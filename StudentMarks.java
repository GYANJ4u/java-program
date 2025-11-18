abstract class marks1 {
    protected marks1() {
      // Optional: Perform common initialization for subclasses if needed
    }
  
    public marks1(int... marks) { // Parameterized constructor with variable arguments
      if (marks.length == 0) {
        throw new IllegalArgumentException("Marks cannot be empty");
      }
    }
  
    abstract double getPercentage();
  }
  
  class StudentA extends Marks {
    private int mark1;
    private int mark2;
    private int mark3;
  
    public StudentA(int mark1, int mark2, int mark3) {
      super(mark1, mark2, mark3); // Call parameterized constructor of Marks
      this.mark1 = mark1;
      this.mark2 = mark2;
      this.mark3 = mark3;
    }
  
    @Override
    public double getPercentage() {
      return (mark1 + mark2 + mark3) / 300.0 * 100;
    }
  }
  
  class StudentB extends Marks {
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;
  
    public StudentB(int mark1, int mark2, int mark3, int mark4) {
      super(mark1, mark2, mark3, mark4); // Call parameterized constructor of Marks
      this.mark1 = mark1;
      this.mark2 = mark2;
      this.mark3 = mark3;
      this.mark4 = mark4;
    }
  
    @Override
    public double getPercentage() {
      return (mark1 + mark2 + mark3 + mark4) / 400.0 * 100;
    }
  }
  
  public class StudentMarks {
    public static void main(String[] args) {
      StudentA studentA = new StudentA(80, 75, 90);
      StudentB studentB = new StudentB(70, 85, 60, 90);
  
      double percentageA = studentA.getPercentage();
      double percentageB = studentB.getPercentage();
  
      System.out.println("Percentage of marks for student A: " + percentageA);
      System.out.println("Percentage of marks for student B: " + percentageB);
    }
  }
