import java.util.Stack;

public class BrowserModel {

	private BrowserView view;
	private Stack<Integer> fwdStack, backStack;
	private int lineNum;
	
	
	BrowserModel(BrowserView view){
		this.view = view;
		home();
	}
	
	public void back() {
	if(hasBack()) {
		fwdStack.push(lineNum);
		lineNum = backStack.pop();
		view.update(lineNum);
		}
	}
	
	public void foreward() {
		
	}
	
	public void home() {
		followLink(0);
		backStack.clear();
	}
	
	public void followLink(int n) {
		fwdStack.clear();
		backStack.push(lineNum);
		lineNum = n;
		view.update(n);
	}
	
	public boolean hasBack() {
		return !backStack.isEmpty();
	}
	
	public boolean hasNext() {
		return !fwdStack.isEmpty();
	}
	
}
