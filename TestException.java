//import java.io.IOException;
import java.util.*;
import java.io.IOException;
class Test{
    void first(int n) throws IOException
    {
        if(n%2==0)
        throw new IOException("this is error in first method");
        else{
            System.out.println("no is odd");
        }
    }
}
public class TestException {
    public static void main(String args[]){
        Test T=new Test();
        try{
        T.first(21);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }










       /*   Scanner scan=new Scanner(System.in);
         int a,b,c;
         System.out.println("enter the two number");
         a=scan.nextInt();
         b=scan.nextInt();
         try{

            if(b==5)
           throw (new ArithmeticException("Divide by 5"));
            c=a/b;
            System.out.println(c);
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
         
*/
    }
}
