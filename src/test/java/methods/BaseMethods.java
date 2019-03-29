package methods;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import sun.invoke.empty.Empty;

import java.util.Set;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.Keys.*;

public class BaseMethods {

    public static void clickOnItem(SelenideElement element){
        element.shouldBe(visible).shouldBe(enabled).click();
    }

    public static void sendKeysToElement(SelenideElement element, String text) {
        element.setValue(text);
    }

    public static void sendKeysToElementEdit(SelenideElement element, String text) {
        element.click();
        element.doubleClick();
        element.sendKeys(BACK_SPACE);
        element.sendKeys(text);
    }

    public static void selectFromSelector(SelenideElement element, String text){
        element.selectOption(text);
    }

    public static void selectItemFromTable(String text){
        $(byXpath("//body//tr//td//div[contains(text(),\""+text+"\")]")).shouldBe(visible).shouldBe(enabled).click();
    }

    public static void textShouldBeVisible(String text) {
        $(byXpath("//div[@class='sG1fB _1yrus' and contains(text(),\"" +text+ "\")]")).shouldBe(visible);
    }

}
