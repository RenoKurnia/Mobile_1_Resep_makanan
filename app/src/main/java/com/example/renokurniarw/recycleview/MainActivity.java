package com.example.renokurniarw.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView rl;
String s1[],s2[];
    private List<Content> listContent = new ArrayList<>();

    Adaptor ad;
    int[] imgResoucres = {R.drawable.syomau,R.drawable.pempek};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (RecyclerView) findViewById(R.id.myRecycler);
        s1 = getResources().getStringArray(R.array.Array_top);
        s2 = getResources().getStringArray(R.array.Array_bottom);
        ad = new Adaptor(this,s1,s2,imgResoucres,listContent);
        rl.setAdapter(ad);
        rl.setLayoutManager(new LinearLayoutManager(this));
        contentInit();

    }

    private void contentInit(){
        Content con  = new Content("Syomai","Cara Membuat\n" + "\n" + "    Campurkan semua bahan, kecuali tepung sagu dan air es, di Mixing Bowl dan aduk hingga tercampur rata.\n" + "    Tambahkan tepung sagu dan air es, aduk kembali hingga rata.\n" + "    Isi selembar kulit siomay dengan bahan isian dan lipat sisinya.\n" + "    Kukus dengan Steam It selama 30 menit atau hingga matang"+"\n"+"Bahan\n" + "\n" + "250 gr paha ayam, giling halus dengan Fusion Master Mincer\n" + "150 gr udang, giling kasar dengan Fusion Master Mincer\n" + "    3 siung bawang putih, cacah dengan Turbo Chopper\n" + "    1 batang daun bawang, cacah dengan Turbo Chopper\n" + "1 sdt garam\n" + "¾ sdt gula\n" + "1/8 sdt merica\n" + "1 sdt minyak wijen\n" + "80 gr tepung sagu\n" + "75 ml air es\n"+"Kulit siomay, secukupnya\n",R.drawable.syomau);
        listContent.add(con);
        con  = new Content("Pempemk","Bahan biang empek empek Palembang :\n" + "\n" + "    50 gram tepung terigu\n" + "    2 sendok makan garam\n" + "    3 sendok makan minyak goreng\n" + "    2 siung bawang putih, haluskan\n" + "    1 sendok teh gula pasir\n" + "    1/2 sendok teh penyedap rasa, (kalau suka)\n" + "    400 ml air\n" + "\n" + "\n" + "Bahan Pencampur resep pempek palembang :\n" + "\n" + "    1 kg daging ikan tenggiri / gabus giling taruh di freezer.\n" + "    1 kg tepung sagu / ditukar tepung kanji / tapioka kwalitas bagus\n" + "\n" + "\n" + "Cara membuat biang  :\n" + "\n" + "    ~ Campurkan tepung terigu, garam, air, gulag pasir, bawang putih serta bumbu penyedap.\n" + "    ~ Masak diatas api kecil sembari diaduk hingga kental. Angkat serta imbuhkan minyak goreng.\n" + "    ~ Aduk, lantas biarlah dingin. Taruh dalam almari pendingin (janganlah di freezer)\n" + "\n" + "\n" + "Cara membuat adonan dasar Pempek Palembang :\n" + "\n" + "    ~ Mengeluarkan daging ikan yang telah beku, biarlah mencair, Mengeluarkan adonan biang dari kulkas.\n" + "    ~ Campur 2 sisi daging ikan tenggiri dengan 1 sisi adonan biang, Tambahkan tepung kanji seperlunya sedikit sedikit.\n" + "    ~ Aduk dengan ujung jari sampai tercampur rata.\n" + "    ~ Pakai plastik beroles minyak goreng untuk membuat adonan.\n" + "    ~ Apabila kombinasi terlampau keras, tambah lagi sedikit adonan biang supaya lentur.\n",R.drawable.syomau);
        listContent.add(con);
    }
}
