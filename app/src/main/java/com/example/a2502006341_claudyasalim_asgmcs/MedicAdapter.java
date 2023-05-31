package com.example.a2502006341_claudyasalim_asgmcs;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MedicAdapter extends RecyclerView.Adapter<MedicAdapter.ViewHolder> {

//    HomeFragment home;
    Context context;
    ArrayList<Medic> medicList;
    User user;

    public MedicAdapter(Context context, MedicDatabase dbMedic, User user) {
        this.context = context;
        this.medicList = dbMedic.getMedicList();
        this.user = user;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(context).inflate(R.layout.medic_card, parent, false);
        return new ViewHolder(layoutView);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.medicIm.setImageResource(medicList.get(position).getPath());
        holder.nameMedicTv.setText(medicList.get(position).getName());
        holder.manufactureMedicTv.setText(medicList.get(position).getManufacture());
        holder.priceMedicTv.setText("Rp" + String.valueOf(medicList.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return medicList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView medicIm;
        TextView nameMedicTv, manufactureMedicTv, priceMedicTv;
        CardView medicCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            medicIm = itemView.findViewById(R.id.medic_im);
            nameMedicTv = itemView.findViewById(R.id.name_medic_tv);
            manufactureMedicTv = itemView.findViewById(R.id.manufacture_medic_tv);
            priceMedicTv = itemView.findViewById(R.id.price_medic_tv);

            medicCard = itemView.findViewById(R.id.medic_card);

            medicCard.setOnClickListener(e-> {
                Intent toDetail = new Intent(context, DetailActivity.class);
                toDetail.putExtra("User", user);
                toDetail.putExtra("Medicine", medicList.get(getAdapterPosition()));
                context.startActivity(toDetail);
            });
        }
    }
}
