
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    public Calculator calculator;


    @BeforeEach
    public void setUp() {
        this.calculator = new Calculator();
    }

    @AfterEach
    public void remove(){
        calculator = null;
    }

    @Test
    public void somVerschillendeGetallen(){

        //Arrange

        //Act
        int som = calculator.sum(1,8);

        //Assert
        Assertions.assertEquals(9, som);
    }

    @Test
    public void somDezelfdeGetallen(){

        //Arrange

        //Act
        int som = calculator.sum(1,8);

        //Assert
        Assertions.assertEquals(9, som);
    }

    @Test
    public void somGroterDan10(){

        //Arrange

        //Act
        int som = calculator.sum(6,8);

        //Assert
        Assertions.assertEquals(14, som);
    }



}
