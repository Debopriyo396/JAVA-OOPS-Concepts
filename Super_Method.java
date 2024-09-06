/* Base class Person */
class Personii 
{ 
    void messagei() 
    { 
        System.out.println("This is person class"); 
    } 
} 
  
/* Subclass Student */
class Studentii extends Personii 
{ 
    void messagei() 
    { 
        System.out.println("This is student class"); 
    } 
  
    // Note that display() is only in Student class 
    void displayi() 
    { 
        // will invoke or call current class message() method 
        messagei(); 
  
        // will invoke or call parent class message() method 
        super.messagei(); 
    } 
} 
  
/* Driver program to test */
public class Super_Method
{ 
    public static void main(String args[]) 
    { 
        Studentii s = new Studentii(); 
  
        // calling display() of Student 
        s.displayi(); 
    } 
} 
/*Output:
This is student class
This is person class
In the above example, we have seen that if we only call method message() then,
 the current class message() is invoked but with the use of super keyword, message() of superclass could also be invoked.
 */
