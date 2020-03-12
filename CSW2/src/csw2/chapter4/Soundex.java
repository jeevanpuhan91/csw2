package csw2.chapter4;

public class Soundex {

	public static String getGode(String s) {
		char[] x = s.toUpperCase().toCharArray();

		char firstLetter = x[0];

		// Convert letters to numeric code
		for (int i = 0; i < x.length; i++) {
			switch (x[i]) {
			case 'B':
			case 'F':
			case 'P':
			case 'V': {
				x[i] = '1';
				break;
			}

			case 'C':
			case 'G':
			case 'J':
			case 'K':
			case 'Q':
			case 'S':
			case 'X':
			case 'Z': {
				x[i] = '2';
				break;
			}

			case 'D':
			case 'T': {
				x[i] = '3';
				break;
			}

			case 'L': {
				x[i] = '4';
				break;
			}

			case 'M':
			case 'N': {
				x[i] = '5';
				break;
			}

			case 'R': {
				x[i] = '6';
				break;
			}

			default: {
				x[i] = '0';
				break;
			}
			}
		}

		String output = "" + firstLetter;

		// Remove duplicates
		for (int i = 1; i < x.length; i++)
			if (x[i] != x[i - 1] && x[i] != '0')
				output += x[i];

		// Pad with 0's or truncate
		output = output + "0000";
		return output.substring(0, 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "beer";
		String name2 = "bear";
		String name3 = "bearer";

		System.out.println(getGode(name1));
		System.out.println(getGode(name2));
		System.out.println(getGode(name3));
	}
}
