package actev_3_23630177;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Cristopher Axel Venegas Venegas 4A ISC
 * Clase para la carrera
 */
public class Carrera extends JFrame{
  boolean CaballoWin = false;
  boolean PrimerCarrera = false;
  JPanel jP_Pri = new JPanel();
  JPanel jP_Sup = new JPanel();
  JPanel jP_Inf = new JPanel();
  JButton Carril [][];
  JButton Iniciar = new JButton();
  JButton Reiniciar = new JButton();
  JButton Salir = new JButton();
  ImageIcon ICaballos [];
  int CantCaballos;
  
  public void InicializarBotones(){
      InicializarIniciar();
      InicializarReiniciar();
      InicializarSalir();
  }
  
  public void InicializarCarril(){
      for(int x=0;x<CantCaballos;x++){
          ICaballos[x]=new ImageIcon();
          ICaballos[x] = icono("Caballo_"+x+".png");
          for(int y=0;y<12;y++){
              Carril[x][y]=new JButton();
              Carril[x][y].setBackground(Color.gray.brighter());
              jP_Sup.add(Carril[x][y]);
          }
          Carril[x][0].setIcon(ICaballos[x]);
      }
  }
  
  public void InicializarIniciar(){
      Iniciar.setBackground(Color.green.brighter());
      Iniciar.setText("INICIAR");
      Iniciar.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              Comenzar();
          }       
    });
      jP_Inf.add(Iniciar);
  }
              
  public void InicializarReiniciar(){
      Reiniciar.setBackground(Color.yellow.brighter());
      Reiniciar.setText("REINICIAR");
      Reiniciar.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              Comenzar();
          }       
    });
      jP_Inf.add(Reiniciar);
  }
  public void InicializarSalir(){
      Salir.setBackground(Color.red.brighter());
      Salir.setText("SALIR");
      Salir.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              System.exit(0);
          }       
    });
      jP_Inf.add(Salir);
  }
  
  public class Caballo implements Runnable{
        int NCaballo;
        
        public Caballo(int NRunner) {
            this.NCaballo= NRunner;
        }
        public void run(){
            for(int x=0 ;x<12; x++){
                if(CaballoWin){
                   break; 
                }
                try{
                    if(x>0){
                        Carril[NCaballo][x].setIcon(Carril[NCaballo][x-1].getIcon());
                        Carril[NCaballo][x-1].setIcon(null);
                    }else{
                        Carril[NCaballo][0].setIcon(ICaballos[NCaballo]);
                    }
                    if(x==11){
                        break;
                    }else{
                        Thread.sleep(TiempoEsp());    
                    }
                }catch(InterruptedException err){
                }
            }
            synchronized(Caballo.class){
                if(!CaballoWin){
                    CaballoWin = true;
                    PrimerCarrera = true;
                    Iniciar.setEnabled(false);
                    Reiniciar.setEnabled(true);
                    JOptionPane.showMessageDialog(null,"Ha ganado el caballo "+NCaballo+"!!");
                }
            }
        }
    }
  
  public int TiempoEsp(){
        int Tiempo =((int)(Math.random()*777)+1);
        return Tiempo;
    }
  
  public void Comenzar(){
      if(PrimerCarrera){
          CaballoWin = false;
          RestCarrilCo();
          for(int x=0;x<CantCaballos;x++){
              new Thread(new Caballo(x)).start();
          }
          
       }else{
          Reiniciar.setEnabled(false);
          for(int x=0;x<CantCaballos;x++){
              new Thread(new Caballo(x)).start();
          }
      }
  }
  public void RestCarrilCo(){
        for(int x=0;x<CantCaballos;x++){
            for(int y=1;y<12;y++){
               Carril[x][y].setIcon(null);
            }
        }
    }
  
    public Carrera() {
        CantCaballos=Integer.parseInt(JOptionPane.showInputDialog("¿Cúantos caballos?"));
        if(CantCaballos >=2 && CantCaballos<=10){
            Carril = new JButton [CantCaballos][12];
            ICaballos = new ImageIcon [CantCaballos];
            jP_Pri.setBackground(Color.white.darker());
            jP_Pri.setLayout(new GridLayout(2,1,5,5));
            jP_Sup.setBackground(Color.gray.darker());
            jP_Sup.setLayout(new GridLayout(CantCaballos,12,5,5));
            jP_Inf.setBackground(Color.yellow);
            jP_Inf.setLayout(new GridLayout(1,3,5,5));
            InicializarBotones();
            Reiniciar.setEnabled(false);
            InicializarCarril();
            jP_Pri.add(jP_Sup);
            jP_Pri.add(jP_Inf);
            add(jP_Pri);
        }else{
            JOptionPane.showMessageDialog(null, "Unicamente de 2 a 10 caballos");
            System.exit(0);
        }
    }
    private ImageIcon icono(String nom){
        ImageIcon img = new ImageIcon(getClass().getResource(nom));
        ImageIcon ico = new ImageIcon(img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        return ico;
    }
}
