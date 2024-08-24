import java.util.*;
public class StudentGradeCalculator 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
try 
{
System.out.print("Enter the number of grades: ");
int numGrades=sc.nextInt();
if(numGrades<=0) 
{
System.out.println("Please enter a positive number of grades.");
return;
}
double[] grades=new double[numGrades];
for(int i=0;i<numGrades;i++) 
{
System.out.print("Enter grade "+(i+1)+": ");
grades[i]=sc.nextDouble();
}
double sum=0;
for(double grade:grades) 
{
sum+=grade;
}
double average=sum/numGrades;
System.out.printf("Average grade: %.2f%n", average);
} 
catch(java.util.InputMismatchException e) 
{
System.out.println("Invalid input. Please enter numeric grades.");
} 
finally 
{
sc.close();
}
}
}
