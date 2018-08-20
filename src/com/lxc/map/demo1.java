package com.lxc.map;

import java.util.HashMap;
import java.util.Map;

public class demo1 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		//demo1(map);
		//demo2(map);
		
	}

	private static void demo2(Map<String, Integer> map) {
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		Integer value=map.remove("张三");
		System.out.println(value);				//根据键删除元素,返回键对应的值
		System.out.println(map);
	}

	private static void demo1(Map<String, Integer> map) {
		/*如果键是第一次存储，就直接存储，返回NULL
		 * 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
		 */
		Integer i1=map.put("张三", 23);
		Integer i2=map.put("李四", 24);
		Integer i3=map.put("王五", 25);
		Integer i4=map.put("赵六", 26);
		Integer i5=map.put("张三", 26);	//相同的键不存在，值被覆盖，把被覆盖的值返回
		
		
		System.out.println(map);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}

}
