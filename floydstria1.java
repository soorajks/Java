class floydstria1
{
 public static void main(String args[])
 {
	int i,j,c1=1,c0=0;
	for(i=0;i<13;i++)
	{
if(i%2 == 0)
{
	 for(j=0;j<=i;j++)
 	  {
	   if(j%2 == 0)
		System.out.print("  "+c1);
	   else
		System.out.print("  "+c0);

	  }
}
else
{
for(j=0;j<=i;j++)
          {
           if(j%2 == 0)
                System.out.print("  "+c0);
           else
                System.out.print("  "+c1);

          }

}
 	 System.out.print("\n");
	}
 }
}
