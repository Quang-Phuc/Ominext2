import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class test {
	public static void main(String[] args) {
		List<Item> items = Arrays.asList(new Item("A", "NinhBinh", 7), new Item("B",  "NinhBinh", 5), new Item("C",  "HaNoi", 7),
				new Item("A",  "NinhBinh", 7),new Item("D",  "HaNoi", 12),new Item("A", "HaNam", 10));
		
		 Map<String, Map<Integer, List<Item>>> checkingLogMap =
				 items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.groupingBy(Item::getAge)));
		
		  for (Entry<String, Map<Integer, List<Item>>> userEntry :checkingLogMap.entrySet()) {
			  System.out.println(userEntry.getKey());
		  }
		 
		 System.out.println(checkingLogMap);
	}
	
	

	
}
