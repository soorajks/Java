import java.io.*;

class distance
{
 public static void main(String[] args) throws IOException
 {
	int n=1;
	InputStreamReader in =new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(in);
	while(n==1)
	{
	   System.out.println("Enter the Initial velocity (m/s)");
	   float u = Float.parseFloat(bf.readLine());
	   System.out.println("Enter the Acceleration (m/(s*s))");
	   float a = Float.parseFloat(bf.readLine());
	   System.out.println("Enter the Time interval (s)");
 	   float t = Float.parseFloat(bf.readLine());
	   System.out.println("The total distance travelled by a vehicle in "+t+" seconds is "+(u*t+(a*t*t)/2));
	   System.out.println("Do you want to repeat test yes/no : 1/0 ?");
	   n= Integer.parseInt(bf.readLine());
	}
 if(n!=0)
 	System.out.println("Invalid selection");
 }
}
