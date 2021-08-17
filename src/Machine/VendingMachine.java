package Machine;

public class VendingMachine {

	/*
	 * VendingMachine = 주요 기능 Beverage = 음료 종류 관리(Getter, Setter) ValueOfTypes = 투입
	 * 금액 입력, 음료 선택
	 */

	private Beverage[] Beverages = new Beverage[5]; // 음료 5개
	private int money = 0; // 소지금

	public void init() {

		Beverages[0] = new Beverage("사이다", 1500);
		Beverages[1] = new Beverage("콜라", 2000);
		Beverages[2] = new Beverage("이온음료", 1600);
		Beverages[3] = new Beverage("감귤주스", 2300);
		Beverages[4] = new Beverage("녹차", 1900);
		
	}
	/*
	 * 투입 금액 확인 후, 구매 가능 물품 출력.
	 */

	public void showBeverage(int money) {
		this.money = money;

		System.out.println("=================");
		for (int i = 0; i < Beverages.length; i++) {
			if (Beverages[i].getPrice() <= money) {
				System.out.printf(Beverages[i].getName() + ":" + Beverages[i].getPrice() + "\n");
			}
		}
		System.out.println("=================");
	}

	public void outBeverage(String name) {
		for (int i = 0; i < Beverages.length; i++) {
			if (name.equals(Beverages[i].getName())) {
				System.out.println(Beverages[i].getName() + " 선택");
				money -= Beverages[i].getPrice();
				System.out.println("잔돈: " + money);
			}
		}
	}
}
