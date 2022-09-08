import java.util.*;
class StringHandling{
  public static void main(String []args)
  {
	  String a, b, c;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a string value : ");
	  a = s.nextLine();
	  System.out.println("Enter a string value : ");
	  b = s.nextLine();
	  System.out.println(a.toUpperCase());
	  char ch=a.charAt(4);
	  System.out.println(ch);
	  System.out.println("string length is: "+a.length());
	  System.out.println(a.substring(2,4));
	  System.out.println(a.substring(2));
	  
  }
}
