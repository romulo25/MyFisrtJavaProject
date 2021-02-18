package com.netmind.array;

public class array {
		public static void main(String[] args) {
			
			int result =0;
			
			int[] intArray = new int[100]; 
		 
			for(int i = 0; i <100; i++){
				intArray[i] = i+1;
		 	}
			for(int i=0; i<intArray.length; i=i+2){
				
				result += intArray[i];
			}
		}
}
