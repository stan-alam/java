//Create a 2nd thread
class NewThread implements Runnable {
  Thread t;

NewThread() {
//create a new, 2nd thread
  t = new Thread(this, "Hello, Multiverse(s)!");
  System.err.println("Children of the thread: " + t);
}

//enter 2nd thread!
public void run() {
  try{
    for(int i = 10; i > 0; i--) {
	System.err.println("children of the thread : part 2: " + i);
Thread.sleep(5000);
    }
  } catch (InterruptedException e) {
    System.err.println("error");
    }
  System.out.println("Exiting child thread");
  }
}
class ChildrenOfTheThread {
  public static void main(String args[]) {
    NewThread nt = new NewThread(); //create the new thread

      nt.t.start();
      
      try {
	for(int i = 5; i > 0; i--) {
	  System.err.println("Main Thread: " + i);
	    Thread.sleep(1000);
	  }
	} catch (InterruptedException e) {
	  System.out.println("Error main thread");
      }
  System.err.println("Done..mainthread");
    }
  }   
