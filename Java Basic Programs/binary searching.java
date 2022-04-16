import java.io.*;
import java.util.*; 
class binarysearching 
public static void main(String[] args) 
Scanner z=new Scanner(System.in);
int n[]=new int[10] 
int i,j,s,min,max,mid,k,t; 
System.out.println(" Enter 10 numbers:"); 
for(i=0;i<10;i++) 
n[i]=z.nextInt(); 
Systemt.out.println("Enter search value:");
s=z.nextInt(); 
for(i=0;i<=8;i++) 
{
for(j=i+1;j<=9;j++)
{ 
if(n[i]>n[j])
{ 
t=n[j]; 
for(k=j;j>i;k--) 
n[k]=n[k-1]; 
n[k]=t;
}
}
}
min=0;max=9; 
while(min<=max)
{
mid=(min+max)/ 2;
if(n[mid]==s)
System.out.println("found"); 
break; 
if(s>n[mid]) 
min=mid+1; 
if(s<n[mid]) 
max=mid-1; 
}
if(min>max) 
System.out.println("not found"); 
}
}