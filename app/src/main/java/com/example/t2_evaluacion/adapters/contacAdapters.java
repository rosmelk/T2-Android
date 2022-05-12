package com.example.t2_evaluacion.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t2_evaluacion.Contact.Contactos;
import com.example.t2_evaluacion.R;

import java.util.List;

public class contacAdapters extends RecyclerView.Adapter<contacAdapters.ContactViewHolder>{

    List<Contactos> contacts;
    public contacAdapters(List <Contactos> contacts){
        this.contacts = contacts;

    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_string, parent, false);
        ContactViewHolder vh = new ContactViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull contacAdapters.ContactViewHolder vh, int position) {
        Contactos conctas = contacts.get(position);

        TextView tvContactname = vh.itemView.findViewById(R.id.txt_nombre);
        TextView tvContactnumber = vh.itemView.findViewById(R.id.txt_number);
        tvContactname.setText(conctas.nombre);
        tvContactnumber.setText(conctas.number);

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    //para interactuar con las vistas
    class ContactViewHolder extends RecyclerView.ViewHolder{
        ConstraintLayout parentLayout;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            parentLayout = itemView.findViewById(R.id.lyBasse);

        }

    }
}
