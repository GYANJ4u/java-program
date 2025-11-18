abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double subject1, subject2, subject3;

    A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }
}

class B extends Marks {
    double subject1, subject2, subject3, subject4;

    B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
  
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}

public class Main {
    public static void main(String[] args) {
        A studentA = new A(80, 85, 90);
        B studentB = new B(75, 80, 85, 90);

        System.out.println("Percentage of marks obtained by Student A: " + studentA.getPercentage());
        System.out.println("Percentage of marks obtained by Student B: " + studentB.getPercentage());
    }
}