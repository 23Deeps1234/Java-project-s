/*Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct.*/ 
  
package mysecond;

	class produce
	{
		int availableProduct=10;
		synchronized public void demandMethod(int avail)
		{
			if(availableProduct<avail) 
			{
				try {
					wait(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
				availableProduct-=avail;
				System.out.println("Demand product......"+availableProduct);
			}
		
		synchronized public void supplyMethod(int i)
		{
			availableProduct+=i;
			System.out.println("supply product........"+availableProduct);

			notify();
		}
	}
	class MyThread1 extends Thread{
		produce tc;
		MyThread1(produce tc)
		{
			this.tc=tc;
		}
		public void run()
		{
			tc.demandMethod(2);
		}
	}class MyThread2 extends Thread{
		produce tc;
		MyThread2(produce tc)
		{
			this.tc=tc;
		}
		public void run()
		{
			tc.supplyMethod(3);
		}
	} 
	public class Producer {

		public static void main(String[] args) {
			
			produce tc=new produce();
				MyThread1 th=new MyThread1(tc);
				MyThread2 th1=new MyThread2(tc);
				th.start();
				th1.start();

		}

	}

