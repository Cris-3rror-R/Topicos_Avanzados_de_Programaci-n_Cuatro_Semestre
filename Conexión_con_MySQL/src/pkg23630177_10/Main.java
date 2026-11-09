package pkg23630177_10;
/**
 * Cristopher Axel Venegas Venegas
 * Intento de conexión a una BD en MySQL
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static Connection cnx;
    public static BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
    static int ID;
    static String NC;
    static String Nom;
    static String Dom;
    static String Tel;
    static String Email;
    static String Edad;
    static String Sexo;
    
    
    
    
    static void Agregar(){
        System.out.println("Agregar registro a la base de datos");
        System.out.println("Número de control");
            NC=LeeCad();
        System.out.println("Nombre");
            Nom=LeeCad();
        System.out.println("Domicilio");
            Dom=LeeCad();
        System.out.println("Telefono");
            Tel=LeeCad();
        System.out.println("Email");
            Email=LeeCad();
        System.out.println("Edad");
            Edad=LeeCad();
        System.out.println("Sexo");
            Sexo=LeeCad();
        try {
            PreparedStatement Ps = cnx.prepareStatement("INSERT INTO datosgenerales (Id,NC,Nom,Dom,Tel,email,edad,sexo) VALUES (null,?,?,?,?,?,?,?)");
            Ps.setString(1, NC);
            Ps.setString(2, Nom);
            Ps.setString(3, Dom);
            Ps.setString(4, Tel);
            Ps.setString(5, Email);
            Ps.setString(6, Edad);
            Ps.setString(7, Sexo);
            Ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static String LeeCad(){
        String Cad = "";
        try{
            Cad = Bf.readLine();
        }catch(IOException ex){
            System.out.println(ex.toString());
        }
        return Cad;
    }
    
    static boolean Busca(String nc){
    boolean Esta=false;
    try{
        Statement St = cnx.createStatement();
        ResultSet Rs = St.executeQuery("SELECT * from datosgenerales WHERE datosgenerales.NC ='"+nc+"'");
        while(Rs.next()){
            Esta = true;
            System.out.println("ID\tNC\tNom\tDom\tTel\tEmail\tEmail\tEdad\tSexo");
            System.out.print(Rs.getString(1)+"\t");
            System.out.print(Rs.getString(2)+"\t");
            System.out.print(Rs.getString(3)+"\t");
            System.out.print(Rs.getString(4)+"\t");
            System.out.print(Rs.getString(5)+"\t");
            System.out.print(Rs.getString(6)+"\t");
            System.out.print(Rs.getString(7)+"\t");
            System.out.print(Rs.getString(8));
            System.out.println("");
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    return Esta;
    }
    
    static void Eliminar(){
        System.out.println("Elimina registros de la base de datos");
        System.out.println("Número de control");
            NC = LeeCad();
        if(!Busca(NC)){
            System.out.println(NC+" No encontrado.");
        }else{
            System.out.println("Estas seguro de eliminar el registro [S/N]");
            String Resp = LeeCad();
            if(Resp.toUpperCase().equals("S")){
                try{
                    Statement St = cnx.createStatement();
                    PreparedStatement Ps = cnx.prepareStatement("DELETE FROM datosgenerales WHERE NC = '"+NC+"'");
                    Ps.executeUpdate();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }else{
                System.out.println("Registro NO eliminado");
            }
        }
    }
    
    static void Modificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Modifica registro de la base de datos");
        System.out.println("Número de control");
            NC = LeeCad();
        if(!Busca(NC)){
            System.out.println(NC+" No encontrado.");
        }else{
            int opM = 0;
            String MiColModifi ="";
            while(opM!=7){
                System.out.println("--------------MENU--------------");
                System.out.println("1.Nombre\t2.Domicilio\t3.Telefono\t4.Correo eletronico\t5.Sexo\t6.Edad\t7.Salir");
                opM = sc.nextInt();
                switch(opM){
                    case 1:
                        System.out.println("Nuevo nombre.");
                        Nom = LeeCad();
                        MiColModifi = "Nom ='"+Nom+"'";
                        break;
                    case 2:
                        System.out.println("Nuevo domicilio.");
                        Dom = LeeCad();
                        MiColModifi = "Dom ='"+Dom+"'";
                        break;
                    case 3:
                        System.out.println("Nuevo telefono.");
                        Tel = LeeCad();
                        MiColModifi = "Tel ='"+Tel+"'";
                        break;
                    case 4:
                        System.out.println("Nuevo correo electronico.");
                        Email = LeeCad();
                        MiColModifi = "email ='"+Email+"'";
                        break;
                    case 5:
                        System.out.println("Nuevo sexo.");
                        Sexo = LeeCad();
                        MiColModifi = "sexo ='"+Sexo+"'";
                        break;
                    case 6:
                        System.out.println("Nueva edad.");
                        Edad = LeeCad();
                        MiColModifi = "edad ='"+Edad+"'";
                        break;
                    default:
                        break;
                }
                if(opM != 7){
                    try{
                    PreparedStatement Pt = cnx.prepareStatement("UPDATE datosgenerales SET "+MiColModifi+" WHERE NC = '"+NC+"'");
                        Pt.executeUpdate();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
    
    static void Buscar(){
        System.out.println("Busca registro en la base de datos");
        System.out.println("Número de control");
            NC = LeeCad();
        if(!Busca(NC)){
            System.out.println(NC+" No encontrado.");
        }
    }
    
    static void Consultar(){
        System.out.println("Consulta registro de la base de datos");
        System.out.println("ID\tNC\tNom\tDom\tTel\tEmail\tEmail\tEdad\tSexo");
        try{
            Statement St = (Statement) cnx.createStatement();
            ResultSet Rs = St.executeQuery("SELECT * from datosgenerales");
            while(Rs.next()){
                System.out.print(Rs.getString(1)+"\t");
                System.out.print(Rs.getString(2)+"\t");
                System.out.print(Rs.getString(3)+"\t");
                System.out.print(Rs.getString(4)+"\t");
                System.out.print(Rs.getString(5)+"\t");
                System.out.print(Rs.getString(6)+"\t");
                System.out.print(Rs.getString(7)+"\t");
                System.out.print(Rs.getString(8));
                System.out.println("");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
    static void Menu(){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while(op != 6){
            System.out.println("/////MENU/////");
            System.out.println("1.Agregar \t2.Eliminar\t3.Modificar\t4.Buscar\t5.Consultar\t6.Salir");
            op = sc.nextInt();
            switch(op){
                case 1:
                    Agregar();
                    break;
                case 2:
                    Eliminar();
                    break;
                case 3:
                    Modificar();
                    break;
                case 4:
                    Buscar();
                    break;
                case 5:
                    Consultar();
                    break;
                case 6:
                    System.out.println("Fin del menu");
                    break;
                default:
                    break;
            }
        }
    
    }
    
    public static void main(String[] args){
        ConectarBD Conectar = new ConectarBD();
        cnx = Conectar.conexion();
        if(cnx==null){
            System.out.println("Error al conectar con la bsse de datos.");
        }else{
            System.out.println("Conexion existosa.");
            Menu();
        }
    }
    
}
