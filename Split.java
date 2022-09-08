public class Split{  
	public static void main(String args[]){
		String Ocean = "The ocean is a huge body of saltwater that covers about 71 percent of Earth’s surface. The planet has one global ocean, though oceanographers and the countries of the world have traditionally divided it into four distinct regions: the Pacific, Atlantic, Indian, and Arctic oceans.";
		String[] words=Ocean.split("\\s");  
		for(String spl:words){  
		System.out.println(spl);  
	}  
}}