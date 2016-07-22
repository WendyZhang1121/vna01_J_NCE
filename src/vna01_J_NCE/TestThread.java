package vna01_J_NCE;

public class TestThread implements Runnable {

	public void run() {
		
		Foo test = new Foo();
		int num = (int)(Math.random()*9+1);
     	test.setHelper(num);
     	System.out.println(num);
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
