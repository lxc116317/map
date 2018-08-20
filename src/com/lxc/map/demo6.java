package com.lxc.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.lxc.bean.Student;

public class demo6 {
	/*
	 * 要对其进行排序的话,就必须要实现comparable的接口,然后再重写compareTo方法,如果不这样的话编译的时候会出现类型转换异常
	 */
	public static void main(String[] args) {
		//demo1();
		TreeMap<Student,String> tm=new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num=s1.getAge()-s2.getAge();						//根据年龄来排序
				return num==0?s1.getName().compareTo(s2.getName()):num;
			}
		});
		tm.put(new Student("张三",23),"北京");
		tm.put(new Student("李四",35),"上海");
		tm.put(new Student("王五",54),"广州");
		tm.put(new Student("赵六",18),"深圳");
		
		System.out.println(tm);

	}

	private static void demo1() {
		TreeMap<Student,String> tm=new TreeMap<>();
		tm.put(new Student("张三",23),"北京");
		tm.put(new Student("李四",35),"上海");
		tm.put(new Student("王五",54),"广州");
		tm.put(new Student("赵六",18),"深圳");
		
		System.out.println(tm);
	}

}
