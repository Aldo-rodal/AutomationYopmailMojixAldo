package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class CRUDProjectTest extends TestBase{

    @Test
    public void verifyCRUDProject() throws InterruptedException {
        String emailCreated="mojix"+new Date().getTime();
        String subject = "test";
        String body = "test";

        //String projectUpdated="QA"+new Date().getTime();

        mainPage.emailTxtBox.setText(emailCreated);
        mainPage.emailTxtBox.enter();
        Assertions.assertTrue(loginSection.eMailDirection.isControlDisplayed(),"ERROR! the login was failed");

        loginSection.newMailButton.click();
        Thread.sleep(3000);
        Session.getInstance().switchToFrame("ifmail");
        frameSection.mailAddressDestination.setText(emailCreated);
//        Thread.sleep(3000);
        frameSection.mailSubject.setText(subject);
//        Thread.sleep(3000);
        frameSection.mailBody.setText(body);
//        Thread.sleep(3000);
        frameSection.sendButton.click();
        Thread.sleep(3000);
        Assertions.assertTrue(frameSection.isSendedMsgDisplayed(),"ERROR! the mail was not sent");

        Session.getInstance().switchToMainFrame();
        loginSection.refreshButton.click();
        Thread.sleep(3000);

        Session.getInstance().switchToFrame("ifinbox");
        Assertions.assertEquals(frameinboxSection.subjectReceivedMail.getText(), subject, "ERROR! the mail was not received");

    }


}
