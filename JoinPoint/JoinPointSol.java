class Solution {
	
	public static int computeJoinPoint(int1, int2){
		do {
			if(s1 < s2) {
				s1 += sumNumber(s1);
			} else {
				s2 += sumNumber(s2);
			}
		} while (s1 != s2);
	} 
	private  int sumNumber(int val){
		int sum = 0;
		for(char c: String.valueOf(val).toCharArray()){
			sum += Character.getNumericValue(c);
		}
		return sum;
	}
}