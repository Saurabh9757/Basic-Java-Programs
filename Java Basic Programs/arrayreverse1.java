//store reverse into another array
import java.io.*;
import java.util.*;
import java.lang.*;
class arrayreverse1
{
public static void main(String[]args)
{
Scanner z=new Scanner(System.in);
int i,j;
int n[]=new int[10];
int m[]=new int[10];
System.out.println("Enter Numbers:");
for(i=0;j=9;i<j;i++;j--)
m[j]=n[i];
for(i=9;i>=0;i--)
m[i]=z.nextInt();
for(i=o;i<=9;i++)
System.outrint(m[i]+"\t");
}
}
