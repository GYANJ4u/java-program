class First
{
   static int n=100;
    static class second
    {
      static  void display(){
            System.out.println("second class:"+n);
        }
    }
}
class NestedClass {
    public static void main(String args[])
    {
        
          // First.second fs=new First.second();
            ///fs.display();
        First.second.display();
    }
    
}
