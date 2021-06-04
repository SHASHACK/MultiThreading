package BasicsMultithreadingPrograms;

public class NotifyClass implements Runnable{
	Message msg;
	public NotifyClass(Message msg){
		this.msg = msg;
	}
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" started");
		
			try {
				Thread.sleep(1000);
				synchronized (msg) {
				System.out.println("Thread "+name + " notifing");
				msg.setMsg("Thread "+name + " notifing");
				msg.notifyAll();
				}
			}
			catch(InterruptedException e) {
				System.out.println("interruption occured");
			}
			System.out.println("Thread "+name+" ends");
	}

}
