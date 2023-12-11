//package christmas.dto;
//
//import java.util.EnumMap;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class ExampleDto {
//
//    private Map<Food, Integer> foods;
//
//    private FoodsDto(final Map<Food, Integer> foods) {
//        this.foods = foods;
//    }
//
//    public static FoodsDto from(final Map<String, Integer> foods){
//        return new FoodsDto(parse(foods));
//    }
//    public OrderedFoods getFoods() {
//        return new OrderedFoods(foods);
//    }
//
//    private static Map<Food, Integer> parse(final Map<String, Integer> foods){
//        return foods.entrySet()
//                .stream()
//                .collect(Collectors.toMap(
//                        entry -> Food.find(entry.getKey()),
//                        entry -> entry.getValue(),
//                        (oldValue, newValue) -> oldValue,
//                        () -> new EnumMap<>(Food.class)
//                ));
//    }
//
//    @Override
//    public String toString() {
//        return "FoodsDto{" +
//                "foods=" + foods +
//                '}';
//    }
//}
