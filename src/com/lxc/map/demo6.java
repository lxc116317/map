package com.lxc.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.lxc.bean.Student;

public class demo6 {
	/*
	 * Ҫ�����������Ļ�,�ͱ���Ҫʵ��comparable�Ľӿ�,Ȼ������дcompareTo����,����������Ļ������ʱ����������ת���쳣
	 */
	public static void main(String[] args) {
		//demo1();
		TreeMap<Student,String> tm=new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num=s1.getAge()-s2.getAge();						//��������������
				return num==0?s1.getName().compareTo(s2.getName()):num;
			}
		});
		tm.put(new Student("����",23),"����");
		tm.put(new Student("����",35),"�Ϻ�");
		tm.put(new Student("����",54),"����");
		tm.put(new Student("����",18),"����");
		
		System.out.println(tm);

	}

	private static void demo1() {
		TreeMap<Student,String> tm=new TreeMap<>();
		tm.put(new Student("����",23),"����");
		tm.put(new Student("����",35),"�Ϻ�");
		tm.put(new Student("����",54),"����");
		tm.put(new Student("����",18),"����");
		
		System.out.println(tm);
	}

}
