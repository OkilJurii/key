package pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Order extends BasePage {

    public Order(WebDriver driver) {
        super(driver);
    }

    By orderInputName = By.xpath("//input[@placeholder='* Имя']");
    By orderInputSurname = By.xpath("//input[@placeholder='* Фамилия']");
    By orderInputAddress  = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    By orderInputTelephone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    By orderInputMetro = By.xpath("//input[@placeholder='* Станция метро']");
    By orderInputMetroName = By.className("select-search_select");

}
