class phone{
    public void showtime(){
        System.out.println("time is 8 am");
    }
    public void on(){
        System.out.println("turning on phone...");
    }

}
class smartphone extends phone{
    public void music(){
       System.out.println("play music");
    }
    public void name(){
        System.out.println("my name is java in class two");
    }
}
    public class sone {
        public static void main(String[] args) {
            phone obj = new smartphone();
            obj.showtime();
            obj.on();
        }
    
}
