package com.lxc.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class test3 {
	/*ģ�⶷����ϴ�ƺͷ��Ʋ����ƽ�������Ĵ���ʵ��
	 * ������
	 * 1����һ���˿ˣ���ʵ�����Լ�����һ�����϶��󣬽��˿��ƴ��ȥ
	 * 2��ϴ��
	 * 3������
	 * 4������
	 */
	public static void main(String[] args) {
	//1����һ���˿ˣ���ʵ�����Լ�����һ�����϶��󣬽��˿��ƴ��ȥ
		String[] num= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color= {"����","����","��Ƭ","÷��"};
		HashMap<Integer, String> hm=new HashMap<>();			//�洢�������˿���
		ArrayList<Integer> list=new ArrayList<>();				//�洢��������Ҫ��������ϴ�Ƶ�ʱ��ϴ����������Ȼ�����������ȡֵ��ֵ���൱�ڱ�ϴ����
		int index=0;
	//ƴ���˿��ƺ��������������洢��hm��
		for(String s1:num) {									//��ȡ����
			for(String s2:color) {								//��ȡ��ɫ
				hm.put(index, s2.concat(s1));
				list.add(index);								//������0��51��ӵ�list������
				index++;
			}
		}
		//���С����
		hm.put(index, "С��");
		list.add(index);										//��52������ӵ�������
		index++;
		hm.put(index, "����");
		list.add(index);										//��53������ӵ�������
		//2��ϴ��,ϴ����������Ȼ�����������ȡֵ��ֵ���൱�ڱ�ϴ����
		Collections.shuffle(list);
		//3������
		/*
		 * ����TreeSet����,�൱��3����,���ư���˳������
		 */
		TreeSet<Integer> lxc=new TreeSet<>();					//��treeSet���϶����������(ΪʲôҪ���򣿣���Ϊ���Ƶ�ʱ�����ҵģ�Ϊ�˷���ÿ����մ�С�����˳���������Ի��õ�TreeSet���Ͻ�������)
		TreeSet<Integer> cj=new TreeSet<>();
		TreeSet<Integer> pl=new TreeSet<>();
		TreeSet<Integer> dipai=new TreeSet<>();
		
		for(int  i=0;i<list.size();i++) {						//���Ƶ��������б���
			if(i>=list.size()-3) {
				dipai.add(i);
			}else if(i%3==0) {									//����ֵ%3==0���Ƹ���һ����
				lxc.add(i);
			}else if(i%3==1) {									//����ֵ%3==1���Ƹ��ڶ�����
				cj.add(i);
			}else {												//����ֵ%3==2���Ƹ���������
				pl.add(i);
			}
		}
		//����
		lookPoker(hm, lxc, "������");
		lookPoker(hm, cj, "�¸�ǿ");
		lookPoker(hm, pl, "���ΰ");
		lookPoker(hm, dipai, "����");
		
	}
	/*
	 * ���ƣ�
	 * 1������ֵ����void
	 * 2�������б�HashMap,TreeSet,String name
	 */
	public static void lookPoker(HashMap<Integer, String> hm,TreeSet<Integer> ts,String name) {		//����HashMap����Ҫ����ֵ�Ĺ�ϵ,TreeSet��������м��ļ���,String name����������һ���˵���
		System.out.print(name+"������:");
		for(Integer i:ts) {																			//i����˫�м����е�ÿһ����,�����м��ļ��Ͻ��б���
			System.out.print(hm.get(i)+" "); 														//���ݼ���ȡֵ
		}
		System.out.println();
	}
}
