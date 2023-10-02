import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page dvc-home tax-form1 tax-form2 tax-form3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dvc-home/tax-form1/tax-form2/tax-form3')

'step 2: Add visual checkpoint at Page dvc-home tax-form1 tax-form2 tax-form3'

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Successful Navigation to page Dvc Home Tax Form1 Tax Form2 Tax Form3_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
