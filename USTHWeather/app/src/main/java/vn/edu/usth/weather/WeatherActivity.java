package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;


public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main, firstFragment).commit();


    }
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "=== APP STARTED ===");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "=== APP RESUMED ===");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "=== APP PAUSED ===");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "=== APP STOPPED ===");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "=== APP DESTROYED ===");
    }
}