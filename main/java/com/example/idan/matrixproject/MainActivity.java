package com.example.idan.matrixproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout linearLayout1 = new LinearLayout(this);
        LinearLayout linearLayout2 = new LinearLayout(this);


        linearLayout.setOrientation(linearLayout.VERTICAL);
        linearLayout1.setOrientation(linearLayout1.HORIZONTAL);
        linearLayout2.setOrientation(linearLayout2.HORIZONTAL);

        LinearLayout.LayoutParams mainLayout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT
                , LinearLayout.LayoutParams.MATCH_PARENT);

        setContentView(linearLayout, mainLayout);


        LinearLayout.LayoutParams horizontalParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT
                , LinearLayout.LayoutParams.WRAP_CONTENT);

        linearLayout1.setLayoutParams(horizontalParams);
        linearLayout2.setLayoutParams(horizontalParams);


        TextView txtView = new TextView(this);
        txtView.setText("Matrix");
        txtView.setTextSize(50);


        linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        txtView.setGravity(Gravity.CENTER);

        linearLayout.addView(txtView);
        linearLayout.addView(linearLayout1, horizontalParams);
        linearLayout.addView(linearLayout2, horizontalParams);


        final Button[] button=new Button[4];

        for(int i=0;i<4;i++){
            button[i]= new Button(this);
        }

        for(int i=0;i<4;i++){
            button[i].setLayoutParams(horizontalParams);
        }

       button[0].setText("Upper part");
       button[0].setTextSize(20);
       button[1].setText("Diagnols");
       button[1].setTextSize(20);
       button[2].setText("Down part");
       button[2].setTextSize(20);
       button[3].setText("Border");
       button[3].setTextSize(20);

        for(int i=0;i<4;i++){
            if(i<2)
                linearLayout1.addView(button[i]);
            else if(i>=2&&i<4)
                linearLayout2.addView(button[i]);
        }

        TableLayout tableLayout = new TableLayout(this);
        TableLayout.LayoutParams tabLayParams = new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tabLayParams.gravity = Gravity.CENTER;


        final Button[][] btn = new Button[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            TableRow row = new TableRow(this);
            row.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < 3; j++) {

                btn[i][j] = new Button(this);
                btn[i][j].setText("");
                btn[i][j].setId(k);
                row.addView(btn[i][j], 360, 360);
            }
            tableLayout.addView(row);
        }
        linearLayout.addView(tableLayout, tabLayParams);
        setContentView(linearLayout);


    button[0].setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            //reset color for all Buttons
            for(int i=0;i<3;i++){
                for (int j=0;j<3;j++) {

                    btn[i][j].setBackgroundResource(android.R.drawable.btn_default);
                }
        }
            for(int i=0;i<3;i++){
                for (int j=0;j<3;j++) {
                    if(i==0){
                        btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                    }
                    if(j==0){
                        btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                    }
                    if(j==1&&i==1){
                        btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                    }
                }
            }
    };
});
        button[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //reset colours for all Buttons
                for(int i=0;i<3;i++){
                    for (int j=0;j<3;j++) {

                        btn[i][j].setBackgroundResource(android.R.drawable.btn_default);
                    }
                }
                for(int i=0;i<3;i++){
                    for (int j=0;j<3;j++) {
                        if(i==j){
                            btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                        }
                        if(j==2&&i==0){
                            btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                        }
                        if(i==2&&j==0){
                            btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                        }
                    }
                }
            };
        });
        button[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //reset colours for all Buttons
                for(int i=0;i<3;i++){
                    for (int j=0;j<3;j++) {

                        btn[i][j].setBackgroundResource(android.R.drawable.btn_default);
                    }
                }
                for(int i=0;i<3;i++){
                    for (int j=0;j<3;j++) {
                        if(i==2){
                            btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                        }
                        if(j==2){
                            btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                        }
                        if(j==1&&i==1){
                            btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                        }
                    }
                }
            };
        });
        button[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Paint all Buttons
                for(int i=0;i<3;i++){
                    for (int j=0;j<3;j++) {

                        btn[i][j].setBackground(getResources().getDrawable(R.drawable.btn_coloured,getTheme()));
                    }
                }
                for(int i=0;i<3;i++){
                    for (int j=0;j<3;j++) {
                        if(j==1&&i==1){
                            btn[i][j].setBackgroundResource(android.R.drawable.btn_default);                        }
                    }
                }
            };
        });
}
}