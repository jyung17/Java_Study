package main.java.baekjoon;

public class Study_test {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		int[] arr1;
////		arr1 = new int[5];
////		
////		arr1 = null;
////		
////		System.out.println(arr1[0]);
//		
////		int[] arr1 = new int[5];
////		
////		int[] arr2 = arr1;
////		
////		arr2[0] = 100;
////		
////		System.out.println(arr1[0]);
//		
////		int[] arr1 = new int[5];
////		float[] arr2 = new float[5];
////		boolean[] arr3 = new boolean[5];
////		char[] arr4 = new char[5];
////		Object[] arr5 = new Object[5];
////		
////		System.out.println(arr1[0]);
////		System.out.println(arr2[0]);
////		System.out.println(arr3[0]);
////		System.out.println(arr4[0]);
////		System.out.println(arr5[0]);
//		
//		
//		
//	}

//	public static void main(String[] args) {
//		System.out.println(100 + 27);
//		System.out.println(100 - 27);
//		System.out.println(100 * 27);
//		System.out.println(100 / 27);
//		System.out.println(100 % 27);
//	}

//	public static void main(String[] args) {
//		int i = 7;
//		--i;
//		--i;
//		System.out.println(i);
//		System.out.println(i--);
//		System.out.println(i);
//	}

//	public static void main(String[] args) {
//		int score = 80;
//		switch (score) {
//			case 100:
//			case 90:
//				System.out.println("A");
//				break;
//			case 80:
//			case 70:
//				System.out.println("B");
//				break;
//			case 60:
//			case 50:
//			case 40:
//				System.out.println("C");
//				break;
//			default:
//				System.out.println("F");
//		}
//	}

//	public static void main(String[] args) {
//		int level = 0;
//
//		final int GUEST = 0, MEMBER = 1, ADMIN = 2;
//
//		switch (level) {
//		case GUEST:
//			System.out.println("조회만 가능합니다.");
//			break;
//		case MEMBER:
//			System.out.println("글작성 가능합니다.");
//			break;
//		case ADMIN:
//			System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
//			break;
//		}
//	}

//	public static void main(String[] args) {
//		System.out.println(20);
//		System.out.println(3.14f);
//		System.out.println("Hello");
//		System.out.println('Y');
//		System.out.println(true);
//
//		System.out.printf("%d %x %c\n", 65, 66, 67);
//		System.out.printf("%3$d %1$x %2$c\n", 65, 66, 67);
//	}

	public static void main(String[] args) {
		for (int i = 1, j = 3; i <= 10; i++, j--) {
			System.out.printf("(%d, %d)", i, j);
			System.out.println();
		}
	}
}

class ClassName<E> {
	private E element; // 제네릭 타입 변수

	void set(E element) { // 제네릭 파라미터 메소드 사라짐
		this.element = element;
	}

	E get() { // 제네릭 타입 반환 메소드
		return element;
	}
}
