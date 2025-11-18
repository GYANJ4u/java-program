interface outer{
    void display();
    interface inner
    {
        void show();
    }
}
class Test1 implements outer.inner
{
  public void show()
    {
        System.out.println("yv");
    }
}
public class TestNestedInterface {
    public static void main(String args[])
    {
      outer.inner T1=new Test1();
      T1.show();
    }

    
}
