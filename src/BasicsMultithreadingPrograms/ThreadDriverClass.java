package BasicsMultithreadingPrograms;

public class ThreadDriverClass {
	public static void main(String[] args) {
		Thread t1= new Thread(new CreatingThreadUsingRunnableInterface(),"t1");
		CreatingThreadUsingThreadClass t2 = new CreatingThreadUsingThreadClass("t2");
		Thread t3= new Thread(new CreatingThreadUsingRunnableInterface(),"t3");
		CreatingThreadUsingThreadClass t4 = new CreatingThreadUsingThreadClass("t4");
		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(1);
		t4.setPriority(1);
		t1.start();
		try {
			t1.join(4000);
		}
		catch(InterruptedException e) {
			System.out.println("t1 interrupted");
		}
		t2.start();
		t3.start();
		t4.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}
		catch(InterruptedException e) {
			System.out.println("t1 interrupted");
		}
		System.out.println("Ending="+Thread.currentThread().getName());
	}

}
