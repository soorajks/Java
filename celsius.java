import java.io.*;

class celsius
{
 public static void main(String[] args) throws IOException
 {
	float f,cel;
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(in);
	System.out.println("Enter the Fahrenheit : ");
	f = Float.parseFloat(bf.readLine());
	cel =(float)((f-32.0)/1.8);
	System.out.println("\n\n\tFahrenheit\tCelsius\n");
	System.out.println("\t----------\t-------\n");
	System.out.println("\t"+f+"\t\t"+cel+"\n");
 }
}
