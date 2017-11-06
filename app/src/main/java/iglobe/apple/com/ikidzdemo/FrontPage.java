package iglobe.apple.com.ikidzdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontPage extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        button = (Button) findViewById(R.id.createAccount);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(FrontPage.this,
                        AccountType.class);
                startActivity(myIntent);
            }
        });


        button = (Button) findViewById(R.id.signIn);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                //login();

                // Start NewActivity.class
                Intent myIntent = new Intent(FrontPage.this,
                        SignIn.class);
                startActivity(myIntent);

            }
        });

    }


}
