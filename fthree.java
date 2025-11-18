class employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
    public class fthree {
    public static void main(String[] args) {
        employee harry = new employee();
        harry.setname("codeyyfyyg");
        harry.salary = 23343;
        System.out.println(harry.getsalary());
        System.out.println(harry.getname());
    }
        

     }

    

