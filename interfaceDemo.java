interface details {

	public void whoAmI ();
}

class kerala implements details {

	public String name;

	public kerala (String _name) {

		name = _name;		
	}

	public void whoAmI () {

		System.out.println(name);
	}
}

class delhi implements details {

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


class interfaceDemo {

    	public static void main(String args[]) {

		kerala objkerala = new kerala ("Kerala");

		objkerala.whoAmI();

		delhi objdelhi = new delhi ("Delhi", "India");

		objdelhi.whoAmI();
    	}
}
