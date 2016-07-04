package com.paiyue.testmaven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sort {
	public <K,V> Map<K, V> getSortedHashtableByValue(Map<K, V> map) {
		Map<K,V> tempMap = new LinkedHashMap<K,V>();
		List<Map.Entry<K,V>> list = new ArrayList<Map.Entry<K,V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K,V>>() {
            public int compare(Map.Entry<K,V> o1, Map.Entry<K,V> o2) {
            	double preValue = Double.valueOf(o1.getValue().toString());
				double behValue = Double.valueOf(o2.getValue().toString());
				return preValue > behValue ? -1 : (preValue < behValue) ? 1 : 0;
            }
        });
		Iterator<Map.Entry<K,V>> i = list.iterator();
		while (i.hasNext()) {
			Entry<K,V> entry = i.next();
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
	public static void main(String args[]){
		sort s=new sort();
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("sakgj", 1);
		map.put("sakgj22", 2);
		map.put("sakgj333", 3);
		map.put("sakg4j", 4);
		Map<String,Integer> map2=s.getSortedHashtableByValue(map);
//		System.out.println(map2);
//		Set set=map.entrySet();
		List<String> list = new ArrayList<String>(map2.keySet());
		System.out.println(list);
	}
}
