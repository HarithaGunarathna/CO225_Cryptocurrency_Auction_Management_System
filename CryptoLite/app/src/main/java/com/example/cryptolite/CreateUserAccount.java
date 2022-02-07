package com.example.cryptolite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateUserAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_account);
    }
    public void NewUserButton(View v) {
        String NewUserName = ((EditText) findViewById(R.id.NewUserName)).getText().toString();
        String NewUserEmail = ((EditText) findViewById(R.id.NewUserEmail)).getText().toString();
        String NewUserPassword = ((EditText) findViewById(R.id.NewUserPassword)).getText().toString();
        String Confirm = ((EditText) findViewById(R.id.ConfirmPassword)).getText().toString();

        if (NewUserName.equals("")) {
            Toast.makeText(this, "Name field is empty", Toast.LENGTH_LONG).show();
        }
        else if (NewUserEmail.equals("")) {
            Toast.makeText(this, "Email field is empty", Toast.LENGTH_LONG).show();
        }
        else if (NewUserPassword.equals("")) {
            Toast.makeText(this, "Password field is empty", Toast.LENGTH_LONG).show();
        }
        else if (!NewUserPassword.equals(Confirm)) {
            Toast.makeText(this, "Password mismatch", Toast.LENGTH_LONG).show();
        }
         else {
            Intent i = new Intent(this, SignInAsAUser.class);
            startActivity(i);
        }
    }
}