package Grade12.unit2_object.HW19;

public class Lab {
    private int maxCapacity;
    static int currentYear = 2022;
    Computer[] computers;

    public Lab(int computerNum) {
        if (computerNum <= maxCapacity) {
            computers = new Computer[computerNum];
        } else {
            computerNum = maxCapacity;
            computers = new Computer[computerNum];
        }
    }

    public void installComputer(int computerNum, String serialNum, String manufacturer, int madeYear,
            int purchaseYear,
            double speed, int ramSize, int expiryYear) {
        for (int i = 0; i < computerNum; i++) {
            if (computers[i] == null) {
                computers[i] = new Computer(serialNum, manufacturer, madeYear, purchaseYear, speed, ramSize,
                        expiryYear);
                return;
            }
        }
    }

    public Computer fastest() {
        int a = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[a].isFaster(computers[i]) && computers[a] != null) {
                a = i;
            }
        }
        return computers[a];
    }

    public Computer largest() {
        int a = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[a].isLarger(computers[i])) {
                a = i;
            }
        }
        return computers[a];
    }

    public Computer newest() {
        int a = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[a].isNewer(computers[i])) {
                a = i;
            }
        }
        return computers[a];
    }

    public int sameManufacturer(String manufacturer) {
        int num = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i].getManyfacturer().equals(manufacturer)) {
                num++;
            }
        }
        return num;
    }

    public Computer[] expiringComputers() {
        Computer[] expiring;
        int expiringNum = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i].getExpiryYear() - currentYear <= 1) {
                expiringNum++;
            }
        }
        expiring = new Computer[expiringNum];
        int a = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i].getExpiryYear() - currentYear <= 1) {
                if (expiring[a] != null && a <= expiringNum) {
                    a++;
                }
                expiring[a] = computers[i];
            }
        }
        return expiring;
    }

    public int averageAge() {
        int average = 0;
        int length = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null) {
                length++;
                average += (currentYear - computers[i].getmadeYear());
            }
        }
        return (average / length);
    }
}