package test.qa_scooter;

import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.qaScooter.Qa_scooter;
import test.base.BaseTest;

public class Qa_scooterTest extends BaseTest {


@Test
    public void qualitySelect(){
    Qa_scooter qaScooter = new Qa_scooter(driver);
    qaScooter
            .waitElement(qaScooter.importantQuestionsSection1)
            .clickElement(qaScooter.importantQuestionsSection1)
            .alertElementOpen(qaScooter.importantQuestionsSection1);
}



}
