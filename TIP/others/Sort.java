package TIP.others;

public class Sort {
    public static void main(String[] args) {
        int[] ary1 = { 1, 7, 3, 6, 2, 9, 8 };
        int[] ary2 = { 1, 7, 3, 6, 2, 9, 8 };
        int[] ary3 = { 1, 7, 3, 6, 2, 9, 8 };
        /*
         * THREE TYPES OF SORT
         * Selection Sort: O(n^2)
         * Insertion Sort: O(n)
         * Bubble Sort: O(n^2)
         */
        /** https://en.wikipedia.org/wiki/Selection_sort */
        selectionSort(ary1);
        /** https://en.wikipedia.org/wiki/Insertion_sort */
        insertionSort(ary2);
        /** https://en.wikipedia.org/wiki/Bubble_sort */
        bubbleSort(ary3);
        
    }

    public static void selectionSort(int[] ary) {
        int swap;
        for (int i = 0; i < ary.length; i++) {
            int tmp = i;
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[tmp] >= (ary[j])) {
                    tmp = j;
                }
            }
            swap = ary[i];
            ary[i] = ary[tmp];
            ary[tmp] = swap;
        }
    }

    public static void insertionSort(int[] ary) {
        int key;
        int j;
        for (int i = 1; i < ary.length; i++) {
            key = ary[i];
            j = i - 1;
            while (j >= 0 && key < ary[j]) {
                ary[j + 1] = ary[j];
                j--;
            }
            ary[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] ary) {
        int swap;
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = 1; j < ary.length - i; j++) {
                if (ary[j - 1] > ary[j]) {
                    swap = ary[j];
                    ary[j] = ary[j - 1];
                    ary[j - 1] = swap;
                }
            }
        }
    }
}
