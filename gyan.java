class student
{
int rollno;
String name;
static String college ="kalinga";
student(int r,String n)
{
rollno = r;
name = n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[])
{
student s1 = new student(3950,"prakash");
student s2 = new student(3951,"gyan");
s1.display();
s2.display();
}
}