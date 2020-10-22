
public class Pies {
	String imie;
	int SilaPsa;
	
	Pies(String s)
	{
		imie = s;
	}
	
	
	void dajGlos()
	{
		System.out.println("Hau hau!");
	}
	
	
	void Nakarm(int pokarm)
	{
		this.SilaPsa=pokarm;
	}
	
	
	void ZjedzKota(Kot k)
	{
		System.out.println("Dales psu tak malo jedzenia, ze z glodu zjadl kota imieniem:"+ k.imie);
	}
}
