public class User_Defined{
	static void Stock(int Num){
		if(Num<5)
			try{
				throw new Exception();
			}
			catch(Exception e){
				System.out.println("The Stock is below 5 !!!");
			}
		else
			System.out.println("The Stock is available");
	}
	public static void main(String[] args){
		Stock(2);
		Stock(9);
	}
}