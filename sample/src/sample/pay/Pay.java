package sample.pay;

public class Pay {
	public void pay(int price, String id, String rsrvNumber) {
		System.out.println("결제 성공");
		System.out.println("결제 금액 : " + price);
		System.out.println("ID : " + id);
		System.out.println("예약 번호 : " + rsrvNumber);
	}

}
