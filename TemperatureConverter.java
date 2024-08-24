import java.util.Scanner;
public class TemperatureConverter 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
try 
{
System.out.print("Enter temperature value: ");
double temperature = sc.nextDouble();
System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
char unit=sc.next().charAt(0);
double convertedTemperature;
if(unit=='C'||unit=='c') 
{
convertedTemperature=(temperature*9/5)+32;
System.out.printf("%.2f°C is %.2f°F%n", temperature,convertedTemperature);
} 
else if(unit=='F'||unit=='f') 
{
convertedTemperature=(temperature-32)*5/9;
System.out.printf("%.2f°F is %.2f°C%n", temperature,convertedTemperature);
} 
else 
{
System.out.println("Invalid unit. Please enter C or F.");
}
} 
catch(java.util.InputMismatchException e) 
{
System.out.println("Invalid input. Please enter a numeric temperature value.");
} 
finally 
{
sc.close();
}
}
}
