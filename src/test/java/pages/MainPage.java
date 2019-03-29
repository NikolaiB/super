package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static final SelenideElement
            buttonUpdate = $(By.xpath("//button[contains(text(),'Update')]")),
            buttonDelete = $(By.xpath("//button[contains(text(),'Delete')]")),
            buttonAdd = $(By.xpath("//button[@type='submit']")),
            valueField = $(By.xpath("//input[@placeholder='Value']")),
            descriptionField = $(By.xpath("//input[@placeholder='Description']")),
            categorySelector = $(By.name("categoryId"));
}



