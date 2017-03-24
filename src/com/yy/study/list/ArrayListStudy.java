package com.yy.study.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List 集合是一个有序集合，它继承自 Collection 接口
 * ArrayList 是 List 接口的实现类，实现了 List 接口
 * 特点：
 * 有序的
 * 可重复的
 * 可以通过索引来操作元素
 * 底层是基于数组实现
 * 不是线程安全的
 * 查询快，插入和删除速度慢
 */
public class ArrayListStudy {

    /**
     * 通过多态的方式实例一个 ArrayList 集合对象
     *
     * 当创建一个不带参数的 ArrayList 对象时，会在底层生成一个长度为10的数组
     * 当创建一个带 Int 类型参数的 ArrayList 对象时，会在底层生成一个对应传入参数长度的数组
     * 还有一个带参数的构造方法，但根据源码注释不是太懂且不常用，此处不深究
     *
     * 如果添加的元素超过了默认容量，那么在底层会新生成一个数组，这个数组的长度是原数组的1.5倍+1
     * 然后将原数组的内容放到新数组中，后续继续增加的元素也会放到新数组里，当新数组无法容纳新增元素的时候，重复此过程
     */
    private List list = new ArrayList();

    /**
     * 添加数据
     */
    public void addData(){

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

    }

    /**
     * 在集合原有数据的基础上，指定插入一个数据到指定位置
     */
    public void insertData(){

        list.add(2,"我是被插入到2位置的数据");

    }

    /**
     * 删除集合里位置为2的数据
     * ArrayList 是基于数组实现的，做了删除数据的操作后需要将被删除数据的后续数据陆续往前移，所以性能等代价较高
     */
    public void deleteData(){

        list.remove(2);

    }

    /**
     * 遍历集合数据
     */
    public void selectData(){

        /**
         * 增强 for 循环
         */
        for(Object i:list){
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
