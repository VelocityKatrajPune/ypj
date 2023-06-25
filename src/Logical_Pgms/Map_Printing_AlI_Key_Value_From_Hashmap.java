package Logical_Pgms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Printing_AlI_Key_Value_From_Hashmap {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc1", 1);
		map.put("abc2", 2);
		map.put("abc3", 3);
		map.put("abc4", 4);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet)
		{
			System.out.println(entry);
			//System.out.println(entry.getKey() + " :" + entry.getValue());
		}
	}
}
