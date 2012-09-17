package com.example.Barcelona;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    Button PgButton;
    Button SgButton;
    Button StreetScenesButton;
    
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnPgButton();
        addListenerOnSgButton();
        addListenerOnStreetScenesButton();
        
                  
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void addListenerOnPgButton() {
    	 
		final Context context = this;
 
		PgButton = (Button) findViewById(R.id.PgButton);
 
		PgButton.setOnClickListener(new OnClickListener() {
 
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, PgActivity.class);
                            startActivity(intent);   
			}
});

}
    
    public void addListenerOnSgButton() {
   	 
		final Context context = this;
 
		SgButton = (Button) findViewById(R.id.SgButton);
 
		SgButton.setOnClickListener(new OnClickListener() {
 
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, SgActivity.class);
                            startActivity(intent);   
			}
});

}

    public void addListenerOnStreetScenesButton() {
   	 
		final Context context = this;
 
		StreetScenesButton = (Button) findViewById(R.id.StreetScenesButton);
 
		StreetScenesButton.setOnClickListener(new OnClickListener() {
 
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, StreetScenesActivity.class);
                            startActivity(intent);   
			}
});

}



}
