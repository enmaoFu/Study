package com.yy.study.list;

import java.util.LinkedList;

/**
 * LinkedList 属于 List 集合下的一个实现类，实现了 List 接口
 * 特点：
 * 有序的
 * 可重复的
 * 可以通过索引来操作元素
 * 底层是基于链表实现（双向链表）
 * 不是线程安全的
 * 插入和删除速度快，查询慢
 */
public class LinkedListStudy {

    /**
     * 创建一个 LinkedList 集合对象
     *
     * 当创建一个不带参数的 LinkedList 对象时,会创建一个空列表
     * 根据资料在源代码里空构造方法里，有如下代码：
     * //将header节点的前一节点和后一节点都设置为自身
     * header.next = header. previous = header ;
     * 如上代码它将header节点的前一节点和后一节点都设置为自身，这里便说明LinkedList 是一个双向循环链表
     * 但根据自带的JDK，在源码中并未发现如上代码，所以暂不清楚是否是双向循环链表，只能肯定确实是基于双向链表
     *
     * 还有一个带参数的构造方法，和 ArrayList的带参构造差不多，但根据源码注释不是太懂且不常用，此处不深究
     *
     * 关于容量方面，由于 ArrayList 是基于数组实现的，所以一开始创建的时候就定义好了长度，当新增元素导致满长度时，会进行扩容操作
     * LinkedList 则没有被初始化定义长度，而是每插入一个元素它会去新 new 一个对象出来
     */
    private LinkedList linkedList = new LinkedList();

    /**
     * 添加数据
     */
    public void addData(){

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

    }

    /**
     * 往指定位置插入数据
     */
    public void insterData(){

        linkedList.add(3,"我是被插入到3位置的数据");

    }

    /**
     * 插入数据到开头
     */
    public void insterStartData(){

        linkedList.addFirst("我是被插入到开头的元素");

    }

    /**
     * 插入数据到结尾
     */
    public void intserEndData(){

        linkedList.addLast("我是被插入到结尾的元素");

    }

    /**
     * 删除指定位置的元素
     */
    public void deleteData(){

        linkedList.remove(5);

    }

    /**
     * 遍历集合数据
     */
    public void selectData(){

        /**
         * 增强 for 循环
         */
        for(Object i:linkedList){
            System.out.println(i);
        }

        /**
         * 普通 for 循环
         */
        /*for(int i = 0; i < list.size(); i++){
            System.out.println(i);
        }*/

        /**
         * 迭代器
         */
        /*Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

    }

}
