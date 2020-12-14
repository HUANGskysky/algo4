package com.huangsky.chapter01_basic;

/**
 * @Description:
 * 求p,q的最大公约数
 * 欧几里得算法：
 *  计算两个非负整数p和q的最大公约数：
 *  若q是0，则最大公约数为 p。
 *  否则，将p除以q得到余数r，p和q的最大公约数即为q和r的最大公约数。
 *
 * @author:huangtiande
 * @date:2020/12/14 11:07
 * @Email:huangtiande@jd.com
 */
public class EuclidAlgo {

    public static void main(String[] args) {
        int p = 2;
        int q = 8;
        System.out.println(gcd(p, q));
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p%q;
        return gcd(q, r);
    }

}
