package christmas.utils;

import java.util.function.Supplier;

public class RetryUtil {
    
    // 리턴값이 있고 예외가 터질때
    public static <T> T getInput(Supplier<T> inputSupplier){
        while(true){
            try{
                return inputSupplier.get();
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    // IllegalArgumentException과 IllegalStateException 둘다 필요할때 그리고 예외 문구를 일정하게 보여줘야할때
    public static <T> T getInputForDay(Supplier<T> inputSupplier){
        while(true){
            try{
                return inputSupplier.get();
            } catch (IllegalArgumentException e){
                System.out.println("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            } catch (IllegalStateException e){
                System.out.println("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            }
        }
    }

    // 리턴값이 필요없을때
    public static <T> void getInputNotReturning(Runnable runnable){
        while(true){
            try{
                runnable.run();
                return;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
    


}
