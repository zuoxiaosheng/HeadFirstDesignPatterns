import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main(String[] args) {
		Vector v = new Vector(Arrays.asList(args));
		Iterator iter = new EnumerationIterator(v.elements());
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}