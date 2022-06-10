package weeklychallengetwo;

public class NumsInString {

	public void addNums(String str) {
		
		str = str.replaceAll("[^0-9]", "");
		
		int total = 0;
		
		for (int i = 0; i < str.length(); i++) {
			int b = str.charAt(i) - '0';
			total += b;
		}
		System.out.println(total);
	}
	
}
