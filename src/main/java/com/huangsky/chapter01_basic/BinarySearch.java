package com.huangsky.chapter01_basic;

/**
 * @Description:
 * 有序数组的二分查找
 * 实际应用：白名单过滤，可以想象一家信用卡公司， 它需要检查客户的交易账号是否有效
 * @author:huangtiande
 * @date:2020/12/14 11:19
 * @Email:huangtiande@jd.com
 */
public class BinarySearch {

    public static void main(String[] args) {

    }

    public static int binarySearch(int key, int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (key < arr[mid]) hi = mid - 1;
            else if (key > arr[mid]) lo = mid + 1;
            return mid;
        }
        return -1;
    }


}
