package lambda;

public class Lambda01 {
	
public static void main(String args[]) {
		
		//fun��es lambda
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Ol� mundo");
				
			}
			}).run();		
	// Mesma resposta com lambda	
			
			
		new Thread(() -> System.out.println("Ol� mundo")).run();
		
		
		//SAM - Single Abstract method
		
	
		
			
		
	}

}
