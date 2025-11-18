public class thirty {
    public static void main(String[] args) {
         
        float [] marks={23.0f,45.0f,67.0f,89.0f,98.0f};
        float sum = 0;
        for(float elements:marks){
            sum=sum + elements;
        }
            System.out.println("the average marks is"+sum/marks.length);

        
    }
    
}
