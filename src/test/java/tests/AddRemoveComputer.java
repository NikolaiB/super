package tests;

import io.qameta.allure.Story;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static methods.ExternalPage.createComputer;
import static methods.ExternalPage.removeComputer;
import static utils.Variables.testPageUrl;

public class AddRemoveComputer {
    @Before
    public void before() {
        open(testPageUrl);
    }

    @Story("Create a new computer")
    @Test
    public void test01_createNewComputer() {
        createComputer();
    }

    @Story("Remove computer")
    @Test
    public void test02_removeNewComputer() {
        removeComputer();
    }
}
