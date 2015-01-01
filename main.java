class main{
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){
		print(TypeChecker.type(5));
	}
}