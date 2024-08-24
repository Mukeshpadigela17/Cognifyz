import java.util.*;
public class PasswordGenerator 
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
Random r=new Random();
System.out.print("Enter the desired length of the password: ");
int length=sc.nextInt();
sc.nextLine();
System.out.print("Include numbers?(yes/no):");
boolean includeNumbers=sc.nextLine().equalsIgnoreCase("yes");
System.out.print("Include lowercase letters?(yes/no):");
boolean includeLowercase = sc.nextLine().equalsIgnoreCase("yes");
System.out.print("Include uppercase letters?(yes/no):");
boolean includeUppercase = sc.nextLine().equalsIgnoreCase("yes");
System.out.print("Include special characters?(yes/no):");
boolean includeSpecial=sc.nextLine().equalsIgnoreCase("yes");
String characters="";
if(includeNumbers)characters+="0123456789";
if(includeLowercase)characters+="abcdefghijklmnopqrstuvwxyz";
if(includeUppercase)characters+="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
if(includeSpecial)characters+="!@#$%^&*()-_+=<>?";
if(characters.isEmpty()) 
{
System.out.println("At least one character set must be selected");
sc.close();
return;
}
StringBuilder password=new StringBuilder(length);
for(int i=0;i<length;i++) 
{
password.append(characters.charAt(r.nextInt(characters.length())));
}
System.out.println("Generated password: "+password);
sc.close();
}
}
