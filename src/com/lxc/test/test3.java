package com.lxc.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class test3 {
	/*模拟斗地主洗牌和发牌并对牌进行排序的代码实现
	 * 分析：
	 * 1、买一副扑克，其实就是自己创造一个集合对象，将扑克牌存进去
	 * 2、洗牌
	 * 3、发牌
	 * 4、看牌
	 */
	public static void main(String[] args) {
	//1、买一副扑克，其实就是自己创造一个集合对象，将扑克牌存进去
		String[] num= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color= {"红桃","黑桃","放片","梅花"};
		HashMap<Integer, String> hm=new HashMap<>();			//存储索引和扑克牌
		ArrayList<Integer> list=new ArrayList<>();				//存储索引，主要作用是在洗牌的时候，洗的是索引，然后根据索引获取值，值就相当于被洗乱了
		int index=0;
	//拼接扑克牌和索引并把索引存储在hm中
		for(String s1:num) {									//获取数字
			for(String s2:color) {								//获取颜色
				hm.put(index, s2.concat(s1));
				list.add(index);								//将索引0到51添加到list集合中
				index++;
			}
		}
		//添加小王；
		hm.put(index, "小王");
		list.add(index);										//将52索引添加到集合中
		index++;
		hm.put(index, "大王");
		list.add(index);										//将53索引添加到集合中
		//2、洗牌,洗的是索引，然后根据索引获取值，值就相当于被洗乱了
		Collections.shuffle(list);
		//3、发牌
		/*
		 * 创建TreeSet集合,相当于3个人,把牌按照顺序排列
		 */
		TreeSet<Integer> lxc=new TreeSet<>();					//用treeSet集合对其进行排序(为什么要排序？：因为发牌的时候是乱的，为了方便好看按照从小到大的顺序排序，所以会用到TreeSet集合进行排序)
		TreeSet<Integer> cj=new TreeSet<>();
		TreeSet<Integer> pl=new TreeSet<>();
		TreeSet<Integer> dipai=new TreeSet<>();
		
		for(int  i=0;i<list.size();i++) {						//对牌的索引进行遍历
			if(i>=list.size()-3) {
				dipai.add(i);
			}else if(i%3==0) {									//索引值%3==0的牌给第一个人
				lxc.add(i);
			}else if(i%3==1) {									//索引值%3==1的牌给第二个人
				cj.add(i);
			}else {												//索引值%3==2的牌给第三个人
				pl.add(i);
			}
		}
		//看牌
		lookPoker(hm, lxc, "姜本浩");
		lookPoker(hm, cj, "陈戈强");
		lookPoker(hm, pl, "朱家伟");
		lookPoker(hm, dipai, "底牌");
		
	}
	/*
	 * 看牌：
	 * 1、返回值类型void
	 * 2、参数列表HashMap,TreeSet,String name
	 */
	public static void lookPoker(HashMap<Integer, String> hm,TreeSet<Integer> ts,String name) {		//其中HashMap：需要键和值的关系,TreeSet存的是所有键的集合,String name：看的是哪一个人的牌
		System.out.print(name+"的牌是:");
		for(Integer i:ts) {																			//i代表双列集合中的每一个键,对所有键的集合进行遍历
			System.out.print(hm.get(i)+" "); 														//根据键获取值
		}
		System.out.println();
	}
}
