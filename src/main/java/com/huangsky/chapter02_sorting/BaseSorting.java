package com.huangsky.chapter02_sorting;

/**
 * @Description:
 * 排序模板类方法：
 * less()
 * exch()
 * isSort()
 * @author:huangtiande
 * @date:2020/12/14 14:10
 * @Email:huangtiande@jd.com
 */
public abstract class BaseSorting {

    public static boolean less(Integer a, Integer b) {
        return a.compareTo(b) < 0;
    }

    public static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean isSort(int[] a) {
        for (int i = 0; i< a.length - 1; i++) {
            if (less(a[i+1], a[i])) return false;
        }
        return true;
    }

    public static void printArr(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public abstract void sort(int[] a);
}
