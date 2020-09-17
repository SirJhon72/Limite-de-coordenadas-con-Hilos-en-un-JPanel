package pelotas;


public class CoorX {
    protected int X;
    
    public CoorX(){
        this.X = (int)(Math.random()*530+1);
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }
    
    
}
