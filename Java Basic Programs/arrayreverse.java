import java.io.*;
class arrayreverse
{
public static void main(String args[])throws IOException
{
DataInputStream z=new DataInputStreamm(System.in);
int n[]=new int[5];
int i;
System.out.println("Enter five numbers:");
for(i=0;i<n.length;i++)
n[i]=Integer.parseInt(z.readLine());
for(i=n.length-1;i>=0;i--)
System.out.println(n[i]);
}
}