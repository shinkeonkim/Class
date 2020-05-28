public class MergeSort {
    
    public static <T extends Comparable<? super T>> void mergeSort(T ar[], int first, int last) {
        @SuppressWarnings("unchecked")
        T[] tempArray =(T[]) new Comparable<?>[ar.length];
        mergeSort(ar, tempArray, first, last);
    }

    public static <T extends Comparable<? super T>> void mergeSort(T ar[], T tempArray[], int first, int last) {
        int mid = (first + last)/2;
        if(first < last) {
            mergeSort(ar, tempArray, first, mid);
            mergeSort(ar, tempArray, mid + 1, last);
            merge(ar,tempArray,first, last);
        }
    }    
    public static <T extends Comparable<? super T>> void merge(T ar[], T tempArray[], int first, int last) {
        int mid = (first + last) / 2;
        int beginHalf1 = first;
        int endHalf1 = mid;

        int beginHalf2 = mid + 1;
        int endHalf2 = last;

        int index = first;
        while((beginHalf1 <= endHalf1) && (beginHalf2 <= endHalf2)) {
            if(ar[beginHalf1].compareTo(ar[beginHalf2]) < 0) {
                tempArray[index] = ar[beginHalf1];
                beginHalf1++;
            }
            else {
                tempArray[index] = ar[beginHalf2];
                beginHalf2++;
            }
            index++;
        }
        while(beginHalf1 <= endHalf1) {
            tempArray[index] = ar[beginHalf1];
            beginHalf1++;
            index++;
        }
        while(beginHalf2 <= endHalf2) {
            tempArray[index] = ar[beginHalf2];
            beginHalf2++;
            index++;
        }

        for(int x=first; x <= last; x++) {
            ar[x] = tempArray[x];
        }
    }
}