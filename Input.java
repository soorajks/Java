import java.io.*;

public class Input {
public static void main(String[] args) throws IOException
 {
	 int x;
	 InputStreamReader f = new InputStreamReader(System.in);
	 BufferedReader in = new BufferedReader(f);
	 System.out.print("Enter the number : ");
	 x = Integer.parseInt(in.readLine());
	 System.out.println("The number is : "+x);
 }
}    
