package com.lxc.test;

import java.util.ArrayList;
import java.util.Collections;

public class test2 {
	//ģ�⶷����ϴ�ƺͷ��ƣ���û��˳��
	/*
	 * ������
	 * 1����һ���˿ˣ���ʵ�����Լ�����һ�����϶��󣬽��˿��ƴ��ȥ
	 * 2��ϴ��
	 * 3������
	 * 4������
	 */
	public static void main(String[] args) {
		//1����һ���˿ˣ���ʵ�����Լ�����һ�����϶��󣬽��˿��ƴ��ȥ
		String[] num= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color= {"����","����","��Ƭ","÷��"};
		ArrayList<String> poker=new ArrayList<>();
		//ƴ�ӻ�ɫ������
		for(String s1 :color) {
			for(String s2 :num) {
				poker.add(s1.concat(s2));							//concat���������ַ���
			}
		}
		poker.add("����");
		poker.add("С��");
		//ϴ��
		Collections.shuffle(poker);
		//����
		ArrayList<String> lxc=new ArrayList<>();
		ArrayList<String> cj=new ArrayList<>();
		ArrayList<String> pl=new ArrayList<>();
		ArrayList<String> dipai=new ArrayList<>();
		
		for(int i=0;i<poker.size();i++) {
			if(i>=poker.size()-3) {
				dipai.add(poker.get(i));							//�����ŵ��ƴ洢�ڵ��Ƽ�����
			}else if(i%3==0) {
				lxc.add(poker.get(i));
			}else if(i%3==1) {
				cj.add(poker.get(i));
			}else {
				pl.add(poker.get(i));
			}
		}
		// 4������
		System.out.println(lxc);
		System.out.println(cj);
		System.out.println(pl);
		System.out.println(dipai);

	}

}
