package com.duckduckgo.mobile.android.events;

public class SavedSearchItemEvent extends Event {
	
	public String query;

	public SavedSearchItemEvent(String query){
		this.query = query;
	}
	
}
