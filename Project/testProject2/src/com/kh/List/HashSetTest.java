package com.kh.List;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		System.out.println("인스턴스 수: "+ set.size());
	
		//바복자를 이용한 전체 출력
		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.println(itr.next() + "\t");
		System.out.println();
		
		for(String s : set)
			System.out.print(s + '\t');
		System.out.println();
	}

}
