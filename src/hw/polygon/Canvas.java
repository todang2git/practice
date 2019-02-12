package hw.polygon;
import java.util.*;
public class Canvas {
	
public Rectangle rectangle;
public Triangle triangle;
 public Square square;
 
 public ArrayList<Polygon>list=new ArrayList<Polygon>();
 public int size=0;
 public void draw(Polygon p){
	list.add(p);
 /*if(p instanceof Rectangle)
  list.add((Rectangle)p);
 if(p instanceof Triangle)
 list.add((Triangle)p);
 if(p instanceof Square)
 list.add((Square)p);
 */
  
 }

public void display(){
 for(int i=0;i<list.size();i++){
	 if(list.get(i) instanceof Rectangle)
	 ((Rectangle)list.get(i)).show();
	 if(list.get(i) instanceof Triangle)
		 ((Triangle)list.get(i)).show();
	 if(list.get(i) instanceof Square)
		 ((Square)list.get(i)).show();
 }
}
}