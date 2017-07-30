package se;

public class E7 {

	
	
	public void print(byte x) {
	 System.out.print("byte");
	 }
	 public void print(int x) {
	 System.out.print("int");
	 }
	 public void print(float x) {
	 System.out.print("float");
	 }
	 public void print(Object x) {
	 System.out.print("Object");
	}
	 public static void main(String[] args) {
	 E7 t = new E7();
	 int s = 123;
	 t.print(s);
	 t.print(true);
	t.print(6.789);
	 }
}
