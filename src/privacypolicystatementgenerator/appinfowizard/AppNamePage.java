package privacypolicystatementgenerator.appinfowizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import privacypolicystatementgenerator.coordinator.Coordinator;

public class AppNamePage extends WizardPage {

	private Text appName;
	private Text appDescription;
	private Coordinator coordinator;

	protected AppNamePage(String pageName, Coordinator coordinator) {
		super(pageName);
		this.coordinator = coordinator;
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
        new Label(composite,SWT.NONE).setText("Description");
        appDescription = new Text(composite,SWT.NONE);
	}

	public Text getAppName() {
		return appName;
	}

	public Text getAppDescription() {
		return appDescription;
	}
}
