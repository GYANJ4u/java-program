import java.util.Scanner;
public class four {
public static void main(String[] args) {
    System.out.println("input taking from user");
    Scanner sc= new Scanner(System.in);
    System.out.println("marks of subject 1");
    float a=sc.nextInt();
    System.out.println("marks of subject 2");
    float b=sc.nextInt();
    System.out.println("marks of subject 3");
    float c=sc.nextInt();
    System.out.println("marks of subject 4");
    float d=sc.nextInt();
    System.out.println("marks of subject 5");
    float e=sc.nextInt();
    float total=a+b+c+d+e;
    float percentage=(total/500)*100;
    System.out.println("the percentage is");
    System.out.println(percentage);
}
}
