import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		Scanner iScanner = new Scanner(System.in);
		System.out.printf("name: ");
		String name = iScanner.nextLine();
		System.out.printf("Привет, %s!", name);
		iScanner.close();
	}
// }
// import java.util.Scanner;
// 	public class program {
// 		public static void main(String[] args) {
// 		Scanner iScanner = new Scanner(System.in);
// 		System.out.printf("int a: ");
// 		int x = iScanner.nextInt();
// 		System.out.printf("double a: ");
// 		double y = iScanner.nextDouble();
// 		System.out.printf("%d + %f = %f", x, y, x + y);
// 		iScanner.close();
// 	}
// }

// import java.util.Scanner;
// 	public class program {
// 		public static void main(String[] args) {
// 		Scanner iScanner = new Scanner(System.in);
// 		System.out.printf("int a: ");
// 		boolean flag = iScanner.hasNextInt();
// 		System.out.println(flag); 
// 		int i = iScanner.nextInt();
// 		System.out.println(i); 
// 		iScanner.close();
//  	} 
// }

// public class program {
//  	static void sayHi() {
//  		System.out.println("hi!");
// }
//  	static int sum(int a, int b) {
//  		return a+b;
//  } 
//  	static double factor(int n) {
//  		if(n==1)return 1;
//  		return n * factor(n-1);
//  }
//  	public static void main(String[] args) {
//  		sayHi(); // hi!
//  		System.out.println(sum(1, 3)); // 4
//  		System.out.println(factor(5)); // 120.0
//  }}

//  Это тестовое задание!

// import java.time.LocalTime;
// import java.util.Scanner;

// public class program {
// 	public static void main(String[] args) {
	
// 	}
// 	static void task0(){
//          System.out.println("Как тебя зовут?");
//          Scanner scanner = new Scanner(System.in);
//          String name = scanner.nextLine();
//          LocalTime time = LocalTime.now();
//          int hour = time.getHour();
//          if(hour>=5 && hour<12){
//              System.out.println("Доброе утро " + name);
//          } else if(hour<18 && hour>=12){
//              System.out.println("Добрый день " + name);
//          }  else if (hour < 23 && hour>=18){
//              System.out.println("Добрый вечер " + name);
//          } else {
//              System.out.println("Доброй ночи " + name);
//          }
//         //  scanner.close();
//     }
// }


// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.
// public class program {
// 	public static void main(String[] args) {
	
// 	}
// 	static void task1(){
//         /*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.*/
//         int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
//         int maxOnes = 0;
//         int temp = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == 1){
//                 temp++;
//             } else {
//                 if (temp > maxOnes){
//                 maxOnes = temp;}
//                 temp = 0;
//             }
//         }
//         if(temp > maxOnes){
//             maxOnes = temp;
//         }
//         System.out.println(maxOnes);
//     }



// Задачи Java
// Во фразе "Добро пожаловать на курс по Java" 
// переставить слова в обратном порядке.
// static String task2(String str){
// 	/*Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.*/
// 	String[] strArr = str.split(" ");
// 	StringBuilder stringBuilder = new StringBuilder();
// 	for (int i = 0; i < strArr.length; i++) {
// 		stringBuilder.append(strArr[strArr.length-i-1]).append(" ");
// 	}
// 	return stringBuilder.toString();

// }


// Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.

// Пример 1: а = 3, b = 2, ответ: 9

// Пример 2: а = 2, b = -2, ответ: 0.25

// Пример 3: а = 3, b = 0, ответ: 1


