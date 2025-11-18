import java.util.Random;
import java.util.Scanner;
;public class project {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 0 for rock, 1 for paper, 2 for scissor");
        int userInput = sc.nextInt();
        // we generate random number which simulate computer random number
        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput)
        {
            System.out.println("draw");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("you win!");
        } else {
            System.out.println("computer win!");
        }

    }
    
}
