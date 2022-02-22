package Methodoverloading;

public class Sports {
	
	public void acheiver(String name,int medalCount)
	{
		System.out.println(name);
		System.out.println(medalCount);
	}
	public void acheiver(String country,String sportName,int rank) 
	{
		System.out.println(country);
		System.out.println(sportName);
		System.out.println(rank);
	}

	public void acheiver(float weight,int height,long contactNo)
	{
		System.out.println(weight);
		System.out.println(height);
		System.out.println(contactNo);
		
		
	}
	public void acheiver(String tournamentName,long prizeMoney)
	{
		System.out.println(tournamentName);
		System.out.println(prizeMoney);
		
	}
	public static void main(String[] args) {
		 Sports main=new Sports();
		 main.acheiver("sowmiya", 6);
         main.acheiver("cricket", 2000000000l);
         main.acheiver(80, 6, 7520000000l);
         main.acheiver("India", "cricket", 1);
	}
	
	
}
	
	

