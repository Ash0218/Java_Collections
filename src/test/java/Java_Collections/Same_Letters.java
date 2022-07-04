package Java_Collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Same_Letters {
    public static void main(String[] args) {
        boolean result = Same("abc", "cba");
        boolean result2 = Same("abc", "cbb");

        System.out.println(result);
        System.out.println(result2);
    }


public static boolean Same(String str1, String str2){
    str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
    str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

    return str1.equals(str2);
} }
