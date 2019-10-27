package com.ismathlifehacks.mytodoapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoRecyclerViewAdapter extends RecyclerView.Adapter<TodoRecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> todoTitle;
    private ArrayList<String> todoDescription;
    private ArrayList<String> todoTime;
    private Context context;

    public TodoRecyclerViewAdapter(ArrayList<String> todoTitle, ArrayList<String> todoDescription, ArrayList<String> todoTime,Context context) {
        this.todoTitle = todoTitle;
        this.todoDescription = todoDescription;
        this.todoTime = todoTime;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.todo_listitems,parent,false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.todoTitle.setText(todoTitle.get(position));
        holder.todoDescription.setText(todoDescription.get(position));
        holder.todoTime.setText(todoTime.get(position));
    }

    @Override
    public int getItemCount() {
        return todoTitle.size();
    }


    protected class ViewHolder extends RecyclerView.ViewHolder{

        private TextView todoTitle;
        private TextView todoDescription;
        private TextView todoTime;

        public ViewHolder(View itemView) {
            super(itemView);

            todoTitle=itemView.findViewById(R.id.todo_title);
            todoTime=itemView.findViewById(R.id.todo_time);
            todoDescription=itemView.findViewById(R.id.todo_desc);

        }
    }

}
