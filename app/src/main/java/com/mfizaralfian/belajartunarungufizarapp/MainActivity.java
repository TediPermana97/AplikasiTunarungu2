package com.mfizaralfian.belajartunarungufizarapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.mfizaralfian.belajartunarungufizarapp.IntroVideo.VideoOoeActivity;
import com.mfizaralfian.belajartunarungufizarapp.IntroVideo.VideoThreeActivity;
import com.mfizaralfian.belajartunarungufizarapp.IntroVideo.VideoTwoTActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView exit1;
    LinearLayout btn1,btn2,btn3,btn4;

    //image slider---------

    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exit1 = (ImageView) findViewById(R.id.ivExit1);

        exit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Apakah Anda Ingin Keluar Dari Aplikasi?")
                        .setCancelable(false)
                        .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                MainActivity.super.onBackPressed();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                        //atur icont
                        .setTitle("Perhatian !!!")
                        .setIcon(R.drawable.cls);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoOoeActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoTwoTActivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoThreeActivity.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TentanAplikasiActivity.class);
                startActivity(intent);
            }
        });


        //--------------image slider-------------------------------
        imageSlider = findViewById(R.id.imege_slider);

        List<SlideModel> imageList = new ArrayList<>();

        //ArrayList imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/sekripsi-fijar.appspot.com/o/Data%20File%2FGambar%20Depan%2Fa6.png?alt=media&token=45acd0ac-2b9d-4507-809b-f284be6eb0fc", "SELAMAT DATANG DI APLIKASI TUNARUNGU"));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/sekripsi-fijar.appspot.com/o/Data%20File%2FGambar%20Depan%2Fa7.png?alt=media&token=72a22058-30f9-4b4f-88c3-ada925451518", "BELAJAR TUNARUNGU"));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/sekripsi-fijar.appspot.com/o/Data%20File%2FGambar%20Depan%2Fa8.png?alt=media&token=09e8b8d2-d678-48de-bf99-69a410690744", "SELAMAT BERGABUNG"));

        imageSlider.setImageList(imageList, true);
    }

    //-----------------------------------kembali tampa memencet tombol-------------------------------

    @Override
    public void onBackPressed()
    {

        exitapp();
    }

    private void exitapp() {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(true);
        builder.setIcon(R.drawable.cls);
        builder.setTitle("Exit App");
        builder.setMessage("Apakah Anda Ingin Keluar Dari Aplikasi?");
        builder.setInverseBackgroundForced(true);
        builder.setPositiveButton("Yes",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which){
                finish();
            }
        });
        builder.setNegativeButton("No",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which){
                dialog.dismiss();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }

    //-----------------------------------------------------------------------------------------------
}