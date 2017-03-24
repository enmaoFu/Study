package com.yy.study.map;

import java.util.TreeMap;

/**
 * Map 集合是一个以 key-value 形式存在的的集合
 * HashMap 是 Map 的实现类，实现了 Map 接口
 * 特点：
 * 是以 key-value 形式的，有必要指出，此处的以 key-value 形成存储并不是将 key 和 value 分开，而是当做一个整体
 * key-value 的整体就是 Entry ，它是一个内部类，也就是用它来存储 key-value 的
 * key 不能重复，value可以重复。但如果出现重复 key 的时候，会覆盖之前 key 所对应 value 的值
 * 底层是基于红黑树实现的
 * 它可以根据指定的排序规则保持有序状态
 * 不是线程安全的
 * 因为其对性能的损坏较大，所以基本不会使用。在此只表明概念
 */
public class TreeMapStudy {

}
