/*******************************************************************************
 * Copyright 2011-2013 Sherif elKhatib
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package mobi.sherif.example.imageuploader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author Sherif elKhatib (sherif.elkhatib[at]gmail[dot]com)
 */
public class MainActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onActivity(View v) {
		startActivity(new Intent(this, ImageUploaderActivity.class));
	}

	public void onActivitySupport(View v) {
		startActivity(new Intent(this, ImageUploaderActivitySupport.class));
	}

	public void onFragment(View v) {
		startActivity(new Intent(this, ActivityForFragment.class));
	}

	public void onFragmentSupport(View v) {
		startActivity(new Intent(this, ActivityForFragmentSupport.class));
	}

	public void onActivityVideo(View v) {
		startActivity(new Intent(this, ImageUploaderActivityVideo.class));
	}

	public void onActivitySupportVideo(View v) {
		startActivity(new Intent(this, ImageUploaderActivitySupportVideo.class));
	}

	public void onFragmentVideo(View v) {
		startActivity(new Intent(this, ActivityForFragmentVideo.class));
	}

	public void onFragmentSupportVideo(View v) {
		startActivity(new Intent(this, ActivityForFragmentSupportVideo.class));
	}
}