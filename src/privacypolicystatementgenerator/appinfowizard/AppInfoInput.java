package privacypolicystatementgenerator.appinfowizard;

import org.eclipse.jface.wizard.Wizard;

import privacypolicystatementgenerator.coordinator.Coordinator;

public class AppInfoInput extends Wizard {

//	private CapturedInfoPage capturedInfoPage;
	private AppNamePage appNamePage;
	private Coordinator coordinator;	
	
    public AppInfoInput(Coordinator coordinator) {
    	this.coordinator = coordinator;
    }

    @Override
	public void addPages() {
    	appNamePage = new AppNamePage("Personal Information Page", coordinator);
        addPage(appNamePage);
        /*
        capturedInfoPage = new CapturedInfoPage("Captured Information Page", coordinator);
        addPage(capturedInfoPage);
        */
	}
	
	@Override
	public boolean performFinish() {
		if (canFinish()) {
			collectInformation();
			coordinator.generatePolicy();
			return true;
		}
		return false;
	}
	
	@Override
	public boolean canFinish() {
		return appNamePage.isPageComplete();
	}
	
	private void collectInformation() {
		appNamePage.collectInfo();
	}
}
