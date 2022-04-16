//store reverse in same array 
import java.io.*;
import java.util.*;
import java.lang.*;
class arrayreverse2 
public static void main(String[] args)
{
Scanner z=new Scanner(System.in); 
int i,j,t; 
int n[]=new int[10]; 
System.out.println("Enter Numbers:"); 
for(i=0;i<=9;i++) 
n[i]=z.nextInt(); 
{
i=0; 
j=9;
while(i<j) 
{
t=n[i]; 
n[i]=n[j]; 
n[j]=t; 
j--; 
i++; 
for(i=0;i<9;i++) 
System.out.print(n[i]+"\ t");
}
} 