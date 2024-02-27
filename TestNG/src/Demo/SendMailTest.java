package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.AppUtils;
import utils.BaseTest;

public class SendMailTest extends BaseTest {

	@Parameters({"tomail","subject"})
	@Test
	public void SendMail(String tomail,String subject)
	{
		System.out.println("Mail sent to:"+tomail+"with subject"+subject);
	}
	

}
