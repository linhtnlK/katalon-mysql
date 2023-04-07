import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')

WebUI.registerBasicAuthentication('admin', 'RAIVpflpDOg=')

WebUI.navigateToUrl('google.com')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/basic_auth')

WebElement element = DriverFactory.getWebDriver().findElement(By.tagName('p'))

assert 'Congratulations! You must have the proper credentials.' == element.getText()

WebUI.closeBrowser()
