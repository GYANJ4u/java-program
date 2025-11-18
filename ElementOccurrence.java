import java.util.Scanner;
public class ElementOccurrence 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of elements:");
int size = scanner.nextInt();
int[] numbers = new int[size];
System.out.println("Enter the elements:");
for (int i = 0; i < size; i++) 
{
numbers[i] = scanner.nextInt();
}
int[] uniqueElements = new int[size];
int[] occurrences = new int[size];
int uniqueCount = 0;
for (int number : numbers) 
{
boolean isNewElement = true;
for (int i = 0; i < uniqueCount; i++) 
{
if (uniqueElements[i] == number) 
{
occurrences[i]++;
isNewElement = false;
break;
}
}
if (isNewElement) 
{
uniqueElements[uniqueCount] = number;
occurrences[uniqueCount] = 1;
uniqueCount++;
}
}
for (int i = 0; i < uniqueCount; i++) 
{
System.out.println("Occurrence of " + uniqueElements[i] + "=" + occurrences[i]);
}
}
}