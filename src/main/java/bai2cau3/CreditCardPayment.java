package bai2cau3;

class CreditCardPayment implements Payment {

    public double pay(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng");
        return amount;
    }

}
