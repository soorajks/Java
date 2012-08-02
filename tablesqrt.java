class tablesqrt
{
public static void main(String args[])
{
float i,j,sq;
System.out.println("---------------------------------------------------------------------------------------------------------");
System.out.println("Number\t|0.0\t|0.1\t|0.2\t|0.3\t|0.4\t|0.5\t|0.6\t|0.7\t|0.8\t|0.9\t|\n");
for(i=0.0f;i<10.0f;i++)
{
System.out.print(i);
for(j=0.0f;j<0.9f;j+=0.1f)
{
sq =(float)Math.sqrt(i+j);
System.out.print("\t|"+sq);
}
System.out.println("\t|");

}
}
}
