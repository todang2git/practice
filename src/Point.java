

public class Point {

	private int x;
    private int y;
    Point(){
    	
    }
    Point(int x,int y){
    	this.x=x;
    	this.y=y;
    }
    public void setXY(int x, int y){
    	this.x=x;
    	this.y=y;
    }
    public int getX(){
    	return x;
    }
    public int getY(){
    	return y;
    }
   public void show(){
    	System.out.print("("+x+","+y+")");
    }


}
