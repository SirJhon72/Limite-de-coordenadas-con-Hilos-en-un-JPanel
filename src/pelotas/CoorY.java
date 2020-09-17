package pelotas;

public class CoorY {
    protected int Y;
    
    public CoorY(){
        this.Y = (int)(Math.random()*450+1);
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    
    
}
