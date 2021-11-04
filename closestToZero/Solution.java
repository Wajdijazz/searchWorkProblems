class A {
	
	static int closestToZero(int[] ints) {
		int result;
		if (ints == null || ints.length == 0) {
			result = 0;
		} else {
		    int[] negativeValues = Arrays.stream(ints).filter(i -> i<0).sorted().toArray();
		    int[] positiveValues = Arrays.stream(ints).filter(i -> i>0).sorted().toArray();
			if (negativeValues.length == 0) {
				result = positiveValues[0];
			} else if (positiveValues.length == 0) {
				result = negativeValues[negativeValues.length - 1];
			} else {
				result = Math.abs(negativeValues[negativeValues.length - 1]) < positiveValues[0] ? 
				negativeValues[negativeValues.length - 1] : positiveValues[0];
		    }
		}
		return result;
	}
}



