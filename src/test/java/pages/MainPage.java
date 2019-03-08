package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static final SelenideElement
            buttonAddComputer = $(".btn.success"),
            buttonFilterByName = $(".btn.primary"),
            buttonDeleteComputer = $(".btn.danger"),
            buttonSaveComputer = $(By.xpath("//input[@type='submit']")),
            fieldComputerName = $(By.id("name")),
            fieldIntroducedDate = $(By.id("introduced")),
            fieldDiscountedDate = $(By.id("discontinued")),
            dropdownChooseCompany = $(By.id("company")),
            fieldSearch = $(By.id("searchbox")),
            table = $(By.xpath("//table[@class='computers zebra-striped']"));



//            buttonDownloadRuLink = $(By.xpath("//h1[contains(text(),'Самый быстрый и удобный способ сделать скриншот')]"));

}



