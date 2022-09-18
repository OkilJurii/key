package pages.qaScooter;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Qa_scooter extends BasePage {

    public Qa_scooter(WebDriver driver) {
        super(driver);
    }

    public By importantQuestionsSection1 = By.xpath("//*[@id='root']/div/div/div[5]/div[2]/div/div[1]");
    public By importantQuestionsSection2 = By.xpath(".//div[2][@class='accordion__item']");
    public By importantQuestionsSection3 = By.xpath(".//div[3][@class='accordion__item']");
    public By importantQuestionsSection4 = By.xpath(".//div[4][@class='accordion__item']");
    public By importantQuestionsSection5 = By.xpath(".//div[5][@class='accordion__item']");
    public By importantQuestionsSection6 = By.xpath(".//div[6][@class='accordion__item']");
    public By importantQuestionsSection7 = By.xpath(".//div[7][@class='accordion__item']");
    public By importantQuestionsSection8 = By.xpath(".//div[8][@class='accordion__item']");

     public Qa_scooter clickElement(By sectionQ) {
         System.out.println(sectionQ + "клик");
         driver.findElement(sectionQ).click();
         return this;
     }

     public Qa_scooter waitElement(By sectionQ) {

         waitElementIsVisible(driver.findElement(sectionQ));
         System.out.println(sectionQ + " ожидание пройдено");
         return this;
     }


     public Qa_scooter alertElementOpen(By sectionQ){
         System.out.println(sectionQ + " -  - " + sectionQ);

         Boolean ariaDisabled = driver.findElement(sectionQ).getAttribute("aria-disabled").equals("true");
         Assert.assertTrue(ariaDisabled);
         return this;
     }

     By orderButtonTop = By.xpath("//button[@class='Button_Button__ra12g']");
     By orderButtonBottom = By.xpath("//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");


}
