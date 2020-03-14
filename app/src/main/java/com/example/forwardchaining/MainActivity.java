package com.example.forwardchaining;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox CbDemam, CbNyeriTenggorokan, CbTenggorokanMerah, CbKelenjarGetahBening, CbSakitKepala, CbHidungMeler, CbBatuk, CbNyeriOtot, CbNyeriSendi, CbKemerahanKulit,
            CbMunculBintikMerah, CbTubuhMengigil;
    Button btnDeteksi;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CbDemam = findViewById(R.id.checkbox);
        CbNyeriTenggorokan = findViewById(R.id.checkbox1);
        CbTenggorokanMerah = findViewById(R.id.checkbox2);
        CbKelenjarGetahBening = findViewById(R.id.checkbox3);
        CbSakitKepala = findViewById(R.id.checkbox4);
        CbHidungMeler = findViewById(R.id.checkbox5);
        CbBatuk = findViewById(R.id.checkbox6);
        CbNyeriOtot = findViewById(R.id.checkbox7);
        CbNyeriSendi = findViewById(R.id.checkbox8);
        CbKemerahanKulit = findViewById(R.id.checkbox9);
        CbMunculBintikMerah = findViewById(R.id.checkbox10);
        CbTubuhMengigil = findViewById(R.id.checkbox11);

        btnDeteksi = findViewById(R.id.btnDeteksi);
        tvResult = findViewById(R.id.tvResults);
        tvResult.setText("");

        btnDeteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NamaPenyakit = "Anda Menderita Penyakit : ";

                if (CbDemam.isChecked() && CbNyeriTenggorokan.isChecked() && CbHidungMeler.isChecked() && CbBatuk.isChecked() && CbNyeriOtot.isChecked()) {
                    NamaPenyakit += "\nCampak";
                }

                if (CbDemam.isChecked() && CbTenggorokanMerah.isChecked() && CbKelenjarGetahBening.isChecked() && CbNyeriSendi.isChecked() && CbKemerahanKulit.isChecked()) {
                    NamaPenyakit += "\nCampak Jerman";
                }

                if (CbDemam.isChecked() && CbSakitKepala.isChecked() && CbMunculBintikMerah.isChecked() && CbTubuhMengigil.isChecked()) {
                    NamaPenyakit += "\nCacar";
                }

                tvResult.setText("" + NamaPenyakit);
            }
        });
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String string = "";
        switch (view.getId()) {
            case R.id.checkbox:
                string = checked ? "Gejala Demam Diseleksi " : "Gejala Demam Tidak Diseleksi";
                break;
            case R.id.checkbox1:
                string = checked ? "Gejala Nyeri Tenggorokan Diseleksi " : "Gejala Nyeri Tenggorokan Tidak Diseleksi";
                break;
            case R.id.checkbox2:
                string = checked ? "Gejala Tenggorokan Tampak Merah Diseleksi " : "Gejala Tenggorokan Tampak Merah Tidak Diseleksi";
                break;
            case R.id.checkbox3:
                string = checked ? "Gejala Pembengkakan Kelenjar Getah Bening Diseleksi " : "Gejala Pembengkakan Kelenjar Getah Bening Tidak Diseleksi";
                break;
            case R.id.checkbox4:
                string = checked ? "Gejala Sakit Kepala Diseleksi " : "Gejala Sakit Kepala Tidak Diseleksi";
                break;
            case R.id.checkbox5:
                string = checked ? "Gejala Hidung Meler Diseleksi " : "Gejala Hidung Meler Tidak Diseleksi";
                break;
            case R.id.checkbox6:
                string = checked ? "Gejala Batuk Diseleksi " : "Gejala Batuk Tidak Diseleksi";
                break;
            case R.id.checkbox7:
                string = checked ? "Gejala Nyeri Otot Diseleksi " : "Gejala Nyeri Otot Tidak Diseleksi";
                break;
            case R.id.checkbox8:
                string = checked ? "Gejala Nyeri Sendi Diseleksi " : "Gejala Nyeri Sendi Tidak Diseleksi";
                break;
            case R.id.checkbox9:
                string = checked ? "Gejala Kemerahan Kulit Diseleksi " : "Gejala Kemerahan Kulit Tidak Diseleksi";
                break;
            case R.id.checkbox10:
                string = checked ? "Gejala Bintik bintik merah Diseleksi " : "Gejala Bintik bintik merah Tidak Diseleksi";
                break;
            case R.id.checkbox11:
                string = checked ? "Gejala Tubuh Mengigil Diseleksi " : "Gejala Tubuh Mengigil Tidak Diseleksi";
                break;
        }
        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_SHORT).show();
    }
}
