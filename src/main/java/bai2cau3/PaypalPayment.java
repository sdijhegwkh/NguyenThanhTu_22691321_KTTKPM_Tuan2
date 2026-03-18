package bai2cau3;

class PaypalPayment implements Payment {

    public double pay(double amount) {
        System.out.println("Thanh toán bằng PayPal");
        return amount;
    }

}
