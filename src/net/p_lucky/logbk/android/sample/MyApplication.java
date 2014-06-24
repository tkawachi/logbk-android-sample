package net.p_lucky.logbk.android.sample;

import net.p_lucky.logbk.android.lbmetrics.LogbookAPI;
import android.app.Application;

public class MyApplication extends Application {
	private static LogbookAPI mLogbookAPI;

	static public LogbookAPI getLogbookAPI() {
		return mLogbookAPI;
	}

	@Override
	public void onCreate () {
		mLogbookAPI = LogbookAPI.getInstance(this, "mEmmEcNn");
	}
}
