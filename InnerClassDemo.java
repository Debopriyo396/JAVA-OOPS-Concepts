//In nested classes, inner class can access any member- that is static,non-static,private members of outer class.
//outer class cant access inner class members
// outer class 
class OuterClass 
{  
    // static member 
    static int outer_x = 10; 
    // instance(non-static) member 
    int outer_y = 20; 
    // private member 
    private int outer_private = 30; 
    // inner class 
    class InnerClass 
    { int m=9;
        void display() 
        { 
            // can access static member of outer class 
            System.out.println("outer_x = " + outer_x); 
              
            // can also access non-static member of outer class 
            System.out.println("outer_y = " + outer_y); 
              
            // can also access private member of outer class 
            System.out.println("outer_private = " + outer_private); 
        } 
    } 
   // System.out.println("M from inner"); 
}
// Driver class 
 class InnerClassDemo 
{ 
    public static void main(String[] args) 
    { 
        // accessing an inner class 
        OuterClass outerObject = new OuterClass(); 
        OuterClass.InnerClass   innerObject = outerObject.new InnerClass(); 
        innerObject.display(); 
    } 
} 
/*OUTPUT:
outer_x = 10
outer_y = 20
outer_private = 30 */