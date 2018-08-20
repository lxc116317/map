package com.lxc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo3 {
	/**
	 * Map集合的第二种迭代,根据键值对对象,获取键和值
	 *  A:键值对对象找键和值思路：
		* 获取所有键值对对象的集合
		* 遍历键值对对象的集合，获取到每一个键值对对象
		* 根据键值对对象找键和值
		* 
		* 
		* 
		* 
		* 把双列集合的键值对变成单列集合的键值对对像，然后遍历这个集合来获取每一个键值对对象，根据键值对对象获取键和值
	 
	 */
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五",25);
		map.put("赵六", 26);
		
		//demo1(map);
		//增强for循环来遍历
		for(Map.Entry<String, Integer> en:map.entrySet()) {				
			System.out.println(en.getKey()+"="+en.getValue());
		}

	}

	private static void demo1(Map<String, Integer> map) {
		//Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set集合中
		Set<Map.Entry<String, Integer>> entry=map.entrySet();			
		//获取每一个对象
		Iterator<Map.Entry<String, Integer>> it=entry.iterator();		//获取迭代器
		while(it.hasNext()) {											
			//获取每一个entry对象
			Map.Entry<String, Integer> en=it.next();					//父类引用指向子类对象
			//Entry<String,Integer> en=it.next();						直接获取的是子类对象
			String key=en.getKey();
			Integer value=en.getValue();
			System.out.println(key+"="+value);
		}
	}

}
