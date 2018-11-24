
package com.example.lutfillahmafazi.dzikirsetelahsholat.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lutfillahmafazi.dzikirsetelahsholat.R;

public class AdapterJikir extends RecyclerView.Adapter<AdapterJikir.ViewHolder> {

    Context context;
    String[] list;

    // TODO setelah mengisi variable lalu buat contruktor dengan cara klik kanan
    public AdapterJikir(Context context, String[] list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterJikir.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_jikir,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterJikir.ViewHolder viewHolder, int i) {
    viewHolder.txtTitleJikir.setText(list[i]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitleJikir, isiJikir;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitleJikir = itemView.findViewById(R.id.txtTitle);
            isiJikir = itemView.findViewById(R.id.txtIsiDzikir);
        }
    }
}
