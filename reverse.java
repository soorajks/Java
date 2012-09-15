import java.io.*;

class reverse{
public static void main(String args[]){
int n,k;
int s=0;
InputStreamReader sr = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(sr);
System.out.println("Enter the number to reverse");
try
{
n = Integer.parseInt(in.readLine());
while(n!=0)
{
k=n%10;
s=s*10+k;
n=n/10;
}
}
catch(IOException e)
{
System.out.println(e);
System.exit(1);
}
System.out.println("The reverse no is : "+ s);
}
}
