package com.example.t2_evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.t2_evaluacion.Contact.Contactos;
import com.example.t2_evaluacion.adapters.contacAdapters;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contactos> contactos = getContacts();
        contacAdapters adapter = new contacAdapters(contactos);
        RecyclerView rv = findViewById(R.id.rvContacts);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }
    private List<Contactos> getContacts(){
        List<Contactos> contacts = new ArrayList<>();
        contacts.add(new Contactos("Rosmel cruzado","937388629"));
        contacts.add(new Contactos("Ahomar cruzado","937388629"));
        contacts.add(new Contactos("Carlos cruzado","937388629"));
        contacts.add(new Contactos("Maria cruzado","937388629"));
        contacts.add(new Contactos("Carmen cruzado","937388629"));
        contacts.add(new Contactos("Rosmel cruzado","937388629"));
        contacts.add(new Contactos("Rosmel cruzado","937388629"));
        contacts.add(new Contactos("Rosmel cruzado","937388629"));
        contacts.add(new Contactos("Rosmel cruzado","937388629"));
        return contacts;

    }

}