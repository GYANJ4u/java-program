class MyClass{
    int n;
    MyClass(int n){
        this.n=n;
    } 
    public String toString(){
        return " "+this.n;
    }
  /*   String str;
    MyClass(String str){
        this.str=str;
    }
    public String toString(){
        return this.str;
    }
        */
}
public class Test1 {
    public static void main(String[] args) {
        /* 
        String S=new String("hello friends");
        MyClass M=new MyClass("hello friends kaise ho");
        System.out.println(S.toString());
        System.out.println(M);
    
        */
        MyClass M=new MyClass(500);
        System.out.println(M);
    }
}
