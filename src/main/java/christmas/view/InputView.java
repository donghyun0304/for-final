package christmas.view;

import christmas.utils.RetryUtil;

public class InputView {
    
    //기본 양식
    public Object input(){
        return RetryUtil.getInput(() -> {

            return null;
        });
    }
}
