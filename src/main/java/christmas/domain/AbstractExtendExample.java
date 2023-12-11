//package christmas.domain;
//
//public class AbstractExtendExample extends AbstractExample{
//
//    public static final String SPECIAL_TITLE = "특별 할인";
//    private static final int PRICE = 1_000;
//
//    private AbstractExtendExample() {
//        super(SPECIAL_TITLE, PRICE);
//    }
//
//    public static Discount from(EventDate eventDate){
//        if(!isSpecial(eventDate)){
//            throw new IllegalArgumentException("[ERROR] 특별 이벤트 날짜에 속하지 않습니다.");
//        }
//        return new SpecialDiscount();
//    }
//
//    private static boolean isSpecial(EventDate eventDate){
//        return DiscountCalendar.isEventDay(DiscountCalendar.SPECIAL , eventDate);
//    }
//}