package entrega3;

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
 * Clase principal
 * Cristopher Axel Venegas Venegas
 * Fuentes de referencia
 * El caso del default del switch fue tomado de:
 * https://es.stackoverflow.com/questions/383259/cómo-validar-y-cómo-puedo-mostrar-un-mensaje-en-ventana
 * 
 */
public class Principal extends JFrame {
    int NumCts=0,n=0,pares=0;
    int Conts [];
    JPanel jP_Pri = new JPanel();
    JButton BotonAux = new JButton();
    JButton [] ABtn; 
    ImageIcon Atras = icono("Cubierta.png");
    ImageIcon [] Imagens;
    
    private void ActualizarBoton(JButton Boton){
        if(n==0){
            BotonAux=Boton;
            Boton.setIcon(Boton.getPressedIcon());
            n++;
        }else{
            if(!Boton.equals(BotonAux)){
                n=0;
                if(Boton.getPressedIcon().toString().equals(BotonAux.getPressedIcon().toString())){
                    Boton.setIcon(Boton.getPressedIcon());
                    BotonAux.setVisible(false);
                    Boton.setVisible(false);
                    pares++;
                    if(pares==NumCts){
                        JOptionPane.showMessageDialog(null, "Has ganado");
                        System.exit(0);
                    }
                }else{
                    BotonAux.setIcon(Atras);
                    }
            }
        }
    }
    
    private ImageIcon icono(String nom){
        ImageIcon img = new ImageIcon(getClass().getResource(nom));
        ImageIcon ico = new ImageIcon(img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        return ico;
    }
    public void InicializarImagen(){
        for(int x=0;x<NumCts;x++){
            Imagens[x]=new ImageIcon();
            Imagens[x]=icono("c"+x+".png");
        }
    }
    public void InicializarCont(){
        for(int x=0;x<NumCts;x++){
            Conts[x]=0;
        }
    }
    public int RandomImage(){
        int RImg=(int)(Math.random()*NumCts);
        return RImg;
    }
    public void InicializarBotones(){
        InicializarImagen();
        InicializarCont();
        for(int x=0;x<NumCts*2;x++){
            ABtn[x]=new JButton();
            ABtn[x].setIcon(Atras);
            ABtn[x].setBackground(Color.GRAY);
            boolean Lleno=false;    
            while(!Lleno){
                int RImg=RandomImage();
                if(Conts[RImg]<2){
                    ABtn[x].setPressedIcon(Imagens[RImg]);
                    Conts[RImg]++;
                    Lleno=true;
                }
            ABtn[x].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ActualizarBoton((JButton) e.getSource());
            }
        });    
            jP_Pri.add(ABtn[x]);
        }
      }
    }
    
    public Principal() {
        NumCts=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas cartas quieres?"));
        ABtn=new JButton [2*NumCts];
        Imagens=new ImageIcon[NumCts];
        Conts=new int [NumCts];
        jP_Pri.setBackground(Color.gray.darker());
        add(jP_Pri);
        switch(NumCts){
            case 2:jP_Pri.setLayout(new GridLayout(2,2,5,5));InicializarBotones();break;
            case 3:jP_Pri.setLayout(new GridLayout(3,2,5,5));InicializarBotones();break;
            case 4:jP_Pri.setLayout(new GridLayout(4,2,5,5));InicializarBotones();break;
            case 5:jP_Pri.setLayout(new GridLayout(5,2,5,5));InicializarBotones();break;
            case 6:jP_Pri.setLayout(new GridLayout(4,3,5,5));InicializarBotones();break;
            case 7:jP_Pri.setLayout(new GridLayout(2,7,5,5));InicializarBotones();break;
            case 8:jP_Pri.setLayout(new GridLayout(4,4,5,5));InicializarBotones();break;
            case 9:jP_Pri.setLayout(new GridLayout(6,3,5,5));InicializarBotones();break;
            case 10:jP_Pri.setLayout(new GridLayout(4,5,5,5));InicializarBotones();break;
            default:JOptionPane.showMessageDialog(null , "Tan solo se puede de 2 a 10 pares.", "ERROR", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }
        
        
    }
}
