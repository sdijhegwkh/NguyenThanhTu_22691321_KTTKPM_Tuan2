package bai2;

public class NewOrderState implements OrderState{
    public void handle(OrderContext context) {
        System.out.println("Đóng gói và vận chuyển...");
        context.setState(new DeliveredState());
    }
}
