package TP10;

public class MonThread extends Thread{
	
	private String s;
	private int i;
	
	public MonThread (String s, int i) {
		this.s = s;
		this.i= i;
	}
	
	public void run() {
		for (int index =0; index< this.i; index ++) {
			System.out.println(s);
			try {
				sleep(1);
			}
			catch(InterruptedException e) {
				
			}
		}
	}

}
