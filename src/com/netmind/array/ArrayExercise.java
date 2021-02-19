package com.netmind.array;

public class ArrayExercise {
	public int addEvenNumber(int[] intArray)  {
		
		int result =0;
			 
		for(int i = 0; i <intArray.length; i++){
			if(i%2==0);{
				result += intArray[i];
			}
	 	}

		return result;
	}
}

