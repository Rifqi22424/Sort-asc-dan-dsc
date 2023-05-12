public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {64,32,12,22,11,90};
        bubbleSort(arr, true);
        System.out.println("Array yang telah diurutkan secara ascending menggunakan Bubble Sort");
        printArray(arr);

        bubbleSort(arr, false);
        System.out.println("Array yang telah diurutkan secara descending menggunakan Bubble Sort");
        printArray(arr);

        int[] arr2 = {64,32,12,22,11,90};
        insertionSort(arr2, true);
        System.out.println("Array yang telah diurutkan secara ascending menggunakan Insertion Sort");
        printArray(arr2);

        insertionSort(arr2, false);
        System.out.println("Array yang telah diurutkan secara descending menggunakan Insertion Sort");
        printArray(arr2);

        int[] arr3 = {64,32,12,22,11,90};
        selectionSort(arr3, true);
        System.out.println("Array yang telah diurutkan secara ascending menggunakan Selection Sort");
        printArray(arr3);

        selectionSort(arr3, false);
        System.out.println("Array yang telah diurutkan secara descending menggunakan Selection Sort");
        printArray(arr3);
    }

    public static void insertionSort(int arr[], boolean ascending) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && ((ascending && arr[j] > key) || (!ascending && arr[j] < key))) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }   
    }

    public static void selectionSort(int arr[], boolean ascending) {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i+1; j < arr.length; j++) {
                if ((ascending && arr[j] < arr[pos]) || (!ascending && arr[j] > arr[pos])) {
                    pos = j;
                }
            }
            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
