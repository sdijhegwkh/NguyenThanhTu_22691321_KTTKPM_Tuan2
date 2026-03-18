package bai2;

class DeliveredState implements OrderState {
    public void handle(OrderContext context) {
        System.out.println("Đơn hàng đã giao thành công.");
    }
}
