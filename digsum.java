import java.io.*;

class digsum{
public static void main(String args[]){
int n,k,l=0;
int s=0;
InputStreamReader sr = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(sr);
System.out.println("Enter the number to add its digits");
try
{
n = Integer.parseInt(in.readLine());
 l = n;
while(n!=0)
{
k=n%10;
s+=k;
n=n/10;
}
}
catch(IOException e)
{
System.out.println(e);
System.exit(1);
}
System.out.println("The sum of digits in "+l+" is : "+ s);
}
}
