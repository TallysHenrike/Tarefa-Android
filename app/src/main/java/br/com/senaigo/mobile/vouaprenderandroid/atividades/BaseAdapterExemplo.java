package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.os.Bundle;
import android.view.View;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.adapters.NotaAdapter;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Nota;

public class BaseAdapterExemplo extends DefaultAtctivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter_exemplo);
    }

    public void adicionar(View view) {

        //ENTRADA DE DADOS
        //Captura o componente EditText da VIEW
        txtNota = findViewById(R.id.txtNota);

        String notaString = txtNota.getText().toString();

        Nota nota = new Nota(notaString);

        lista.add(nota);

        //SAIDA

        minhaLista = findViewById(R.id.minhaLista);

        //SAIDA

        minhaLista = findViewById(R.id.minhaLista);


        NotaAdapter notaAdapter = new NotaAdapter(this, lista);
        minhaLista.setAdapter(notaAdapter);
    }
}