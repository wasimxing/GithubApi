package practice_Java;

public class StringDemoClass {

	public static void m1() {
		String os = "my name is wasim raja";

		char targetChar = 'm';

		char replacementChar = 'o';

		char[] charArray = os.toCharArray();

		int j = 0;
		while (j < charArray.length) {
			if (charArray[j] == targetChar)

			{
				charArray[j] = replacementChar;
			}
			j++;
		}

		String modifyString = new String(charArray);
		System.out.println(os);
		System.out.println(modifyString);

	}

	public static void main(String[] args) {
		m1();
		String s = "my name is wasim raja";

		char tc = 'a';

		char rc = 'o';

		char[] ca = s.toCharArray();

		for (int i = 0; i < ca.length; i++) {
			if (ca[i] == tc) {
				ca[i] = rc;
			}
		}

		String ms = new String(ca);

		System.out.println(s);
		System.out.println(ms);

	}

}
