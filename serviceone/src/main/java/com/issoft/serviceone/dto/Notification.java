package com.issoft.serviceone.dto;

public class Notification {

	private String source;
	private String text;

	public Notification() {
	}

	public Notification(String source, String text) {
		this.source = source;
		this.text = text;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}