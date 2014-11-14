package privacypolicystatementgenerator.appinfowizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import privacypolicystatementgenerator.coordinator.Coordinator;
import privacypolicystatementgenerator.data.Data;

public class CapturedInfoPage extends WizardPage {

	private Coordinator coordinator;
	private Data parsedInfo;
	
	protected CapturedInfoPage(String pageName, Coordinator coordinator) {
		super(pageName);
		this.coordinator = coordinator;
		this.parsedInfo = coordinator.getParsedInfo();
	}

	@Override
	public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        composite.setLayout(layout);
        setControl(composite);
        new Label(composite,SWT.NONE).setText("Title");
        //appName = new Text(composite,SWT.NONE);		
	}

}
