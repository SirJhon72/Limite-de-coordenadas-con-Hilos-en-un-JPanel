
package pelotas;
import javax.swing.*;

public class Hilo extends Thread{
    protected PanelBall panel;
    protected CoorX X;
    protected CoorY Y;
    protected int AnguloX;
    protected int AnguloY;
    
    public Hilo(PanelBall panel, CoorX X, CoorY Y){
        this.panel = panel;
        this.X = X;
        this.Y = Y;
        this.AnguloX = 1;
        this.AnguloY = 1;
    }
    
    public void run(){
        while(true){
            try { 
                
                //Parte del codigo que averiguara la direccion de la pelota y como es que debe de moverse 
                if(X.getX() + AnguloX < 0){
                    AnguloX = 1;
                }else if(X.getX() + AnguloX > panel.getWidth() - 50){
                    AnguloX = -1;
                }else if(Y.getY() - AnguloY < 0){
                    AnguloY = 1;
                }else if(Y.getY() - AnguloY > panel.getHeight()- 50){
                    AnguloY = -1;
                }
        
                X.setX(X.getX() + AnguloX);
                Y.setY(Y.getY() + AnguloY);
                
                sleep(10);
                panel.repaint();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public void Direccion(CoorX x, CoorY y, int AnguloX, int AnguloY){
        

    }
    
    
}
