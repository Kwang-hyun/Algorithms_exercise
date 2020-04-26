package Rope_num_2217;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int temp = 0;
	
		for(int i = 0; i < N; i++) {
			int weight = sc.nextInt();
			list.add(weight);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		int Max = list.get(0);
		
		for(int i = 0; i < N; i++ ) {
			temp = (i+1) * list.get(i);
			if(temp > Max) {
				Max = temp;
			}
		}
		
		System.out.println(Max);
	}
}
