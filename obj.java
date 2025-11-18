class obj
{
static int x=0;
obj()
{
x++;
}
public static void main(String[] args)
{

obj oB1= new obj();
obj oB2= new obj();
obj oB3= new obj();
System.out.println("the number of created objects are:" +x);
}
}
