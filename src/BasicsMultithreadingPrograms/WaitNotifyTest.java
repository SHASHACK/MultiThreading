package BasicsMultithreadingPrograms;

public class WaitNotifyTest {
	public static void main(String[] args) {
		Message msg = new Message("process it");
		WaitClass wc= new WaitClass(msg);
		new Thread(wc,"Wait1").start();
		WaitClass wc2= new WaitClass(msg);
		new Thread(wc2,"Wait2").start();;
		NotifyClass nc1= new NotifyClass(msg);
		new Thread(nc1,"notifier1").start();;
	}

}
