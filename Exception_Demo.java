import java.util.Scanner;
public class Exception_Demo{
	public static void main(String[] args){
		try{
			try{
				int Num1,Num2,Num3;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter two numbers : ");
				Num1 = s.nextInt();
				Num2 = s.nextInt();
				Num3 = Num1/Num2;
				System.out.println(Num3);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("A number cannot be divided by 0 !!!");
			}
			catch(Exception e3)
			{
				System.out.println("Enter numbers only!!!");
			}
			String Num4 = null;
			if (Num4.equals("ABC"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
		}
		catch(Exception ee)
		{
			System.out.println("The String is assigned with a null value");
		}
	}
}