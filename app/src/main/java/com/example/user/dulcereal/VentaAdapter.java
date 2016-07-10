package com.example.user.dulcereal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import clases.Pedido;
import clases.Venta;

/**
 * Created by USER on 09/07/2016.
 */
public class VentaAdapter extends RecyclerView.Adapter<VentaAdapter.ViewHolder> {
    private List<Venta> lista;


    View.OnClickListener listener;

    public void SetOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView idVentaTvi;
        public TextView productoTvi;
        public TextView cantidadTvi;
        public TextView costoVentaTvi;

        public ViewHolder(View v) {
            super(v);
            idVentaTvi = (TextView)v.findViewById(R.id.tviIdVenta);
            productoTvi = (TextView)v.findViewById(R.id.tviProducto);
            cantidadTvi = (TextView)v.findViewById(R.id.tviCantidadVenta);
            costoVentaTvi = (TextView)v.findViewById(R.id.tviCostoVenta);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public VentaAdapter(List<Venta> myDataset) {
        lista = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public VentaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemventa, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element



        Venta ve=lista.get(position);
        holder.idVentaTvi.setText(ve.idventa);
        holder.productoTvi.setText(ve.prod.nombreProducto);
        holder.cantidadTvi.setText(ve.cantidad);
        holder.costoVentaTvi.setText(Float.toString(ve.costo));

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return lista.size();
    }
}
