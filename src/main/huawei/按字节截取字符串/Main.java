package main.huawei.按字节截取字符串;

import java.util.Scanner;

/**
 * 题目描述
 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。但是要保证汉字不被截半个，如"我ABC"4，应该截为"我AB"，
 * 输入"我ABC汉DEF"6，应该输出为"我ABC"而不是"我ABC+汉的半个"。
 * 输入描述:
 * 输入待截取的字符串及长度
 * 输出描述:
 * 截取后的字符串
 * 示例1
 * 输入
 * 我ABC汉DEF
 * 6
 * 输出
 * 我ABC
 */
public class Main {
    public static String jieQu(String str, int n) {
        char[] ch = str.toCharArray();
        int count = 0;
        int i = 0;
        int len = ch.length;
        for (; i < len; i++) {
            if ((ch[i] > 'a' && ch[i] < 'z') || (ch[i] > 'A' && ch[i] < 'Z')) {
                count++;
            } else {
                count += 2;
            }
            if (count > n) {
                break;
            }
        }
        return str.substring(0, i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] strings = scanner.nextLine().split(" ");
            String str = strings[0];
            int n = Integer.parseInt(strings[1]);
            System.out.println(jieQu(str, n));
        }
    }
}
