package com.myapp.org.multithreading.baseOperations;

public class ThreadBaseOperations {

	public static void main(String[] args) {
		Runnable r1 = 
				()->{ 
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1");
		// TODO Auto-generated method stub
	};
	Runnable r2 = 
			()->{
			   try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   System.out.println("Thread 2");
	// TODO Auto-generated method stub
};
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.start();
t2.start();
try {
	t1.join();
	t2.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.println("main end");


}
}
