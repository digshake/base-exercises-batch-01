package module1._8practice;

public class E10Clearance {

	//Exercise 10: This code is attempting to compute the price
	//of an item on clearance but there are errors. Fix them!
    public static void main(String[] args) {
        int originalPrice = 68.00;
        int clearancePrice = originalPrice * 0.3; //item is on 70% clearance
        int finalPrice = clearancePrice * 0.8; //you have a 20% off coupon
        System.out.println(finalPrice);
    }
}
