public class theight {
    static int number(int n){
        if(n==1){
            return 1;
        }
        return n + number(n-1);
    }
    public static void main(String[] args) {
        int c = number(5);
        System.out.println(c);
    }
    
    
}
