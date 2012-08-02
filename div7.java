class div7
{
 public static void main(String args[])
 {
  int count =0,sum =0;
  for(int i=100;i<200;i++)
  {
	if(i%7 == 0)
	{
	     count++;
	     sum+=i;
	     System.out.println(i);
	}
  }
  System.out.print("The number of integers divisible by 7 between 100 and 200");
  System.out.print(" is "+count+" and their sum = "+sum+"\n");
 }
}
