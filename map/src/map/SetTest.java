package map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> strSet = new HashSet<>();
		
		// 등록
		strSet.add("100");
		strSet.add("101");
		strSet.add("102");
		strSet.add("103");
		strSet.add("104");
		strSet.add("105");
		
		
//		for (String str: strSet) {
//			System.out.println(str);
//		}
		
		Iterator<String> iterStr = strSet.iterator();
		
		while (iterStr.hasNext()) {
			System.out.println(iterStr.next());
		}
		

//		iterStr.hasNext(); // 다음게 있니? boolean 리턴
//		iterStr.next();	// 다음값을 줌
		
		System.out.println(strSet.size());
		
		
	}
	
	
}
