package com.exception;

public class UsernameLengthReachedException extends RuntimeException {
	public UsernameLengthReachedException(String msg)
	{
		super(msg);
	}

}
