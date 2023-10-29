package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage{
    WebDriver ldriver;
    public HomePage(WebDriver rdriver)
    {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(xpath = "//div[@class='bwc__sc-1nbn7v6-14 khhVFa']")
    WebElement SignInButton;

    public void ClickOnSignInButton(){

        SignInButton.click();
    }


    @FindBy(xpath = "//div[@class='bwc__sc-dh558f-9 gRiudS']/div[2]")
    WebElement ContinuewithEmailOPtion;

    public void ClickOnCreateAccountLink(){

        ContinuewithEmailOPtion.click();
    }
    @FindBy(xpath = "//input[@id='emailId']")
    WebElement EmailInputField;

    public void setEmailInputField(String email){
        EmailInputField.sendKeys(email);
    }
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void submittingEmailID(){
        continueButton.click();
    }


    @FindBy(xpath= "//input[@type='tel']")
    List<WebElement> OTPInputArea;

    public List<WebElement> enterOTP(){
        return OTPInputArea;


    }
    @FindBy(xpath="//span[@class='bwc__sc-1nbn7v6-12 cQWvYS']")
    WebElement UserProfile;

    public WebElement UserProfile(){
        return UserProfile;
    }
}



