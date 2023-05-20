package com.hitech.day07_exercise.test;

public class Test8 {
    public static void main(String[] args) {
        /*  某系统的数字密码（大于0）。比如1983，采用加密方式进行传输，
            规则如下：
                每位数加上5
                再对10求余，
                最后将所有数字反转，
                得到一串新数。
                按照以上的规则进行解密：
                比如1983加密之后变成8346，解密之后变成1983
        */

        //1.定义数组解密之后的结果
        int[] arr = {1, 9, 8, 3};
        //2.反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.由于加密是通过对10取余的方式获取的
        //所以在解密的时候就需要进行判断，0~4之间+10,5~9数字不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }

        //4.减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        //5.获取数组里的每一个数字拼接成最终的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
