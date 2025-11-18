class employee{
    private int id;
    private String name;

public employee(){
    id=45;
    name = "your-name-here";
}
public employee(String myName, int myId){
    id = myId;
    name = myName;
}
public String getName(){ return name;}
public void setName(String n) { this.name = n;}
public void setId(int i) { this.id = i;}
public int getId() { return id;}
}
public class feight{
    public static void main(String[] args) {
        employee gyan = new employee("gyanrajwara", 12);
        System.out.println(gyan.getId());
        System.out.println(gyan.getName());
    }
}

    

