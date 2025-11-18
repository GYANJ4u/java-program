public class tnine {
    public static void main(String[] args) {
        float[] elements={1.0f,2.0f,3.0f,4.0f,5.0f,6.0f};
        float num=7.0f;

        boolean isinarray=false;
        for(float number:elements){
            if(num==number){
                isinarray=true;
            }

        }
        if(isinarray){
        System.out.println("ispresent");
    }
    else{
        System.out.println("not in ");
    }
}
}
