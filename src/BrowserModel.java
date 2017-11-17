import java.util.Stack;

public class BrowserModel extends Stack<Integer> {

	private BrowserView view;
	
	BrowserModel(BrowserView view){
		this.view = view;
	}
	
	public void back() {
		
	}
	
	public void foreward() {
		
	}
	
	public void home() {
		
	}
	
	public void followLink(int n) {
		
	}
	
	public boolean hasBack() {
		return false;
	}
	
	public boolean hasNext() {
		return false;
	}
	
}
