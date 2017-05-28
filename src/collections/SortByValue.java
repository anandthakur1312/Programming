package collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValue implements Comparator<Map.Entry<Employee,String>>{

	@Override
	public int compare(Map.Entry<Employee,String> e1, Map.Entry<Employee,String> e2) {
        String s1 = e1.getValue();
        String s2 = e2.getValue();
		return s2.compareTo(s1);
    }

}
