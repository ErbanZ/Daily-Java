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

    // 冒泡排序
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
        // 可替换为 System.arraycopy(arr, 0, res, 0, arr.length);
        for (int i = 0; i < arr.length; i++){
            res[i] = arr[i];
        }
        return res;
    }

    public static int middlevalue(int[] arr, int low, int high){
        // arr的第1个数作为中值
        int tmp = arr[low];
        int mid = 0;

        while (low < high){
            while (low < high && arr[high] > tmp){
                high--;
            }
            // 比中值小，放到中值左边
            arr[low] = arr[high];

            while (low < high && arr[low] < tmp){
                low++;
            }
            // 比中值大，放到中值右边
            arr[high] = arr[low];
        }

        arr[low] = tmp;
        mid = low;

        return mid;
    }

    // 快速排序
    public static void quicksort(int[] arr, int low, int high){
//        int[] res = new int[arr.length];
        if (low < high){
            int mid = middlevalue(arr, low, high);
            quicksort(arr, low, mid-1);
            quicksort(arr, mid+1, high);

        }
    }

    // 选择排序
    public static void selectsort(int[] arr){
        int[] res = new int[arr.length];
        int tmp = 0;
        for (int i = 1; i < arr.length; i++){
            // 当前循环最大值下标
            int maxindex = 0;

            // 找到arr[0:arr.length - i]的最大值下标
            for (int j = 1; j <= arr.length - i; j++){
                if (arr[j] > arr[maxindex]){
                    maxindex = j;
                }
            }
            tmp = arr[arr.length-i];
            arr[arr.length-i] = arr[maxindex];
            res[arr.length-i] = arr[maxindex];
            arr[maxindex] = tmp;

        }
    }

    // 直接插入排序
    public static void insertsort(int[] arr){
        int tmp, j;
        for (int i = 1; i < arr.length; i++){
            tmp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > tmp; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = tmp;
        }
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

//        int[] arr = {77, 90, 68, 59, 80, 100};
//        int[] bubblearr = bubblesort(arr);
//        for (int val : bubblearr){
//            System.out.print(val + " ");
//        }
//        System.out.println();
//        int[] arr = {77, 90, 68, 59, 80, 100};
        int[] arr = {13, 15, 24, 99, 14, 11, 1, 2, 3};

//        selectsort(arr);
        insertsort(arr);
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();


    }

}


