package com.lxc.collections;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
	/*
	 * Collections�еĳ�������
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
		
		//System.out.println(Collections.max(list));			//��ȡ���ֵ
		//Collections.reverse(list);							//��ת
		Collections.shuffle(list);								//����û��������ÿ�ϴ��
		System.out.println(list);					
	
	}

	private static void demo2() {
		ArrayList<String> list=new ArrayList<>();
		list.add("c");
		list.add("d");
		list.add("m");
		list.add("n");
		
		System.out.println(Collections.binarySearch(list, "e"));		//����������������б��У��򷵻������������������򷵻�(-(�����)-1)
	}

	private static void demo1() {
		ArrayList<String> list=new ArrayList<>();
		list.add("c");
		list.add("o");
		list.add("m");
		list.add("d");
		
		Collections.sort(list);				//�Լ��Ͻ�������
		System.out.println(list);
	}
}
