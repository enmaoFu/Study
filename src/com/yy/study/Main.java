package com.yy.study;

import com.yy.study.list.ArrayListStudy;
import com.yy.study.list.LinkedListStudy;
import com.yy.study.list.VectorStudy;
import com.yy.study.map.HashMapStudy;
import com.yy.study.map.HashTableStudy;

/**
 * Created by John on 2017/1/14.
 */
public class Main {

    public static void main(String[] args){

        /*ArrayListStudy arrayListStudy = new ArrayListStudy();
        arrayListStudy.addData();
        arrayListStudy.insertData();
        arrayListStudy.selectData();
        System.out.println("---------------------------------------------------");
        arrayListStudy.deleteData();
        arrayListStudy.selectData();*/

        /*LinkedListStudy linkedListStudy = new LinkedListStudy();
        linkedListStudy.addData();
        linkedListStudy.insterData();
        linkedListStudy.insterStartData();
        linkedListStudy.intserEndData();
        linkedListStudy.selectData();
        System.out.println("---------------------------------------------------");
        linkedListStudy.deleteData();
        linkedListStudy.selectData();*/

       /* VectorStudy vectorStudy = new VectorStudy();
        vectorStudy.addData();
        vectorStudy.insterData();
        vectorStudy.selectData();
        System.out.println("---------------------------------------------------");
        vectorStudy.deleteData();
        vectorStudy.selectData();*/

        /*HashMapStudy hashMapStudy = new HashMapStudy();
        hashMapStudy.addData();
        hashMapStudy.selectData();
        System.out.println("---------------------------------------------------");
        hashMapStudy.deleteData();
        hashMapStudy.selectData();*/

        HashTableStudy hashTableStudy = new HashTableStudy();
        hashTableStudy.addData();
        hashTableStudy.selectData();
        System.out.println("-----------------------------------------------");
        hashTableStudy.deleteData();
        hashTableStudy.selectData();

    }

}
