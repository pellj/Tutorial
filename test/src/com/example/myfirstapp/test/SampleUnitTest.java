package com.example.myfirstapp.test;

import com.example.myfirstapp.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.EditText;

public class SampleUnitTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public SampleUnitTest() {
		super("com.example.myfirstapp", MainActivity.class);
	}

	@SmallTest
	public void testMessageTextBoxExists() {
		assertNotNull(getActivity().findViewById(com.example.myfirstapp.R.id.edit_message));
	}

	@SmallTest
	public void testMessageTextBoxDisplaysCorrectHint() {
		assertNotNull(getActivity().findViewById(com.example.myfirstapp.R.id.edit_message));
		EditText editText = (EditText) getActivity().findViewById(com.example.myfirstapp.R.id.edit_message);
		assertTrue(editText.getHint().equals("Enter a message"));
	}

	@SmallTest
	public void testThatWillFail() {
		assertTrue(false);
	}

}
