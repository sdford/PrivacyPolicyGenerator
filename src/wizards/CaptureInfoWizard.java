package wizards;

import org.eclipse.jface.wizard.Wizard;

public class CaptureInfoWizard extends Wizard {

	AddressInformationPage addressInformationPage;
	AppNamePage appNamePage;
	
    public void addPages() {
    	appNamePage = new AppNamePage("Personal Information Page");
        addPage(appNamePage);
        addressInformationPage = new AddressInformationPage("Address Information");
        addPage(addressInformationPage);
    }
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
