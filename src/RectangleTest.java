

public class RectangleTest {
static void show(Rectangle r){
	r.show();
	System.out.println("����:"+r.getArea());
	System.out.println();
	System.out.println("�ѷ�:"+r.getCircumference());
	
}
public static void main(String[] args){
	
	
	Rectangle rect1=new Rectangle(0,0,10,5);
	show(rect1);
	
	System.out.println();
	
	Rectangle rect2=new Rectangle(new Point(0,0),new Point(5,10));
	show(rect2);
	
		
}
}
