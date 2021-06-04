package BasicsMultithreadingPrograms;
//Implementing the java.lang.Runnable interface
public class CreatingThreadUsingRunnableInterface implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread is running via implementing Runnable Interace");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i+"using thread"+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			System.out.println("Thread name = "+ Thread.currentThread().getName());
		}
		catch(InterruptedException e) {
			System.out.println("Interruption occured --> Runnable Interace");
		}
		System.out.println("Thread Completed --> Runnable Interace. Processed" );
	}
}
