package testProject;

import java.util.*;

public class Study0801 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		/**
//		 * 1. 배열형식의 참조변수 선언
//		 * 2. 배열객체 할당
//		 * 3. 배열 데이터 초기화
//		 * 4. 배열 데이터 활용
//		 */
//		
//		int[] ref;
//		ref = new int[6];
//		ref[0] = 1;
//		ref[1] = 2;
//		ref[2] = 3;
//		ref[3] = 4;
//		ref[4] = 5;
//		ref[5] = 6;
//		
//		//반복문을 이용해서 배열 초기화
//		for (int i = 0; i < ref.length; i++)
//			ref[i] = i + 1;
//		
//		//반복문을 이용해서 배열 출력
//		for (int i = 0; i < ref.length; i++)
//			System.out.print(ref[i]);
		
		/*
		// int형 변수 num을 생성하고 값을 10으로 초기화
		int num = 10;
		// String형 변수 str을 생성하고 값을 "hi"로 초기화
		String str = "hi";
		//num과 str을 출력
		System.out.println(num);
		System.out.println(str);
		
		//만약 num이 5보다 크다면 "num은 5보다 큰 수입니다"출력
		// 더 작다면 "num은 5보다 작은 수 입니다"출력
		// 5라면 "num은 5입니다"출력
		if (num > 5) {
			System.out.println("num은 5보다 큰 수입니다");
		} else if (num < 5) {
			System.out.println("num은 5보다 작은 수 입니다");
		} else {
			System.out.println("num은 5입니다");
		}
		
		
		// 반복문을 활용하여 1~num까지 숫자를 순차적으로 출력 
		// ex) num = 3일떄 1 2 3출력
		// for while각각 작성
		
		for (int i = 1; i <= num; i++)
			System.out.print(i);
		
		int i = 0;
		while(i <= num) {
			System.out.print(i);
			i++;
		}

		//길이가 20인 int형 배열 arr생성후 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
		int[] arr = new int[20];
		for (int i = 1; i <= arr.length; i++) { 
			arr[i - 1] = i;
		}
		
		//반복문을 이용하여 arr 요소 전체출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		//string형 길이가 5인 배열 arr2을 생성하고 생성과 동시에 {"사과", "포도", "귤", "파인애플", "바나나"}로 초기화
		String[] arr2 = {"사과", "포도", "귤", "파인애플", "바나나"};
		
		//반복문을 이용하여 arr2 요소 전체출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		*/
		
		/*
		로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		1~45번 난수 생성
		Arrays.sort(배열)// 오름차순 정렬
		Arrays.sort(배열, Collections.reverseOrder()); // 내림차순 정렬
		
		ex.
		3 4 15 17 28 40 
		*/
		
		/*
		int[] arr = new int[6];

		
		int i = 0;
		while (i < arr.length) {
			//난수 입력받기
			int nan = (int)(Math.random() * 45 + 1);
			
			//난수 검사
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == nan) {
					nan = 0;
					break;
				}
			}
			
			if (nan == 0)
				continue;
			else {
				arr[i] = nan;
				i++;
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] ==  arr[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		 */
		
		
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요.
//
//		ex.
//		문자열 : application
//		문자열에 있는 문자 : a, p, l, i, c, t, o, n
//		문자 개수 : 8

		
//		String str;
//		char[] strArray;
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		// application
//		
//		strArray = new char[str.length()];
//		
//		int i = 0, j = 0;
//		
//		while(i < str.length()) {
//			strArray[j] = str.charAt(i);
//			//중복검사
//			for(int k = 0; k < j; k++) {
//				if (strArray[j] == strArray[k]) {
//					j--;
//					break;
//				}
//			}
//			i++;
//			j++;
//		}
//		
//		System.out.print("문자열에 있는 문자 : ");
//		for (int h = 0; h < strArray.length; h++) {
//			if (h == (strArray.length - 1) || strArray[h + 1] == 0) {
//				System.out.println(strArray[h]);
//				System.out.print("문자 개수 : " + (h + 1));
//				break;
//			} else 
//				System.out.print(strArray[h] + ", ");
//		}
		
		/*
		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.

		배열의 크기를 입력하세요 : 3
		1번째 문자열 : 자바의 정석
		2번째 문자열 : 알고리즘
		3번째 문자열 : C프로그래밍
		더 값을 입력하시겠습니까?(Y/N) : y
		더 입력하고 싶은 개수 : 2
		4번째 문자열 : 인간관계
		5번째 문자열 : 자기계발
		더 값을 입력하시겠습니까?(Y/N) : y
		더 입력하고 싶은 개수 : 1
		6번째 문자열 : 영단어600
		더 값을 입력하시겠습니까?(Y/N) : n
		[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		*/
		
		int num;
		String[] strArray1, strArray2;
		
		System.out.print("배열의 크기를 입력하세요 :");
		num = sc.nextInt(); //3
		sc.nextLine();
		
		strArray1 = new String[num];
		int i = 0;
		while(true) {
			// 문자열을 입력받는 부분
			for (; i < strArray1.length; i++) { // i = 0; i < 3
				System.out.print((i + 1) + "번째 문자열 : "); //1번째 문자열 :
				strArray1[i] = sc.nextLine(); // strArray1[0] = "입력한 값"
			}
			
			//더 입력할지 안할지 확인부분
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			
			// 더 입력하겠다.
			if ('Y' == sc.next().charAt(0)) {
				System.out.print("더 입력하고 싶은 개수 :");
				num = sc.nextInt();
				sc.nextLine();
				strArray2 = new String[strArray1.length + num];
				
				for (i = 0; i < strArray1.length; i++) {
					strArray2[i] = strArray1[i];
				}
				strArray1 = strArray2;
				// 배열 추가로 크게 생성해주고
				//복제
			} else { // 그만입력하겠다.
				System.out.print("[");
				for (i = 0; i < strArray1.length; i++) {
					if (i == strArray1.length - 1)
						System.out.print(strArray1[i] + "] ");
					else 
						System.out.print(strArray1[i] + ", ");
				}
				break;
			}
		}
		
		
		
		
	}
}
