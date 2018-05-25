package pages.ali;

import controls.Button;
import controls.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MensBackpacksPage extends BasePage{

    @FindBy(xpath = "//input[@name=\"minPrice\"]")
    private Input minPrice;

    @FindBy(xpath = "//input[@name=\"maxPrice\"]")
    private Input maxPrice;

    public enum Brands {
        BISON_DENIM("BISON DENIM"), //
        KINGSONS("Kingsons");

        private final String text;

        Brands(final String text) {
            this.text = text;
        }
//          TODO: understand what is this s**t here for??
//        public static Brands getStatusFromString(final String candidateStatus) throws Exception {
//            for (Brands enam : Brands.values()) {
//                if (enam.toString().equals(candidateStatus)) {
//                    return enam;
//                }
//            }
//            throw new Exception("There is no enum with value: " + candidateStatus);
//        }
    }

    public MensBackpacksPage selectBrand(Brands brandName) {
        brandButton(brandName.text).click();
        return this;
    }

    public MensBackpacksPage enterMinPrice(long price) {
        minPrice.setText(String.valueOf(price));
        return this;
    }

    public MensBackpacksPage enterMaxPrice(long price) {
        maxPrice.setText(String.valueOf(price));
        return this;
    }

    private Button brandButton(String title) {
        return Button.ByLocator(By.xpath(String.format("//a[@title='%s']", title)));
    }
}
