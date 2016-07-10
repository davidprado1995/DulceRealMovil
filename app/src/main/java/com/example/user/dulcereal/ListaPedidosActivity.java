package com.example.user.dulcereal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import clases.Pedido;

public class ListaPedidosActivity extends AppCompatActivity {

    PedidoAdapter adapter;
    List<Pedido>  pedidos = new ArrayList<>();
    Button btnFiltrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pedidos);

        RecyclerView rvi=(RecyclerView)findViewById(R.id.my_recycler_view);
        rvi.setLayoutManager(new LinearLayoutManager(this));

        //Falta agregar el codigo que llama al webservice de los pedidos y asignar la lista resultante del json a la variable pedidos

        adapter=new PedidoAdapter(pedidos);

        rvi.setAdapter(adapter);

        adapter.SetOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pedido pe = (Pedido) v.getTag();
                Intent i = new Intent(ListaPedidosActivity.this, DetallePedido.class);

                //Pasar a JSON la lista de venta del pedido y luego pasarla al intent.

                startActivity(i);
            }
        });





    }

}
