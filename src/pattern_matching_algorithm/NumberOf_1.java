package pattern_matching_algorithm;

/**
 * @author TIMI
 * @Date 2021/1/23 - 20:06
 */

import java.util.Scanner;

/**
    这是一个官方最优解，直呼没想到
    我的解法是：遍历二进制中所有的位，只要这个位是1，那么就记录一个，那么时间复杂度就是位数O（n）
    最优解法：就是官方解法，每次本身都和比自己小1的数进行按位与（这样是为了区别出二进制中为1的最低位），直到该数为0，那么时间复杂度为1的个数
    芜湖 ~ ~ ~

 */
public class NumberOf_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int m = sc.nextInt();
        /*这是官方解法*/
        int n = func(m);
        System.out.println("官方解法结果：" + n);

        /*这是自己的解法*/
        int n1 = func1(m);
        System.out.println("我的解法结果：" + n1);



    }
    /*自己的解法*/
    public static int func1(int m) {
        int count = 0;
        while(m!=0) {
            int n = m % 2;
            if(n == 1) {
                count++;
            }
            m/=2;
        }

        return count;
    }

    /*官方解法*/
    public static int func(int m) {
        int count = 0;
        while(m != 0) {
            m = m & (m - 1);
            count++;
        }
        return count;
    }
}



