package com.lxc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class test4 {

	//��bug,���ÿ��ˢ�¶����в�ͬ���Ƴ���
	public static void main(String[] args) {
		/*ģ�⶷����ϴ�ƺͷ��Ʋ����ƽ�������Ĵ���ʵ��
		 * ������
		 * 1����һ���˿ˣ���ʵ�����Լ�����һ�����϶��󣬽��˿��ƴ��ȥ
		 * 2��ϴ��
		 * 3������
		 * 4������
		 */
		String[] num= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color= {"����","����","��Ƭ","÷��"};
		HashMap<Integer, String> hm=new HashMap<>();		//�洢�������˿���
		ArrayList<Integer> list=new ArrayList<>();			//�洢����
		int index=0;
		
		for(String s1:num) {
			for(String s2:color) {
				hm.put(index,s2.concat(s1));
				list.add(index);
				index++;
			}
		}
		hm.put(index, "����");
		list.add(index);
		index++;
		hm.put(index, "С��");
		list.add(index);
		index++;
		//ϴ��
		Collections.shuffle(list);
		//����
		TreeSet<Integer> lxc=new TreeSet<>();
		TreeSet<Integer> cj=new TreeSet<>();
		TreeSet<Integer> pl=new TreeSet<>();
		TreeSet<Integer> dipai=new TreeSet<>();
		
		for(int i=0;i<list.size();i++) {
			if(i>=list.size()-3) {
				dipai.add(i);
			}else if(i%3==0) {
				lxc.add(i);
			}else if(i%3==1) {
				cj.add(i);
			}else {
				pl.add(i);
			}
		}
		//����
		lookPoker(hm,lxc,"���ʹ�");
		lookPoker(hm,cj,"�½�");
		lookPoker(hm,pl,"����");
		lookPoker(hm,dipai,"����");
	}
	/*����
	*��ȷ����ֵvoid
	*��ȷ�����б�hashMap,treeset,string name
	*/
	public static void lookPoker(HashMap<Integer, String> hm,TreeSet<Integer> ts,String name) {
		System.out.print(name+"�����ǣ�");
		for(Integer i:ts) {
			System.out.print(hm.get(i)+",");
		}
		System.out.println();
	}

}


