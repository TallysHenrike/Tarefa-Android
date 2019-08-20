package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.senaigo.mobile.vouaprenderandroid.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void baseAdapterExemplo(View view) {
        startActivity(new Intent(this, BaseAdapterExemplo.class));
    }
}