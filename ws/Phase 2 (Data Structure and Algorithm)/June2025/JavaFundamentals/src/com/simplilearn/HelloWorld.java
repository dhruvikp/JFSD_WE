package com.simplilearn;

public class HelloWorld {

	public static void main(String[] args) {

		int x = 3;
		int y = 4;

		System.out.println(x + y);
		System.out.println(10 % 3);

		System.out.println((5 == 5) || (3 == 3));

		int a = 5;
		a += 5; // a=a+5
		System.out.println(a);

		a++;
		System.out.println(a);// 11
		int b = a++;
		System.out.println(b); // 11
		System.out.println(a);// 12

		int c = ++a;
		System.out.println(c);
		System.out.println(a);

		int a1 = 10, b1 = 20;

		int max = (a1 > b1) ? a1 : b1;
		System.out.println(max);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Count :" + i);
		}

		int i = 1;
		while (i <= 5) {
			System.out.println("Count: " + i);
			i++;
		}
		
		i=10;
		do {
			System.out.println("Count :"+i++);
		}while(i<=5);
		
		
		// Enhanced for loop
		int[] numbers = {10,20,30,40};
		for(int num: numbers) {
			System.out.println(num);
		}
		
		
		//break; and continue
		for(int i1=1; i1<=10; i1++) {
			if(i1==5) break;
			System.out.print(i1);
		}
		
		System.out.println();
		for(int i1=1; i1<=10; i1++) {
			if(i1==5) continue;
			System.out.print(i1);
		}
		
		System.out.println("");
		int day = 13;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Invalid day");
		}
	}
}
