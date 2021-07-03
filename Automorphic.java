import java.util.Scanner;  
public class automorphic
{  
public static void main(String args[])  
{  
Scanner sc= new Scanner(System.in);
int n,a=0,b,c,d;
System.out.print("enter the n value");  
n=sc.nextInt();  
b=n*n;   
c=n;     
while(c>0)  
{  
a++;    
c=c/10;  
}   
d= (int)(b%(Math.pow(10,a)));   
if(n==d)  
System.out.println(n+ " is an automorphic number.");  
else  
System.out.println(n+ " is not an automorphic number.");  
}  
}  


output:
C:\Users\Vaisshnavi\Documents>javac Automorphic.java

C:\Users\Vaisshnavi\Documents>java Automorphic
enter the n value25
25 is an automorphic number.
