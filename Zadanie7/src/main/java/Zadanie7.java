//Author: Karol Melañczuk
public class Zadanie7 {

	public static void main(String[] args) {
		if(args.length<4)
		{
			System.out.println("Podano zbyt malo argumentow");
			System.exit(0);
		}
		Pies pies = new Pies(args[0]);
		Kot kot = new Kot(args[1]);
		System.out.println("Pies wabi sie: " + args[0] );
		pies.dajGlos();
		System.out.println("Kot wabi sie: "+args[1]);
		kot.dajGlos();
		int PokarmPsa=0;
		try
		{
			PokarmPsa=Integer.parseInt(args[2]);
		}
		catch(NumberFormatException e)
		{
				System.out.println(args[2]+ "Tym nie da sie nakarmic psa!");
				System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		}
		pies.Nakarm(PokarmPsa);
		int PokarmKota=0;
		try
		{
			PokarmKota=Integer.parseInt(args[3]);
		}
		catch(NumberFormatException e)
		{
				System.out.println(args[2]+ "Tym nie da sie nakarmic Kota!");
				System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		}
		kot.Nakarm(PokarmKota);
		if(kot.SilaKota>pies.SilaPsa)
		{
			pies.ZjedzKota(kot);
		}
		else if(kot.SilaKota<pies.SilaPsa)
		{
			kot.zjedzPsa(pies);
		}
		else
		{
			System.out.println("Zwierzeta nakarmione taka sama iloscia jedzenia zyja w zgodzie");
		}
			
		

	}

}
