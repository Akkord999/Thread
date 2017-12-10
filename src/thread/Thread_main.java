package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Thread_run th = new Thread_run();
		Thread_runnable th2 = new Thread_runnable();
		th.start();
		th2.run();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		Thread_run []th = new Thread_run[5];
		for (int i = 0; i < 4; i++) {
			   th[i] = new Thread_run();
			   th[i].run();
		}
		
		Thread_run []th2 = new Thread_run[5];
		for (int i = 0; i < 4; i++) {
			   th2[i] = new Thread_run();
			   th2[i].run();
		}
		
		for (int i = 0; i < 4; i++) {
			try {
				th[i].join();	
			}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		}
		
		
	    for (int i = 0; i < 10; i++)
		        System.out.println("ƒƒCƒ“‚©‚ço—ÍF" + i);
	
	}

}
