class polymorphism {

	void add (int a, int b) {

		System.out.println("sum of the two  numbers is: " +(a + b) ); 
		
	}

	void add (int a, int b , int c) {

		System.out.println("sum of the three numbers is: "+(a + b + c)); 
		
	}


/*void area (double base, double hieght) {

		System.out.println("Area of the triangle is: "+(0.5*base*hieght)); 
		
	}*/

}


class achootty {
      
	public static void main(String[] arguments) {

		polymorphism object = new polymorphism ();	
				
		/*To print the area of a circle having radious 10*/
		object.add(10,10);

		/*To print the area of a square having lenghth 10 and breadth 20 */

		object.add(10, 20 ,30);

		/*To print the area of a triangle having length 10 and hieght 20 */

		//object.area(10.0, 20.0);
	}

}
