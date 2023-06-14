package com.pro09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Pro04 {
    public static void main(String[] args) {
        //输出HashMap中的所有键，及其键对应的值
        HashMap map = new HashMap();
        map.put("studentNumber", "1001"); //键studentNumber，值1001
        map.put("studentName", "张三");
        map.put("studentSex", '男');
        map.put("studentAge", 19);
        map.put("studentHeight", 1.75F);
        //输出所有键
        Set set = map.keySet(); //返回所有键组成的Set集合
        for (Object ob : set) { //取出集合中的每一个键
            Object val = map.get(ob + ","); //通过键找到值
            System.out.print(ob + ":" + val + ",");
        }
        System.out.println("\n==================================");
        Iterator it = set.iterator(); //得到迭代器
        while (it.hasNext()) {
            Object key = it.next(); //取出下一个元素，是键
            System.out.print(key + ",");
        }
        System.out.println("\n==================================");
        Collection col = map.values(); //取出所有值组成的集合
        for (Object ob2 : col) {
            System.out.print(ob2 + ",");
        }
    }
}
