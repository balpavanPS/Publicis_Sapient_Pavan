package com.cd.bean;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import com.cd.bean.CD;
import com.cd.bean.SortAsPerTitle;
import com.cd.bean.SortAsPerSinger;


public class CDMainClass {

	public static void main(String[] args, TreeSet CD) {
		Set<CD> collection=new TreeSet<CD>(new SortAsPerTitle());
		collection.add(new CD("kevvukeka","DSP"));
		collection.add(new CD("bahubali","Keeravani"));
		collection.add(new CD("ASVR","Thaman"));
		collection.add(new CD("24","AR rahman"));
		System.out.println(collection);
		Set<CD> collection2=new TreeSet<CD>(new SortAsPerSinger());
		collection2.add(new CD("kevvukeka","DSP"));
		collection2.add(new CD("bahubali","Keeravani"));
		collection2.add(new CD("ASVR","Thaman"));
		collection2.add(new CD("24","AR rahman"));
		Iterator<CD> iterator=collection2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
