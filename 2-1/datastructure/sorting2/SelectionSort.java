public class SelectionSort {
    public static <T extends Comparable<? super T>> void selectionSort(T ar[],int n) {
        for(int index = 0; index < n-1; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(ar, index, n-1);
            swap(ar, index, indexOfNextSmallest);
        }
    }

    public static <T extends Comparable<? super T>> int getIndexOfSmallest(T[] ar, int first, int last) {
        T min = ar[first];
        int indexOfMin = first;
        for(int index = first +1; index <=last; index++) {
            // 내림차순으로 바꾸기 위해 compareTo 비교문의 부호 변경
            if(ar[index].compareTo(min) > 0) {
                min = ar[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    private static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}