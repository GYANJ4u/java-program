/* find sum of each diagonal (left & right) elements separately of a user entered 3*3 matrix in java.*/
 

import java.util.scanner;
public class diagonalsum
{
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
int[][] matrix = new int[3][3];

system.out.println("enter the elements of 3*3 matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
system.out.print("enter elements at position[" + (i + 1) + "][" + (j + 1) + "]: ");

matrix[i][j]=scanner.nextInt();
}
}
int leftDiagonalSum = 0;
for (int i = 0; i < 3; i++) 
{
leftDiagonalSum += matrix[i][i];
}
int rightDiagonalSum = 0;
for (int i = 0; i < 3; i++) 
{
rightDiagonalSum += matrix[i][2 - i];
System.out.println("Matrix:");
displayMatrix(matrix);

System.out.println("Sum of left diagonal: " + leftDiagonalSum);
System.out.println("Sum of right diagonal: " + rightDiagonalSum);

scanner.close();
}
}
}










