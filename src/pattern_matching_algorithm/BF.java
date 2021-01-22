package pattern_matching_algorithm;

/**
 * @author TIMI
 * @Date 2021/1/22 - 18:33
 */
public class BF {


    public static void main(String[] args) {
        String str = "adskaklj";
        String str1 = "ska";
        int result = bF(str, str1);
        if(result > 0) {
            System.out.println("匹配成功");
        } else {
            System.out.println("匹配失败");
        }
    }
    public static int bF(String str, String str1) {
        char[] arr1 = str.toCharArray();
        char[] arr2 = str1.toCharArray();
        int i = 0, j = 0;//i用于记录字符串中开始匹配的位置；j记录模式串中配的字符位置
        while (i < arr1.length && j < arr2.length) { // 当字符串没有被遍历完并且模式串没有遍历完
            if (arr1[i] == arr2[j]) { //当字符串中的字符和模式串中相等
                i++;    //字符串匹配位置加一
                j++;    //模式串匹配位置加一
            } else {    //字符串和模式串中对应位置不相等
                i = i - j + 1;  //字符串匹配位置回到开始位置的下一个
                j = 0;  //模式串开始匹配回到0
            }
        }
        if (j == arr2.length) { //当模式串中的位置达到最后说明匹配成功
            return i - arr2.length; //返回模式串在字符串中的位置
        } else {
            return 0;//匹配失败
        }
    }

}
