package page.yopmail;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public Label eMailDirection  = new Label(By.xpath("//div[contains(@class, 'ycptalias')]"));
    public Button newMailButton = new Button(By.id("newmail"));
    public Button refreshButton = new Button(By.id("refresh"));
}
