package com.lxc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo2 {

	public static void main(String[] args) {
		/*
		 * ͨ���鿴Map�����е�API���Է���û��iterator��������ô˫�м�����ε����أ�
		 */
		
		//demo1();
		//ʹ����ǿforѭ��������
		Map<String, Integer> map=new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����",25);
		map.put("����", 26);
		
		for(String key:map.keySet()) {			//map.keySet�����м��ļ��ϣ��Լ��ϱ���
			System.out.println(key+"="+map.get(key));	//���ݼ�����ȡֵ
			
		}
	}

	private static void demo1() {
		//��Ҫ˼����Ǹ��ݼ�����ȡֵ
		Map<String, Integer> map=new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����",25);
		map.put("����", 26);
		
		Integer i=map.get("����");		//���ݼ���ȡֵ
		System.out.println(i);
		
		//��ȡ���еļ�
		Set<String> keySet=map.keySet();	//map��������keySet���������ص���set����˿�����set������ĵ���������
		Iterator<String> it=keySet.iterator();	//����keySet��ĵ�����,��ȡ������
		while(it.hasNext()) {					//�ж��Ƿ���Ԫ��
			String key=it.next();				//��ȡÿһ����
			Integer value=map.get(key);			//���ݼ�����ȡֵ
			System.out.println(value);
		}
	}

}
