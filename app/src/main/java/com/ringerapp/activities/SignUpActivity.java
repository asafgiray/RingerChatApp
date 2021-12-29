package com.ringerapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ringerapp.R;
import com.ringerapp.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_sign_up);
        setListeners();
    }
    private void setListeners(){
        binding.textSignIn.setOnClickListener(
                v -> onBackPressed()
        );
    }
}