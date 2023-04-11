package org.example;

public class TestThread {
    public static void main(String[] args) {
        MyThread a1 = new MyThread(150, "Hi");
        MyThread a2 = new MyThread(150, " World");

        a1.start();
        a2.start();


    }


}


class MyThread extends Thread{
    int a;
    String test;

    public MyThread(int a, String test) {
        this.a = a;
        this.test = test;
    }

    @Override
    public void run() {
        extracted();
    }

    private synchronized void extracted() {
        for (int i = 0; i < a; i++) {
            System.out.println(test + " " + i);
        }
    }
}
