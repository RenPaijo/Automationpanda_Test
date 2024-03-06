import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Want to practice test automation Try t_1959ee/p_Enter your email address to follow this b_db4915 (4)'), 
    'Enter your email address to follow this blog and receive notifications of new posts by email.')

WebUI.setText(findTestObject('Object Repository/Page_Want to practice test automation Try t_1959ee/input_Email Address_email (4)'), 
    GlobalVariable.emailValid2)

WebUI.click(findTestObject('Object Repository/Page_Want to practice test automation Try t_1959ee/button_Follow (4)'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Want to practice test automation Try t_1959ee/div_Thank you You can now check your email _c277fd (2)'), 
    'Thank you! You can now check your email to confirm your subscription.')

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Want to practice test automation Try t_1959ee/input_Email Address_email (4)'), 
    GlobalVariable.emailValid2)

WebUI.click(findTestObject('Object Repository/Page_Want to practice test automation Try t_1959ee/button_Follow (4)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Want to practice test automation Try t_1959ee/div_It seems you already tried to subscribe_7e49bc'), 
    'It seems you already tried to subscribe. We just sent you another email so you can confirm the subscription.')

println('teks setelah mengirimkan email yang sudah didaftarkan: ' + WebUI.getText(findTestObject('Object Repository/Page_Want to practice test automation Try t_1959ee/div_It seems you already tried to subscribe_7e49bc')))

WebUI.closeBrowser()

