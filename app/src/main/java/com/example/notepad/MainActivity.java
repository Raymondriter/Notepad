package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends FragmentActivity implements Communicate {

    FragmentTransaction transaction;
    BottomFragment frgBot;
    TopFragment frgTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frgTop = new TopFragment();
        frgBot = new BottomFragment();

        FragmentManager manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.top_fragment, frgTop, "Frag_top_tag");
        transaction.add(R.id.bottom_fragment, frgBot, "Frag_bot_tag");
        transaction.commit();
    }

    @Override
    public void sendData(String key) {

        String temp = frgBot.getData(key);
        frgTop.incrementData(temp);

    }
}
