package com.bridgelabzsnake;


	import java.util.Random;
	import java.util.Scanner;

	public class SnakeLadder {

	    public static void main(String[] args){
	        System.out.println("Welcome to Snake Ladder Program");
	        Scanner read = new Scanner(System.in);
	        int num = 0;
	        System.out.println("The position  number is at 0 ");
	        Random random = new Random();
	        int dice1 = random.nextInt(6)+1;
	        System.out.println("The player rolls dice " +dice1);
}
}