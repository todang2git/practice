package hw.test;
import hw.polygon.*;

public class CanvasApp {
 
 public static void main(String args[]){
   
  Canvas canvas=new Canvas();

  canvas.draw(new Rectangle(0,0,10,15));
 canvas.draw(new Triangle(0,0,5,10));
  canvas.draw(new Rectangle(0,0,10,10));
  
   canvas.display();
 
 
 }
}
