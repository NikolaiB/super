package methods;

import static methods.BaseMethods.*;
import static pages.MainPage.*;
import static utils.Variables.*;

public class ExternalPage {

    public static void createComputer(){
        clickOnItem(buttonAddComputer);
        sendKeysToElement(fieldComputerName, macBook);
        sendKeysToElement(fieldIntroducedDate, "2019-04-08");
        sendKeysToElement(fieldDiscountedDate, "2019-04-08");
        selectFromSelector(dropdownChooseCompany, "Apple Inc.");
        clickOnItem(buttonSaveComputer);
        textShouldBeVisible("Done! Computer "+macBook+" has been created");
    }

    public static void removeComputer(){
        sendKeysToElement(fieldSearch, macBook);
        clickOnItem(buttonFilterByName);
        selectFromTable(macBook);
        clickOnItem(buttonDeleteComputer);
        textShouldBeVisible("Done! Computer has been deleted");
    }
}
