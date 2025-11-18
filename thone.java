public class thone {
    public static void main(String[] args) {
        int result;
        int [][] n = {{1,2,3},{4,5,6}};
        int [][] m = {{3,5,7},{6,9,8}};

   int [][] p = {{0,0,0},{0,0,0}};

   for(int i=0;i<n.length;i++){
    for(int j=0;j<n[i].length;j++){
        System.out.format("value for i=%d and j=%d\n",i,j);
        p[i][j] = n[i][j] + m[i][j]; 


    }
   }
   for(int i=0;i<n.length;i++){
    for(int j=0;j<n[i].length;j++){
        System.out.format(p[i][j]+ " ");
        p[i][j] = n[i][j] + m[i][j]; 

    }
    System.out.println(" ");
    
}
    }
}
