import java.util.Scanner ;
public class Password{
	public static void main(String[] args){
		char x, y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a password : ");
		x = s.next().charAt(0);
		System.out.println("Confirm your password : ");
		y = s.next().charAt(0);
		if(x!=y)
			try {
				throw new Exception();
			}
			catch(Exception e){
				System.out.println("The passwords do not match!!!");
			}
		else
			System.out.println("Welcome!!");
	}
}