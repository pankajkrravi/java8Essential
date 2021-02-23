import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LoopingProj {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Pankaj");
		list.add("Ravishankar");
		list.add("Anusha");
		list.add("Jatan");
		System.out.println("==== Arraylist iterator ======= ");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
		// for each
		System.out.println(" &&&&&&&&&&&&&&& for each &&&&&&&&&&&&&&&& n");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println(" ############ Java 8 method referance  ###############");
		list.forEach(System.out::println);

		// map

		Map<String, String> map = new HashMap();
		map.put("KA", "Bangalore");
		map.put("TN", "Chanai");
		map.put("BR", "z`Patna");
		map.put("JH", "Rachi");
		System.out.println("@@@@@ toString @@@@@@@@@@@@");
		System.out.println(map);
		System.out.println("*********** Hashmap Iterator **********");
		Set<String> keys = map.keySet();
		Iterator<String> iterator1 = keys.iterator();
		while (iterator1.hasNext()) {
			String key=iterator1.next();
			System.out.println("The Capital of "+key+" is "+map.get(key));
		}
			System.out.println(" ^^^^^^^^^^^^^^^^ for each ^^^^^^^^^^^^");
		for (String key : keys) {
			System.out.println("The Capital of "+key+" is "+map.get(key));
		}
	}
}
