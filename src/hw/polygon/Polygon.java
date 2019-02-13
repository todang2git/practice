package hw.polygon;

 public abstract class Polygon {
 int x,y;
 int w,h;
 String type;
 //public Polygon(){
         
 //}
 public Polygon(int x,int y,int w,int h,String type){
         this.x=x;
         this.y=y;
         this.w=w;
         this.h=h;
         this.type=type;
         
 }
 public void show(){
         System.out.println("xÁÂÇ¥:"+x+" "+"yÁÂÇ¥:"+y+" "+"Æø:"+w+" "+"³ôÀÌ:"+h+" "+"µµÇü Á¾·ù:"+type);
 }
 public abstract double getArea();
 }

 