package com.example.utsmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.utsmobile.EditDataMahasiswaFragment;
import androidx.fragment.app.FragmentTransaction;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    private List<String> listData;
    private LayoutInflater inflater;

    public AdapterData(Context context, List<String> listData) {
        this.listData = listData;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_view, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        // Set data to appropriate TextViews or Buttons
        holder.txtName.setText(listData.get(position * 5)); // Name
        holder.txtNim.setText(listData.get(position * 5 + 1)); // NIM
        holder.txtEmail.setText(listData.get(position * 5 + 2)); // Email
        holder.txtJudul.setText(listData.get(position * 5 + 3)); // Judul
        holder.txtStatus.setText(listData.get(position * 5 + 4)); // Status
    }

    @Override
    public int getItemCount() {
        // Divide the listData size by 5 to get the number of items
        return listData.size() / 5;
    }

    public static class HolderData extends RecyclerView.ViewHolder {
        TextView txtName, txtNim, txtEmail, txtJudul, txtStatus;
        Button btnEdit, btnDelete;

        public HolderData(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.name);
            txtNim = itemView.findViewById(R.id.nim);
            txtEmail = itemView.findViewById(R.id.email);
            txtJudul = itemView.findViewById(R.id.judul);
            txtStatus = itemView.findViewById(R.id.status);
            btnEdit = itemView.findViewById(R.id.editButton);
            btnDelete = itemView.findViewById(R.id.deleteButton);
        }
    }
}
