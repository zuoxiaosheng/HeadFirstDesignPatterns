import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main(String[] args) {
		ArrayList l = new ArrayList(Arrays.asList(args));
		Enumeration enumer = new IteratorEnumeration(l.iterator());
		while (enumer.hasMoreElements()) {
			System.out.println(enumer.nextElement());
		}
	}
}