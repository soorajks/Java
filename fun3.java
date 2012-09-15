class fun3{
public static void main(String args[]){
for(int i=1;i<=10;i++)
{
for(int k =1;k<=i;k++)
{
System.out.print("  ");

}
for(int j=10;j>=1;j--)
{
System.out.print(" "+i);
if(i==j)
break;
}
System.out.print("\n");
}
}
}
