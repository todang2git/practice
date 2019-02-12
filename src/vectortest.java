import java.util.Vector;

public class vectortest {
public static Vector v = new Vector();

public static void main(String args[]){
	
	v.add("1");
	v.add("2");
	v.add("3");
	
	v.insertElementAt("4", 2);
	
	for(int i=0; i<v.size();i++){
		System.out.println(v.get(i));
		
	}
	if(v.contains("5")){
		System.out.println("들어있음");
	}
}
}
