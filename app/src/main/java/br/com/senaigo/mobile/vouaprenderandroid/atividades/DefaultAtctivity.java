package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.entidades.Nota;

public class DefaultAtctivity extends AppCompatActivity {

    public EditText txtNota;
    public List<Nota> lista = new ArrayList<>();
    public ListView minhaLista;

}