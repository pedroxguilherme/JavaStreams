package lambda;

public class Lambda01 {
	
public static void main(String args[]) {
		
		//funções lambda
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Olá mundo");
				
			}
			}).run();		
	// Mesma resposta com lambda	
			
			
		new Thread(() -> System.out.println("Olá mundo")).run();
		
		
		//SAM - Single Abstract method
		
	
		
			
		
	}

}
