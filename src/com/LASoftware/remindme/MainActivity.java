package com.LASoftware.remindme;

import java.util.ArrayList;
import java.util.List;

import Note.Note;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

// Array of options -->> ArrayAdapter -->> ListView

// List view: {views: da_items}

public class MainActivity extends Activity {

	List<Note> noteList = new ArrayList<Note>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		populateListView();
		registerClickCallback();
		
	}

	private void populateListView() {
		// create list of items

	

		ListView list = (ListView) findViewById(R.id.listView1);
		MyListAdapter adapter = new MyListAdapter();
		list.setAdapter(adapter);
	
	}
	
	private class MyListAdapter extends ArrayAdapter<Note> {

		public MyListAdapter() {
			super(MainActivity.this, R.layout.item_view, noteList);
			}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// make sure we have a view to work with
			View itemView = convertView;
			if(itemView == null){
				itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
			}
			
			Note currentNote = noteList.get(position);
			ImageView imageView = (ImageView) itemView.findViewById(R.id.item_icon);
			imageView.setImageResource(currentNote.getIconId());
			
			TextView nameText = (TextView) itemView.findViewById(R.id.txtName);
			nameText.setText(currentNote.getNoteName());
			TextView amountText = (TextView) itemView.findViewById(R.id.txtItems);
			amountText.setText(currentNote.getAmount() + " items");
			TextView timeText = (TextView) itemView.findViewById(R.id.txtTime);
			timeText.setText(currentNote.getNextNotify());
			
			
			return itemView;
		}
		
		
	}

	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.listView1);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Note noteClicked = noteList.get(position);
				
				String message = "You clicked # " + position + " which is : "
						+ noteClicked.getNoteName();
				Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT)
						.show();
			}
		});
	}
	
	
	

}
