package com.java.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExamples {

	public static void main(String[] args) {
		treemapInfo();
		getTheColor();
		subMap();

	}

	public static void treemapInfo() {
		
		TreeMap <Integer, String >tmap = new TreeMap<>();
		
		tmap.put(23, "Data23");
		tmap.put(3, "Data3");
		tmap.put(2, "Data2");
		tmap.put(34, "Data34");
		tmap.put(67, "Data67");
		tmap.put(98, "Data98");
		
		Set set = tmap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println("Key is  "+ entry.getKey() + " " + "Value is" + entry.getValue());
			
		}
		

	}
	
	public static void getTheColor() {
		  TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		  
		  // Put elements to the map 
		  tree_map1.put("C1", "Red");
		  tree_map1.put("C2", "Green");
		  tree_map1.put("C3", "Black");
		  tree_map1.put("C4", "White"); 
		  tree_map1.put("C5", "Pink"); 
		  
		  if (tree_map1.containsValue("Green")) {
			  System.out.println("Map has color green");
		  }else {
			  System.out.println("Map does not have color green");
		  }
		  
		  if(tree_map1.containsValue("Pink")) {
			  System.out.println("Map  has color Pink");
		  }else {
			  System.out.println("Map does not have color Pink");
		  }
		
		  System.out.println("Greatest key: " + tree_map1.firstEntry());
		  System.out.println("Least key: " + tree_map1.lastEntry());
		  System.out.println("Highst Key: " + tree_map1.higherKey(""));
		
	}
	
	public static void subMap() {
		
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		  SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();
		  
		  tree_map.put(10, "Red");
		  tree_map.put(20, "Green");
//		  tree_map.put(30, "Black");
		  tree_map.put(40, "White");
		  tree_map.put(50, "Pink");
		  System.out.println("Orginal TreeMap content: " + tree_map);
		  sub_tree_map = tree_map.subMap(20, true, 40, true);
		  System.out.println(sub_tree_map);
		  System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingKey(20));
		  System.out.println("Keys greater than or equal to 30: " + tree_map.ceilingKey(30));
		  System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingKey(50));
		
	}
	

}
