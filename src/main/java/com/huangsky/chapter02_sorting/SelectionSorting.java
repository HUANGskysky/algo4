package com.huangsky.chapter02_sorting;

/**
 * @Description:
 * 选择排序：
 * @author:huangtiande
 * @date:2020/12/14 14:36
 * @Email:huangtiande@jd.com
 */
public class SelectionSorting extends BaseSorting {

    @Override
    public void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i<N; i++) {
            int min = i;
            for (int j = i+1; j<N; j++) {
                if (less(a[j], a[min]))
                    min = j;
            }
            exch(a, min, i);
        }
    }
}
