package bai2cau3;

class ProcessingFee extends PaymentDecorator {

    public ProcessingFee(Payment payment) {
        super(payment);
    }

    public double pay(double amount) {
        amount = payment.pay(amount);
        amount += 5;
        System.out.println("Thêm phí xử lý: 5");
        return amount;
    }

}
