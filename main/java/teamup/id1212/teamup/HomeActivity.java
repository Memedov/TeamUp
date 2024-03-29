package teamup.id1212.teamup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private TextView soccerButton;
    private TextView rideButton;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    goHome();
                    return true;
                case R.id.navigation_dashboard:
                    goToProfile();
                    return true;
                case R.id.navigation_notifications:
                    getRide();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        soccerButton = (TextView) findViewById(R.id.soccer);
        rideButton = (TextView) findViewById(R.id.ride2);

        soccerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getGroup();
            }
        });

        rideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getRide();
            }
        });

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void getGroup() {
        Intent intent4 = new Intent(this, GroupActivity.class);
        startActivity(intent4);
    }

    public void getRide() {
        Intent intent5 = new Intent(this, ActivityRidesActivity.class);
        startActivity(intent5);
    }

    public void goHome(){
        Intent homeIntent = new Intent(this, HomeActivity.class);
        startActivity(homeIntent);
    }

    public void goToProfile(){
        Intent profileIntent = new Intent(this, ProfileActivity.class);
        startActivity(profileIntent);
    }

}
