package bai2;

 class OrderContext {
     private OrderState state;

     public OrderContext() {
         state = new NewOrderState();
     }

     public void setState(OrderState state) {
         this.state = state;
     }

     public void process() {
         state.handle(this);
     }
}
