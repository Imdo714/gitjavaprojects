package testProject;
import java.util.*;
import java.math.*;

public class ArrayExample1 {
	public static void arr1(){
		int[] ar1 = new int[5];
		double[] ar2 = new double[7];
		
		float[] ar3;
		ar3 = new float[9];
		System.out.println("ar1의 길이 : " + ar1.length);
		System.out.println("ar2의 길이 : " + ar2.length);
		System.out.println("ar3의 길이 : " + ar3.length);
	}
	
	public static void arr2() {
		String str[] = new String[5];
		str[0] = "sangwon";
		str[1] = new String("Choi");
		str[4] = "hi";
		str[2] = "tree";
		str[3] = "tree";
		
		int a = 0;
		for(int i = 0; i <str.length; i++) {
			a += str[i].length();	
		}
			System.out.print(a);
 	}
	
	public static void arr3() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;
		arr2[2] = 0;
		System.out.print(arr1[2]);
 	}
	
	public static void arr4() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[5];
		for(int i = 0; i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		arr2[0] = 10;
		for(int j = 0; j<arr1.length;j++) {
			System.out.println("arr1 : "+ arr1[j]);
			System.out.println("arr2 : "+ arr2[j]);
		}	
 	}
	public static void arr5() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[5];
		char[] ch1 = {'s', 's', 'd', 'r', 'a'};
		double[] do1 = {3.14, 5.12, 4.11, 22.1, 0.22};
		String[] str1 = {"오늘", " 나는", " 정말", " 졸립", "다"};
		

		//보편적인 배열 복사 방법
		arr2 = arr1.clone();
		//배열 arr1을 전부 7로 초기화;
		Arrays.fill(arr1, 7);
		
		for(int j = 0; j<arr1.length;j++) {
//			System.out.println("arr1 : "+ arr1[j]);
//			System.out.println("arr2 : "+ arr2[j]);
//			System.out.print(ch1[j]);
//			System.out.println("do1 : "+ do1[j]);
			System.out.print(str1[j]);
		}	
 	}
	public static void arr6() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
 	}
	
	public static void arr7() {
		int[] arr = new int[10];
		
		for(int i = 0, j = arr.length; i < arr.length; i++, j--) {
			arr[i] = j;
			System.out.print(arr[i] + " ");
		}
 	}
	public static void arr8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
 	}
	
	public static void arr9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
 	}
	
	public static void arr10() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String[] str = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.print(str[num]);
 	}
	
	public static void arr11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str1 = sc.nextLine();
		System.out.print("문자 : ");
		
		char ch = sc.next().charAt(0);
		int a = 0;
		
		System.out.print(str1 + "에" + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i< str1.length(); i++) {
			if(ch == str1.charAt(i)) {
				a++;
				System.out.print(i + " ");
			}
		}
//		System.out.println(str1 + "에" + sc + "가 존재하는 위치(인덱스) : " + a);
		System.out.println("\n" + ch + "개수 :" + a);
 	}
	
	public static void arr12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str1 = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int a = 0;
		int[] intlog;
		intlog = new int[str1.length()];
		
		System.out.print(str1 + "에" + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i< str1.length(); i++) {
			
			if(ch == str1.charAt(i)) {
				a++;
				intlog[i] = i;
				System.out.print(intlog[i] + " ");
			}
		}
//		System.out.println(str1 + "에" + sc + "가 존재하는 위치(인덱스) : " + a);
		System.out.println("\n" + ch + "개수 :" + a);
 	}
	
	public static void arr13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] m = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
