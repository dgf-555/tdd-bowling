import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    public void should_return_zero_when_all_zero(){
        //given
        int temp[] = new int[20];
        for(int i = 0;i<20;i++){
            temp[i] = 0;
        }
        //when
        int result = BowlingGame.calculate(temp);
        //then
        Assertions.assertEquals(0,result);
    }
    @Test
    public void should_return_300_when_all_strike(){
        //given
        int temp[] = new int[12];
        for(int i = 0;i<12;i++){
            temp[i] = 10;
        }
        //when
        int result = BowlingGame.calculate(temp);
        //then
        Assertions.assertEquals(300,result);
    }
    @Test
    public void should_return_truenumber_when_include_spare_and_the_last_throw_was_strike(){
        //given
        int temp[] = new int[]{1,9,10,10,5,3,10,7,2,10,2,8,10,10,2,8};

        //when
        int result = BowlingGame.calculate(temp);
        //then
        Assertions.assertEquals(178,result);
    }
    @Test
    public void should_return_truenumber_when_include_spare_and_the_last_throw_was_spare(){
        //given
        int temp[] = new int[]{1,9,10,10,5,3,10,7,2,10,2,8,10,0,10};

        //when
        int result = BowlingGame.calculate(temp);
        //then
        Assertions.assertEquals(176,result);
    }
    @Test
    public void should_return_truenumber_when_include_spare_and_the_last_throw_was_sparebut_not10(){
        //given
        int temp[] = new int[]{1,9,10,10,5,3,10,7,2,10,2,8,10,2,3};

        //when
        int result = BowlingGame.calculate(temp);
        //then
        Assertions.assertEquals(156,result);
    }

}
