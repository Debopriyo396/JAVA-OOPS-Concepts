import myPackage.MyClass;
public class PackExp1
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "KING";
    // Creating an instance of class MyClass in 
      // the package.
      MyClass obj = new MyClass();
        obj.getNames(name);
   }
}
//Note : MyClass.java must be saved inside the myPackage directory since it is a part of the package.
