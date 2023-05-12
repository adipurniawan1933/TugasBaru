package com.adipurniawan.recycleviewdancardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ViewHolder> {

    private ArrayList<ClubModel> clubModel;

    public ClubAdapter(ArrayList<ClubModel> clubModel) {
        this.clubModel = clubModel;
    }

    @NonNull
    @Override
    public ClubAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubAdapter.ViewHolder holder, int position) {
        holder.namaClub.setText(clubModel.get(position).getNamaClub());
        holder.logoClub.setImageResource(clubModel.get(position).getLogoClub());
    }

    @Override
    public int getItemCount() {
        return clubModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaClub;
        ImageView logoClub;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaClub = itemView.findViewById(R.id.nama_club);
            logoClub = itemView.findViewById(R.id.logo_club);

        }
    }
}
