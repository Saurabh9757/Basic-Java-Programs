import java.io.*; 
import java.util.*; 
import java.lang.*; 
class bubble
{ 
public static void main(String[] args) 
{ 
Scanner z=new Scanner(System.in);
int n[]=new int[10]; 
int i,j,t; 
System.out.println("Enter values:"); 
for(i=0;i<=9;i++) 
n[i]=z.nextInt(); 
for(i=1;i<=9;i++) 
{ 
for(j=0;j<=9-1;j++)
{ 
if(n[j]>n[j+1]) 
{
t=n[j]; 
n[j]=n[j=1]; 
n[j+1]=t; 
}
}
}
for(i=0;i<=9;i++) 
System.out.print(n[i]+"\ t");
}
} 
