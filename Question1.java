class Que1 {
	private int count;
	
	public Que1(){
		count = 1;
	}
	public void increment() {
		count = count + 1;
	}
	public int getCount() {
		return count;
	}
}
public class Q1 {
	public static void main (String []arg) {
		Que1 q1;
		q1 = new Que1();
		q1.increment();
		q1.increment();
		System.out.println(q1.getCount());
	}
}
