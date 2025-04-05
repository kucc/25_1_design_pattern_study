from abc import ABC, abstractmethod


class Notifier(ABC):
  @abstractmethod
  def notify(self, recipient: str, message: str) -> None:
    pass


class EmailNotifier(Notifier):
  def notify(self, recipient, message):
    print(message)


class PhoneNotifier(Notifier):
  def notify(self, recipient, message):
    print(message)


class Product():
  def __init__(self, name: str, owner: str):
    self.name = name
    self.owner = owner


class OrderService:
  def __init__(self, notifier: Notifier):
    self.notifier = notifier

  def set_notifier(self, notifier: Notifier):
    self.notifier = notifier

  def order(self, product: Product, quantity: int):
    self.notifier.notify(product.owner, f"[주문알림] \"{product.name}\" 상품 {quantity}개 주문이 들어왔습니다")


if __name__ == "__main__":
  onion_chicken = Product("마늘 치킨", "삼성통닭")

  order_service = OrderService(PhoneNotifier())
  order_service.order(onion_chicken, 2)

  order_service.set_notifier(EmailNotifier())
  order_service.order(onion_chicken, 5)
