package com.example.custompreferenceheader;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends CustomPreferenceActivity {

	@Override
	public void onBuildHeaders(List<Header> target) {
		this.loadHeadersFromResource(R.xml.preference_headers, target);
	}

}
