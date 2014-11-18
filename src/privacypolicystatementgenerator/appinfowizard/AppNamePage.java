package privacypolicystatementgenerator.appinfowizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import privacypolicystatementgenerator.coordinator.Coordinator;

public class AppNamePage extends WizardPage {

	private Text appName;
	private Text appDescription;
	private Coordinator coordinator;
	private ModifyListener listener;
	
	protected AppNamePage(String pageName, Coordinator coordinator) {
		super(pageName);
		this.coordinator = coordinator;
		this.listener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				getContainer().updateButtons();
			}
		};
		setTitle("Mobile Application Title");
        setDescription("Please enter your Mobile Application's name and description");
	}

	@Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        composite.setLayout(layout);
        setControl(composite);
        new Label(composite,SWT.NONE).setText("Title");
        appName = new Text(composite,SWT.NONE);
        appName.addModifyListener(listener);
        new Label(composite,SWT.NONE).setText("Description");
        appDescription = new Text(composite,SWT.NONE);
        appDescription.addModifyListener(listener);
	}
	
	@Override
	public boolean isPageComplete() {
		if (appName.getCharCount() == 0 && appDescription.getCharCount() == 0) 
			return false;
		return true;
	}
	
	public void collectInfo() { 
		System.out.println(appName.getText());
		coordinator.setAppName(appName.getText());
		coordinator.setAppDescription(appDescription.getText());
	}
}
