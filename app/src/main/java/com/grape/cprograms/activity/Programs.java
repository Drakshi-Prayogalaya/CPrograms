package com.grape.cprograms.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.grape.cprograms.R;
import com.purplebrain.adbuddiz.sdk.AdBuddiz;
import com.purplebrain.adbuddiz.sdk.AdBuddizLogLevel;

/**
 * Created by rarodi on 12/15/2015.
 */
public class Programs extends Activity
{
    Button b1;
    TextView tv,tva;
    SharedPreferences preferences;
    int adCount;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programs);

        final Activity activity = this;
        AdBuddiz.setLogLevel(AdBuddizLogLevel.Info);    // log level
        AdBuddiz.setPublisherKey("6c188974-22d9-416d-b488-97e9012a2b64"); // replace with your app publisher key
        AdBuddiz.cacheAds(activity);

        //TextView tv,tva;

        tva = (TextView)findViewById(R.id.textView1);
        tv = (TextView)findViewById(R.id.textView3);

        String fontpath = "fonts/Slabo27px-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);

        tv.setTypeface(tf);
        tva.setTypeface(tf);

        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        adCount = preferences.getInt("adCount",0);

        b1 = (Button)findViewById(R.id.button1);
        final Intent i = getIntent();

        if(i.hasExtra("c1"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c1"));
            tva.setText("PROGRAM 1");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c2"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c2"));
            tva.setText("PROGRAM 2");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c3"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c3"));
            tva.setText("PROGRAM 3");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c4"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c4"));
            tva.setText("PROGRAM 4");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c5"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c5"));
            tva.setText("PROGRAM 5");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c6"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c6"));
            tva.setText("PROGRAM 6");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c7"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c7"));
            tva.setText("PROGRAM 7");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c8"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c8"));
            tva.setText("PROGRAM 8");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c9"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c9"));
            tva.setText("PROGRAM 9");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c10"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c10"));
            tva.setText("PROGRAM 10");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c11"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c11"));
            tva.setText("PROGRAM 11");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c12"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c12"));
            tva.setText("PROGRAM 12");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c13"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c13"));
            tva.setText("PROGRAM 13");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c14"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c14"));
            tva.setText("PROGRAM 14");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c15"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c15"));
            tva.setText("PROGRAM 15");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c16"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c16"));
            tva.setText("PROGRAM 16");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c17"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c17"));
            tva.setText("PROGRAM 17");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c18"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c18"));
            tva.setText("PROGRAM 18");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c19"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c19"));
            tva.setText("PROGRAM 19");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c20"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c20"));
            tva.setText("PROGRAM 20");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c21"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c21"));
            tva.setText("PROGRAM 21");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c22"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c22"));
            tva.setText("PROGRAM 22");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c23"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c23"));
            tva.setText("PROGRAM 23");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c24"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c24"));
            tva.setText("PROGRAM 24");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c25"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c25"));
            tva.setText("PROGRAM 25");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c26"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c26"));
            tva.setText("PROGRAM 26");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c27"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c27"));
            tva.setText("PROGRAM 27");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c28"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c28"));
            tva.setText("PROGRAM 28");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c29"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c29"));
            tva.setText("PROGRAM 29");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c30"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c30"));
            tva.setText("PROGRAM 30");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c31"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c31"));
            tva.setText("PROGRAM 31");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c32"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c32"));
            tva.setText("PROGRAM 32");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c33"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c33"));
            tva.setText("PROGRAM 33");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c34"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c34"));
            tva.setText("PROGRAM 34");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c35"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c35"));
            tva.setText("PROGRAM 35");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c36"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c36"));
            tva.setText("PROGRAM 36");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c37"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c37"));
            tva.setText("PROGRAM 37");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c38"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c38"));
            tva.setText("PROGRAM 38");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c39"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c39"));
            tva.setText("PROGRAM 39");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c40"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c40"));
            tva.setText("PROGRAM 40");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c41"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c41"));
            tva.setText("PROGRAM 41");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c42"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c42"));
            tva.setText("PROGRAM 42");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c43"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c43"));
            tva.setText("PROGRAM 43");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c44"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c44"));
            tva.setText("PROGRAM 44");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c45"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c45"));
            tva.setText("PROGRAM 45");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c46"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c46"));
            tva.setText("PROGRAM 46");AdBuddiz.cacheAds(this);

        }

        if(i.hasExtra("c47"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c47"));
            tva.setText("PROGRAM 47");AdBuddiz.cacheAds(this);

        }
        if(i.hasExtra("c48"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c48"));
            tva.setText("PROGRAM 48");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c49"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c49"));
            tva.setText("PROGRAM 49");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c50"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c50"));
            tva.setText("PROGRAM 50");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c51"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c51"));
            tva.setText("PROGRAM 51");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c52"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c52"));
            tva.setText("PROGRAM 52");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c53"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c53"));
            tva.setText("PROGRAM 53");AdBuddiz.cacheAds(this);
        }


        if(i.hasExtra("c54"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c54"));
            tva.setText("PROGRAM 54");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c55"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c55"));
            tva.setText("PROGRAM 55");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c56"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c56"));
            tva.setText("PROGRAM 56");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c57"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c57"));
            tva.setText("PROGRAM 57");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c58"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c58"));
            tva.setText("PROGRAM 58");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c59"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c59"));
            tva.setText("PROGRAM 59");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c60"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c60"));
            tva.setText("PROGRAM 60");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c61"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c61"));
            tva.setText("PROGRAM 61");AdBuddiz.cacheAds(this);
        }
        if(i.hasExtra("c62"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c62"));
            tva.setText("PROGRAM 62");AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c63"))
         {
             tv = (TextView)findViewById(R.id.textView3);
             tva = (TextView)findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c63"));
             tva.setText("PROGRAM 63");AdBuddiz.cacheAds(this);
         }
         if(i.hasExtra("c64"))
         {
             tv = (TextView)findViewById(R.id.textView3);
             tva = (TextView)findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c64"));
             tva.setText("PROGRAM 64");AdBuddiz.cacheAds(this);
         }
         if(i.hasExtra("c65"))
         {
             tv = (TextView)findViewById(R.id.textView3);
             tva = (TextView)findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c65"));
             tva.setText("PROGRAM 65");AdBuddiz.cacheAds(this);
         }
         if(i.hasExtra("c66"))
         {
             tv = (TextView)findViewById(R.id.textView3);
             tva = (TextView)findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c66"));
             tva.setText("PROGRAM 66");AdBuddiz.cacheAds(this);
         }
         if(i.hasExtra("c67"))
         {
             tv = (TextView)findViewById(R.id.textView3);
             tva = (TextView)findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c67"));
             tva.setText("PROGRAM 67");AdBuddiz.cacheAds(this);
         }
         if(i.hasExtra("c68"))
         {
             tv = (TextView)findViewById(R.id.textView3);
             tva = (TextView)findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c68"));
             tva.setText("PROGRAM 68");AdBuddiz.cacheAds(this);
         }
         if(i.hasExtra("c69"))
         {
             tv = (TextView)findViewById(R.id.textView3);
             tva = (TextView)findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c69"));
             tva.setText("PROGRAM 69");AdBuddiz.cacheAds(this);
         }
         if(i.hasExtra("c70"))
         {
             tv = (TextView)findViewById(R.id.textView3);
             tva = (TextView)findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c70"));
             tva.setText("PROGRAM 70");AdBuddiz.cacheAds(this);
         }
         if(i.hasExtra("c71"))
         {
             tv = (TextView)findViewById(R.id.textView3);
             tva = (TextView)findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c71"));
             tva.setText("PROGRAM 71");AdBuddiz.cacheAds(this);
         }
         if(i.hasExtra("c72"))
         {
             tv = (TextView) findViewById(R.id.textView3);
             tva = (TextView) findViewById(R.id.textView1);
             tv.setText(i.getStringExtra("c72"));
             tva.setText("PROGRAM 72");
             AdBuddiz.cacheAds(this);
         }


        AdBuddiz.showAd(this);


    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        AdBuddiz.showAd(this);
    }


    //    private boolean MyStartActivity(Intent aIntent)
//    {
//        try
//        {
//            startActivity(aIntent);
//            return true;
//        }
//        catch (ActivityNotFoundException e)
//        {
//            return false;
//        }
//    }


}
