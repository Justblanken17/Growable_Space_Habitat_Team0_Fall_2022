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

public class mcu4meth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcu4meth);
        TextView methy1 = findViewById(R.id.methane16);
        TextView methy2 = findViewById(R.id.methane17);
        TextView methy3 = findViewById(R.id.methane18);
        TextView methy4 = findViewById(R.id.methane19);
        Button buttonreferesh = (Button) findViewById(R.id.refreshmcu1methane4);
        Button buttonback = (Button) findViewById(R.id.backmcu1methane4);
        DatabaseReference rootDatabaseref = FirebaseDatabase.getInstance().getReference().child("MCU 4").child("Methane").child("Sensor 1");
        DatabaseReference rootDatabaseref2 = FirebaseDatabase.getInstance().getReference().child("MCU 4").child("Methane").child("Sensor 2");
        DatabaseReference rootDatabaseref3 = FirebaseDatabase.getInstance().getReference().child("MCU 4").child("Methane").child("Sensor 3");
        DatabaseReference rootDatabaseref4 = FirebaseDatabase.getInstance().getReference().child("MCU 4").child("Methane").child("Sensor 4");
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
                Double z = Double.parseDouble(data);
                methy1.setText(String.valueOf(z));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String data = snapshot.getValue().toString();
                Double z = Double.parseDouble(data);
                methy2.setText(String.valueOf(z));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String data = snapshot.getValue().toString();
                double z = Double.parseDouble(data);
                methy3.setText(String.valueOf(z));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String data = snapshot.getValue().toString();
                double z = Double.parseDouble(data);
                methy4.setText(String.valueOf(z));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    public void openActivityrefresh(){
        Intent intent = new Intent(this, mcu4meth.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
    public void openActivitymain(){
        Intent intent = new Intent(this, MCU4.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
}