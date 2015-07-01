package Note;

import java.util.ArrayList;
import java.util.List;

import Alarm.AlarmSetting;

public class Note {
	
	private String noteName;
	private int iconId;
	private int amount;
	private String nextNotify;
	private AlarmSetting alarmSetting;
	private List<TinyNote> noteList = new ArrayList<TinyNote>();
	
	public Note(String noteName, int iconId, int amount, String nextNotify, AlarmSetting alarmSetting) {
		super();
		this.noteName = noteName;
		this.iconId = iconId;
		this.amount = amount;
		this.nextNotify = nextNotify;
		this.setAlarmSetting(alarmSetting);
	}
	
	public void addNote(TinyNote note){
		noteList.add(note);
	}
	public void removeNote(int position){
		noteList.remove(position);
	}
	public void setState(int position, boolean state){
		noteList.get(position).setActive(state);
	}
	
	
	
	public String getNoteName() {
		return noteName;
	}
	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}
	public int getIconId() {
		return iconId;
	}
	public void setIconId(int iconId) {
		this.iconId = iconId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getNextNotify() {
		return nextNotify;
	}
	public void setNextNotify(String nextNotify) {
		this.nextNotify = nextNotify;
	}
	public AlarmSetting getAlarmSetting() {
		return alarmSetting;
	}
	public void setAlarmSetting(AlarmSetting alarmSetting) {
		this.alarmSetting = alarmSetting;
	}

	
	
}
