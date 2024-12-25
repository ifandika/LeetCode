/**
 * https://leetcode.com/problems/print-in-order
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

import java.util.concurrent.*; // Semaphore

public class E1114_PrintInOrder {
    public static void main(String[] args) throws InterruptedException {
        int[] nums = {1,3,2};
        Foo foo = new Foo();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                new Thread(() -> {
                    try {
                        foo.first(new Runnable() {
                            @Override
                            public void run() { System.out.print("first"); }
                        });
                    }
                    catch(InterruptedException ie) {}
                }).start();
            }
            else if(nums[i] == 2) {
                new Thread(() -> {
                    try {
                        foo.second(new Runnable() {
                            @Override
                            public void run() { System.out.print("second"); }
                        });
                    }
                    catch(InterruptedException ie) {}
                }).start();
            }
            else if(nums[i] == 3) {
                new Thread(() -> {
                    try {
                        foo.third(new Runnable() {
                            @Override
                            public void run() { System.out.print("third"); }
                        });
                    }
                    catch(InterruptedException ie) {}
                }).start();
            }
        }
    }

    /**
     * 
     */
    public static void solution() {}

    /**
     * Semaphore = Untuk mengontrol berjalannya concurrent/thread
     */
    static class Foo {
        Semaphore run2, run3;

        public Foo() {
            run2 = new Semaphore(0);
            run3 = new Semaphore(0);
        }

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            run2.release(); // Berikan izin
        }

        public void second(Runnable printSecond) throws InterruptedException {
            // printSecond.run() outputs "second". Do not change or remove this line.
            run2.acquire(); // Meminta izin
            printSecond.run();
            run3.release(); // Berikan izin
        }

        public void third(Runnable printThird) throws InterruptedException {
            // printThird.run() outputs "third". Do not change or remove this line.
            run3.acquire(); // Meminta izin
            printThird.run();
        }
    }
}