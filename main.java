class TypeChecker<T>{
	
	public static <T> void print(T input){
		System.out.println(input);
	} 
	
	public <T> String type(T generic){
		if(generic instanceof Integer){
			
			return "<type Integer>";

		} else if(generic instanceof String){
			
			return "<type String>";
		
		} else if(generic instanceof Boolean){
			return "<type Boolean>";
		} else if(generic instanceof Double)
			return "<type Double>";

		else{
			//yay reflection!
			//String class_name = generic.getClass();
			try{
				print(generic);
				Class<?> c = Class.forName( generic.getClass().toString() );
				String result = "<types " + c.getFields() + " " + c.getDeclaredFields() + "in "+generic.getClass() +" >";
				return result;
			} catch(ClassNotFoundException e){
				print("here");
				return ""+e.getMessage();
			}
			 
		}
	}

}

class hello{ int x; Boolean y;}

public class main{
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){
		//TypeChecker t = new TypeChecker();
		
	}
}