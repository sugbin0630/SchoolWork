package Grade11.others;

public class Memory_Trace {
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		int num;

		num = a + b;
		System.out.println(num);
		a = 6 + 5 - num;
		b = b + a;
		System.out.println(a + a + num + "&" + b);
	}
}
