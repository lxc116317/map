package com.lxc.map;

import java.util.LinkedHashMap;

public class demo5 {
	//linkedhashmap���ص㣺�ײ�������ʵ�ֵģ����Ա�֤��ô�����ôȡ
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
		lhm.put("����", 23);
		lhm.put("����", 24);
		lhm.put("����", 26);
		lhm.put("����", 25);
		
		
		System.out.println(lhm);
	}

}
