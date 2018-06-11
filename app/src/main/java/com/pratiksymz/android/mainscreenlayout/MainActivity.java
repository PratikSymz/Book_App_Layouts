package com.pratiksymz.android.mainscreenlayout;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar mTopToolbar;
    private CardView mOption1Card, mOption2Card, mOption3Card, mOption4Card, mOption5Card;

    private List<CardView> mCardViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher_screen_layout);

//        mTopToolbar = findViewById(R.id.my_toolbar);
//        setSupportActionBar(mTopToolbar);

//        mCardViewList = new ArrayList<>();
//
        mOption1Card = findViewById(R.id.card_option_1);
        mOption1Card.setOnClickListener(this);
//        mCardViewList.add(mOption1Card);
//
//        mOption2Card = findViewById(R.id.card_option_2);
//        mOption2Card.setOnClickListener(this);
//        mCardViewList.add(mOption2Card);
//
//        mOption3Card = findViewById(R.id.card_option_3);
//        mOption3Card.setOnClickListener(this);
//        mCardViewList.add(mOption3Card);
//
//        mOption4Card = findViewById(R.id.card_option_4);
//        mOption4Card.setOnClickListener(this);
//        mCardViewList.add(mOption4Card);
//
//        mOption5Card = findViewById(R.id.card_option_5);
//        mOption5Card.setOnClickListener(this);
//        mCardViewList.add(mOption5Card);
//
//        // Initialize Animation:
//        final Animation cardPopInOut = AnimationUtils.loadAnimation(this, R.anim.card_view_scale_anim);
//        runOnUiThread(() -> {
//            for (int i = 0; i < mCardViewList.size(); i++) {
//                mCardViewList.get(i).startAnimation(cardPopInOut);
//            }
//        });

        Button closeButton = findViewById(R.id.close_app);
        closeButton.setOnClickListener(view -> finish());
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View alertDialogView = inflater.inflate(R.layout.layout_ocr_dialog, null);
        alertBuilder.setView(alertDialogView);

        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.show();
    }
}
