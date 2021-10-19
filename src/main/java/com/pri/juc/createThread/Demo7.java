package com.pri.juc.createThread;

import java.util.Arrays;
import java.util.List;

/**
 * lambda 表达式<BR>
 * author: ChenQi <BR>
 * createDate: 2021/10/19 <BR>
 */
public class Demo7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,60,30,40,10);
        int res = new Demo7().add(list);
        System.out.println("res:"+res);

    }

    public int add (List<Integer> list){
        list.stream().forEach(System.out :: println);
        System.out.println("-----------");
        list.parallelStream().forEach(System.out :: println);

        System.out.println("-----------");
        System.out.println("max():"+list.stream().mapToInt(i -> i).max());
        int re = list.stream().mapToInt(i -> i).sum();
        return re;
    }
}
