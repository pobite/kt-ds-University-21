package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {
	
	public static void main(String args[]) {
		
		
		List<String> a;
		
		Map<String, Object> map = new HashMap<>();
		map.put("Java", 100);
		map.put("C", 90);
		map.put("C#", 80);
		map.put("Python", 70);
		map.put("Languages", new ArrayList<>());
		
		Set<String> keys = map.keySet();	// 키만 모여 있는 set을 보여줌.
		for (String key: keys) {
			System.out.println(key + " => " + map.get(key));
		}
		
		
		System.out.println("Java\t" + map.get("Java"));
		System.out.println("C\t" + map.get("C"));
		System.out.println("C#\t" + map.get("C#"));
		System.out.println("Python\t" + map.get("Python"));
		System.out.println("Scala\t" + map.get("Scala"));
		
		
		// !true == false
		// !false == true
		
		if (!map.containsKey("Python")) {
			map.put("Python", 100);
		}
		System.out.println("Python");
		
		
		map.remove("C#");
		System.out.println("C#\t" + map.get("C#"));
		
		System.out.println(map.size());
		
		Map<Integer, List<String>> matrix = new HashMap<>();
		
		
	}
}
