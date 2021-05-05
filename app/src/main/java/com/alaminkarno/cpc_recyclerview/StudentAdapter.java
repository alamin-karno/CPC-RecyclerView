package com.alaminkarno.cpc_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    List<Student> students;
    Context context;

    public StudentAdapter(List<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_design_student,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student = students.get(position);

        holder.imageView.setImageResource(student.getImageView());
        holder.nameTV.setText(student.getName());
        holder.rollTV.setText(student.getRoll());
        holder.departmentTV.setText(student.getDepartment());
        holder.sectionTV.setText(student.getSection());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Item View click...", Toast.LENGTH_SHORT).show();
            }
        });


        holder.click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Button Click...", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTV,rollTV,departmentTV,sectionTV;
        Button click;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.model_imageView);
            nameTV = itemView.findViewById(R.id.model_nameTV);
            rollTV = itemView.findViewById(R.id.model_rollTV);
            departmentTV = itemView.findViewById(R.id.model_departmentTV);
            sectionTV = itemView.findViewById(R.id.model_sectionTV);
            click = itemView.findViewById(R.id.model_button);
        }
    }
}
