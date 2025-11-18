class Student {
    int rno;
    String name;
    double per;
    Student(int rno,String name,double per)
    {
        this.rno=rno;
        this.name=name;
        this.per=per;
    }
    public String toString(){
        return " "+rno+  this.name+" "+per;
    }

    
}
public class Test2 {
    public static void main(String[] args) {
        Student M=new Student(101,"rajesh",89.99);
        System.out.println(M);
    }
}
