package methods;

import com.codeborne.selenide.SelenideElement;

import java.util.Set;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class BaseMethods {

    public static void clickOnItem(SelenideElement element){
        element.shouldBe(visible).shouldBe(enabled).click();
    }

    public static void sendKeysToElement(SelenideElement element, String text) {
        element.setValue(text);
    }

    public static void selectFromSelector(SelenideElement element, String text){
        element.selectOptionContainingText(text);
    }

    public static void selectFromTable(String text){
        $(byXpath("//a[contains(text(),\""+text+"\")]")).shouldBe(visible).shouldBe(enabled).click();
    }

    public static void textShouldBeVisible(String text) {
        $(byText("//*[normalize-space()='"+text+"']")).is(visible);
    }

}
