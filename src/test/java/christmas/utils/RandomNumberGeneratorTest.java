package christmas.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    
    // createMax2DuplicateNumbers 예외 테스트
    @Test
    void 최대_2개의_중복된_랜덤리스트를_가질_수_있다(){
        for (int i=0; i<10; i++){
            List<Integer> max2DuplicateNumbers = RandomNumberGenerator.createMax2DuplicateNumbers();
            System.out.println("max2DuplicateNumbers = " + max2DuplicateNumbers);
        }

    }

}