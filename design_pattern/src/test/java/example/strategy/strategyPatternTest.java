package example.strategy;

import org.junit.jupiter.api.Test;

class strategyPatternTest {

  @Test
  void strategyPatterTest() {
    PaymentContext paymentContext = new PaymentContext();

    // 신용카드 결제
    paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
    paymentContext.executePayment(50000);

    // 페이팔 결제
    paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
    paymentContext.executePayment(30000);

    // 비트코인 결제
    paymentContext.setPaymentStrategy(new BitcoinPayment("1A2b3C4d5E6F"));
    paymentContext.executePayment(70000);
  }
}

