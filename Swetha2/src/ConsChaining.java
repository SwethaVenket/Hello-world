class ConsChaining{
	
ConsChaining(){
	System.out.println("This is non parametrised Constructor");
}

ConsChaining(int x){
	this();
	System.out.println("Single Parametrised constructor");
}

ConsChaining(int x,int y){
	this(6);
	System.out.println("Constructor with two paramteres invoking others using this method");
}

public static void main(String args[]) {
	ConsChaining temp = new ConsChaining(5,7);
	
}
}