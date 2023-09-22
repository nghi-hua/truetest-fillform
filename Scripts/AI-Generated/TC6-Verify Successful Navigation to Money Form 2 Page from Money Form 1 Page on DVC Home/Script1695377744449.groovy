import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page dvc-home money-form1 money-form2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dvc-home/money-form1/money-form2')

'step 2: Add visual checkpoint at Page dvc-home money-form1 money-form2'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Successful Navigation to Money Form 2 Page from Money Form 1 Page on DVC Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
