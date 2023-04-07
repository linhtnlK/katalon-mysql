import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.registerBasicAuthentication('admin', 'RAIVpflpDOg=')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/basic_auth')

WebElement element = DriverFactory.getWebDriver().findElement(By.tagName('p'))

assert 'Congratulations! You must have the proper credentials.' == element.getText()

//WebUI.closeBrowser()

