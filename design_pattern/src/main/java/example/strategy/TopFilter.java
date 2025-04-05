package example.strategy;

import java.util.List;
import java.util.stream.Collectors;

public class TopFilter implements ClothingFilterStrategy {
  @Override
  public List<Clothing> filter(List<Clothing> clothes) {
    return clothes.stream()
            .filter(c -> "top".equalsIgnoreCase(c.getType()))
            .collect(Collectors.toList());
  }
}
