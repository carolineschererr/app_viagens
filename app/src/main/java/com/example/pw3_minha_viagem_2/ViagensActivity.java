package com.example.pw3_minha_viagem_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

public class ViagensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagens);
    }

   public void compartilharViagem(View view) {
       Intent sendIntent = new Intent();
       sendIntent.setAction(Intent.ACTION_SEND);
       sendIntent.putExtra(Intent.EXTRA_TEXT, "Compartilhando minha viagem.");
       sendIntent.setType("text/plain");
       Intent shareIntent = Intent.createChooser(sendIntent, null);
       startActivity(shareIntent);
   }
}
