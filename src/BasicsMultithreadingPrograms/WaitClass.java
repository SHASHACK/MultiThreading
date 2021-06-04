package BasicsMultithreadingPrograms;

public class WaitClass implements Runnable{
	Message msg;
	WaitClass(Message msg){
		this.msg = msg;
	}
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" started");
		synchronized (msg) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread "+name + " waiting");
				msg.wait();
			}
			catch(InterruptedException e) {
				System.out.println("interruption occured");
			}
			System.out.println("Thread "+name+" notifid at "+System.currentTimeMillis());
			System.out.println("Thread "+name+msg.getMsg());
		}
	}

}
