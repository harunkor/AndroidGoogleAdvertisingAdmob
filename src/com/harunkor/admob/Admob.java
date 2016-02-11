package com.harunkor.admob;

import com.harunkor.androidgoogleadvertisingadmob.R;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Admob {

	public static InterstitialAd mInterstitial; // Interstital
	private static AdView mAdView; // banner

	public static void createLoadInterstitial(final Context context, View view)

	{

		mInterstitial = new InterstitialAd(context);
		mInterstitial.setAdUnitId(context.getResources().getString(
				R.string.admob_showIntersitial_ad_unit_id));
		mInterstitial.setAdListener(new AdListener() {
			@Override
			public void onAdLoaded() {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Ad Interstitial loaded.",
						Toast.LENGTH_LONG).show();
				showInterstitial();
			}

			@Override
			public void onAdFailedToLoad(int errorCode) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Ad Interstitial load failed.",
						Toast.LENGTH_LONG).show();
				super.onAdFailedToLoad(errorCode);
			}

			@Override
			public void onAdOpened() {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Ad Interstitial Opened.",
						Toast.LENGTH_LONG).show();
				super.onAdOpened();
			}

			@Override
			public void onAdClosed() {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Ad Interstitial closed.",
						Toast.LENGTH_LONG).show();
				super.onAdClosed();
			}

			@Override
			public void onAdLeftApplication() {
				// TODO Auto-generated method stub
				// Called when an ad leaves the app (for example, to go to the
				// browser).
				Toast.makeText(context, "Ad Interstitial leaved.",
						Toast.LENGTH_LONG).show();
				super.onAdLeftApplication();
			}

		});

		loadInterstitial();

	}

	public static void loadInterstitial() {

		mInterstitial.loadAd(new AdRequest.Builder().build());
	}

	public static void showInterstitial() {
		if (mInterstitial.isLoaded()) {
			mInterstitial.show();
		}
	}

	public static void createLoadBanner(final Context context, View view) {
		mAdView = (AdView) view.findViewById(R.id.ad_view);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		mAdView.setAdListener(new AdListener() {

			@Override
			public void onAdLoaded() {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Ad Banner loaded.", Toast.LENGTH_LONG)
						.show();

				super.onAdLoaded();
			}

			@Override
			public void onAdClosed() {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Ad Banner closed.", Toast.LENGTH_LONG)
						.show();

				super.onAdClosed();
			}

			@Override
			public void onAdOpened() {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Ad Banner opened.", Toast.LENGTH_LONG)
						.show();

				super.onAdOpened();
			}

			@Override
			public void onAdLeftApplication() {
				// TODO Auto-generated method stub

				Toast.makeText(context, "Ad Banner leaved.", Toast.LENGTH_LONG)
						.show();
				super.onAdLeftApplication();
			}

			@Override
			public void onAdFailedToLoad(int errorCode) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Ad Banner load failed.",
						Toast.LENGTH_LONG).show();

				super.onAdFailedToLoad(errorCode);
			}

		});

	}

}
