package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class mcu1temphumid extends AppCompatActivity {
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("hello");
        setContentView(R.layout.activity_mcu1temphumid);
        TextView temp1 = findViewById(R.id.temp);
        TextView temp2 = findViewById(R.id.temp4);
        TextView temp3 = findViewById(R.id.temp5);
        TextView temp4 = findViewById(R.id.temp16);
        // ethy4 = findViewById(R.id.ethy4);
        Button buttonreferesh = (Button) findViewById(R.id.refreshmcu1temp);
        Button buttonback = (Button) findViewById(R.id.backmcu1temp);
        Button buttongraph = (Button) findViewById(R.id.graphmcutemphumid);
        Button buttonhome = (Button) findViewById(R.id.homebutton7);
        DatabaseReference rootDatabaseref = FirebaseDatabase.getInstance().getReference().child("MCU Test").child("Humidity").child("1");
        DatabaseReference rootDatabaseref2 = FirebaseDatabase.getInstance().getReference().child("MCU Test").child("Temperature").child("1");
        DatabaseReference rootDatabaseref3 = FirebaseDatabase.getInstance().getReference().child("MCU Test2").child("Humidity").child("1");
        DatabaseReference rootDatabaseref4 = FirebaseDatabase.getInstance().getReference().child("MCU Test2").child("Temperature").child("1");
        //DatabaseReference rootDatabaseref4 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Ethylene").child("Sensor 4");
        buttonback.setOnClickListener(new View.OnClickListener() { //this section will allow the button to perform the method call when the button is pressed
            @Override
            public void onClick(View view) {
                openActivitymain();
            }
        });
        buttonreferesh.setOnClickListener(new View.OnClickListener() { //this section will allow the button to perform the method call when the button is pressed
            @Override
            public void onClick(View view) {
                openActivityrefresh();
            }
        });
        buttongraph.setOnClickListener(new View.OnClickListener() { //this section will allow the button to perform the method call when the button is pressed
            @Override
            public void onClick(View view) {
                openActivitygraph();
            }
        });
        buttonhome.setOnClickListener(new View.OnClickListener() { //this section will allow the button to perform the method call when the button is pressed
            @Override
            public void onClick(View view) {
                openActivityhome();
            }
        });
        rootDatabaseref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if((snapshot.getChildrenCount()== 0)) {
                    return;
                }
                int t = 0;
                int iterator = 0;
                double c = 0;

                double y;
                int x;
                x = -1;
                int arraysize = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    arraysize = arraysize + 1;
                }
                int[] time = new int[arraysize];
                double[] concentration = new double[arraysize];
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    time[iterator] = Integer.parseInt(snapshot1.child("7-Seconds").getValue().toString());//7-Seconds seconds
                    concentration[iterator] = Double.parseDouble(snapshot1.child("1-Concentration").getValue().toString());//1-Concentration concentration
                    iterator = iterator + 1;
                }
                t = time[0];
                c = concentration[arraysize-1];
                temp1.setText(String.valueOf(c));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if((snapshot.getChildrenCount()== 0)) {
                    return;
                }
                int t = 0;
                int iterator = 0;
                double c = 0;

                double y;
                int x;
                x = -1;
                int arraysize = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    arraysize = arraysize + 1;
                }
                int[] time = new int[arraysize];
                double[] concentration = new double[arraysize];
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    time[iterator] = Integer.parseInt(snapshot1.child("7-Seconds").getValue().toString());
                    concentration[iterator] = Double.parseDouble(snapshot1.child("1-Concentration").getValue().toString());
                    iterator = iterator + 1;
                }
                t = time[0];
                c = concentration[arraysize-1];
                temp2.setText(String.valueOf(c));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if((snapshot.getChildrenCount()== 0)) {
                    return;
                }
                int t = 0;
                int iterator = 0;
                double c = 0;

                double y;
                int x;
                x = -1;
                int arraysize = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    arraysize = arraysize + 1;
                }
                int[] time = new int[arraysize];
                double[] concentration = new double[arraysize];
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    time[iterator] = Integer.parseInt(snapshot1.child("7-Seconds").getValue().toString());
                    concentration[iterator] = Double.parseDouble(snapshot1.child("1-Concentration").getValue().toString());
                    iterator = iterator + 1;
                }
                t = time[0];
                c = concentration[arraysize-1];
                temp3.setText(String.valueOf(c));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if((snapshot.getChildrenCount()== 0)) {
                    return;
                }
                int t = 0;
                int iterator = 0;
                double c = 0;

                double y;
                int x;
                x = -1;
                int arraysize = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    arraysize = arraysize + 1;
                }
                int[] time = new int[arraysize];
                double[] concentration = new double[arraysize];
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    time[iterator] = Integer.parseInt(snapshot1.child("7-Seconds").getValue().toString());
                    concentration[iterator] = Double.parseDouble(snapshot1.child("1-Concentration").getValue().toString());
                    iterator = iterator + 1;
                }
                t = time[0];
                c = concentration[arraysize-1];
                temp4.setText(String.valueOf(c));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    public void openActivityrefresh(){
        Intent intent = new Intent(this, mcu1temphumid.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
    public void openActivitymain(){
        Intent intent = new Intent(this, Recycleviewtest.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
    public void openActivitygraph(){
        Intent intent = new Intent(this, mcu1temphumidgraph.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
    public void openActivityhome(){
        Intent intent = new Intent(this, MainActivity.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
}