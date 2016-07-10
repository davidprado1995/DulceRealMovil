package com.example.user.dulcereal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import clases.Pedido;

/**
 * Created by itlab on 11/5/15.
 */
public class PedidoAdapter extends RecyclerView.Adapter<PedidoAdapter.ViewHolder> {
    private List<Pedido> lista;


    View.OnClickListener listener;

    public void SetOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView idPedidoTvi;
        public TextView clienteTvi;
        public TextView costoTvi;
        public TextView fechaTvi;

        public ViewHolder(View v) {
            super(v);
            idPedidoTvi = (TextView)v.findViewById(R.id.tviIdPedido);
            clienteTvi = (TextView)v.findViewById(R.id.tviClientePedido);
            costoTvi = (TextView)v.findViewById(R.id.tviCostoPedido);
            fechaTvi = (TextView)v.findViewById(R.id.tviFechaPedido);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public PedidoAdapter(List<Pedido> myDataset) {
        lista = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public PedidoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itempedido, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element


        //recorriendo la lista de veterinarias (parse object)
        Pedido pe=lista.get(position);
        holder.idPedidoTvi.setText(pe.idpedido);
        holder.clienteTvi.setText(pe.cliente);
        holder.fechaTvi.setText(pe.fecha);
        holder.costoTvi.setText(Float.toString(pe.costoTotal));
        holder.itemView.setTag(pe);
        holder.itemView.setOnClickListener(listener);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return lista.size();
    }
}
