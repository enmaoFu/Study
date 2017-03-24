package com.yy.study.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * Map 集合是一个以 key-value 形式存在的的集合
 * HashMap 是 Map 的实现类，实现了 Map 接口
 * 特点：
 * 是以 key-value 形式的，有必要指出，此处的以 key-value 形成存储并不是将 key 和 value 分开，而是当做一个整体
 * key-value 的整体就是 Entry ，它是一个内部类，也就是用它来存储 key-value 的
 * key 不能重复，value可以重复。但如果出现重复 key 的时候，会覆盖之前 key 所对应 value 的值
 * 底层是基于数组和链表实现的，具体实现方法是拉链法
 * 有必要提出，数组中的每一项对应了一个链表，这种结构称“链表散列”的数据结构，即数组和链表的结合体；也叫散列表、哈希表。
 * 线程安全的
 * 无序的
 */
public class HashTableStudy {

    /**
     * 通过多态的方式实例一个 HashTable 集合对象
     *
     * HashTable 与 HashMap 十分相似
     * 当创建一个不带参数的 HashTable 时，在底层会生成一个默认长度为11，加载因子为0.75的哈希表
     * 当创建一个带 Int 参数的 HashTable 时，在底层会生成一个对应传入参数长度的哈希表，加载因子默认为0.75
     * 当创建一个带 Int 参数和 Folat 参数的 HashTable 时，会在底层生成一个对应传入参数长度和加载因子的哈希表
     * 还有一个带参数的构造方法，但根据源码注释不是太懂且不常用，此处不深究
     *
     * 如果添加的元素超过了默认容量会扩容，即：原容量*2+1
     */
    private Map map = new Hashtable();

    /**
     * 添加数据
     * HashTable 的 key 和 value 均不能为 null ，否则会抛出异常
     */
    public void addData(){

        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

    }

    /**
     * 查询数据
     */
    public void selectData(){

        /*Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }*/

         for (Object key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

    }

    /**
     * 删除数据
     */
    public void deleteData(){

        map.remove("3");

    }

}
