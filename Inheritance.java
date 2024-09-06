class  Ab
{
void msg1()
{
System.out.println("method of super class");
}
}
class B extends Ab
{
void   msg1()
{
System.out.println("overriding method of super class");
}
void msg2()
{
System.out.println("Another method of sub class");
}
}
 public class Inheritance
{
public static void main(String args[])
{
Ab a=new Ab();
B b=new B();
a.msg1();
b.msg1();
b.msg2();
}
}
/*Output:
method of super class
overriding method of super class
Another method of sub class
*/