package com.easyapps.ImplicitIntentsToyApp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//--------------------------------------------------------------
    public void onClickOpenWebpageButton(View v) {
        String urlAsString = "http://www.udacity.com";
        openWebPage(urlAsString);
    }
//---------------------------------------------------------------------

    public void onClickOpenAddressButton(View v) {
        String addressString = "1600 Amphitheatre Parkway, CA"; //google headQuarter Address
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("geo")           //0,0 is lat and longitude, its because according to rules...
                .path("0,0")              // if we specify the address in string the lat and long should be 0.
                .query(addressString);

        Uri addressUri = builder.build();

        showMap(addressUri);
    }

//--------------------------------------------------------
    public void onClickShareTextButton(View v) {
        String textThatYouWantToShare =
                "Sharing the coolest thing I've learned so far. You should " +
                        "check out Udacity and Google's Android Nanodegree!";
        shareText(textThatYouWantToShare);
    }

//--------------------------------------------------------

//----------------------------------------------------
    private void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
//--------------------------------------------------------
    private void showMap(Uri geoLocation) {

        Intent intent = new Intent(Intent.ACTION_VIEW);

        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

//-------------------------------------------------------------------
    private void shareText(String textToShare) {
        String mimeType = "text/plain";
        String title = "Learning How to Share";

        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(title)
                .setText(textToShare)
                .startChooser();
    }
}