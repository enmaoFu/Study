package com.yy.study.set;

/**
 * Set 集合是一个无序集合，它继承自 Collection 接口
 * HashSet 是 Set 接口的实现类，实现了 Set 集合
 * 特点：
 * 无序的
 * 不可重复
 * 底层是基于数组和链表实现的，具体实现方法是 Hash 算法
 * 有必要提出，数组中的每一项对应了一个链表，这种结构称“链表散列”的数据结构，即数组和链表的结合体；也叫散列表、哈希表。
 * 但实际上，HashSet 只是封装了 HashMap ，大部分都是通过调用 HashMap 的方法来实现的，所以本质上与 HashMap 相同
 * 不是线程安全的
 */
public class HashSetStudy {
}
