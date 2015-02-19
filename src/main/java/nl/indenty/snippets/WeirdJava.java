/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.indenty.snippets;

import java.util.Random;

/**
 *
 * @author tesfayaregay
 */
public class WeirdJava {

    private boolean isEqual(int x, int y) {
        return Integer.valueOf(x) == Integer.valueOf(y);
    }

    public static String randomString(int seed) {
        Random rand = new Random(seed);
        StringBuilder sb = new StringBuilder();
        for (int i = 0;; i++) {
            int n = rand.nextInt(27);
            if (n == 0) {
                break;
            }
            sb.append((char) ('`' + n));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        WeirdJava wj = new WeirdJava();
        System.out.println(wj.isEqual(6, 6));

        System.out.println(wj.isEqual(1000, 1000));

        System.out.println((byte) +(char) -(int) +(long) -1);

        int q = 022 - 2;
        System.out.println(q);
        
        System.out.println(randomString(-229985452)+' '+randomString(-147909649));
    }
}
