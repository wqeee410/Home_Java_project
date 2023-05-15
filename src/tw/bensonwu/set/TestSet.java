package tw.bensonwu.set;

import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		Set<String> data = new TreeSet<>();
		data.add("1");
		data.add("yo");
		data.add("0");
		data.add("hi");
	
		System.out.println(data);
		System.out.println(data);
	}

}
