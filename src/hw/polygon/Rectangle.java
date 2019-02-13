package hw.polygon;

 public class Rectangle extends Polygon{
       
 public Rectangle(int x,int y,int w,int h){
         super(x,y,w,h,"직사각형");
         
 
 }
public double getArea(){
         return w*h;
 }
 public void show(){
        
        if(isSquare())
        	 super.type="이 직사각형은 정사각형";
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