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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testingjarkom.000webhostapp.com/admin/login.php')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Login Akun_username'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Login Akun_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

Halaman_tujuan = WebUI.getUrl()

WebUI.verifyMatch(Halaman_tujuan, 'https://testingjarkom.000webhostapp.com/admin/login.php', false)

WebUI.verifyElementText(findTestObject('login/Login/span_Username  Password salah'), 'Username / Password salah')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

