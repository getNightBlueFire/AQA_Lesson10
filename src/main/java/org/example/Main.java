package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        console();
        Thread thread = Thread.currentThread();

        String s = "q3tw4gr";

        String d = "test";

        String s1 = new String("test2");
        String d2 = new String("test2");


        Float f = (3.4f);
        System.out.println(s == d);

        System.out.println(s1 == d2);
        boolean equals = s1.equals(d2);
        System.out.println(equals);

        String testConcatenation = "sdasf".concat("dasgadhgdh");
        testConcatenation = testConcatenation.concat("21325354").concat("dasg").concat("sdasfg");
        System.out.println(testConcatenation);
        System.out.println("sdsagasg" + "sdasfgg");
        String s2 = String.valueOf(123322324124.5f);
        System.out.println(s2);

        String join = String.join("; ", "10", "20", "30");
        System.out.println(join);
        String[] s3 = join.split("\\s+");
        System.out.println(Arrays.toString(s3));

        int i = s.compareTo(d);
        System.out.println(i);


        System.out.println(s);

        s = s.replace("t", " ");

        System.out.println(s);

        char c = "123456789".charAt(0);

        System.out.println(c);
        char[] testChar = new char[10];
        "eqwfgtjweafwrhtbsfvdfg".getChars(10, 20, testChar, 0);

        System.out.println(Arrays.toString(testChar));

        boolean b = "sdagadg".startsWith("ggg");

        String substring = "1234567890".substring(5);
        System.out.println(substring);

        System.out.println("ssss".toUpperCase());

        String testEmpty = "    ";

        System.out.println(testEmpty.isEmpty());

        System.out.println(testEmpty.isBlank());


        if (poly1("123421")) {
            System.out.println("It is polyndrom");
        } else {
            System.out.println("It is not polyndrom");
        }


        StringBuilder sb = new StringBuilder("stringBuilder");
        //String string = sb.toString();
        sb.append("1223").append("213r ");
        sb.insert(6, "Hi");
        sb.delete(6, 8);
        System.out.println(sb);


    }

    public static boolean poly(String arg) {
        String[] test = arg.split("");
        boolean isPoly = false;
        for (int i = 0; i < test.length / 2; i++) {
            String a = test[i];
            String b = test[test.length - 1 - i];
            if (a.equals(b)) {
                isPoly = true;
            } else {
                isPoly = false;
                break;
            }
        }
        return isPoly;
    }

    public static boolean poly1(String arg) {
        StringBuilder sb = new StringBuilder(arg);
        String string = sb.reverse().toString();

        return string.equals(arg);
    }

    public static void console() {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        String[] strings = new String[n];
        for (int i = 0; i < strings.length; i++)
            strings[i] = scanner.nextLine();

        String max = strings[0];
        String min = strings[0];

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < min.length())
                min = strings[i];

            if (strings[i].length() > max.length())
                max = strings[i];

        }

        System.out.println(max);
        System.out.println(min);

    }

}