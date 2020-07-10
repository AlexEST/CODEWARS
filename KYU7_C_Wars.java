package Codewars;

/**
 * 
 * @author Alexander Chelpanov
 * @date 09.07.2020
 *
 * Normally we have firstname, middle and the last name but there may 
 * be more than one word in a name like a South Indian one.
 * 
 * Similar to those kinda names we need to initialize the names.
 * See the pattern below:
 * initials('code wars') => returns C.Wars 
 * initials('Barack Hussain obama') => returns B.H.Obama 
 * Complete the function initials.
 *
 */

public class KYU7_C_Wars {
	public static void main(String[] args) {
		System.out.println(initials("Barack hussain obama"));
		System.out.println(initials("code wars"));
	}

	public static String initials(String name) {
		String [] array = name.split(" ");
		name = "";
		for (int i = 0; i < array.length; i++) {
			if (i<array.length-1) {
				name += array[i].substring(0, 1).toUpperCase()+".";
			} else {
				name += array[i].substring(0,1).toUpperCase()+array[i].substring(1);
			}
		}
		return name;
	}
}
