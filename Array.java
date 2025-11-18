import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int r,c,m,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of row and column");
        m=scan.nextInt();
        n=scan.nextInt();
       int ar1[][]=new int[m][n];
       int ar2[][]=new int[m][n];
       int ar3[][]=new int[m][n];
       
        System.out.println("enter element in first matrix");
        for (r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                ar1[r][c]=scan.nextInt();
            }
        }
        System.out.println("enter element in second matrix");
        for (r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                ar2[r][c]=scan.nextInt();
            }
        }

        for (r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                System.out.print(ar1[r][c]+" ");
            }
            System.out.println();
        }
        for (r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                System.out.print(ar2[r][c]+" ");
            }
            System.out.println();
        }
        int k;
        for (r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                
                for(k=0;k<m;k++)
                {
                ar3[r][c]=ar3[r][c]+(ar1[r][k]*ar2[k][c]);

            }
        }
        }
        System.out.println("after multiplication");
        for(r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                System.out.print(ar3[r][c]+" ");
            }
            System.out.println();
        }
       // if(m==n)
       // {
    //    for (r=0;r<m;r++)
      //  {
        //    for(c=0;c<n;c++)
          //  {
              //  if(r<=c)
             //   System.out.print(ar[r][c]);
            // if(r==0&&c==0)
             //System.out.println("top left corner" +ar[c][r]);
            // if(r==0&&c==n-1)
             //System.out.println("top right corner" +ar[r][c]);
         //    if(r==m-1&&c==0)
           //  System.out.println("bottom left corner" +ar[r][c]);
        //   if(r==m-1&&c==n-1)
          //   System.out.println("bottom right corner" +ar[r][c]);
        //      }
           // System.out.println();
        //}
             //  }
}
    
    
}