//		switch(num) {
//		case 0:
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//			System.out.print(m[num]);
//			break;
//		default :
//			System.out.print("잘못입력하셨습니다.");
//		}
//		if(num == 0) {
//			System.out.print(m[0]);
//		}else if(num == 1) {
//			System.out.print(m[1]);
//		}else if(num == 2) {
//			System.out.print(m[2]);
//		}else if(num == 3) {
//			System.out.print(m[3]);
//		}else if(num == 4) {
//			System.out.print(m[4]);
//		}else if(num == 5) {
//			System.out.print(m[5]);
//		}else if(num == 6) {
//			System.out.print(m[6]);
//		}else
//			System.out.print("잘못입력하셨습니다.");
		if(num < 7 && num >= 0) {
			System.out.print(m[num]);
		}else
			System.out.print("잘못입력하셨습니다.");
}
	public static void arr14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] intArr = new int[num];
		
		int sum = 0;
		for(int i = 0; i < intArr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			intArr[i] = sc.nextInt();
		}
		for(int j = 0; j < intArr.length; j++) {
			System.out.print(intArr[j] +" ");
			sum += intArr[j];
		}
		System.out.println("\n총합 : " + sum);
 	}
	
	public static void arr15() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(num < 3 && !((num % 2 == 1))) {
			System.out.print ("정수 : ");
			num = sc.nextInt();
			int sum = 0;
			
			if(num >= 3 && (num % 2 == 1)) {
				int[] arr = new int[num];
				for(int i = 0; i < num; i++) {
					if(i <= (num/2)) {
						sum++;
						arr[i] = sum;
						System.out.print(arr[i] + " ");
					}else {
						sum--;
						arr[i] = sum;
						System.out.print(arr[i] + " ");
					}
				}
			}else
				System.out.println("다시 입력하세요.");
		}
	}
	
	public static void arr16() {
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"양념", "후라이드", "파닭"};
		String chik;
		System.out.print("치킨 이름을 입력하세요 : ");
		chik = sc.nextLine();
		
		for(int i = 0; i < str.length; i++) {
			if(chik.equals(str[i])) {
				System.out.println( chik + "치킨 배달 가능");
				break;
			}else {
				System.out.println( chik + "치킨 배달 불가");
				break;
			}
		}

	
	}
	public static void arr17() {
		Scanner sc = new Scanner(System.in);
		String str, res = null;
		
		String[] strarr = {"양념", "후라이드", "갈릭", "간장"};
		System.out.print("치킨 이름을 입력하세요 : ");
		str = sc.next();
		
		res = str + "은 없는 치킨입니다.";
		
		for(int i = 0; i < strarr.length; i++ ) {
			if(str.equals(strarr[i])) {
				res = str + "배달 가능";
				break;
			}
		}
		System.out.print(res);
	}
	
