class TypeChecker<T>{
	
	public static <T> void print(T input){
		System.out.println(input);
	} 
	
	public static <T> String type(T generic){
		if(generic instanceof Integer){
			
			return "<type Integer>";

		} else if(generic instanceof String){
			
			return "<type String>";
		
		} else{
			return "unknown type";
		}
	}

}