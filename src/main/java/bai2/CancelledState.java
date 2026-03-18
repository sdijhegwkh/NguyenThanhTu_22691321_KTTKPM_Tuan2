package bai2;

class CancelledState implements OrderState {
    public void handle(OrderContext context) {
        System.out.println("Đơn hàng đã bị hủy và hoàn tiền.");
    }
}
