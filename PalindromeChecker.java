import java.util.Scanner;
public class PalindromeChecker 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String input:");
String s=sc.nextLine();
if(isPalindrome(s)) 
{
System.out.println("The given String is a palindrome.");
} 
else 
{
System.out.println("The given String is not a palindrome.");
}
sc.close();
}
public static boolean isPalindrome(String s) 
{       
String Input=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
int length=Input.length();
for(int i=0;i<length/2;i++) 
{
if(Input.charAt(i)!=Input.charAt(length-1-i)) 
{
return false;
}
}
return true;
}
}
