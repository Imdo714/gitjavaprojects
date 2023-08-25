package testProject;

public class ArrayExample3 {

	public static void main(String[] args) {
		/*
		 * 1.배열형식의 참조변수 선언
		 * 2. 배열객체 할당
		 * 3. 배열 데이터 초기화
		 * 4. 배열 데이터 활용
		 */
		int[] ref;
		ref = new int[] {1,2,3,4,5,6};
		ref[0] = 1;
		ref[1] = 2;
		ref[2] = 3;
		ref[3] = 4;
		ref[4] = 5;
		ref[5] = 6;
		
		for(int i  = 0; i< ref.length; i++) {
			ref[i] = i + 1;
		}
		for(int i = 0; i < ref.length; i++) {
			System.out.print(ref[i]);
		}
		System.out.print("\n");
		//int형 변수 num을 생성하고 값을 10으로 초기화
		int num = 10;
		//String형 변수 str을 생성하고 값을 "hi"로 초기화
		String str = "hi";
		//num과 str출력
		System.out.println(num + " " + str);
		//만약 num이 5보다 크다면 "num은 5보다 큰 수 입니다." 출력
		if(num > 5)
			System.out.println("num은 5보다 큰 수 입니다.");
		else if(num < 5) //더작다면 "num은 5보다 작은 수 입니다. 출력"
			System.out.println("num은 5보다 작은 수 입니다.");
		else //5라면 "num은 5입니다."
			System.out.println("num은 5입니다.");
		
		//반복문을 활용하여 1~num까지 숫자를 순차적으로 출력
		//ex) num = 3일때 1 2 3 출력
		
		//for
		for(int i = 1; i<=num  ; i++) {
			System.out.print(i +" ");
		}
		System.out.print("\n");
		//while
		int i = 1;
		while(i<=num) {
			System.out.print(i +" ");
			i++;
		} 
		System.out.print("\n");
		//길이가 20인 int형 배열 arr 생성 후 반복문을 이용하여 값을 1~20까지 순차적 초기화
		int[] arr = new int[20];
		for(int j = 0; j<arr.length; j++) {
			arr[j] = j+1;
		}
		//출력
		for(int j = 0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.print("\n");
		//String 배열 초기화 후 출력
		String[] arr2 = {"사과", "포도", "귤", "파인애플", "바나나"};
		for(int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j] + ", ");
		}
	}

}
