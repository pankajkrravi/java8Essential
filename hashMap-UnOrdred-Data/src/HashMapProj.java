import java.util.HashMap;
import java.util.Map;

public class HashMapProj {
	public static void main(String[] args) {
		// Note -> Order of data is not guranteed in Map
		Map<String, String> map = new HashMap<String, String>();
		map.put("Bihar", "Patna");
		map.put("Karnatika", "Bangalore");
		map.put("Jharkhand", "Ranchi");
		System.out.println(map);
		map.put("Punjab", "Hariyana");
		System.out.println(map);
		// find
		String capital = map.get("Bihar");
		System.out.println("Capital of Bihar is " + capital);
	}
}
