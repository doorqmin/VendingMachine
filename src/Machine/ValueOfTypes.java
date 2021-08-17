package Machine;

import java.util.Scanner;

public class ValueOfTypes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VendingMachine vm = new VendingMachine();
		
		vm.init(); // 음료 목록 배열 생성
		System.out.println("소지금을 입력하세요");
		int money = sc.nextInt();
		
		vm.showBeverage(money); // 소지금으로 구매 가능 음료 출력
		
		System.out.println("음료를 선택하세요");
		String name = sc.next();
		
		vm.outBeverage(name); // 음료 제공 및 잔돈 반환
	}
}