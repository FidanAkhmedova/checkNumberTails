package com.company;

public class TestSome {
    public static void main(String[] args) {
    /*
        int num = 5;
        String number = Integer.toBinaryString(num);
        char[] nums = number.toCharArray();

        if (nums[nums.length - 1] == '1'){
          System.out.println("de " + number);
        }
        System.out.println("dee " + number);
        System.out.println("dee " + nums.length);
        System.out.println("dee " + nums[nums.length - 1]);
        */
        String str = "hi";
        String str1 = str;
        str = "89";
            System.out.println(str1.equals(str));

        int num1 = 3, num2 = 2;
        System.out.println("" + num1 + num2);
        System.out.println(num1 + num2 + "");
        System.out.println(num1 + "" + num2);
        // System.out.println("" + num1 + num2);

        }
}
