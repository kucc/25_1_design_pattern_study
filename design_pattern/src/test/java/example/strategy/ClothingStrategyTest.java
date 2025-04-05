package example.strategy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ClothingStrategyTest {

  @Test
  void clothingStrategyTest() {
    List<Clothing> clothes = Arrays.asList(
            new Clothing("반팔 티셔츠", "top", 25000),
            new Clothing("청바지", "bottom", 55000),
            new Clothing("가디건", "outer", 75000),
            new Clothing("셔츠", "top", 49000),
            new Clothing("코트", "outer", 150000)
    );

    ClothingFilterContext context = new ClothingFilterContext();

    // 상의만 필터링
    context.setStrategy(new TopFilter());
    System.out.println("=== 상의만 필터링 ===");
    context.filterClothing(clothes).forEach(System.out::println);

    // 5만원 이하 필터링
    context.setStrategy(new PriceBelowFilter(50000));
    System.out.println("\n=== 5만 원 이하만 필터링 ===");
    context.filterClothing(clothes).forEach(System.out::println);
  }
}

