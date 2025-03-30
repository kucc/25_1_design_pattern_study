// 결제 전략 인터페이스
public interface PaymentStrategy {
    void pay(int amount);
}

// 신용카드 결제
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "원을 신용카드(" + cardNumber + ")로 결제했습니다.");
    }
}

// 페이팔 결제
public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "원을 PayPal 계정(" + email + ")으로 결제했습니다.");
    }
}

// 비트코인 결제
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

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // 결제 전략을 동적으로 변경 가능
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        if (paymentStrategy == null) {
            System.out.println("결제 방법이 선택되지 않았습니다.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}


public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // 신용카드 결제
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.pay(50000);

        // PayPal 결제
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.pay(30000);

        // 비트코인 결제
        context.setPaymentStrategy(new BitcoinPayment("1A2B3C4D5E6F"));
        context.pay(70000);
    }
}
