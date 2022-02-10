package collections;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
//		for(int i=0;i<input.length;i++)
//		{
			//System.out.println(input[i]);
			Arrays.sort(input);
//			System.out.println(input[i]);
			for(int j=input.length-1;j>=0;j--)
			{
				System.out.println(input[j]);
			}
		}
	

	}