package com.example.utsmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class PengujiFragment extends Fragment {
    RecyclerView recyclerView;
    AdapterData adapterData;
    List<String> listData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_penguji, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize combined list to store both sets of data
        List<String> combinedList = new ArrayList<>();

        // Add data from the first set
        combinedList.add("Fulan S.T.,M.T."); // Name
        combinedList.add("12345"); // NIM
        combinedList.add("Laki-Laki"); // jk
        combinedList.add("6"); // Kuota
        combinedList.add("Pemrograman"); // Status

        // Add data from the second set
        combinedList.add("Fulanah S.T.,M.T."); // Name
        combinedList.add("123456"); // NIM
        combinedList.add("Perempuan"); // Email
        combinedList.add("7"); // Judul
        combinedList.add("Ditolak"); // Status

        // Initialize adapter and set it to RecyclerView
        adapterData = new AdapterData(getContext(), combinedList);
        recyclerView.setAdapter(adapterData);

        // Button "ADD" click listener
        Button addButton = view.findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to TambahDosenPembimbingFragment
                TambahDosenPenguji tambahFragment = new TambahDosenPenguji();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, tambahFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return view;
    }
}
