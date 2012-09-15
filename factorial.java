import java.io.*;

class factorial {
public static void main(String args[]){
int n,fact=1,l=0;
InputStreamReader sr= new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(sr);
System.out.println("Enter the number : ");
try{
n = Integer.parseInt(in.readLine());
l=n;
while(n!=0)
{
fact *= n;
n--;
}
System.out.println("Factorial of "+n+" is : "+fact);
}
catch(IOException e)
{
System.out.println(e);
System.exit(1);
}
}
}

