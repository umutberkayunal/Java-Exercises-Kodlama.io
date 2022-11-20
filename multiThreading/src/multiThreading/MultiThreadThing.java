package multiThreading;

public class MultiThreadThing extends Thread{
	
	private int threadNumber;
	public MultiThreadThing(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " from thread" + threadNumber);
			if(threadNumber == 3) {
				//all the other threads will keep on counting
				throw new RuntimeException();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
