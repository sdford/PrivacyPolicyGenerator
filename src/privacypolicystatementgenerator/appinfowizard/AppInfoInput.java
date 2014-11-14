package privacypolicystatementgenerator.appinfowizard;

import org.eclipse.jface.wizard.Wizard;
import privacypolicystatementgenerator.coordinator.Coordinator;

public class AppInfoInput extends Wizard {

	private CapturedInfoPage capturedInfoPage;
	private AppNamePage appNamePage;
	private Coordinator coordinator;	
	
    public AppInfoInput(Coordinator coordinator) {
    	this.coordinator = coordinator;
    }

	public void addPages() {
    	appNamePage = new AppNamePage("Personal Information Page", coordinator);
        addPage(appNamePage);
        capturedInfoPage = new CapturedInfoPage("Captured Information Page", coordinator);
        addPage(capturedInfoPage);
	}
	
	@Override
	public boolean performFinish() {
		coordinator.generatePolicy();
		return false;
	}

}
