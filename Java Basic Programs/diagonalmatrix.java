import java.io.*;
class diagonalmatrix
{
public static void main(String args[])throws IOException
{
DataInputStream z=new DataInputStream(System.in);
int n[][]=new int[3][3];
int i,j;
System.out.println("Enter values in 3*3 matrix");
for(i=0;i<=2;i++)
for(j=0;j<=2;j++)
n[i][j]=Integer.parseInt(z.readLine())
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
if(i==j)
System.out.print(n[i][j]+"\t");
System.out.println();
}
}
}