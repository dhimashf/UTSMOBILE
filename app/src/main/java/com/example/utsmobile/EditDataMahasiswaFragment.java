package com.example.utsmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.fragment.app.Fragment;

public class EditDataMahasiswaFragment extends Fragment {

    private CheckBox checkboxDiterima, checkboxDitolak;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_editdatamahasiswa, container, false);

        // Inisialisasi checkbox
        checkboxDiterima = rootView.findViewById(R.id.checkboxditerima);
        checkboxDitolak = rootView.findViewById(R.id.checkboxditolak);

        // Tambahkan listener untuk checkbox diterima
        checkboxDiterima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Jika checkbox diterima di-check, pastikan checkbox ditolak tidak di-check
                if (checkboxDiterima.isChecked()) {
                    checkboxDitolak.setChecked(false);
                }
            }
        });

        // Tambahkan listener untuk checkbox ditolak
        checkboxDitolak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Jika checkbox ditolak di-check, pastikan checkbox diterima tidak di-check
                if (checkboxDitolak.isChecked()) {
                    checkboxDiterima.setChecked(false);
                }
            }
        });

        return rootView;
    }
}
