package br.com.senaigo.mobile.vouaprenderandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Nota;

public class NotaAdapter extends BaseAdapter {


    Context context;
    List<Nota> colecao;
    LayoutInflater inflter;

    public NotaAdapter(
        final Context applicationContext,
        final List<Nota> colecao
    ) {
        this.context = applicationContext;
        this.colecao = colecao;
    }

    @Override
    public int getCount() {
        return this.colecao != null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecao.get(i);
    }

    private Nota parsetItem(int i){
        return this.colecao.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.item_nota,
                            viewGroup, false);
        }

        // pega o objeto corrente da lista
        Nota nota = parsetItem(i);

        //Neste ponto vc ira popular os dados do seu layout,
        //utilizando JAVA.

        TextView campoNota;

        //CASO não queria declarar um campo
        //((TextView)view.findViewById(R.id.txtItemNome)).setText(nota.getTexto());

        campoNota = view.findViewById(R.id.txtItemNota);

        campoNota.setText(nota.getTexto());

        return view;
    }
}