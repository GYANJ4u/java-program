abstract class First
{
abstract void display()
 }
class Second extends First
{
  void show()
{
System.out.println("this is show method");
}
}
class TestMain
{
public static void main()
{
First F=new Second();
F.display();
}
}