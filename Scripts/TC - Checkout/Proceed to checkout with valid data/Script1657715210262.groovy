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

WebUI.callTestCase(findTestCase('TC - Shopping/Adding item to cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Checkout/a_Proceed to checkout'))

WebUI.navigateToUrl('http://kotakoki.wijaysali.my.id/checkout-2/')

WebUI.setText(findTestObject('Object Repository/Checkout/input__billing_first_name'), 'Adam')

WebUI.setText(findTestObject('Object Repository/Checkout/input__billing_last_name'), 'Ghufron')

WebUI.setText(findTestObject('Object Repository/Checkout/input__billing_address_1'), 'Jl. Bangka Raya')

WebUI.setText(findTestObject('Object Repository/Checkout/input__billing_city'), 'Tanggerang')

WebUI.setText(findTestObject('Object Repository/Checkout/input__billing_postcode'), '12770')

WebUI.setText(findTestObject('Object Repository/Checkout/input__billing_phone'), '085156512320')

WebUI.setText(findTestObject('Object Repository/Checkout/input__billing_email'), 'adamghufrons@gmail.com')

WebUI.click(findTestObject('Object Repository/Checkout/input_Rp_payment_method'))

WebUI.click(findTestObject('Object Repository/Checkout/button_Place order'))

WebUI.navigateToUrl('https://checkout-staging.xendit.co/v2/62ceb8cc998356f98bba3133#bca')

