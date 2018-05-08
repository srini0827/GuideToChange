package com.algorithm.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		TowerOfHanoi towerOfHanoi= new TowerOfHanoi();
		towerOfHanoi.move(3, 'A', 'C', 'B');
	}

	private void move(int i, char c, char d, char e) {
		if(i == 1) {
			System.out.println("Moving disc " + i + " from " + c + " to " + e);
		} else {
			move(i - 1, c, d, e);
			System.out.println("Moving disc " + i + " from " + c + " to " + e);
			move(i - 1, d, e, c);
		}
	}
}
