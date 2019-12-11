package main.java;

interface Sayable{	
      //void say();
	static void say() {
    	
    }
}  
@FunctionalInterface
interface Doable extends Sayable{
	void doit();
	//void xyz();
}
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }
    public static void sayHello(String name) {
    	System.out.println("Hello " +name);
    }
    public static void main(String[] args) {  
        // Referring static method  
        Doable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.doit();
        
    }  
}  