package hw.polygon;

 public class Rectangle extends Polygon{
       
 public Rectangle(int x,int y,int w,int h){
         super(x,y,w,h,"���簢��");
         
 
 }
public double getArea(){
         return w*h;
 }
 public void show(){
        
        if(isSquare())
        	 super.type="�� ���簢���� ���簢��";
         super.show();
         System.out.println(getArea());
        
 }
 public boolean isSquare(){
         if(w==h)
                 return true;
         else
                 return false;
 }
 public void zz(){
	 System.out.print("aaa");
 }
 }