package hw.polygon;

 public class Triangle extends Polygon{
       
           public Triangle(int x,int y,int w,int h){
           super(x,y,w,h,"»ï°¢Çü");
           
   }
         public double getArea(){
                 return w*h/2;
         }
         public void show(){
                 super.show();
                 System.out.println(getArea());
         }
 }