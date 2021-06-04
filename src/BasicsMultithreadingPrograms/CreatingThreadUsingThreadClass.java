package BasicsMultithreadingPrograms;
//Extending the java.lang.Thread class
public class CreatingThreadUsingThreadClass extends Thread{
	public CreatingThreadUsingThreadClass(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("Thread is running via extending Thread Class");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i+"using thread"+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			
			System.out.println("NAme of the thread = "+ Thread.currentThread().getName());
		}
		catch(InterruptedException e) {
			System.out.println("Interruption occured  --> extending Thread Class");
		}
		System.out.println("Thread Completed --> extending Thread Class");
	}
}
