/*A sample program using class*/
class room
{
 float length,width;
 void getdata(float a,float b)
 {
	length = a;
	width = b;
 }
}

class area
{
 public static void main(String args[])
 {
	float area;
	room room1=new room();
	room1.getdata(4,5);
	area = room1.length*room1.width;
	System.out.println("Area is : "+area);
 }
}

