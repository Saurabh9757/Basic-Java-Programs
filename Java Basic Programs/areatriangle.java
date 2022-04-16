import java.io.*;
class area
{
public static void main(String args[])throws IOException
{
DataInputStream z=new DataInputStream(System.in);
float a,d,c,s;
double ar;
System.out.println("Enter three sides of the triangle:");
a=Float.parseFloat(z.readLine());
b=Float.parseFloat(z.readLine());
c=Float.parseFloat(z.readLine());
s=(a+b+c)/2;
ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("area="+ar);
}
}