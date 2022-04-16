import java.io.*;
class array1
{
public static void main(String args[])throws IOException
{
DataInputStream z=new DataInputStream(System.in);
int n[]=new int[5];
int i;
System.out.println("Enter five numbers:");
for(i=0;i<n.length;i++)
n[i]=Integer.parseInt(z.readLine());
for(i=0;i<n.length;i++)
System.out.print(n[i]+"\t");
}
}