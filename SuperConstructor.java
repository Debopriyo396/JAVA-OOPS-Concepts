/* superclass Person */
class Personi 
{ 
    Personi() 
    { 
        System.out.println("Person class Constructor"); 
    } 
} 
  
/* subclass Student extending the Person class */

class Studenti extends Personi 
{ 
    Studenti() 
    { 
        // invoke or call parent class constructor 
        super(); 
  
        System.out.println("Student class Constructor"); 
    } 
} 
  
/* Driver program to test*/
public class SuperConstructor
{ 
    public static void main(String[] args) 
    { 
        Studenti s = new Studenti(); 
    } 
} 
/*
Output:
Person class Constructor
Student class Constructor */
