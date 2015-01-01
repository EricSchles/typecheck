
public class main{
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){
		//TypeChecker t = new TypeChecker();
		class hello{ int x; Boolean y;}
		hello x = new hello();
		try{
			Class<?> c = Class.forName("hello");
			print(c.getFields());
			print(c.getDeclaredFields()[0]);
		} catch(ClassNotFoundException e){
			print("dammit");
		}
		 		
	}
}