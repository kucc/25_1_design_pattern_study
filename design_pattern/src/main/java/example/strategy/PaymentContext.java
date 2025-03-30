package example.strategy;

public class PaymentContext {
  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void executePayment(int amount) {
    if (paymentStrategy == null) {
      System.out.println("결제 방법이 선택되지 않았습니다.");
      return;
    }
    paymentStrategy.pay(amount);
  }
}
