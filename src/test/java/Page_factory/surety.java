package Page_factory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class surety extends baseclass {

	@Test(priority = 11)
	public void createsurety() {

		try {

			Thread.sleep(15000);
			W.click(F.getLocator("suretyid"));
			test = extent.createTest("Create Surety");
			Assert.assertEquals(W.getText(F.getLocator("asrtsuretypg")), "Company");

		} catch (Exception e) {

			System.out.println("Exception Occured at Surety");
			e.printStackTrace();

		}
	}

	@Test(priority = 12)
	public void companysurety() {

		try {
			W.sleep();
			String strname = "Auto_test_surety" + W.getAlphaNumericString(5);
			System.out.println(strname);
			W.setText(F.getLocator("suretyname"), strname);
			W.tab();
			W.click(F.getLocator("savncontsurety"));
			test = extent.createTest("Company Surety");
			Assert.assertEquals(W.getText(F.getLocator("asrtuw")), "Minimum Premium");

		} catch (

		Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured at Company Surety");
			e.printStackTrace();
		}

	}
	
	@Test(priority = 13)
	public void underwritingsurety() {

		try {
			W.sleep();
			W.click(F.getLocator("savncontuw"));
			test = extent.createTest("Underwriting  Surety");
			W.sleep();
			Assert.assertEquals(W.getText(F.getLocator("asrtclaimsdebt")), "Another Location");

		} catch (

		Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured at UW Surety");
			e.printStackTrace();
		}

	}
	
	@Test(priority = 14)
	public void claimsdebtsurety() {

		try {
			W.sleep();
			W.click(F.getLocator("savncontclaims"));
			test = extent.createTest("Claims debt Surety");
			W.sleep();
			Assert.assertEquals(W.getText(F.getLocator("asrthomeoffice")), "Home Notes");

		} catch (

		Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured at Claims debt Surety");
			e.printStackTrace();
		}

	}

	@Test(priority = 15)
	public void homeofficesurety() {

		try {
			W.sleep();
			W.click(F.getLocator("savenconthome"));
			test = extent.createTest("Home office Surety");
			W.sleep();
			Assert.assertEquals(W.getText(F.getLocator("asrtcommercialdept")), "Commercial Notes");

		} catch (

		Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured at Home office Surety");
			e.printStackTrace();
		}

	}
	
	
	@Test(priority = 16)
	public void commdebtsurety() {

		try {
			W.sleep();
			W.click(F.getLocator("savncontcom"));
			test = extent.createTest("Commericial debt Surety");
			W.sleep();
			Assert.assertEquals(W.getText(F.getLocator("asrtaccdept")), "Quickbooks Vendor");

		} catch (

		Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured at Commercial debt Surety");
			e.printStackTrace();
		}

	}

	@Test(priority = 15)
	public void accdeptsurety() {

		try {
			W.sleep();
			W.click(F.getLocator("savncontaccdept"));
			test = extent.createTest("Account debt Surety");
			W.sleep();
			Assert.assertEquals(W.getText(F.getLocator("asrtbondno")), "Bond Numbers ");

		} catch (

		Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured at Accounting debt Surety");
			e.printStackTrace();
		}

	}

	
	
}
