package com.zking.crm.util;

import java.io.Serializable;

public class test1 {
    public static void main(String[] args) {
        String s="1,2,3,4,5,6,7,8,9";
        String[] sFirst = s.split(",");
        int k = 0;
        String[] sSencond = new String[k];
        for (int i = 0;i<sFirst.length;i++) {
            sSencond = sFirst[i].split(",");
            k+=sSencond.length;
        }
        System.out.println("k=" + k);
        System.out.println("k=" + sSencond.length);
        for (int i = 0;i<sSencond.length;i++) {
            System.out.println(sSencond[i]);
        }
    }
}
