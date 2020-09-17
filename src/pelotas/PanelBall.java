
package pelotas;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PanelBall extends JPanel{
    protected CoorX X;
    protected CoorY Y;
    protected NumeroBall Num;
 
    
    public PanelBall(CoorX x, CoorY y, NumeroBall Num){
        this.X = x;
        this.Y = y;
        this.Num = Num;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        
        
        g2.setColor(Color.black);  
        g2.fill(new Ellipse2D.Double(X.getX(),Y.getY(),50,50));
        g2.setColor(Color.white);
        g2.drawString(String.valueOf(Num.getNumero()), X.getX()+25, Y.getY()+25);
              
    }
    
}
