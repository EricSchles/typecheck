

class TypeChecker<T>{
	
	public static <T> void print(T input){
		System.out.println(input);
	} 
	
	public static <T> String type(T generic){
		if(generic instanceof Integer){
			
			return "<type Integer>";

		} else if(generic instanceof String){
			
			return "<type String>";
		
		} else if(generic instanceof Boolean){
			return "<type Boolean>";
		} else if(generic instanceof Double)
			return "<type Double>";

		else{
			String class_name = generic.getClass().toString();
			try{
				Class<?> c = Class.forName( class_name );
				String result = "<types " + c.getFields() + " " + c.getDeclaredFields() + "in "+generic.getClass() +" >";
				return result;
			} catch(ClassNotFoundException e){
				return ""+e.getMessage();
			}
			 
		}
	}

}