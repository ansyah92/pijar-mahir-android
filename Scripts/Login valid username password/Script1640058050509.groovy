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

Mobile.startApplication(GlobalVariable.apk_file, false)

Mobile.tap(findTestObject('Home Page/Button Masuk'), 0)

Mobile.verifyElementText(findTestObject('Login Page/Text Masuk'), 'Masuk', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Login Page/Email Text'), 'Email', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Login Page/Email Field'), 'arini.inf@gmail.com', 0)

Mobile.verifyElementText(findTestObject('Login Page/Password Text'), 'Password', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Login Page/Password Field'), 'ariniinf', 0)

Mobile.tap(findTestObject('Login Page/Icon Eye'), 0)

Mobile.tap(findTestObject('Login Page/Button Lanjutkan'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

