package methods;

import static methods.BaseMethods.*;
import static pages.MainPage.*;

public class ExternalPage {

    public static void createItem(){
        selectFromSelector(categorySelector, "Travel");
        sendKeysToElement(descriptionField, "Tickets");
        sendKeysToElement(valueField, "$400");
        clickOnItem(buttonAdd);
        textShouldBeVisible("$1,813.93");
    }

    public static void editItem() {
        selectItemFromTable("Paycheck");
        sendKeysToElementEdit(descriptionField, "Paycheck 2");
        sendKeysToElementEdit(valueField, "$6,700");
        clickOnItem(buttonUpdate);
        textShouldBeVisible("$3,213.93");
    }

    public static void deleteItem() {
        selectItemFromTable("Gas");
        clickOnItem(buttonDelete);
        textShouldBeVisible("$2,978.66");
    }
}
