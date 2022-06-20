package com.tolganacar.example88;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tolganacar.example88.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        binding.textName.setText(selectedLandmark.name);
        binding.textCountry.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);

    }
}