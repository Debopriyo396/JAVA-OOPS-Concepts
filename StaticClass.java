public class StaticClass {
    /*A class can be made static only if it is a nested class. 
    Nested static class doesn’t need a reference of Outer class. 
    In this case, a static class cannot access non-static members of the Outer class. Let’s take an example to understand how it works*/
private static String str= "king";
//String st="Hi";//Gives error AS NON STATIC
//Static class
static class MyNestedClass{
//non-static method
public void disp(){
System.out.println(str);
//System.out.println(st);
}
}
public static void main(String args[]){
StaticClass.MyNestedClass obj = new StaticClass.MyNestedClass();
obj.disp();
 }
}
