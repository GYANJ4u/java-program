import java.util.*;
class finallly {
    class Abc{
        int mydivision(int a,int b){
            int c=0;
            try{
                c=a/b;
                return c;
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                System.out.println("bye bye");
            }
            return c;
        }
    }
    
}
