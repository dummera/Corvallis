package com.example.michael.com.hello_world;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

//extends Activity
//extends AppCompatActivity
public class FirstActivity extends Activity {
    MySQLiteHelper myDb;
    TextView textView; //instantiates textview
    private GoogleMap mMap;
    Button btnviewAll;
    public TextView firstButtonText;
    public TextView atext;
    public TextView btext;
    public TextView ctext;
    public TextView dtext;
    public TextView etext;
    public TextView ftext;
    public TextView gtext;
    public TextView htext;
    public TextView itext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        textView = (TextView) findViewById(R.id.greetings_text_view); //needs to be after setContent
        //finds the id of the text
        myDb = new MySQLiteHelper(this);
        Cursor res = myDb.getData();
        firstButtonText = (TextView) this.findViewById(R.id.n1);
        atext = (TextView) this.findViewById(R.id.n2);
        btext = (TextView) this.findViewById(R.id.n3);
        ctext = (TextView) this.findViewById(R.id.n4);
        dtext = (TextView) this.findViewById(R.id.n5);
        etext = (TextView) this.findViewById(R.id.n6);
        ftext = (TextView) this.findViewById(R.id.n7);
        gtext = (TextView) this.findViewById(R.id.n8);
        htext = (TextView) this.findViewById(R.id.n9);
        itext = (TextView) this.findViewById(R.id.n10);


        btnviewAll = (Button)findViewById(R.id.n4);

