package example.strategy;

public class BitcoinPayment implements PaymentStrategy {
  private String walletAddress;

  public BitcoinPayment(String walletAddress) {
    this.walletAddress = walletAddress;
  }

  @Override
  public void pay(int amount) {
    System.out.println(amount + "원을 비트코인 지갑(" + walletAddress + ")으로 결제했습니다.");
  }
}
