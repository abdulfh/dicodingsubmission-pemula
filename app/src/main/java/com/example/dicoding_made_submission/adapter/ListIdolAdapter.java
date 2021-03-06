package com.example.dicoding_made_submission.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.dicoding_made_submission.R;
import com.example.dicoding_made_submission.model.IdolModel;

import java.util.ArrayList;

public class ListIdolAdapter extends RecyclerView.Adapter<ListIdolAdapter.ListViewHolder> {

    private ArrayList<IdolModel> listIdol;

    private OnItemClickCallback onItemClickCallback;

    public ListIdolAdapter(ArrayList<IdolModel> list) {
        this.listIdol = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_idol, parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        IdolModel idolModel = listIdol.get(position);
        Glide.with(holder.itemView.getContext())
                .load(idolModel.getPhoto())
                .into(holder.imgPhoto);
        holder.tvName.setText(idolModel.getName());
        holder.tvDetail.setText(idolModel.getDetail());
        holder.tvBirthday.setText(idolModel.getBirthday());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listIdol.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listIdol.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvBirthday;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvBirthday = itemView.findViewById(R.id.tv_birthday);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(IdolModel idolModel);
    }
}
