package Note;

public class TinyNote {

	private String text;
	private boolean isActive;
	
	public TinyNote(String text){
		this.setText(text);
		this.setActive(true);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
