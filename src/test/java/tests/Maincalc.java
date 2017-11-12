package tests;

import objects.pagecalc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

public class Maincalc extends Basecalc {

    static pagecalc calc = new pagecalc(driver);

    @BeforeClass
    public static void openPage() {
        calc.open();
    }

    @Before
    public void cleanup() {
        calc.clear();
    }

    @Test
    @Stories("Add story")
    @Features("Calculator")
    public void add_test() {
        Assert.assertEquals("141", calc.calculate("85+56"));
    }

    @Test
    @Stories("Sub story")
    @Features("Calculator")
    public void sub_test() {
        Assert.assertEquals("35", calc.calculate("56-21"));
    }

    @Test
    @Stories("Mult story")
    @Features("Calculator")
    public void mult_test() {
        Assert.assertEquals("492", calc.calculate("41x12"));
    }

    @Test
    @Stories("Div story")
    @Features("Calculator")
    public void div_test() {
        Assert.assertEquals("3", calc.calculate("99/33"));
    }



}
