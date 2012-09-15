class fun4{
public static void main(String args[]){
for(int i=1;i<=9;i++)
{
for(int k =9;k>=i;k--)
{
System.out.print(" ");

}
for(int j=1;j<=9;j++)
{
System.out.print(" "+i);
if(i==j)
break;
}
System.out.print("\n");
}
}
}
