package Logical_Pgms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map_Get_Synchronized_Version_Of_Map {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Map<String, Integer> syncMap = Collections.synchronizedMap(map);	
		

	}

}
