package selectionsort;
public class SelectionSort {
    public static void main(String[] args) {
        int data [] = {100,76,3,9,50,25,4};
        selectionSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }
    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1 ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data [minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }
}
