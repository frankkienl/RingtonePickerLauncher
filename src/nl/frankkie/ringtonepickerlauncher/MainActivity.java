package nl.frankkie.ringtonepickerlauncher;

import android.app.Activity;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b = (Button) findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try {
                    Intent intent = new Intent(RingtoneManager.ACTION_RINGTONE_PICKER);                    
                    
                    Intent chooser = Intent.createChooser(intent, "Ringtone Picker");
                    // Verify the intent will resolve to at least one activity
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(chooser);
                    } else {
                        Toast.makeText(MainActivity.this, "Activity not found", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error!\n" + e, Toast.LENGTH_LONG).show();
                }
            }
        });
        
        Button b2 = (Button) findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_PICK);                    
                    
                    Intent chooser = Intent.createChooser(intent, "Ringtone Picker");
                    // Verify the intent will resolve to at least one activity
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(chooser);
                    } else {
                        Toast.makeText(MainActivity.this, "Activity not found", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error!\n" + e, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
