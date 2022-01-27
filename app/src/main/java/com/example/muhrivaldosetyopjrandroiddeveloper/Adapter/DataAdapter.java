package com.example.muhrivaldosetyopjrandroiddeveloper.Adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Contacts.GetData;
import com.example.muhrivaldosetyopjrandroiddeveloper.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.CustomViewHolder> {
    private List<GetData> dataList;
    private Context context;

    public DataAdapter(Context context, List<GetData> dataList){
        super();
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.list_item,parent,false);
        return new CustomViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull DataAdapter.CustomViewHolder holder, int position) {
        holder.firstName.setText(dataList.get(position).getFirstName());
        holder.lastName.setText(dataList.get(position).getLastName());
        holder.gender.setText(dataList.get(position).getGender());
        holder.email.setText(dataList.get(position).getEmail());
        Picasso.get()
                .load(Uri.parse(dataList.get(position).getAvatar()+".png"))
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round)
                .into(holder.imageUser);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView firstName, lastName, gender, email;
        ImageView imageUser;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.firstName);
            lastName = itemView.findViewById(R.id.lastName);
            gender = itemView.findViewById(R.id.gender);
            email = itemView.findViewById(R.id.email);
            imageUser = itemView.findViewById(R.id.imageUser);
        }
    }
}
