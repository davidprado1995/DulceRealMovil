package com.example.user.dulcereal;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import clases.Pedido;

public class PedidoFiltradoActivity extends Activity {

    PedidoAdapter adapter;
    List<Pedido> pedidos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_filtrado);

        RecyclerView rvi=(RecyclerView)findViewById(R.id.my_recycler_view3);
        rvi.setLayoutManager(new LinearLayoutManager(this));

        //Falta agregar el codigo que llama al webservice de los pedidos filtrados por cliente y asignar la lista resultante del json a la variable pedidos

        adapter=new PedidoAdapter(pedidos);

        rvi.setAdapter(adapter);

        adapter.SetOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pedido pe = (Pedido) v.getTag();
                Intent i = new Intent(PedidoFiltradoActivity.this, DetallePedido.class);

                //Pasar a JSON la lista de venta del pedido y luego pasarla al intent.

                startActivity(i);
            }
        });

        }

    }


