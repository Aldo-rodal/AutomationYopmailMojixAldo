package page.yopmail;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class FrameSection {
    //public MenuProjectSection menuProjectSection= new MenuProjectSection();
    public TextBox mailAddressDestination = new TextBox(By.id("msgto"));
    public TextBox mailSubject = new TextBox(By.id("msgsubject"));
    public TextBox mailBody= new TextBox(By.id("msgbody"));
    public Button sendButton= new Button(By.id("msgsend"));

    public FrameSection(){}

    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        projectCreated.click();
    }

    public boolean isSendedMsgDisplayed(){
        Label projectCreated = new Label(By.id("msgpopmsg"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        return projectCreated;
    }

}
