package multiThreading;

public class Main {

	public static void main(String[] args) {
		//MultiThreadThing myThread = new MultiThreadThing();
		//MultiThreadThing myThread2 = new MultiThreadThing();
		
		//does not run same time like this, we need to use start to synchronize.
		//myThread.run();
		//myThread2.run();
		
		//myThread.start();
		//myThread2.start();
		
		
		//no guarantee to start ascending order, the counting timing is random for each thread.
		for (int i = 0; i < 5; i++) {
			MultiThreadThing myThread = new MultiThreadThing(i);
			myThread.start();
		}
		throw new RuntimeException();
		//threads will keep on counting disregarding runtime exception.
	}

}
