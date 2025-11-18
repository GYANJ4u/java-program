import java.util.Scanner;

public class baras {
    public static void main(String[] args) {
        int age;
        System.out.println("enter age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {

            case 18:
            System.out.println("going to adult");
                
                break;
            case 24:
            System.out.println("job");
        
            
                break;
            case 29:
            System.out.println("shadi");
            break;
            default:
            System.out.println("retired");
        }
    }
    
}
