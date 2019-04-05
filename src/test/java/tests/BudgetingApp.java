package tests;

import io.qameta.allure.Story;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static methods.ExternalPage.*;
import static utils.Variables.testPageUrl;

public class BudgetingApp {
    @Before
    public void before() {
        open(testPageUrl);
    }

    @Story("Create budget item")
    @Test
    public void test1(){
        createItem();
    }

    @Story("Edit budget item")
    @Test
    public void test2(){
        editItem();
    }

    @Story("Delete budget item")
    @Test
    public void test3(){
        deleteItem();
    }
}
