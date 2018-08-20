package com.lxc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class test4 {

	//有bug,如何每次刷新都会有不同的牌出现
	public static void main(String[] args) {
		/*模拟斗地主洗牌和发牌并对牌进行排序的代码实现
		 * 分析：
		 * 1、买一副扑克，其实就是自己创造一个集合对象，将扑克牌存进去
		 * 2、洗牌
		 * 3、发牌
		 * 4、看牌
		 */
		String[] num= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color= {"红桃","黑桃","放片","梅花"};
		HashMap<Integer, String> hm=new HashMap<>();		//存储索引和扑克牌
		ArrayList<Integer> list=new ArrayList<>();			//存储索引
		int index=0;
		
		for(String s1:num) {
			for(String s2:color) {
				hm.put(index,s2.concat(s1));
				list.add(index);
				index++;
			}
		}
		hm.put(index, "大王");
		list.add(index);
		index++;
		hm.put(index, "小王");
		list.add(index);
		index++;
		//洗牌
		Collections.shuffle(list);
		//发牌
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
		//看牌
		lookPoker(hm,lxc,"李贤春");
		lookPoker(hm,cj,"陈杰");
		lookPoker(hm,pl,"潘蕾");
		lookPoker(hm,dipai,"底牌");
	}
	/*看牌
	*明确返回值void
	*明确参数列表hashMap,treeset,string name
	*/
	public static void lookPoker(HashMap<Integer, String> hm,TreeSet<Integer> ts,String name) {
		System.out.print(name+"的牌是：");
		for(Integer i:ts) {
			System.out.print(hm.get(i)+",");
		}
		System.out.println();
	}

}


