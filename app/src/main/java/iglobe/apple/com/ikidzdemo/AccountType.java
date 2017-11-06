package iglobe.apple.com.ikidzdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccountType extends Activity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_type);


        button = (Button) findViewById(R.id.staffTeacher);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(AccountType.this,
                        GetStarted.class);
                startActivity(myIntent);
            }
        });

        button = (Button) findViewById(R.id.parent);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(AccountType.this,
                        SignIn.class);
                startActivity(myIntent);
            }
        });

        button = (Button) findViewById(R.id.signIn);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(AccountType.this,
                        SignIn.class);
                startActivity(myIntent);
            }
        });
    }
}