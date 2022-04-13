package com.company;

public class Main {

    public static void main(String[] args) {
        /* ALL PRIMITIVE TYPES HAVE A WRAPPER CLASS */

        /* INT DATA TYPE */
        int myValue = 10000;
        // Integer is a wrapper class for int data type
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // This overflows because it is too big of a number
        System.out.println("Busted MAX Value " + (myMaxIntValue + 1));

        // This underflows because it is too low of a number
        System.out.println("Busted MIN Value " + (myMinIntValue - 1));

        // Can use underscores to separate the place
        int myMaxIntTest = 2147483647;


        /*  BYTE DATA TYPE  */
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value " + myMinByteValue);
        System.out.println("Byte Maximum Value " + myMaxByteValue);


        /* SHORT DATA TYPE */
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value " + myMinShortValue);
        System.out.println("Short Maximum Value " + myMaxShortValue);


        /* LONG DATA TYPE */
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value " + myMinLongValue);
        System.out.println("Long Maximum Value " + myMaxLongValue);

        // Java auto assumes numbers are integers, that's why we add L to end of long
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);


        /* CASTING IN JAVA */
        // Treat or convert a number from one type to another
        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        // We put the type we want the number to be in parentheses
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        /* USE INT FOR THE MOST PART */

        byte challengeByte = 10;
        short challengeShort = 20;
        int challengeInt = 50;
        long challengeLong = 50000L + 10L * (challengeInt + challengeShort + challengeByte);
        System.out.println(challengeLong);

        short shortTotal = (short) (1000 + 10 * (challengeByte + challengeShort + challengeInt));

    }
}
