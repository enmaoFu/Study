package com.yy.study.set;

import java.util.TreeSet;

/**
 * Set 集合是一个无序集合，它继承自 Collection 接口
 * TreeSet 是 Set 接口的实现类，实现了 Set 集合
 * 特点：
 * 不可重复
 * 底层是基于红黑树实现的
 * 它可以通过指定的排列顺序保持有序状态
 * 不是线程安全的
 * 但实际上，TreeSet 只是封装了 TreeMap ，大部分都是通过调用 TreeMap 的方法来实现的，所以本质上与 TreeMap 相同
 * 因为其对性能的损坏较大，所以基本不会使用。在此只表明概念
 */
public class TreeSetStudy {


}
