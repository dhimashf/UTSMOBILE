package com.example.utsmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DataMahasiswaFragment extends Fragment {

    RecyclerView recyclerView;
    AdapterData adapterData;
    List<String> listData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data_mahasiswa, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize combined list to store both sets of data
        List<String> combinedList = new ArrayList<>();

        // Add data from the first set
        combinedList.add("Tigreal"); // Name
        combinedList.add("123456"); // NIM
        combinedList.add("TigrealMontage@Gmail.com"); // Email
        combinedList.add("Pengaruh Fleeting Time Pada Montage"); // Judul
        combinedList.add("Menunggu"); // Status

        // Add data from the second set
        combinedList.add("Ahmad"); // Name
        combinedList.add("123456"); // NIM
        combinedList.add("ahmadsumbul@Gmail.com"); // Email
        combinedList.add("Pengaruh Bedak Terhadap persentase adu retri"); // Judul
        combinedList.add("Ditolak"); // Status

        // Initialize adapter and set it to RecyclerView
        adapterData = new AdapterData(getContext(), combinedList);
        recyclerView.setAdapter(adapterData);

        return view;
    }

}
