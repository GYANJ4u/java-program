class cylinder{
    private int height;
    private int radius;

    public int getRadius(){
        return radius;
    }
    public void getradius(){
        this.radius = radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height = height;
    }
    
}
    public class fnine {
        public static void main(String[] args) {
            cylinder mCylinder = new cylinder();
            mCylinder.setheight(12);
            int h = mCylinder.getheight();
            System.out.println(h);
            mCylinder.setradius(9);
           
            System.out.println(mCylinder.getRadius());
        }
    
}
