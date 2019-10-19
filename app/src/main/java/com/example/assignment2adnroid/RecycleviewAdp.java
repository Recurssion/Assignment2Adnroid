package com.example.assignment2adnroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleviewAdp extends RecyclerView.Adapter<RecycleviewAdp.ViewHolder>
{

    Context context;
    ArrayList<Student>students;
    LayoutInflater layoutInflater;

    RecycleviewAdp(Context context,ArrayList<Student> students)
    {
        this.context=context;
        this.students=students;
        layoutInflater= LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.list_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.idTv.setText(""+students.get(position).Id);
        holder.nameTv.setText(students.get(position).name);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView idTv,nameTv;
        public ViewHolder(View itemView)
        {
            super(itemView);
            idTv=itemView.findViewById(R.id.rvId);
            nameTv=itemView.findViewById(R.id.rvName);
        }
    }
}