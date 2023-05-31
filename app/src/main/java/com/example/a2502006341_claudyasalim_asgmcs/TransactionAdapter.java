package com.example.a2502006341_claudyasalim_asgmcs;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDate;
import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder> {

    Context context;
    ArrayList<Transaction>tList;
    User user;

    public TransactionAdapter(Context context, ArrayList<Transaction> tList, User user) {
        this.context = context;
        this.tList = tList;
        this.user = user;
    }

    @NonNull
    @Override
    public TransactionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(context).inflate(R.layout.transaction_card, parent, false);
        return new ViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.ViewHolder holder, int position) {
        holder.date.setText(tList.get(position).getDate());
        holder.medicName.setText(tList.get(position).getMedic().getName());
        holder.medicPrice.setText("Rp" + String.valueOf(tList.get(position).getMedic().getPrice()));
        holder.qtyNum.setText(String.valueOf(tList.get(position).getQty()));
    }

    @Override
    public int getItemCount() {
        if(tList.size()==0){
            return 0;
        }
        else {
            Log.i("Size of array", String.valueOf(tList.size()));
            return tList.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView date, medicName, medicPrice, qtyText, qtyNum;
        Button updateBtn, deleteBtn;
        CardView tCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.transaction_date_tv);
            medicName = itemView.findViewById(R.id.medic_name_tv);
            medicPrice = itemView.findViewById(R.id.medic_price_tv);
            qtyText = itemView.findViewById(R.id.quantity_tv);
            qtyNum = itemView.findViewById(R.id.num_quantity_tv);
            updateBtn = itemView.findViewById(R.id.update_btn);
            deleteBtn = itemView.findViewById(R.id.delete_btn);

            tCard = itemView.findViewById(R.id.transaction_card);

            updateBtn.setOnClickListener(e->{
                Intent toUpdateT = new Intent(context, UpdateTransactionActivity.class);
                toUpdateT.putExtra("Transaction", user.getUsertransactions().get(getAdapterPosition()));
                toUpdateT.putExtra("Logged User", user);
                context.startActivity(toUpdateT);
            });

            deleteBtn.setOnClickListener(e->{
                tList.remove(getAdapterPosition());
                Intent toHome = new Intent(context, HomeActivity.class);
                toHome.putExtra("Logged User", user);
                context.startActivity(toHome);
            });

        }
    }
}
