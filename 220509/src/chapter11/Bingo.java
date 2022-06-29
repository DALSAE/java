package chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		Set set = new HashSet();
		int [][] board = new int[5][5];
		
		for(int i=0; set.size()<25; i++) {
			set.add((int)(Math.random()*50)+1);
			}
		System.out.println(set);
		Iterator it = set.iterator();
		
		for(int i=0; i<board.length; i++) {//board는 2차원 배열이라서 보드렝스는 5임.
			
		}
		
	}

}
