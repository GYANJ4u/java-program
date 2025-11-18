import java.util.*;
public class fifty {
    

    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("enter two number");
    a=scan.nextInt();
    b=scan.nextInt();
    try{
        c=a/b;
        System.out.println(c);
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally
    {
        System.out.println("bye bye");
    }
    System.out.println("take care");
    }
}

    

