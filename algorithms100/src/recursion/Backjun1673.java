package recursion;
// 강민이는 치킨 한 마리를 주문할 수 있는 치킨 쿠폰을 n장 갖고있다.
// 이 치킨집에서는 한마리 주문할 때 마다 도장은 하나씩 찍어 주는데, 
// 도장을 k개 모으면 치킨 쿠폰 한장으로 교환할 수 있다.
// 강민이가 지금 갖고 있는 치킨쿠폰으로 치킨을 최대 몇마리나 먹을 수 있는지 구하세요.
// * 단 치킨을 주문하기 위해서는 반드시 치킨 쿠폰을 갖고 있어야한다.
// 입력: n k   출력 : 정답 
// 예 : 쿠폰(n) 4개 도장(k) 3개

public class Backjun1673 {

	static void ateChicken ( int ticket, int ) {
		
	}
	
	public static void main(String[] args) {
		// 간단히 짜본 것.
		int coupon = 100;
		int stamp = 5;
		int count = 0;
		int chicken = 0;
		//그니까 치킨을 쿠폰한장(치킨하나)에 도장 1개
		while (coupon > 0) {
			coupon--;
			chicken++;
			count++;
			if(count == stamp) {
				count = 0;
				coupon++;
			}
		}
		System.out.println(chicken);
		
	
	}
}