//	public static void arr18() {
//		Scanner sc = new Scanner(System.in);
//	
//		final String[] strarr = {"양념", "후라이드", "갈릭", "간장"};
//		
//		System.out.print("치킨 이름을 입력하세요 : ");
//		String str = sc.next();
//		
//		for(int i = 0; i< strarr.length; i++) {
//			switch (str) {
//				case strarr[i] :
//					System.out.print( str +"치킨 배달 가능"); break;
//				default :
//					System.out.print( str +"치킨은 없는 메뉴 입니다.");
//			}
//		}
//	}
	public static void arr19() {
		Scanner sc = new Scanner(System.in);
//		System.out.print("주민등록번호(-포함) : ");
//		String str = sc.nextLine();
//		
//		char[] st = new char[str.length()];
//		for(int i = 0; i< str.length(); i++) {
//			if(i < 8) {
//				st[i] = str.charAt(i);
//				System.out.print(st[i]);
//			}else {
//				st[i] = '*';
//				System.out.print(st[i]);
//			}	
//		}
		
//		System.out.print("주민등록번호(-포함) : ");
//		char[] str = sc.next().toCharArray();
//		
//		char[] st = new char[str.length];
//		
//		for(int i = 0; i < st.length; i++) {
//			if(i < 8) {
//				st[i] = str[i];
//				System.out.print(st[i]);
//			}else
//				st[i] = '*';
//				System.out.print(st[i]);
//		}
	}
	
	public static void arr20() {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int max = 0, min = 10;
		for(int i = 0; i < num.length;i++) {
			num[i] = (int)(Math.random() * 10 + 1);
			
			max = num[i] > max ? num[i] : max ;
			min = num[i] < min ? num[i] : min;
			System.out.print(num[i] +" ");
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	public static void arr21() {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int i = 0;
		while(i < num.length) {
			int nan = (int)(Math.random() * 10 + 1);
			for(int j = 0; j < num.length; j++) {
				if(num[j] == nan) {
					nan = 0;
					break;
				}
			}
			if(nan == 0)
				continue;
			else {
				num[i] = nan;
				i++;
			}
		}
		for(i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	public static void arr22() {
		int[] num = new int[10]; //0,0,0,0,0,0,0,0,0,0
		int i = 0, rand = 0;
		while(i < num.length) {
			rand = (int)(Math.random() * 10 +1);
			for(int j = 0; j<num.length; j++ ) {
				if(num[j] == rand) {
					rand = 0;
					break;
				}
			}
			if(rand == 0) {
				continue;
			}else {
				num[i] = rand;
				i++;
			}
		}
		for(i = 0; i< num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
	}
	public static void arr23() {
		int[] num =new int[6]; //0,0,0,0,0,0
		int i = 0, rand = 0;
		while(i < num.length) {
			rand = (int)(Math.random() * 45 +1);
			for(int j = 0; j<num.length; j++ ) {
				if(num[j] == rand) {
					rand = 0;
					break;
				}
			}
			if(rand == 0) {
				continue;
			}else {
				num[i] = rand;
				i++;
			}
		}
		Arrays.sort(num);
		for(i = 0; i< num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	public static void arr24() {
		int[] num =new int[6]; //0,0,0,0,0,0
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 45 +1);
			for(int j = 0; j < i; j++ ) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(num);
		for(int j = 0; j < num.length;j++) {
			System.out.print(num[j] + " ");
		}
	}
	public static void arr25() {
		//application
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.print("문자열 : ");
		str = sc.next();
		
		char[] ch = new char[str.length()];
		System.out.print("문자열에 있는 문자 : ");
		
		int i = 0, j = 0;
		while(i < str.length()){
			ch[j] = str.charAt(i);
			//중복검사
			for(int k = 0; k < j; k++) {
				if(ch[j] == ch[k]) {
					j--;
					break;
				}
			}
			i++;
			j++;
		}
		for(int h = 0; h < ch.length; h++) {
			if(h == (ch.length - 1) || ch[h + 1] == 0) {
				System.out.print(ch[h]);
				System.out.print("\n문자 개수 : " + (h + 1));
				break;
			}else
				System.out.print(ch[h] + ", ");
		}	
	}
	public static void arr26() {
		Scanner sc = new Scanner(System.in);
		int size;
		String[] strarr, strarr2;
		
		System.out.print("배열의 크기를 입력하세요 : ");
		size = sc.nextInt();
		sc.nextLine();
		
		strarr = new String[size];
		int i = 0;
		while(true) {
			for(; i<strarr.length; i++) {
				System.out.print((i + 1) + "번째 문자열 : ");
				strarr[i] = sc.nextLine();
			}
			
			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
			if('y' == sc.next().charAt(0)) {
				System.out.print("더 입력하고 싶은 개수 : ");
				size = sc.nextInt();
				sc.nextLine();
				
				strarr2 = new String[size + strarr.length];
				for(i = 0; i< strarr.length;i++) {
					strarr2[i] = strarr[i];
				}
				
				strarr = strarr2;
				
			}else {
				System.out.print("[");
				for(i = 0; i<strarr.length; i++) {
					if(i == (strarr.length-1))
						System.out.print(strarr[i] + "]");
					else
						System.out.print(strarr[i] +", ");
				}
				break;
			}
		}
	}
	public static void arrsecond() {
		//크기가 4인 1차원배열 3개를 담고있는 2차원배열을 만들어라(int)
//		int[][] arr1 = new int[3][4];
//		arr1[0][0] = 5;
//		arr1[0][1] = 2;
//		arr1[0][2] = 3;
//		arr1[0][3] = 4;
		
//		arr1[1][0] = 5;
//		arr1[1][1] = 6;
//		arr1[1][2] = 7;
//		arr1[1][3] = 8;
		
//		arr1[1][0] = 5;
//		arr1[1][1] = 5;
//		arr1[1][2] = 5;
//		arr1[1][3] = 5;
		
//		arr1[2][0] = 5;
//		arr1[2][1] = 10;
//		arr1[2][2] = 11;
//		arr1[2][3] = 12;
		
		//[i][0]
//		for(int i = 0; i < arr1.length;i++) {
//			arr1[i][0] = 5;
//		}
		
		
		// [1][i]
//		for(int i = 0 ; i < arr1[1].length; i++) {
//			arr1[1][i] = 5;
//			System.out.print(arr1[1][i] + " ");
//		}
		

		

//		for(int i = 0; i < arr1.length ; i++) {
//			for(int j = 0; j < arr1[i].length; j++) {
//				arr1[i][j] = 5;
//			}
//		}
//		
//		for(int i = 0; i < arr1.length ; i++) {
//			for(int j = 0; j < arr1[i].length; j++) {
//				System.out.println(arr1[i][j]);
//			}
//		}
		//크기가 각각 4, 3, 5, 2인 1차원배열들로 생성된 2차월 배열들로 만들고 값을 전부 10으로 초기화
		int[][] num = {
						{10,10,10,10},
						{10,10,10},
						{10,10,10,10,10},
						{10,10}
					  };
	}
	public static void arrsecond2() {
		String[][] str = {{"(0,0)", "(0,1)", "(0,2)"},
						{"(1,0)", "(1,1)", "(1,2)"},
						{"(2,0)", "(2,1)", "(2,2)"}};
		
		String[][] str1 = new String[3][3];
		for(int i = 0; i < str1.length ; i++) {
			for(int j = 0; j < str1[i].length; j++) {
				str1[i][j] = "("+ i +", " + j + ")"; 
				System.out.print(str1[i][j]);
			}
		}
	}
	public static void arrsecond3() {
		char[][] charr2= {{'a', 'b', 'c'},{'d','e','f'},{'G','h','i'}};
		char[][] charr = new char[3][3];
		char a = 'a';
		for(int i = 0; i < charr.length; i++) {
			for(int j = 0; j < charr[i].length; j++) {
				charr[i][j] = a;
				a++;
				System.out.print(charr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void arrsecond4() {
		int[][] num = new int[4][4];
		int num1 = 1;
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				num[i][j] = num1++;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void arrsecond5() {
		int[][] num = new int[4][4];
		int num1 = 16;
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				num[i][j] = num1--;
				
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void arrsecond6() {
		int[][] sum = new int[4][4];
		int num = 1;
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum[i].length; j++) {
				
				if(j == (sum.length - 1)) {
					sum[i][j] = sum[i][0] + sum[i][1] + sum[i][2] ;
				}else if (i == (sum.length - 1)) {
					sum[i][j] = sum[0][j] + sum[1][j] + sum[2][j] ;
				}else
					sum[i][j] = num++;
				
				if(i == (sum.length - 1) && j == (sum.length - 1)) {
					sum[i][j] *= 2;
				}
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void arrsecond7() {
		int[][] sum = new int[4][4];

		int num = 1;
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum[i].length; j++) {
				
				if(j == (sum.length-1)) {
					sum[i][j] = sum[i][0] + sum[i][1] + sum[i][2] ;
				}else if (i == (sum.length-1)) {
					sum[i][j] = sum[0][j] + sum[1][j] + sum[2][j] ;
				}else
					sum[i][j] =(int)(Math.random() * 10 +1);
				
				if(i == (sum.length-1) && j == (sum.length-1)) {
					sum[i][j] *= 2;
				}
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void arrsecond8() {
		String str = "안녕하세요";
		if(!(str.equals("hi"))) {
			System.out.println(str);
		}else {
			System.out.println("hi");
		}
		
		int[] arr = new int[8];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = 5;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		char[][] arr2 = new char[2][3];
		
		char a = 'a';
		for(int i = 0; i<arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = a++;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void arrsecond9() {
		int[][] sum = new int[4][4];
		for(int i = 0; i < (sum.length - 1);i++) {
			for(int j = 0; j < (sum[i].length - 1); j++) {
				sum[i][j] = (j + 1 + ( i * 3)); //[0][0] = 1, 
				sum[i][3] += sum[i][j]; // 6, 15, 24 를 저장
				sum[3][3] += sum[i][j]; // 6 + 15 + 24 = 45를 저장
			}
			sum[3][0] += sum[i][0]; //1+4+7 =12
			sum[3][1] += sum[i][1]; //2 + 5 + 8 = 15
			sum[3][2] += sum[i][2]; // 3+ 6 +9 = 18
			sum[3][3] += sum[i][0]; // 45 + 12 = 57
			sum[3][3] += sum[i][1]; // 57 + 15 = 72
			sum[3][3] += sum[i][2]; // 72 + 18 = 90
		}
		
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum.length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		arrsecond9();
	}

}
