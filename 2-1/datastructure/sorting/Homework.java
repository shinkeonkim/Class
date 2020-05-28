public class Homework {
    public static void main(String[] args) {
        
        Employee[] employees1 = new Employee[110];
        Employee[] employees2 = new Employee[1100];
        Employee[] employees3 = new Employee[11000];
        Employee[] employees4 = new Employee[110000];

        Employee[] employees12 = new Employee[110];
        Employee[] employees22 = new Employee[1100];
        Employee[] employees32 = new Employee[11000];
        Employee[] employees42 = new Employee[110000];

        // 데이터 생성
        for(int x=0; x<100; x++) {
            employees1[x] = new HourlyEmployee("a","b",x+1,1,1,2000,1.0,1.0);
            employees12[x] = new HourlyEmployee("a","b",x+1,1,1,2000,1.0,1.0);
        }
        for(int x=0; x<1000; x++) {
            employees2[x] = new HourlyEmployee("a","b",x+1,1,1,2000,1.0,1.0);
            employees22[x] = new HourlyEmployee("a","b",x+1,1,1,2000,1.0,1.0);

        }
        for(int x=0; x<10000; x++) {
            employees3[x] = new HourlyEmployee("a","b",x+1,1,1,2000,1.0,1.0);
            employees32[x] = new HourlyEmployee("a","b",x+1,1,1,2000,1.0,1.0);

        }
        for(int x=0; x<100000; x++) {
            employees4[x] = new HourlyEmployee("a","b",x+1,1,1,2000,1.0,1.0);
            employees42[x] = new HourlyEmployee("a","b",x+1,1,1,2000,1.0,1.0);
        }

        // 데이터 랜덤

        for(int x=0; x<50; x++) {
            int randIdx = (int)(Math.random()*50)+49;
            Employee tmp = employees1[x];
            employees1[x] = employees1[randIdx];
            employees1[randIdx] = tmp;

            tmp = employees12[x];
            employees12[x] = employees12[randIdx];
            employees12[randIdx] = tmp;
        }
        for(int x=0; x<500; x++) {
            int randIdx = (int)(Math.random()*500)+499;
            Employee tmp = employees2[x];
            employees2[x] = employees2[randIdx];
            employees2[randIdx] = tmp;

            tmp = employees22[x];
            employees22[x] = employees22[randIdx];
            employees22[randIdx] = tmp;
        }
        for(int x=0; x<5000; x++) {
            int randIdx = (int)(Math.random()*5000)+4999;
            Employee tmp = employees3[x];
            employees3[x] = employees3[randIdx];
            employees3[randIdx] = tmp;

            tmp = employees32[x];
            employees32[x] = employees32[randIdx];
            employees32[randIdx] = tmp;
        }
        for(int x=0; x<50000; x++) {
            int randIdx = (int)(Math.random()*50000)+49999;
            Employee tmp = employees4[x];
            employees4[x] = employees4[randIdx];
            employees4[randIdx] = tmp;

            tmp = employees42[x];
            employees42[x] = employees42[randIdx];
            employees42[randIdx] = tmp;
        }


        // Merge Sort
        long startTime = System.currentTimeMillis();
        long endTime = 0;
        MergeSort.mergeSort(employees1, 0, 99);

        endTime = System.currentTimeMillis();
        long MergeTime1 = endTime - startTime;

        startTime = System.currentTimeMillis();
        MergeSort.mergeSort(employees2, 0, 999);
        endTime = System.currentTimeMillis();
        long MergeTime2 = endTime - startTime;

        startTime = System.currentTimeMillis();
        MergeSort.mergeSort(employees3, 0, 9999);
        endTime = System.currentTimeMillis();
        long MergeTime3 = endTime - startTime;

        startTime = System.currentTimeMillis();
        MergeSort.mergeSort(employees4, 0, 99999);
        endTime = System.currentTimeMillis();
        long MergeTime4 = endTime - startTime;

        //Selectiopon Sort

        startTime = System.currentTimeMillis();
        SelectionSort.selectionSort(employees12, 100);
        endTime = System.currentTimeMillis();
        long SelectionTime1 = endTime - startTime;

        startTime = System.currentTimeMillis();
        SelectionSort.selectionSort(employees22, 1000);
        endTime = System.currentTimeMillis();
        long SelectionTime2 = endTime - startTime;

        startTime = System.currentTimeMillis();
        SelectionSort.selectionSort(employees32, 10000);
        endTime = System.currentTimeMillis();
        long SelectionTime3 = endTime - startTime;

        startTime = System.currentTimeMillis();
        SelectionSort.selectionSort(employees42, 100000);
        endTime = System.currentTimeMillis();
        long SelectionTime4 = endTime - startTime;

        
        System.out.println("Merge Sort(size 100): "+MergeTime1);
        System.out.println("Merge Sort(size 1000): "+MergeTime2);
        System.out.println("Merge Sort(size 10000): "+MergeTime3);
        System.out.println("Merge Sort(size 100000): "+MergeTime4);
    
        System.out.println("Selection Sort(size 100): "+SelectionTime1);
        System.out.println("Selection Sort(size 1000): "+SelectionTime2);
        System.out.println("Selection Sort(size 10000): "+SelectionTime3);
        System.out.println("Selection Sort(size 10000): "+SelectionTime4);
    }
}