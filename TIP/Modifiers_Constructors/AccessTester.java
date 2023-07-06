package TIP.Modifiers_Constructors;

public class AccessTester {
	public static void main(String[] args) {
		AccessExample ae = new AccessExample();
		ae.publicMethod();

		// ae.privateMethod();
		// Error Because Private cant be used in another class

		ae.noAccessModifierMethod();
	}
}