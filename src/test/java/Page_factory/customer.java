package Page_factory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class customer extends baseclass {

	@Test(priority = 1)
	public void login() {

		try {

			D.navigate().to("http://demo.sigmainfo.in:8072/csba/login/auth");
			W.explicitWait(F.getLocator("login"));
			W.setText(F.getLocator("emailid"), "admin@commercialsurety.com");
			W.setText(F.getLocator("password"), "Csba#csba321$");
			W.click(F.getLocator("loginbtn"));
			W.explicitWait(F.getLocator("assertlogdpage"));
			test = extent.createTest("Login");
			// Assert.assertEquals(W.getText(F.getLocator("assertlogdpage"), "Reports List
			// ");
			Assert.assertEquals(W.getText(F.getLocator("assertlogdpage")), "Reports List  ");

		} catch (Exception e) {

			System.out.println("Exception Occured in Login");
			e.printStackTrace();

		}
	}

	@Test(priority = 2)
	public void createcustomer_contactinfo() {
		try {
			Thread.sleep(15000);
			W.jsExecClick(F.getLocator("cust"));
			// W.waitTillClickable((F.getLocator("cust")));
			W.click(F.getLocator("cust1"));
			String strname = "Auto_test_cust" + W.getAlphaNumericString(5);
			System.out.println(strname);
			W.setText(F.getLocator("pname"), strname);
			W.tab();
			W.dropDown(F.getLocator("csbaoff"), "Orange");
			W.scrollDown();
			W.dropDownValue(F.getLocator("companytype"), "admin user");
			W.click(F.getLocator("savencont1"));
			W.sleep();
			test = extent.createTest("Create customer");
			Assert.assertEquals(W.getText(F.getLocator("asrtsurety")), "Surety Name");

		} catch (Exception e) {

			System.out.println("Exception Occured in createcustomer_contactinfo");
			e.printStackTrace();

		}
	}

	// @Test(enabled = false)
	@Test(priority = 3)
	public void createcustomer_underwritinginfo() {
		try {
			W.setText(F.getLocator("surety"), "Allied");
			W.sleep();
			W.list(F.getLocator("sugallied"));
			W.sleep();
			W.dropDownValue(F.getLocator("custype"), "Commercial");
			W.setText(F.getLocator("commision1"), "5");
			W.setText(F.getLocator("commision2"), "3");
			W.setText(F.getLocator("commision3"), "2");
			W.setText(F.getLocator("commision4"), "1");
			W.click(F.getLocator("savencont1"));
			W.sleep();
			test = extent.createTest("Added Underwriting info");
			Assert.assertEquals(W.getText(F.getLocator("asrtpremium")), "Contract Amount");

		} catch (Exception e) {

			System.out.println("Exception Occured in createcustomer_underwritinginfo");
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void createcustomer_premiumquotes() {
		try {
			W.click(F.getLocator("savencont1"));
			W.sleep();
			test = extent.createTest("Added Premium quotes");
			Assert.assertEquals(W.getText(F.getLocator("asrtwip")), "WIP Date");

		} catch (Exception e) {
			System.out.println("Exception Occured in createcustomer_premiumquotes");
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void createcustomer_wip() {
		try {
			W.click(F.getLocator("custsave"));
			W.sleep();
			W.click(F.getLocator("savencont1"));
			test = extent.createTest("Added WIP");
			Assert.assertEquals(W.getText(F.getLocator("asrtreports")), "Client Premium Statement\r\n");

		} catch (Exception e) {

			System.out.println("Exception Occured in createcustomer_wip");
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void createcustomer_reports() {
		try {
			W.sleep();
			W.click(F.getLocator("savencont1"));
			test = extent.createTest("Added Reports");
			Assert.assertEquals(W.getText(F.getLocator("asrtbondlog")), "Line Card");

		} catch (Exception e) {

			System.out.println("Exception Occured in createcustomer_reports");
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void createcustomer_bondlog() {
		try {
			W.sleep();
			W.click(F.getLocator("savencont1"));
			test = extent.createTest("Added Bond log");
			Assert.assertEquals(W.getText(F.getLocator("asrtbidbondlog")), "Bid Bond Log");

		} catch (Exception e) {

			System.out.println("Exception Occured in createcustomer_bondlog");
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void createcustomer_bidbondlog() {
		try {
			W.sleep();
			W.click(F.getLocator("savencont1"));
			test = extent.createTest("Added Bid Bond log");
			Assert.assertEquals(W.getText(F.getLocator("asrtfinanalysis")), "Fiscal Year End");

		} catch (Exception e) {

			System.out.println("Exception Occured in createcustomer_bidbondlog");
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void createcustomer_finanalysis() {
		try {
			W.sleep();
			W.click(F.getLocator("finanalysiscont"));
			test = extent.createTest("Added Financial analysis");
			Assert.assertEquals(W.getText(F.getLocator("asrtbuscontact")), "CPA");

		} catch (Exception e) {

			System.out.println("Exception Occured in createcustomer_finanalysis");
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void createcustomer_businesscontact() {
		try {
			W.sleep();
			W.click(F.getLocator("savebuscontact"));
			test = extent.createTest("Added Business contact");
			Assert.assertEquals(W.getText(F.getLocator("asrtbuscontact")), "CPA");

		} catch (Exception e) {

			System.out.println("Exception Occured in createcustomer_businesscontact");
			e.printStackTrace();
		}
	}

}
