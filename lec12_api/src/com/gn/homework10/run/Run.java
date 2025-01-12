package com.gn.homework10.run;

import java.util.Arrays;
import java.util.Collections;

import com.gn.homework10.view.BuilderMenu;

public class Run {
	public static int main(String[] args) {
		
		int[] array = {1,2,7,10,11};
		for(int i = 0; i <array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[array.length/2];
		

	}
}
