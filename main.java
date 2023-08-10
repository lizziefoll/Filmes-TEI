package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapter.Adapter;
import com.example.myapplication.R;
import com.example.myapplication.Adapter.Adapter;
import com.example.myapplication.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList();

    public void criarFilmes(){
        Filme filme = new Filme("Homem Aranha", "aventura", "2018");
        this.listaFilmes.add(filme);
        filme = new Filme("Mulher maravilha", "aventura", "2016");
        this.listaFilmes.add(filme);
        filme = new Filme("Barbie", "ficçao", "2023");
        this.listaFilmes.add(filme);
        filme = new Filme("Os incríveis", "animação", "2000");
        this.listaFilmes.add(filme);




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //configurar adapter;
        Adapter adapter = new Adapter(listaFilmes);


        //configurar recycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        //recyclerView.setAdapter(); //criar adapter




    }


}
