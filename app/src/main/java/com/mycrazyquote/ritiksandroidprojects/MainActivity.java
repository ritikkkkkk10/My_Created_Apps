package com.mycrazyquote.ritiksandroidprojects;

import com.mycrazyquote.ritiksandroidprojects.Project;
import com.mycrazyquote.ritiksandroidprojects.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {new Project("BMI Calculator", "Calculates ones BMI index", R.drawable.calculator),
                new Project("The Hungry Developer", "Presents the menu for a restaurant", R.drawable.hungry_developer)};


        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);
    }
}