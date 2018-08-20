package com.lxc.collections;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
	/*
	 * Collections中的常见方法
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		ArrayList<String> list=new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("z");
		list.add("m");
		list.add("o");
		
		//System.out.println(Collections.max(list));			//获取最大值
		//Collections.reverse(list);							//反转
		Collections.shuffle(list);								//随机置换，可以用开洗牌
		System.out.println(list);					
	
	}

	private static void demo2() {
		ArrayList<String> list=new ArrayList<>();
		list.add("c");
		list.add("d");
		list.add("m");
		list.add("n");
		
		System.out.println(Collections.binarySearch(list, "e"));		//如果搜索键包含在列表中，则返回搜索键的索引；否则返回(-(插入点)-1)
	}

	private static void demo1() {
		ArrayList<String> list=new ArrayList<>();
		list.add("c");
		list.add("o");
		list.add("m");
		list.add("d");
		
		Collections.sort(list);				//对集合进行排序
		System.out.println(list);
	}
}
