package TIP.Modifiers_Constructors;

public class AccessExample {
    /*
     * ^
     * | Modifiers
     */

    /** public method: this method can be used in everwhere if it called */
    public void publicMethod() {
        System.out.println("This is a public method!");
    }

    /** private method: this method cant be used in outside of the class */
    /* private */ void privateMethod() {
        System.out.println("This is a private method!");
    }

    /**
     * default method: this method cant be used in other packages, but can be used
     * in a same package
     */
    void noAccessModifierMethod() {
        System.out.println("This is a unspecified method!");
    }
}