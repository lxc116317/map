package com.lxc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo2 {

	public static void main(String[] args) {
		/*
		 * 通过查看Map集合中的API可以发现没有iterator方法，那么双列集合如何迭代呢？
		 */
		
		//demo1();
		//使用增强for循环来遍历
		Map<String, Integer> map=new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五",25);
		map.put("赵六", 26);
		
		for(String key:map.keySet()) {			//map.keySet是所有键的集合，对集合遍历
			System.out.println(key+"="+map.get(key));	//根据键来获取值
			
		}
	}

	private static void demo1() {
		//主要思想就是根据键来获取值
		Map<String, Integer> map=new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五",25);
		map.put("赵六", 26);
		
		Integer i=map.get("张三");		//根据键获取值
		System.out.println(i);
		
		//获取所有的键
		Set<String> keySet=map.keySet();	//map集合里有keySet方法，返回的是set，因此可以用set集合里的迭代器方法
		Iterator<String> it=keySet.iterator();	//调用keySet里的迭代器,获取迭代器
		while(it.hasNext()) {					//判断是否有元素
			String key=it.next();				//获取每一个键
			Integer value=map.get(key);			//根据键来获取值
			System.out.println(value);
		}
	}

}
