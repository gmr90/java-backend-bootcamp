package io.javabrains.javabasics;

import org.w3c.dom.ls.LSOutput;

enum Day {MONDAY, FRIDAY, SUNDAY, TUESDAY, WEDNESDAY}

public class SwitchStatement {

    public static void main(String args[]) {

        int a = 10;
        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("b is 2");
                break;
            default:
                System.out.println("default");
                break;
        }
        // new switch statement from java 14
        Day day = Day.MONDAY;
        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case WEDNESDAY -> 9;
        };
        System.out.println("day ==" + day);
        System.out.println("numLetters ==" + numLetters);
    }
}


