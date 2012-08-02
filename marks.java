import java.io.*;

class marks
{
 public static void main(String[] args)
 {
  int mat[] = new int[10];
  int phy[] = new int[10];
  int che[] = new int[10];
  int tot[] = new int[10];  
  int n,i;
  String s[] = new String[10];
  InputStreamReader in = new InputStreamReader(System.in);
  BufferedReader bf = new BufferedReader(in);
  System.out.println("Enter the no. of Students");
  try
  {
   n = Integer.parseInt(bf.readLine());
   
 
   for(i=1;i<=n;i++)
   {
        System.out.println("Enter the Name for student "+i);
	s[i] = bf.readLine();
	System.out.println("Enter Marks in Maths for "+s[i]);
	mat[i] = Integer.parseInt(bf.readLine());
	System.out.println("Enter Marks in Physicss for "+s[i]);
	phy[i] = Integer.parseInt(bf.readLine());
	System.out.println("Enter Marks in Chemistry for "+s[i]);
	che[i] = Integer.parseInt(bf.readLine());

	tot[i] = mat[i]+phy[i]+che[i];
   }


   System.out.println("The list of eligible candidates \n");
   for(i=1;i<=n;i++)
   {
	if(mat[i]>=60 && phy[i]>=50 && che[i]>=40 )
	{
	  if(tot[i]>=200 || (mat[i]+phy[i])>=150)
	  {
		System.out.println"\t"+(s[i]+"\n");
	  }
	}
   }
  }
  catch(Exception e)
  {
    System.out.println("I/O error");
  }
 }
}
