package com.lxc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo3 {
	/**
	 * Map���ϵĵڶ��ֵ���,���ݼ�ֵ�Զ���,��ȡ����ֵ
	 *  A:��ֵ�Զ����Ҽ���ֵ˼·��
		* ��ȡ���м�ֵ�Զ���ļ���
		* ������ֵ�Զ���ļ��ϣ���ȡ��ÿһ����ֵ�Զ���
		* ���ݼ�ֵ�Զ����Ҽ���ֵ
		* 
		* 
		* 
		* 
		* ��˫�м��ϵļ�ֵ�Ա�ɵ��м��ϵļ�ֵ�Զ���Ȼ����������������ȡÿһ����ֵ�Զ��󣬸��ݼ�ֵ�Զ����ȡ����ֵ
	 
	 */
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����",25);
		map.put("����", 26);
		
		//demo1(map);
		//��ǿforѭ��������
		for(Map.Entry<String, Integer> en:map.entrySet()) {				
			System.out.println(en.getKey()+"="+en.getValue());
		}

	}

	private static void demo1(Map<String, Integer> map) {
		//Map.Entry˵��Entry��Map���ڲ��ӿڣ�������ֵ��װ����Entry���󣬲��洢��Set������
		Set<Map.Entry<String, Integer>> entry=map.entrySet();			
		//��ȡÿһ������
		Iterator<Map.Entry<String, Integer>> it=entry.iterator();		//��ȡ������
		while(it.hasNext()) {											
			//��ȡÿһ��entry����
			Map.Entry<String, Integer> en=it.next();					//��������ָ���������
			//Entry<String,Integer> en=it.next();						ֱ�ӻ�ȡ�����������
			String key=en.getKey();
			Integer value=en.getValue();
			System.out.println(key+"="+value);
		}
	}

}
