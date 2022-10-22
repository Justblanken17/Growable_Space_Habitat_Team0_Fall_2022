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

public class mcu1flowv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcu1flowv);
        TextView flowv1 = findViewById(R.id.flowv1);
        TextView flowv2 = findViewById(R.id.flowv12);
        //TextView flowv3 = findViewById(R.id.flowv3);
        //TextView flowv4 = findViewById(R.id.flowv4);
        Button buttonreferesh = (Button) findViewById(R.id.refreshmcu1maxflu);
        Button buttonback = (Button) findViewById(R.id.backmcu1maxfl);
        Button buttongraph = (Button) findViewById(R.id.graphmcuflowv1);
        DatabaseReference rootDatabaseref = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Water Flow").child("Sensor 1");
        DatabaseReference rootDatabaseref2 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Water Level").child("Sensor 1");
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
        rootDatabaseref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
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
                    time[iterator] = Integer.parseInt(snapshot1.child("time").getValue().toString());
                    concentration[iterator] = Double.parseDouble(snapshot1.child("concentration").getValue().toString());
                    iterator = iterator + 1;
                }
                t = time[0];
                c = concentration[arraysize-1];
                flowv1.setText(String.valueOf(c));
                //String data = snapshot.getValue().toString();
                //double z = Double.parseDouble(data);
                //flowv1.setText(String.valueOf(z));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                int t = 0;
                int iterator = 0;
                double c = 0;

                double y;
                int arraysize = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    arraysize = arraysize + 1;
                }
                int[] time = new int[arraysize];
                double[] concentration = new double[arraysize];
                int x;
                x = -1;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    time[iterator] = Integer.parseInt(snapshot1.child("time").getValue().toString());
                    concentration[iterator] = Double.parseDouble(snapshot1.child("concentration").getValue().toString());
                    iterator = iterator + 1;
                }
                t = time[0];
                c = concentration[0];
                flowv2.setText(String.valueOf(c));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }
    public void openActivityrefresh(){
        Intent intent = new Intent(this, mcu1flowv.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
    public void openActivitymain(){
        Intent intent = new Intent(this, Recycleviewtest.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }

    public void openActivitygraph(){
        Intent intent = new Intent(this, mcu1flowvgraph.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
}