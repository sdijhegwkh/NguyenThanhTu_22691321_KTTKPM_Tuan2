package bai2cau3;

abstract class PaymentDecorator implements Payment {

    protected Payment payment;

    public PaymentDecorator(Payment payment) {
        this.payment = payment;
    }

}
