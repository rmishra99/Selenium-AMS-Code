package CommonFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonFeature {
	
	//Hover on Reference Number
	public void DisabledFeature() {
		WebElement referenceNumber = driver.findElement(By.id(loc.getProperty("REFERENCE_NUMBER")));
		boolean hoverReferenceNumber = referenceNumber.isEnabled();
		if(!hoverReferenceNumber) {
			test.pass("Reference Number is disabled!!");
		} else {
			test.fail("Reference number is enabled");
		}
	}

}
