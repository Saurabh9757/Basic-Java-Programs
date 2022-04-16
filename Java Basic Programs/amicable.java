import java.io.*;
import java.lang.*;
class amicable
{
public static void main(String args[])throws IOException
{
DataInputStream z=new DataInputStream(System.in);
int n1,n2,s=0,c=0,num1,num2,i,j;
System.out.println("Enter two numbers:");
n1=Integer.parseInt(z.readLine());
n2=Integer.parseInt(z.readLine());
for(i=1;i<=n1/2;i++)
{
if(n1%i==0)
s+=i;
}
for(j=1;j<=n2/2;j++)
{
if(n2%j==0)
c+=j;
}
if(s==n2&&c==n1)
System.out.print("Amicable");
else
System.out.print("Not Amicable");
}
}