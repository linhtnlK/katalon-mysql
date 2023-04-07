import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.registerDigestAuthentication('postman', '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.navigateToUrl('google.com')

WebUI.navigateToUrl('https://postman-echo.com/digest-auth')

WebElement element = DriverFactory.getWebDriver().findElement(By.tagName('pre'))

assert element.getText().contains('"authenticated": true') == true

WebUI.closeBrowser()