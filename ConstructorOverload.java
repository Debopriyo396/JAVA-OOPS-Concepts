// Java Program to illustrate constructor overloading 
// using same task (addition operation ) for different 
// types of arguments. 
class A
{ 
    // constructor with one argument 
    A(String name) 
    { 
        System.out.println("Constructor with one " + 
                      "argument - String : " + name); 
    } 
  
    // constructor with two arguments 
    A(String name, int age) 
    { 
  
        System.out.println("Constructor with two arguments : " + 
                " String and Integer : " + name + " "+ age); 
  
    } 
  
    // Constructor with one argument but with different 
    // type than previous.. 
    A(long id) 
    { 
        System.out.println("Constructor with one argument : " + 
                                            "Long : " + id); 
    } 
} 
  
class  newone
{ 
    public static void main(String[] args) 
    { 
        // Creating the objects of the class named  A 
        // by passing different arguments 
  
        // Invoke the constructor with one argument of 
        // type 'String'. 
        A  x= new  A("raj"); 
  
        // Invoke the constructor with two arguments 
        A  y= new A("rahul", 10); 
  
        // Invoke the constructor with one argument of 
        // type 'Long'. 
        A  z= new  A(325614567); 
    } 
} 
