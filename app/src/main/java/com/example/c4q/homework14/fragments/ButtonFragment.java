package com.example.c4q.homework14.fragments;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.c4q.homework14.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {
    private SharedPreferences sharedPreferences;
    private View rootView;
    private TextView savedfooditem;
    private Button savebutton;


    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_button, container, false);
        savedfooditem = rootView.findViewById(R.id.saved_food_textview);
        savebutton = rootView.findViewById(R.id.saved_food_button);
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        try {
            String jsonString = sharedPreferences.getString("saved", null);

            savebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(rootView.getContext(), "Item Saved", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Intent.ACTION_VIEW);

                    rootView.getContext().startActivity(intent);
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
