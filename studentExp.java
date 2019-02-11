public class studentExp
{
	public static void main(String args[])
	{
		State Kerala = new State("India", "Modi", "Kerala", "Pinarayi Vijayan");
		State Islamabad = new State("Pakistan", "someone", "Islamabad", "someone else");



		Kerala.NameofCM();
		Kerala.NameofState();
		Kerala.NameofCountry();
		Kerala.NameofPM();

		Islamabad.NameofCM();
		Islamabad.NameofState();
		Islamabad.NameofCountry();
		Islamabad.NameofPM();

	}	
}


class Country
{
	public String PM, CName;

	public void NameofCountry()
		{System.out.println(CName);}
	public void NameofPM()
		{System.out.println(PM);}
	public Country(String cname, String pm)
	{
		CName = cname;
		PM = pm;
	}
	
}

class State extends Country
{
	public String CM, SName;
	
	public void NameofCM()
		{System.out.println(CM);}
	public void NameofState()
		{System.out.println(SName);}
	public State(String cname, String pm, String sname, String cm)
	{
		super(cname, pm);
		SName = sname;
		CM = cm;
	}
}


