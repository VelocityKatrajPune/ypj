package Logical_Pgms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Remove_Key_Value_Fom_hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc1", 1);
		map.put("abc2", 2);
		map.put("abc3", 3);
		map.put("abc4", 4);
		System.out.println("----Elemets in hashmap-----");
		
		Set<Entry<String, Integer>> entrys = map.entrySet();
		for (Entry<String, Integer> entry : entrys) {
			System.out.println(entry);
		}
		
		map.remove("abc3");
		System.out.println("----Element removed from map------");
		
		Set<Entry<String, Integer>> entrys1 = map.entrySet();
		for (Entry<String, Integer> entry : entrys1) {
			System.out.println(entry);
		}

	}
}
