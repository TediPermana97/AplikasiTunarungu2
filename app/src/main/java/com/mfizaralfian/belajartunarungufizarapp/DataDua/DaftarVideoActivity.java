package com.mfizaralfian.belajartunarungufizarapp.DataDua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.belajartunarungufizarapp.DataDua.MateriVideo.PlayVideoDuaActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataDua.MateriVideo.PlayVideoEmpatActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataDua.MateriVideo.PlayVideoSatuActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataDua.MateriVideo.PlayVideoTigaActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.Materi.MateriDuaActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.Materi.MateriSatuActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor.PanduanTutorDuaActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor.PanduanTutorSatuActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor.PanduanTutorTigaActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutorial.TutorDuaActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutorial.TutorSatu2Activity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutorial.TutorTigaActivity;
import com.mfizaralfian.belajartunarungufizarapp.R;

public class DaftarVideoActivity extends AppCompatActivity {
    ImageView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_video);

        //-----------------------kembali----------------------------------
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //-----------------------musik----------------------------------
    }
    public void onClick1(View v) {
        Intent i = new Intent(this, PlayVideoSatuActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick2(View v) {
        Intent i = new Intent(this, PlayVideoDuaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick3(View v) {
        Intent i = new Intent(this, PlayVideoTigaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick4(View v) {
        Intent i = new Intent(this, PlayVideoEmpatActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick5(View v) {
        Intent i = new Intent(this, PlayVideoActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick11(View v) {
        Intent i = new Intent(this, TutorSatu2Activity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick22(View v) {
        Intent i = new Intent(this, TutorDuaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick33(View v) {
        Intent i = new Intent(this, TutorTigaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }



}