        Button c = (Button)this.findViewById(R.id.thingy);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://site.republicservices.com/site/corvallis-or/en/documents/corvallisrecycledepot.pdf"));
                startActivity(i);
            }
        });

        Button d = (Button)this.findViewById(R.id.moar);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://site.republicservices.com/site/corvallis-or/en/documents/detailedrecyclingguide.pdf"));
                startActivity(i);
            }
        });

        res.moveToNext();
        firstButtonText.setText(res.getString(2));
        Button firstWeb = (Button)this.findViewById(R.id.n1W);
        Button firstCall = (Button)this.findViewById(R.id.n1C);
        Button firstMap = (Button)this.findViewById(R.id.n1M);
        final String firstWebString = res.getString(4);
        final String firstCallString = res.getString(3);
        final String firstMapString = res.getString(5);
        firstWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(firstWebString));
                startActivity(i);
            }
        });
        firstCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + firstCallString));
                startActivity(i);
            }
        });
        firstMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + firstMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });

        res.moveToNext();
        atext.setText(res.getString(2));
        Button aWeb = (Button)this.findViewById(R.id.n2W);
        Button aCall = (Button)this.findViewById(R.id.n2C);
        Button aMap = (Button)this.findViewById(R.id.n2M);
        final String aWebString = res.getString(4);
        final String aCallString = res.getString(3);
        final String aMapString = res.getString(5);
        aWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(aWebString));
                startActivity(i);
            }
        });
        aCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + aCallString));
                startActivity(i);
            }
        });
        aMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + aMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });
        res.moveToNext();
        btext.setText(res.getString(2));
        Button bWeb = (Button)this.findViewById(R.id.n3W);
        Button bCall = (Button)this.findViewById(R.id.n3C);
        Button bMap = (Button)this.findViewById(R.id.n3M);
        final String bWebString = res.getString(4);
        final String bCallString = res.getString(3);
        final String bMapString = res.getString(5);
        bWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(bWebString));
                startActivity(i);
            }
        });
        bCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + bCallString));
                startActivity(i);
            }
        });
        bMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + bMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });
        res.moveToNext();
        ctext.setText(res.getString(2));
        Button cWeb = (Button)this.findViewById(R.id.n4W);
        Button cCall = (Button)this.findViewById(R.id.n4C);
        Button cMap = (Button)this.findViewById(R.id.n4M);
        final String cWebString = res.getString(4);
        final String cCallString = res.getString(3);
        final String cMapString = res.getString(5);
        cWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(cWebString));
                startActivity(i);
            }
        });
        cCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + cCallString));
                startActivity(i);
            }
        });
        cMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + cMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });
        res.moveToNext();
        dtext.setText(res.getString(2));
        Button dWeb = (Button)this.findViewById(R.id.n5W);
        Button dCall = (Button)this.findViewById(R.id.n5C);
        Button dMap = (Button)this.findViewById(R.id.n5M);
        final String dWebString = res.getString(4);
        final String dCallString = res.getString(3);
        final String dMapString = res.getString(5);
        dWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(dWebString));
                startActivity(i);
            }
        });
        dCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + dCallString));
                startActivity(i);
            }
        });
        dMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + dMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });
        res.moveToNext();
        etext.setText(res.getString(2));
        Button eWeb = (Button)this.findViewById(R.id.n6W);
        Button eCall = (Button)this.findViewById(R.id.n6C);
        Button eMap = (Button)this.findViewById(R.id.n6M);
        final String eWebString = res.getString(4);
        final String eCallString = res.getString(3);
        final String eMapString = res.getString(5);
        eWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(eWebString));
                startActivity(i);
            }
        });
        eCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + eCallString));
                startActivity(i);
            }
        });
        eMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + eMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });
        res.moveToNext();
        ftext.setText(res.getString(2));
        Button fWeb = (Button)this.findViewById(R.id.n7W);
        Button fCall = (Button)this.findViewById(R.id.n7C);
        Button fMap = (Button)this.findViewById(R.id.n7M);
        final String fWebString = res.getString(4);
        final String fCallString = res.getString(3);
        final String fMapString = res.getString(5);
        fWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(fWebString));
                startActivity(i);
            }
        });
        fCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + fCallString));
                startActivity(i);
            }
        });
        fMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + fMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });
        res.moveToNext();
        gtext.setText(res.getString(2));
        Button gWeb = (Button)this.findViewById(R.id.n8W);
        Button gCall = (Button)this.findViewById(R.id.n8C);
        Button gMap = (Button)this.findViewById(R.id.n8M);
        final String gWebString = res.getString(4);
        final String gCallString = res.getString(3);
        final String gMapString = res.getString(5);
        gWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(gWebString));
                startActivity(i);
            }
        });
        gCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + gCallString));
                startActivity(i);
            }
        });
        gMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + gMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });
        res.moveToNext();
        htext.setText(res.getString(2));
        Button hWeb = (Button)this.findViewById(R.id.n9W);
        Button hCall = (Button)this.findViewById(R.id.n9C);
        Button hMap = (Button)this.findViewById(R.id.n9M);
        final String hWebString = res.getString(4);
        final String hCallString = res.getString(3);
        final String hMapString = res.getString(5);
        hWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(hWebString));
                startActivity(i);
            }
        });
        hCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + hCallString));
                startActivity(i);
            }
        });
        hMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + hMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });
        res.moveToNext();
        itext.setText(res.getString(2));
        Button iWeb = (Button)this.findViewById(R.id.n10W);
        Button iCall = (Button)this.findViewById(R.id.n10C);
        Button iMap = (Button)this.findViewById(R.id.n10M);
        final String iWebString = res.getString(4);
        final String iCallString = res.getString(3);
        final String iMapString = res.getString(5);
        iWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(iWebString));
                startActivity(i);
            }
        });
        iCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + iCallString));
                startActivity(i);
            }
        });
        iMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + iMapString);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }else{
                    String message = "uncool";
                    textView.setText(message);
                }
            }
        });

        final String string = res.getString(4);
        final String string2 = res.getString(3);
        /*b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(string));
                startActivity(i);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + string2));
                startActivity(i);
            }
        });*/
        viewAll();
    }


    public void testMap(View view){
        Cursor res = myDb.getData();
        res.moveToNext();
       //res.getString(1) showMessage("Lets see" , res.getString(1));
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + res.getString(5));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }else{
            String message = "uncool";
            textView.setText(message);
        }

    }

    public void viewAll() {
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getData();
                        if(res.getCount() == 0) {
                            // show message
                            showMessage("error", "Nothing found");
                            return;
                        }
                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()){
                            buffer.append("Id :" + res.getString(0) + "\n");
                            buffer.append("Name :" + res.getString(1) + "\n");
                            buffer.append("Surname :" + res.getString(2) + "\n");
                            buffer.append("Marks :" + res.getString(3) + "\n");
                        }
                       /* Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + res.getString(1));
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }else{
                            String message = "uncool";
                            textView.setText(message);
                        }*/
                        showMessage("Data", buffer.toString());
                    }
                }
        );
    }
/*

    public void showMap(View view){
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
    }*/

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    public void showGreetings(View view){
        String message = "whatup";
        textView.setText(message); //sets the message to the new string
    }
    public void verbthingy(View view){
        String message = "WHATUUUUP!!";
        textView.setText(message); //sets the message to the new string
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

/*

    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() { //arbitrary map position, doesn't need its own function
        mMap.addMarker(new MarkerOptions().position(new LatLng(36.207186, -86.280029)).title("Marker"));
    }*/
}



