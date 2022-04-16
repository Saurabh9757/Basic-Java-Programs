import java.io.*;
import java.util.*;
class addname
{
public static void main(String ar[])
{
Scanner z=new Scanner(System.in);
float a,b;
String n;
System.out.println("Enter name");
n=z.nextLine();
System.out.println("Enter two numbers");
a=z.nextFloat();
b=z.nextFloat();
System.out.println("Add="+(a+b));
System.out.println("Your name="+n);
}
}