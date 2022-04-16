import java.io.*; 
class average 
{
public static void main(String args[])throws I0Exception {
DatalnputStream z=new DatalnputStream(System.in); 
float a,h,c; 
double avg; 
System.out.println("Enter three numbers:"); 
a=Float.parseFloat(z.readLine()); 
b=Float.parseFloat(z.readLine()); 
c=Float.parseFloat(z.readLine()); 
avg=(float)(a+b+c)/3; 
System.outprintln("Average is="+avg); 
}
}