package com.F52124061.aplikasi_uts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listHP;

    String[] namaHP = {
            "Samsung Galaxy S24",
            "iPhone 15",
            "Xiaomi 14",
            "OPPO Reno 12",
            "vivo V30",
            "Google Pixel 8"
    };

    String[] spesifikasiHP = {
            "6.2\" AMOLED • 8GB RAM • 256GB • Snapdragon",
            "6.1\" OLED • 6GB RAM • 128GB • A16 Bionic",
            "6.36\" AMOLED • 12GB RAM • 256GB • Snapdragon 8 Gen 3",
            "6.7\" AMOLED • 12GB RAM • 256GB • Dimensity",
            "6.78\" AMOLED • 12GB RAM • 256GB • Snapdragon",
            "6.2\" OLED • 8GB RAM • 128GB • Google Tensor"
    };

    String[] hargaHP = {
            "Rp 9.999.000",
            "Rp 11.999.000",
            "Rp 10.499.000",
            "Rp 5.999.000",
            "Rp 6.499.000",
            "Rp 8.999.000"
    };

    int[] gambarHP = {
            R.drawable.samsung_s24,
            R.drawable.iphone_15,
            R.drawable.xiaomi_14,
            R.drawable.oppo_reno_12,
            R.drawable.vivo_v30,
            R.drawable.google_pixel_8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listHP = findViewById(R.id.listHP);

        AdapterHP adapter = new AdapterHP();
        listHP.setAdapter(adapter);
    }

    class AdapterHP extends BaseAdapter {

        @Override
        public int getCount() {
            return namaHP.length;
        }

        @Override
        public Object getItem(int position) {
            return namaHP[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = LayoutInflater.from(MainActivity.this)
                        .inflate(R.layout.item_hp, parent, false);
            }

            ImageView imgHP = convertView.findViewById(R.id.imgHP);
            TextView txtNama = convertView.findViewById(R.id.txtNama);
            TextView txtSpesifikasi = convertView.findViewById(R.id.txtSpesifikasi);
            TextView txtHarga = convertView.findViewById(R.id.txtHarga);

            imgHP.setImageResource(gambarHP[position]);
            txtNama.setText(namaHP[position]);
            txtSpesifikasi.setText(spesifikasiHP[position]);
            txtHarga.setText(hargaHP[position]);

            return convertView;
        }
    }
}