package com.educonnect.common.beans;

public class TextBean extends Bean{

	public TextBean( String payload ) {
		super.header = BeanConstants.TEXT.toString();
		super.payload = payload;
	}

}