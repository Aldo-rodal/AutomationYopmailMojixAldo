package page.yopmail;

import control.Label;
import org.openqa.selenium.By;

public class FrameInboxSection {
    public Label subjectReceivedMail= new Label(By.xpath("//div[contains(@class, 'lms')]"));
   // public Label addressReceivedMail= new Label(By.xpath("//span[contains(@class, 'lmf')]"));
}
