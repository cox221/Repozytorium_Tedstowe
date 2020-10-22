
public class Kot {
 String imie;
 int SilaKota;
 
	Kot(String s)
	{
		imie = s;
	}
	
	
	void dajGlos()
	{
		System.out.println("Miau!");
	}
	
	
	void Nakarm(int pokarm)
	{
		this.SilaKota=pokarm;
	}
	
	
	void zjedzPsa(Pies p)
	{
		System.out.println("Dales kotu tak malo jedzenia, ze z glodu zjadl psa imieniem:"+ p.imie);
	}
	
}
