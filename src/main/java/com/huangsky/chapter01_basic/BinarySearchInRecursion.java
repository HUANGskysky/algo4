package com.huangsky.chapter01_basic;

/**
 * @Description:
 * 递归版二分查找
 * @author:huangtiande
 * @date:2020/12/14 11:29
 * @Email:huangtiande@jd.com
 */
public class BinarySearchInRecursion {
    public static void main(String[] args) {

    }

    private static int rank(int key, int[] arr) {
        return rankInRecursion(key, arr, 0, arr.length-1);
    }

    private static int rankInRecursion(int key, int[] arr, int lo, int hi) {
        int mid = lo + (hi - lo)/2;
        if (lo > hi) return -1;
        if (key < arr[mid]) return rankInRecursion(key, arr, lo, mid-1);
        else if (key > arr[mid]) return rankInRecursion(key, arr, mid + 1, hi);
        else return mid;

    }
}
