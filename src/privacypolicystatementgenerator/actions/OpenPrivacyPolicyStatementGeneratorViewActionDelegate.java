package privacypolicystatementgenerator.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;

import privacypolicystatementgenerator.appinfowizard.AppInfoInput;
import privacypolicystatementgenerator.coordinator.Coordinator;

/** 
 * This class is the action that is triggered when clicking the menu to open
 * the window of generator.
 * 
 * @author Sung Kim
 *
 */
public class OpenPrivacyPolicyStatementGeneratorViewActionDelegate implements
		IWorkbenchWindowActionDelegate {
	
    private IWorkbenchWindow window;
    public static final String ID = "privacypolicystatementgenerator.views.PrivacyPolicyStatementGeneratorView";

	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
    
	@Override
	public void run(IAction action) {
		Coordinator coordinator = new Coordinator();
        AppInfoInput wizard = new AppInfoInput(coordinator);
        WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
        dialog.create();
        dialog.open();
		/*
		IWorkbenchPage page = window.getActivePage();

        try {

           page.showView(ID); // use the Resource Manager View id to open up view.

        } catch (PartInitException e) {

        }
        */
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
}
