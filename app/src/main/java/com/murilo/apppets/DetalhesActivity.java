package com.murilo.apppets;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetalhesActivity extends AppCompatActivity {

    ImageView imgPet;
    TextView txtNome, txtCor, txtRaca, txtIdade, txtDataAniversario;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_detalhes);

        imgPet = findViewById(R.id.imgPet);
        txtNome = findViewById(R.id.txtNome);
        txtCor = findViewById(R.id.txtCor);
        txtRaca = findViewById(R.id.txtRaca);
        txtIdade = findViewById(R.id.txtIdade);
        txtDataAniversario = findViewById(R.id.txtAniversario);

        String nomeRecebido = getIntent().getStringExtra("nome");
        String corRecebida = getIntent().getStringExtra("cor");
        String racaRecebida = getIntent().getStringExtra("raca");
        String idadeRecebida = getIntent().getStringExtra("idade");
        String dataAniversarioRecebida = getIntent().getStringExtra("data_aniversario");

        int idImgRecebida = getIntent().getIntExtra("id_imagem", 0);

        imgPet.setImageResource(idImgRecebida);
        txtNome.setText("Nome: " + nomeRecebido);
        txtRaca.setText("Cor: " + racaRecebida);
        txtCor.setText("Cor: " + corRecebida);
        txtIdade.setText("Cor: " + idadeRecebida);
        txtDataAniversario.setText("Cor: " + dataAniversarioRecebida);

    }
}
