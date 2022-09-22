/*Q.1 Write a Java program to create multiple thread in Java.
    (Print even and Odd numbers)Set their name and prorities.*/
package myfirst;

public class MyThread {
	
		  int max;

		  public MyThread(int max) {
		    this.max = max;
		  }

		  public synchronized void even() throws InterruptedException {
		    for (int i = 0; i <= max; i++) {
		      notifyAll();
		      if (i % 2 == 0)
		        System.out.println(Thread.currentThread().getName() + ":= " + i);
		      wait();
		    }
		  }

		  public synchronized void odd() throws InterruptedException {
		    for (int i = 0; i <= max; i++) {
		      notifyAll();
		      if (i % 2 != 0)
		        System.out.println(Thread.currentThread().getName() + ":= " + i);
		      wait();
		    }
		  }

		public static void main(String[]args) {
			
		
		MyThread mt = new MyThread(20);

		//Thread to print even numbers
		Thread t1 = new Thread(new Runnable() {
		  @Override
		  public void run() {
		    try {
		      mt.even();
		    } catch (InterruptedException e) {
		    }
		  }
		});

		//Thread to print odd numbers
		Thread t2 = new Thread(new Runnable() {
		  @Override
		  public void run() {
		    try {
		      mt.odd();
		    } catch (InterruptedException e) {
		    }
		  }
		});

		t1.setName("even Thread1");
		t2.setName(" odd Thread2");
        t1.setPriority(10);
        t2.setPriority(5);
        System.out.println("thread1priority"+t1.getPriority());
  	  System.out.println("thread2priority"+t2.getPriority());
		t1.start();
		t2.start();
}}