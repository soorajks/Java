import java.io.*;

class series
{
 public static void main(String[] args) throws IOException
 {
	int n;
	float sum=0;
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(in);
	System.out.println("Enter the limit : ");
	n = Integer.parseInt(bf.readLine());
	System.out.println("The sries is : ");
	for(int i=1;i<n;i++)
	{
	        System.out.print("(1/"+i+")+");
	}
	System.out.print("(1/"+n+")\n");

	for(int j=1;j<=n;j++)
	{
	        sum+=1.0/j;
	}
	System.out.println("The sum of series is : "+sum);
 }
}

