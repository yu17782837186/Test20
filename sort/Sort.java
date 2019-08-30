package cn.datastructure.com;

public class Sort {
    public static void main(String[] args) {
//        int[] array = {99,12,56,38,64,77,22,9,81,100,0};
//        System.out.println(sort(array,101));
        int[] array = {0,1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(BinarySearch(array,11,0,11));

    }
    public static int sort(int[] arr,int key) {
        //时间复杂度是T(n) = O(n),空间复杂度是S(n) = O(1)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i ;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[] arr,int key) {
        //二分查找非递归 时间复杂度是T(n) = O(logn),空间复杂度是S(n) = O(1)
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = (low + high) >>1;
            if (arr[mid] > key) {
                high = mid-1;
            }else if(arr[mid] < key) {
                low = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[] arr,int key,int low,int high) {
        //递归实现二分查找 时间复杂度为T(n) = O(logn),空间复杂度为S(n) = O(logn)
        if (low > high) {
            return -1;
        }
        int mid = (low + high) >> 1;
        if (arr[mid] == key) {
            return mid;
        }else if (arr[mid] > key) {
            return BinarySearch(arr,key,low,mid-1);
        }else if(arr[mid] < key) {
            return BinarySearch(arr,key,low+1,high);
        }
        return -1;
    }
}
