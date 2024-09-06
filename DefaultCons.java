public class DefaultCons {
        // no-argument constructor  
      int num; 
      String name; 
       // this would be invoked while an object 
      // of that class is created. 
      DefaultCons() 
      { 
   System.out.println("Constructor called"); 
      } 
  } 
    
  class  Demo 
  { 
      public static void main (String[] args) 
      { 
          // this would invoke default constructor. 
          DefaultCons x = new   DefaultCons(); 
           // Default constructor provides the default 
          // values to the object like 0, null 
          System.out.println(x.name); 
          System.out.println(x.num); 
      } 
  } 