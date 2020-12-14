package com.huangsky.chapter02_sorting;

/**
 * @Description:
 * 插入排序
 * @author:huangtiande
 * @date:2020/12/14 14:42
 * @Email:huangtiande@jd.com
 */
public class InsertionSorting extends BaseSorting {

    @Override
    public void sort(int[] a) {
        int N = a.length;
        for (int i = 1; i<N; i++) {
            for (int j = i; j>0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }
}
