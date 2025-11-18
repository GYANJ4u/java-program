import java.util.Scanner;

public class egarah {
    public static void main(String[] args) {
    int age;

    System.out.println("enter age");
    Scanner sc = new Scanner(System.in);
    age=sc.nextInt();
    if(age>18){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
    }

        }