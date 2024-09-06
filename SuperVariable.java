/* 
Super Keyword in Java
The super keyword in java is a reference variable that is used to refer parent class objects.  
The keyword “super” came into the picture with the concept of Inheritance. It is majorly used in the following contexts:
1. Use of super with variables: This scenario occurs when a derived class and base class has same data members.
In that case there is a possibility of ambiguity for the JVM. We can understand it more clearly using this code 
*/
/* Base class vehicle */
class Vehicle 
{ 
    int maxSpeed = 120; 
} 
  
/* sub class Car extending vehicle */
class Car extends Vehicle 
{ 
    int maxSpeed = 180; 
  
    void display() 
    { 
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed); 
    } 
} 
  
/* Driver program to test */
public class SuperVariable
{ 
    public static void main(String[] args) 
    { 
        Car small = new Car(); 
        small.display(); 
    } 
} 
/*Output:
Maximum Speed: 120
In the above example, both base class and subclass have a member maxSpeed. We could access 
maxSpeed of base class in subclass using super keyword.
*/