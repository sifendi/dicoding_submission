package com.example.dicoding_submission;


import android.content.Intent;
import android.view.LayoutInflater;import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;



public class CardViewKotaAdapter extends RecyclerView.Adapter<CardViewKotaAdapter.CardViewViewHolder> {
    private ArrayList<Kota> listkota;

    public CardViewKotaAdapter(ArrayList<Kota> list) {
        this.listkota = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_kota, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        final Kota kota = listkota.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kota.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.foto);
        holder.texttitle.setText(kota.getName());
        holder.textdetail.setText(kota.getDetail());

        holder.tomboldetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Nama Kota = "
                        +kota.getName().toString(), Toast.LENGTH_SHORT).show();
                if (kota.getName().toString() == "Surabaya") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_Surabaya.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (kota.getName().toString() == "Semarang") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_Semarang.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (kota.getName().toString() == "Jakarta") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_Jakarta.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (kota.getName().toString() == "Jogja") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_Jogja.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (kota.getName().toString() == "Bali") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_Bali.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (kota.getName().toString() == "Bandung") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_Bandung.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (kota.getName().toString() == "NTB") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_NTB.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (kota.getName().toString() == "NTT") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_NTT.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (kota.getName().toString() == "Makassar") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_Makassar.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (kota.getName().toString() == "Sumbar") {
                    Intent intent = new Intent (holder.itemView.getContext(), Detail_Sumbar.class);
                    holder.itemView.getContext().startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return listkota.size();
    }



    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView texttitle, textdetail;
        Button tomboldetail;
        CardViewViewHolder(View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.img_item_photo);
            texttitle = itemView.findViewById(R.id.titleofcity);
            textdetail = itemView.findViewById(R.id.description);
            tomboldetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}