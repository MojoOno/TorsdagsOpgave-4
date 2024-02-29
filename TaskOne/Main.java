

public class Main{
	public static void main(String[] args){
		
		Team hold1 = new Team("The Mucho Machos");
		Team hold2 = new Team("Whipping Wheelers");
		Team hold3 = new Team("De Dødelige Dudes");
		Team hold4 = new Team("Kedelige Koner");
		Team hold5 = new Team("The Ill Illegal Eagles");
		Team hold6 = new Team("The Breach Brothers");

		hold1.setRank(1);
		hold2.setRank(1);
		hold3.setRank(2);
		hold4.setRank(2);
		hold5.setRank(5);
		hold6.setRank(3);

		System.out.println(hold1.toString());
		System.out.println(hold2.toString());
		System.out.println(hold3.toString());
		System.out.println(hold4.toString());
		System.out.println(hold5.toString());
		System.out.println(hold6.toString());
	}

}