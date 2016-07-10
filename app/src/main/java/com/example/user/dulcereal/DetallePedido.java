package com.example.user.dulcereal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import clases.Venta;

public class DetallePedido extends AppCompatActivity {

    VentaAdapter adapter;
    List<Venta> ventas= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pedido);

        RecyclerView rvi=(RecyclerView)findViewById(R.id.my_recycler_view2);
        rvi.setLayoutManager(new LinearLayoutManager(this));

        //Llamar el JSON creado de la lista de venta del pedido, luego convertirlo a lista y asignarlo a la variable ventas

        adapter=new VentaAdapter(ventas);

        rvi.setAdapter(adapter);

    }

}
