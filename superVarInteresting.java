/*“Super can refer to sub but vice versa is not possible”-by using reference variable of super class we can able 
to create object of sub class but by using reference of sub class we can’t able to create object of super.
After that by using that reference if we invoke any method which is present in both then version of sub will
invoke but in case of variable version of super will invoke.*/

class Aaa
{
int a=5;
void msg()
{
System.out.println("method of super class");
}
} 

class Bb extends Aaa
{
int a=10;
void msg()
{
System.out.println("method of sub class");
}
} 

public class superVarInteresting 
{
public static void main(String args[])
{
Aaa  x=new  Bb();
x.msg();
System.out.println(x.a);
}
}
/*
Output:
method of sub class
5
*/
