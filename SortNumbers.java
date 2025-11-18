import java.util.*;
public class SortNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the size of the list:");
int size = scanner.nextInt();
int[] numbers = new int[size];
System.out.println("Enter the list of numbers:");
for (int i = 0; i < size; i++) {
System.out.print("Enter number " + (i + 1) + ": ");
numbers[i] = scanner.nextInt();
}
Arrays.sort(numbers);
System.out.println("Sorted numbers: " + Arrays.toString(numbers));
}
}