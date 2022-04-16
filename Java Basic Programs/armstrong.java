import java.io.*;
import java.lang.*;
class armstrong
{
public static void main (Strings args[])throws IOException
{
DataInputStream z=new DataInputStream(System.in);
int n,c=0,s=0,i,r,num;
System.out.println("Enter number:");
n=Integer.parseInt(z.readLine());
num=n;
do
{
c++;
n=n/10;
}
while(n>0);
n=num;
do
{
r=n%10;
s+=Math.pow(r,c);
n=n/10;
}
while(n.0);
if(num==s)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}
}