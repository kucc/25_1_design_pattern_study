package example.strategy;

public class PayPalPayment implements PaymentStrategy {
  private String email;

  public PayPalPayment(String email) {
    this.email = email;
  }

  @Override
  public void pay(int amount) {
    System.out.println(amount + "원을 PayPal(" + email + ")로 결제했습니다.");
  }
}
