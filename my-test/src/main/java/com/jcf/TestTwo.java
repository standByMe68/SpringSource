package com.jcf;

import org.springframework.beans.factory.DisposableBean;

public class TestTwo implements DisposableBean {

	TestOne testOne;

	public TestOne getTestOne() {
		return testOne;
	}

	public void setTestOne(TestOne testOne) {
		this.testOne = testOne;
	}

	@Override
	public void destroy() throws Exception {

	}
}
