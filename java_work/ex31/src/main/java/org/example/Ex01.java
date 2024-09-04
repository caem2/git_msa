package org.example;

public class Ex01 {

    public static void main(String[] args) {
        Runnable runnable = ()-> {
            try {
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(100);
                    if (i % 2 == 0)
                        System.out.println(Thread.currentThread().getName() + " " + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(150);
                if (i % 2 == 0)
                    System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(runnable);
        thread2.start();

        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(150);
                if (i % 2 == 0)
                    System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread thread3 = new Thread(runnable);
        thread3.start();
    }
}
