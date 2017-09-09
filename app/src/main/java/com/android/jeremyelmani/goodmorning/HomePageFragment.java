package com.android.jeremyelmani.goodmorning;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by jeremyelmani on 9/9/17.
 */

public class HomePageFragment extends Fragment
{
    private Button editButton;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_home_page, container, false);
        init(v, container);
        return v;
    }

    private void init(View v, final ViewGroup container){
        editButton = (Button) v.findViewById(R.id.edit_button);

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment editFragment = new EditAlarmFragment();
                ((GoodMorningActivity)getActivity()).switchFragment(editFragment, container.getId());
            }
        });
    }
}
