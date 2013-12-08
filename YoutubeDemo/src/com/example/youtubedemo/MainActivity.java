package com.example.youtubedemo;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends YouTubeBaseActivity implements OnInitializedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
		youTubeView.initialize("", this);
	}

	@Override
	public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
		String error = result.toString();
		Log.e("Error", error);
	}

	@Override
	public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
		      boolean wasRestored) {
		if (!wasRestored) {
			player.cuePlaylist("PL9C2818276B0B3FC0");
		}
		
	}

}
