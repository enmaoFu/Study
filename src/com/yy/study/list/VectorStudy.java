package com.yy.study.list;

import java.util.Vector;

/**
 * Vector 是 List 的实现类，所以它同样拥有 List 的一系列特性
 * 特点：
 * 有序的
 * 可重复的
 * 可以通过索引来操作元素
 * 底层是数组实现的
 * Vector 和 ArrayList,LinkedList不同的是，前者是线程安全的，后者是非线程安全的
 * 但由于是线程安全的，所以对系统的开销也会更大
 */
public class VectorStudy {

    /**
     * 创建一个 Vector 的集合对象
     *
     * Vector 有四个构造方法
     * 当创建一个不带参数的 Vector 对象时，会在底层生成一个长度为10的数组，同时增长量为0
     * 当创建一个带 Int 类型参数的 Vector 对象时，会在底层生成一个对应传入参数长度的数组，同时增长量为0
     * 当创建一个带有两个 Int 类型参数的 Vector 对象时，会在底层生成一个对应传入参数长度的数组，并通过第二个参数定义好了增长量
     * 但如果增长量为 非正数，扩容时会扩大两倍
     * 还有一个带参数的构造方法，但根据源码注释不是太懂且不常用，此处不深究
     */
    private Vector vector = new Vector();

    /**
     * 添加数据
     */
    public void addData(){

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

    }

    /**
     * 在集合原有的数据基础上，指定插入一个数据到指定位置
     */
    public void insterData(){

        vector.add(1,"我是被插入到指定位置的数据");

    }

    /**
     * 删除集合里位置为2的数据
     * Vector 是基于数组实现的，做了删除数据的操作后需要将被删除数据的后续数据陆续往前移，所以性能等代价较高
     */
    public void deleteData(){

        vector.remove(2);

    }

    /**
     * 遍历集合数据
     */
    public void selectData(){

        /**
         * 增强 for 循环
         */
        for(Object i:vector){
            System.out.println(i);
        }

        /**
         * 普通 for 循环
         */
        /*for(int i = 0; i < vector.size(); i++){
            System.out.println(i);
        }*/

        /**
         * 迭代器
         */
        /*Iterator it = vector.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

    }

}
