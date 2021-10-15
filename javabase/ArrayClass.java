package javabase;

/**
 * @Author max.zhang
 * @Date 2021/10/13 14:02
 * @Description 数组
 */
public class ArrayClass {
    public static int myaddone(int idx){
        return idx + 1;
    }

	public static int mybinarysearch(int[] arr, int key){
        int low = 0;
        int high = arr.length;

        // low <= high : 等于的含义为，一般在最后一次比较中，key需要和相邻两个数进行比较，如果不加等于时，
        // key只和相邻两数中其中一个进行比较
        while (low <= high){
            int mid = (low + high) >>> 1;

            int middlevalue = arr[mid];

            if (middlevalue < key){
                low = mid + 1;
            }
            else if (middlevalue > key){
                high = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int[] bubblesort(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                int tmp = 0;
                if (arr[j] > arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++){
            res[i] = arr[i];
        }
        return res;
    }



    public static void main(String[] args) {
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));

//        Arrays.fill(arr, 1);
//        System.out.println(Arrays.toString(arr));
//        int[] arr = {0, 1, 9, 4, 6, 3, 4, 0};
//        int[] arr = {0, 1};
//        Arrays.sort(arr);
//        System.out.println(arr.length);
//        int idx = Arrays.binarySearch(arr, 0);
//        int myidx = mybinarysearch(arr, 0);
//        System.out.println("√ binarySearch (index): " + idx + '\n' + "mybinarysearch (index): " + myidx);
//        int[] newarr = arr.clone();
//        for (int val : newarr){
//            System.out.print(val + " ");
//        }
//        System.out.println();
//        Integer[] arr = {0, 1, 9, 4, 6, 3, 4, 0};
//        myComparator cmp = new myComparator();
//        Arrays.sort(arr, cmp);
//        for (Integer val : arr){
//            System.out.print(val + " ");
//        }
//        System.out.println();
//        int[] arr = {0, 1, 9, 4, 6, 3, 4, 0};
        int[] arr = {77, 90, 68, 59, 80};

        int[] newarr = bubblesort(arr);
        for (int val : newarr){
            System.out.print(val + " ");
        }
        System.out.println();


    }

}


