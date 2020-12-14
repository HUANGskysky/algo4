package com.huangsky.chapter02_sorting;

/**
 * @Description:
 * @author:huangtiande
 * @date:2020/12/14 15:24
 * @Email:huangtiande@jd.com
 */
public class ShellSorting extends BaseSorting {

    @Override
    public void sort(int[] a) {
        int N = a.length;
        int h = 1;
        if (h < N/3) h = 3*h - 1;
        while (h >= 1) {
            for (int i = h; i<N; i++) {
                for (int j = h; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }
    }
}
