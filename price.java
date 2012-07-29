import java.io.*;

class price
 {
 public static void main(String[] args) throws IOException
 {
	float val;
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(in);
	System.out.println("Enter the Price :");
	val = Float.parseFloat(bf.readLine());
	System.out.println("The price in paise : "+(int)(val*100));
 }
}
