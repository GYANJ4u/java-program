public class teight {

    public static void main(String[] args) {
        float[] elements={1.0f,2.0f,3.0f,4.0f,5.0f,6.0f};
      //  float sum;
        //sum=elements[0]+elements[1]+elements[2]+elements[3]+elements[4]+elements[5];
        //System.out.println(sum);

        float sum=0;
        for(float number:elements){
            sum = sum + number;
        }
        System.out.println("sumis"+sum);
    }
}
