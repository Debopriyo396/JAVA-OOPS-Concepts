public class ParameterizedCons {
    // parameterized constructor. 
    // data members of the class. 
    String name; 
    int id; 
  
    // constructor would initialize data members 
    // with the values of passed arguments while 
    // object of that class created. 
    ParameterizedCons(String name, int id) 
    { 
        this.name = name; 
        this.id = id; 
    } 
} 
  
class Demo2 
{ 
    public static void main (String[] args) 
    { 
        // this would invoke the parameterized constructor. 
        ParameterizedCons x = new  ParameterizedCons("adam", 1); 
        System.out.println("Name :" + x.name + 
                           " and Id :" + x.id); 
    } 
} 

