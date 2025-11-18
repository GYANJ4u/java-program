import java.util.Scanner;
public class terash{
 public static void main(String[] args) {
    byte m1,m2,m3;
    Scanner sc = new Scanner(System.in);
    System.out.println("physics");
    m1 = sc.nextByte();
    System.out.println("chemistry");
    m2 = sc.nextByte();
    System.out.println("math");
    m3 = sc.nextByte();

    float avg = (m1+m2+m3)/3.0f;
    System.out.println("percentage" +avg);
    if(avg>=48 && m2>=33 && m3>=23)
    {
        System.out.println("promot");

    }
    else{
        System.out.println("fail");
    }
 }
}