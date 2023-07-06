package Grade12.unit1_algorithm.HW5;

public class Bubble_Sort {
    public static void main(String[] args) {
        double[] ary = { 3, 8, 3, 2, 7 };
        bubbleSort(ary);
        printAry(ary);
        System.out.println("");
        double[] ary2 = { 2, 9, 4, 6, 1, 7, 8 };
        shakeSort(ary2);
        printAry(ary2);
        System.out.println("");

    }
    /*
     * Question 1:
     * (3 8) 3 2 7
     * 3 (3 8) 2 7
     * 3 3 (2 8) 7
     * 3 3 2 (7 8)
     * (3 3) 2 7 8
     * 3 (3 2) 7 8
     * 3 2 (3 7) 8
     * (3 2) 3 7 8
     * 2 (3 3) 7 8
     */

    public static void bubbleSort(double[] ary) {
        double swap;
        boolean sorted = false;
        for (int i = ary.length - 1; i > 0 && !sorted; i--) {
            sorted = true;
            for (int j = 0; j < i; j++) {
                if (ary[j] > ary[j + 1]) {
                    swap = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = swap;
                    sorted = false;
                }
            }
        }
    }

    /*
     * Question 3:
     * (2 9) 4 6 1 7 8
     * 2 (9 4) 6 1 7 8
     * 2 4 (9 6) 1 7 8
     * 2 4 6 (9 1) 7 8
     * 2 4 6 1 (9 7) 8
     * 2 4 6 1 7 (9 8)
     * 2 4 6 1 (7 8) 9
     * 2 4 6 (1 7) 8 9
     * 2 4 (6 1) 7 8 9
     * 2 (4 1) 6 7 8 9
     * (2 1) 4 6 7 8 9
     * 1 2 4 6 7 8 9
     */
    public static void shakeSort(double[] ary2) {
        {
            boolean swapped = true;
            double swap;
            int bot = 0;
            int top = ary2.length - 1;

            while (swapped == true) {
                swapped = false;
                for (int i = bot; i < top; i++) {
                    if (ary2[i] > ary2[i + 1]) {
                        swap = ary2[i];
                        ary2[i] = ary2[i + 1];
                        ary2[i + 1] = swap;
                        swapped = true;
                    }
                }
                if (swapped == true) {
                    swapped = false;
                    top--;
                    for (int i = top - 1; i >= bot; i--) {
                        if (ary2[i] > ary2[i + 1]) {
                            swap = ary2[i];
                            ary2[i] = ary2[i + 1];
                            ary2[i + 1] = swap;
                            swapped = true;
                        }
                    }
                    bot++;
                }
            }
        }
    }

    public static void printAry(double[] ary) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println("");
    }
}
