

public class Rectangle {

	 Point p1;
	 Point p2;
	 Rectangle(int x1,int y1,int x2,int y2){
	     
		 p1=new Point(x1,y1);
		 p2=new Point(x2,y2);
	     
	     }
	 Rectangle(Point p1,Point p2){
         this.p1=p1;
         this.p2=p2;
 }
	 int getWidth(){
		 
	         if(p2.getX()>p1.getX())
	         return p2.getX()-p1.getX();
	         
	         else
	        	 return p1.getX()-p2.getX();
		 
	         
	 }
	 int getHeight(){
		 int a;
		 
	         if(p2.getY()>p1.getY()){
	         
	        	 a=p2.getY()-p1.getY();
	        	 return a;
	        	 //return p2.getY()-p1.getY();
	         }
	         else 
	         { a=p1.getY()-p2.getY();
	         return a;
	         }
	        	// return p1.getY()-p2.getY();
	 }
	         int getCircumference(){
	               int c;
	                 c=2*(getWidth())+2*(getHeight());
	                return c;
	                 
	         }
	         int getArea(){
	                 int d;
	                 d=(getWidth())*(getHeight());
	                 return d;
	                                 
	         }
	         void show(){
	                 System.out.print("직사각형");
	                 p1.show();p2.show();
	                 System.out.println();
	                 
	         }
	 }