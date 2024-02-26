package clp.concorrente;

public class MyRunnable {
	
	public static void main (String[] args) {
		
		Thread t1 = new Thread( new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("T1: " + i);
				}
			}			
		});
		
		Thread t2 = new Thread( new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("T2: " + i);
				}
			}			
		});

		t1.start();
		t2.start();
		
	}

}
