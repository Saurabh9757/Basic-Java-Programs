import java.io.*;
class arraydynamic
{
public static void main(String args[])throws IOException
{
DataInputStream z=new DataInputStream(System.in);
int n[]; //empty array
int i,size;
System.out.println("Enter size of array: ");
size=Integer.parseInt(z.readLine());
n=new int[size];
System.out.println("Enter"+size+"numbers");
for(i=0;i<n.length;i++)
n[i]=Integer.parseInt(z.readLine());
for(i=0;i<n.length;i++)
System.out.println(n[i]);
}
}