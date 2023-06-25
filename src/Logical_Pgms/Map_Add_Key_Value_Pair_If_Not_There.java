package Logical_Pgms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Add_Key_Value_Pair_If_Not_There {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc1", 1);
		map.put("abc2", 2);
		map.put("abc3", 3);

		map.putIfAbsent("abc3", 3);
		map.putIfAbsent("abc4", 4);

		Set<Entry<String, Integer>> entrys = map.entrySet();
		for (Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}
}
