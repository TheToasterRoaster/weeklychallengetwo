package weeklychallengetwo;

public class SecondHighest {

	public void find(int[][] nums) {
		
		
		
		for (int i = 0; i < nums.length; i++ ) {
			int max = 0;
			int second = 0;
			for (int j = 0; j < nums[i].length; j++) {
				if (j == 0) {
					max = nums[i][j];
				} else {
					if (nums[i][j] > max) {
						second = max;
						max = nums[i][j];
					} else if (nums[i][j] > second) {
						second = nums[i][j];
					}
				}
				
			}
			System.out.println(second);
		}
	}
}
