package example.strategy;

import java.util.List;

public class ClothingFilterContext {
  private ClothingFilterStrategy strategy;

  public void setStrategy(ClothingFilterStrategy strategy) {
    this.strategy = strategy;
  }

  public List<Clothing> filterClothing(List<Clothing> clothes) {
    if (strategy == null) {
      throw new IllegalStateException("전략이 설정되지 않았습니다.");
    }
    return strategy.filter(clothes);
  }
}

