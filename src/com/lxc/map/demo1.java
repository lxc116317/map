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
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		Integer value=map.remove("����");
		System.out.println(value);				//���ݼ�ɾ��Ԫ��,���ؼ���Ӧ��ֵ
		System.out.println(map);
	}

	private static void demo1(Map<String, Integer> map) {
		/*������ǵ�һ�δ洢����ֱ�Ӵ洢������NULL
		 * ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
		 */
		Integer i1=map.put("����", 23);
		Integer i2=map.put("����", 24);
		Integer i3=map.put("����", 25);
		Integer i4=map.put("����", 26);
		Integer i5=map.put("����", 26);	//��ͬ�ļ������ڣ�ֵ�����ǣ��ѱ����ǵ�ֵ����
		
		
		System.out.println(map);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}

}
