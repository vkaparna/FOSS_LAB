class sharedVariables {

	public int shared_variable;
}

// Java code for thread creation by extending 
// the Thread class 
class multithreadingDemo extends Thread { 

	private sharedVariables objSharedVar;

	public multithreadingDemo (sharedVariables _objSharedVar) {

		objSharedVar = _objSharedVar;
	}
	
    	public void run() { 
        
		try { 
       			// Displaying the thread that is running 

            		//System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 

			System.out.println ("Thread id: "+Thread.currentThread().getId()+" and value is: "+objSharedVar.shared_variable); 
			objSharedVar.shared_variable++;

		} catch (Exception e) {
 
            		// Throwing an exception 
            		System.out.println ("Exception is caught"); 
        	} 
    	} 
} 
  
// Main Class 
public class multithread {
 
    	public static void main(String[] args) { 
        
		int n = 8; // Number of threads 

		sharedVariables objSharedVar = new sharedVariables();

		objSharedVar.shared_variable = 0;

        	for (int i = 0; i < 8; i++) { 

            		multithreadingDemo object = new multithreadingDemo(objSharedVar); 
            
			object.start(); 
        	} 
    	} 
} 

