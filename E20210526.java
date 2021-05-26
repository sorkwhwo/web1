package onlypractice3;

import java.util.Arrays;

public class E20210526 {
public static void init(double[] arr) {
	for(int i=0; i<arr.length; i++) {
		arr[i]=0;
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] doubles = {1,4,5,6};
		init(doubles);
		System.out.println(Arrays.toString(doubles));
}
}
