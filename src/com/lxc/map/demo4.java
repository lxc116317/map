package com.lxc.map;

import java.util.HashMap;

import com.lxc.bean.Student;

public class demo4 {
	/*ǰ���Ǳ�֤        ����Ψһ
	 * * A:������ʾ
	 * HashMap���ϼ���Studentֵ��String�İ���
	 * ����ѧ������,����ÿһ��ѧ��
	 * ֵ���ַ�������,����ѧ��������
	 */
	public static void main(String[] args) {
		HashMap<Student,String> hm=new HashMap<>();
		hm.put(new Student("����",23), "����");
		hm.put(new Student("����",23), "�Ϻ�");
		hm.put(new Student("����",24), "����");
		hm.put(new Student("����",25), "����");
		
		System.out.println(hm);
	}

}
