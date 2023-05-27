package com.hitech.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        // 1.创建集合存储52个大小写字母
        ArrayList<Character> list = new ArrayList<>();
        // 2.遍历集合,添加字母a-z,A-Z
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        // 3.创建StringBuilder容器存储集合中随机获取到的字母
        StringBuilder sb = new StringBuilder();
        // 4.随机获取4个字母
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            // 获取随机索引
            int randomIndex = r.nextInt(list.size());
            char c = list.get(randomIndex);
            sb.append(c);
        }

        // 5.随机获取一位数字并放到sb中
        int randomNumber = r.nextInt(10);
        sb.append(randomNumber);

        // 6. 如果要修改字符串中的内容,先把字符串变成字符数组,在数组中修改,然后再创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        // 7. 拿最后一个索引指向的元素和随机索引指向的元素进行交换
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }
}
