package example.strategy;

import java.util.List;
import java.util.stream.Collectors;

public class PriceBelowFilter implements ClothingFilterStrategy {
  private int maxPrice;

  public PriceBelowFilter(int maxPrice) {
    this.maxPrice = maxPrice;
  }

  @Override
  public List<Clothing> filter(List<Clothing> clothes) {
    return clothes.stream()
            .filter(c -> c.getPrice() <= maxPrice)
            .collect(Collectors.toList());
  }
}

