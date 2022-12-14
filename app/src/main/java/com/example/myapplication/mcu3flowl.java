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

public class mcu3flowl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcu3flowl);
        TextView flowv1 = findViewById(R.id.flowv3);
        TextView flowv2 = findViewById(R.id.flowv4);
        //TextView flowv3 = findViewById(R.id.flowv3);
        //TextView flowv4 = findViewById(R.id.flowv4);
        Button buttonreferesh = (Button) findViewById(R.id.refreshmcu1maxflu3);
        Button buttonback = (Button) findViewById(R.id.backmcu1maxfl3);
        DatabaseReference rootDatabaseref = FirebaseDatabase.getInstance().getReference().child("MCU 3").child("Water Flow").child("Water Flow");
        DatabaseReference rootDatabaseref2 = FirebaseDatabase.getInstance().getReference().child("MCU 3").child("Water Level").child("Sensor 1");
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
        rootDatabaseref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String data = snapshot.getValue().toString();
                double z = Double.parseDouble(data);
                flowv1.setText(String.valueOf(z));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String data = snapshot.getValue().toString();
                double z = Double.parseDouble(data);
                flowv2.setText(String.valueOf(z));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    public void openActivityrefresh(){
        Intent intent = new Intent(this, mcu3flowl.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
    public void openActivitymain(){
        Intent intent = new Intent(this, MCU3.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
}