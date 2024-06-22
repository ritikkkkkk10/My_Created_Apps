package com.mycrazyquote.ritiksandroidprojects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder>
{
    private Project[] projects;
    public ProjectsAdapter(Project[] projects)
    {
        this.projects=projects;
    }
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project,parent,false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position)
    {
        holder.bind(projects[position]);
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder
    {
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;
        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage=itemView.findViewById(R.id.image_view_project_item);
            appTitle=itemView.findViewById(R.id.text_view_project_title);
            appDescription=itemView.findViewById(R.id.text_view_project_description);
        }

        public void bind(Project project) {
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }

    }
}
