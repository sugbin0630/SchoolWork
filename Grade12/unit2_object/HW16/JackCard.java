package Grade12.unit2_object.HW16;

public class JackCard {
    private String card_Holder;
    private double discount_Rate, balance;
    private int points, PIN;

    public JackCard() {
        this.card_Holder = "default";
        this.balance = 0;
        this.discount_Rate = 0;
        this.points = 0;
        this.PIN = 1234;
    }

    public JackCard(String card_holder, int PIN, int balance) {
        this.card_Holder = card_holder;
        this.balance = balance;
        this.discount_Rate = 0;
        this.points = 0;
        this.PIN = PIN;
    }

    public boolean refill(int amount) {
        this.balance += amount;
        return true;

        /*
         * Write an instance method refill to add the specified amount to the card. In
         * case the
         * amount will bring the balance over the maximum, the balance will only be top
         * up to the
         * maximum. Be sure to update the discount rate with the new balance. The method
         * should
         * return a boolean, indicating if the full amount can be added.
         */
    }

    public boolean pay(double amount, int PIN, boolean usePoint) {
        if (this.PIN == PIN) {

        }
        return true;
        /*
         * Write a method pay to pay for a purchase. It should take three parameters,
         * amount, PIN,
         * usePoint (boolean). It should first validate the PIN before spending any
         * money / points.
         * The usePoint (boolean) indicate if the customer wants to redeem the points if
         * they are
         * sufficient for the purchase. Be sure to update the discount rate with the new
         * balance. The
         * method should return a boolean, indicating if the purchase is successful
         * (correct PIN,
         * enough money / points)
         */
    }

    public void higherBalance(JackCard c) {
        /*
         * Write a method higherBalance that could be called by a statement like
         * c3 = c1.higherBalance(c2);
         * where c1, c2, and c3 are objects of type JackCard. The method should make c3
         * refer to
         * whichever c1 or c2 that has the higher balance (or c1 if c1 and c2 have the
         * same balance)
         */
    }

    public void morePoints(JackCard c) {

        /*
         * Write a method morePoints that could be called by a statement like
         * c3 = c1.morePoints(c2);
         * where c1, c2, and c3 are objects of type JackCard. The method should make c3
         * refer to
         * whichever c1 or c2 that has the more points (or c1 if c1 and c2 have the same
         * number of
         * points)
         */
    }

    public void combinePoints(JackCard c) {

        this.fixPoints(this.points + c.points);
        c.fixPoints(0);
    }

    public boolean changePIN(String name, int PIN, int newPIN) {
        if (this.card_Holder == name && this.PIN == PIN) {
            fixPin(newPIN);
            return true;
        }
        return false;
    }

    public String toString() {
        return "Card Holder: " + this.card_Holder + "\nBalance: $" + this.balance + "\nDiscount rate: "
                + this.discount_Rate + "%\nPoints: " + this.points + "\nPIN: " + this.PIN;
    }

    public String getName() {
        return this.card_Holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getPercent() {
        return this.discount_Rate;
    }

    public int getPoints() {
        return this.points;
    }

    public int getPIN() {
        return this.PIN;
    }

    public void fixName(String b) {
        this.card_Holder = b;
    }

    public void fixBalance(int b) {
        this.balance = b;
    }

    public void fixPercent(int b) {
        this.discount_Rate = b;
    }

    public void fixPoints(int b) {
        this.points = b;
    }

    public void fixPin(int b) {
        this.PIN = b;
    }
}
