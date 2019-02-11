class superClass {

	public String name;

	public String group;

	public superClass (String _name, String _group) {

		name = _name;

		group = _group;
	}

	public void whoAmI () {

		System.out.println(this.name);
	}

	public void whichIsMyGroup () {

		System.out.println(this.group);
	}
}

class subClass extends superClass {

	public String name;

	public subClass (String _name, String _name_of_parent, String _group) {

		super (_name_of_parent, _group);

		name = _name;		
	}

	public void whoAmI () {

		System.out.println(this.name);
	}

	public void whichIsMyGroup () {

		//System.out.println(this.group);

		super.whichIsMyGroup();
	}

	public void whoIsMyParent () {

		//System.out.println(super.name);

		super.whoAmI();
	}
}


class inheritance {

    	public static void main(String args[]) {

		subClass objsub = new subClass ("Athul", "Father of Athul", "Student");

		objsub.whoAmI();

		objsub.whoIsMyParent();

		objsub.whichIsMyGroup();
    	}
}







