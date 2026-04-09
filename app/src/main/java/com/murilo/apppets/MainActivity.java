package com.murilo.apppets;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btBob, btLisa, btTed, btFred, btLuna, btTob;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Pet pet1 = new Pet("Bob", "Dourado", "Golden", 7, "2 de junho");
        Pet pet2 = new Pet("Lisa", "Dourado e preto", "Yorkshire Terrier", 2, "25 de agosto");
        Pet pet3 = new Pet("Ted", "Preto e branco", "Chihuawa", 5, "7 de setembro");
        Pet pet4 = new Pet("Fred", "Marrom-claro", "Bobtail", 3, "18 de janeiro");
        Pet pet5 = new Pet("Luna", "Branco", "Balinês", 1, "25 de dezembro");
        Pet pet6 = new Pet("Tob", "Preto e branco", "Americano", 9, "7 de abril");

        btBob.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, DetalhesActivity.class);
            intent.putExtra("nome", pet1.getNome());
            intent.putExtra("cor", pet1.getCor());
            intent.putExtra("raca", pet1.getRaca());
            intent.putExtra("idade", pet1.getIdade());
            intent.putExtra("data_aniversario", pet1.getData_aniversario());
            intent.putExtra("id_imagem", R.drawable.bob);
            startActivity(intent);
        });

        btLisa.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, DetalhesActivity.class);
            intent.putExtra("nome", pet2.getNome());
            intent.putExtra("cor", pet2.getCor());
            intent.putExtra("raca", pet2.getRaca());
            intent.putExtra("idade", pet2.getIdade());
            intent.putExtra("data_aniversario", pet2.getData_aniversario());
            intent.putExtra("id_imagem", R.drawable.lisa);
            startActivity(intent);
        });

        btTed.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, DetalhesActivity.class);
            intent.putExtra("nome", pet3.getNome());
            intent.putExtra("cor", pet3.getCor());
            intent.putExtra("raca", pet3.getRaca());
            intent.putExtra("idade", pet3.getIdade());
            intent.putExtra("data_aniversario", pet3.getData_aniversario());
            intent.putExtra("id_imagem", R.drawable.ted);
            startActivity(intent);
        });

        btFred.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, DetalhesActivity.class);
            intent.putExtra("nome", pet4.getNome());
            intent.putExtra("cor", pet4.getCor());
            intent.putExtra("raca", pet4.getRaca());
            intent.putExtra("idade", pet4.getIdade());
            intent.putExtra("data_aniversario", pet4.getData_aniversario());
            intent.putExtra("id_imagem", R.drawable.fred);
            startActivity(intent);
        });

        btLuna.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, DetalhesActivity.class);
            intent.putExtra("nome", pet5.getNome());
            intent.putExtra("cor", pet5.getCor());
            intent.putExtra("raca", pet5.getRaca());
            intent.putExtra("idade", pet5.getIdade());
            intent.putExtra("data_aniversario", pet5.getData_aniversario());
            intent.putExtra("id_imagem", R.drawable.luna);
            startActivity(intent);
        });

        btTob.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, DetalhesActivity.class);
            intent.putExtra("nome", pet6.getNome());
            intent.putExtra("cor", pet6.getCor());
            intent.putExtra("raca", pet6.getRaca());
            intent.putExtra("idade", pet6.getIdade());
            intent.putExtra("data_aniversario", pet6.getData_aniversario());
            intent.putExtra("id_imagem", R.drawable.tob);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}