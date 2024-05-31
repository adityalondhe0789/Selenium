package com.crm.listenersCode;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenersRetry implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		int start=0;int end=3;
		while(start<end) {
			start++;
			return true;
		}
		return false;
		
	}

	
	
	
}
