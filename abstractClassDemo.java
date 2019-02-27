abstract class details {

	abstract public void whoAmI ();
}

class kerala extends details {

	public String name;

	public kerala (String _name) {

		name = _name;		
	}

	public void whoAmI () {

		System.out.println(name);
	}
}

class delhi extends details {

	public String stateName;

	public String countryName;

	public delhi (String _stateName, String _countryName) {

		stateName = _stateName;	

		countryName = _countryName;		
	}

	public void whoAmI () {

		System.out.println(stateName+", The capital of "+countryName);
	}
}


class abstractClassDemo {

    	public static void main(String args[]) {

		kerala objkerala = new kerala ("Kerala");

		objkerala.whoAmI();

		delhi objdelhi = new delhi ("Delhi", "India");

		objdelhi.whoAmI();
    	}
}
