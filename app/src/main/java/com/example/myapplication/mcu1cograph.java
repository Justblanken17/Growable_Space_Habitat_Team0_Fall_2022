package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.lang.Math;

public class mcu1cograph extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private int indication = 0;
    private int indication2 = 0;
    LineGraphSeries<DataPoint> seriessupersecond;
    GraphView graphz;
    int arraysizesecondglobal1;
    //int max = 0;
    double max = 0;
    int second1max = 0;
    LineGraphSeries<DataPoint> seriessuperminute1;
    int arraysizeglobalminute1;
    int arraysizeCHECKglobal;
    int minute1max = 0;
    LineGraphSeries<DataPoint> seriesghour1;
    int arraysizeglobalhour1;
    int hour1max = 0;
    LineGraphSeries<DataPoint> seriesgday1;
    int arraysizeglobalday1;
    int day1max = 0;
    LineGraphSeries<DataPoint> seriesgweek1;
    int arraysizeglobalweek1;
    int week1max = 0;
    LineGraphSeries<DataPoint> seriesgyear1;
    int arraysizeglobalyear1;
    int year1max = 0;
    LineGraphSeries<DataPoint> seriesgsecond2;
    int arraysizeglobalsecond2;
    int second2max = 0;
    LineGraphSeries<DataPoint> seriesgsuperminute2;
    int arraysizeglobalminute2;
    int minute2max = 0;
    LineGraphSeries<DataPoint> seriesghour2;
    int arraysizeglobalhour2;
    int hour2max = 0;
    LineGraphSeries<DataPoint> seriesgday2;
    int arraysizeglobalday2;
    int day2max = 0;
    LineGraphSeries<DataPoint> seriesgweek2;
    int arraysizeglobalweek2;
    int week2max = 0;
    LineGraphSeries<DataPoint> seriesgyear2;
    int arraysizeglobalyear2;
    int year2max = 0;
    LineGraphSeries<DataPoint> seriesgsecond3;
    int arraysizeglobalsecond3;
    int second3max = 0;
    LineGraphSeries<DataPoint> seriesgsuperminute3;
    int arraysizeglobalminute3;
    int minute3max = 0;
    LineGraphSeries<DataPoint> seriesghour3;
    int arraysizeglobalhour3;
    int hour3max = 0;
    LineGraphSeries<DataPoint> seriesgday3;
    int arraysizeglobalday3;
    int day3max = 0;
    LineGraphSeries<DataPoint> seriesgweek3;
    int arraysizeglobalweek3;
    int week3max = 0;
    LineGraphSeries<DataPoint> seriesgyear3;
    int arraysizeglobalyear3;
    int year3max = 0;
    LineGraphSeries<DataPoint> seriesgsecond4;
    int arraysizeglobalsecond4;
    int second4max = 0;
    LineGraphSeries<DataPoint> seriesgsuperminute4;
    int arraysizeglobalminute4;
    int minute4max = 0;
    LineGraphSeries<DataPoint> seriesghour4;
    int arraysizeglobalhour4;
    int hour4max = 0;
    LineGraphSeries<DataPoint> seriesgday4;
    int arraysizeglobalday4;
    int day4max = 0;
    LineGraphSeries<DataPoint> seriesgweek4;
    int arraysizeglobalweek4;
    int week4max = 0;
    LineGraphSeries<DataPoint> seriesgyear4;
    int arraysizeglobalyear4;
    int year4max;
    //GraphView graph1 = (GraphView) findViewById(R.id.graph);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        graphz = (GraphView) findViewById(R.id.graphth);
        setContentView(R.layout.activity_mcu1cograph);
        seriessupersecond = new LineGraphSeries<DataPoint>();
        //bull[0] = new DataPoint(0, 0);
        //seriessupersecond.appendData(bull[0], true, 2);

        Button buttonreferesh = (Button) findViewById(R.id.refreshmcu9);
        Button buttonback = (Button) findViewById(R.id.backmcu10);
        //Button buttonseconds = (Button) findViewById(R.id.secondstab);
        //Button buttonminutes = (Button) findViewById(R.id.minutestab);

        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.period, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0,false);
        spinner.setOnItemSelectedListener(this);
        DatabaseReference rootDatabaseref = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Monoxide").child("Sensor 1");
        DatabaseReference rootDatabaseref2 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Monoxide").child("Sensor 2");
        DatabaseReference rootDatabaseref3 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Monoxide").child("Sensor 3");
        DatabaseReference rootDatabaseref4 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Monoxide").child("Sensor 4");
        //DatabaseReference rootDatabaserefmin = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Dioxide").child("Sensor 1");
        //DatabaseReference rootDatabaserefmin2 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Dioxide").child("Sensor 2");
        //DatabaseReference rootDatabaserefmin3 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Dioxide").child("Sensor 3");
        //DatabaseReference rootDatabaserefmin4 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Dioxide").child("Sensor 4");
        //DatabaseReference rootDatabaserefhour = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Dioxide").child("Sensor 1");
        //DatabaseReference rootDatabaserefhour2 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Dioxide").child("Sensor 2");
        //DatabaseReference rootDatabaserefhour3 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Dioxide").child("Sensor 3");
        //DatabaseReference rootDatabaserefhour4 = FirebaseDatabase.getInstance().getReference().child("MCU 1").child("Carbon Dioxide").child("Sensor 4");
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
        /*
        buttonseconds.setOnClickListener(new View.OnClickListener() { //this section will allow the button to perform the method call when the button is pressed
            @Override
            public void onClick(View view) {
                openActivityrefresh();
            }
        }); */
        //buttonminutes.setOnClickListener(new View.OnClickListener() { //this section will allow the button to perform the method call when the button is pressed
        //    @Override
        //    public void onClick(View view) {
        //        openActivityminutes();
        //    }
        //});
        rootDatabaseref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                LineGraphSeries<DataPoint> series;
                LineGraphSeries<DataPoint> seriesminutes;
                LineGraphSeries<DataPoint> serieshours;
                LineGraphSeries<DataPoint> seriesday;
                LineGraphSeries<DataPoint> seriesweek;
                LineGraphSeries<DataPoint> seriesyear;

                LineGraphSeries<DataPoint> seriesB;
                LineGraphSeries<DataPoint> seriesminutesB;
                LineGraphSeries<DataPoint> serieshoursB;
                LineGraphSeries<DataPoint> seriesdayB;
                LineGraphSeries<DataPoint> seriesweekB;
                LineGraphSeries<DataPoint> seriesyearB;

                String data;// = snapshot.child();
                Double z;// = Double.parseDouble(data);
                // oxyg1.setText(S tring.valueOf(z));
                int t = 0;
                int iterator = 0;
                //double max = 0;
                double c = 0;
                double y;
                int x;
                //x = -1;
                int arraysize = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    arraysize = arraysize + 1;
                }
                int[] time = new int[arraysize];
                double minutediv = arraysize/60;                ///////////
                double hourdiv = arraysize/3600;
                double daydiv = arraysize/43200;
                double weekdiv = arraysize/302400;
                double yeardiv = arraysize/15768000;

                double minutesdoub = Math.floor(minutediv);     ///////////
                double hoursdoub = Math.floor(hourdiv);     ///////////
                double daydouble = Math.floor(daydiv);
                double weekdouble = Math.floor(weekdiv);
                double yearsdouble = Math.floor(yeardiv);

                int minutes = (int)minutesdoub;
                int hours = (int)hoursdoub;                 //////////
                int days = (int)daydouble;
                int weeks = (int)weekdouble;
                int years = (int)yearsdouble;

                int[] minutetime = new int[minutes];
                int[] hourtime = new int[hours];            //////////
                int[] daytime = new int[days];
                int[] weektime = new int[weeks];
                int[] yeartime = new int[years];



                int parsetogetsizes = 0;

                int[] minutetimeB = new int[arraysize];
                int[] hourtimeB = new int[arraysize];            //////////
                int[] daytimeB = new int[arraysize];
                int[] monthtimeB = new int[arraysize];
                int[] yeartimeB = new int[arraysize];

                int[] secondwindow = new int[60];
                int[] minutewindow = new int[60];
                for(int i = 0; i < 60; i++)
                {
                    secondwindow[i] = -1;
                    minutewindow[i] = -1;
                }
                int[] hourwindow = new int[24];            //////////
                for(int i = 0; i < 24; i++)
                {
                    hourwindow[i] = -1;

                }
                int[] daywindow = new int[32];
                for(int i = 0; i < 32; i++)
                {
                    daywindow[i] = -1;

                }
                int[] monthwindow = new int[13];
                for(int i = 0; i < 13; i++)
                {
                    monthwindow[i] = -1;

                }
                int[] yearwindow = new int[10];
                for(int i = 0; i < 10; i++)
                {
                    yearwindow[i] = -1;

                }
                double [] secconcentrationAVG = new double[60];
                double[] mintuteconcentrationAVG = new double[60]; ////// hold average values for each unit
                double[] hourconcentrationAVG = new double[24]; ////// hold average
                double[] dayconcenctrationAVG = new double[32]; //
                double[] weekconcenctrationAVG = new double[13];
                double[] yearsconcentrationAVG = new double[10];
                int iteratorB = 0;
                int minutiteratorB = 0;      ///////
                int houriteratorB = 0;      ///////
                int dayiteratorB = 0;
                int weekiteratorB = 0;
                int yeariteratorB = 0;




                double[] concentration = new double[arraysize];
                double[] mintuteconcentration = new double[minutes]; //////
                double[] hourconcentration = new double[hours]; //////
                double[] dayconcenctration = new double[days];
                double[] weekconcenctration = new double[weeks];
                double[] yearsconcentration = new double[years];

                int minutiterator = 0;      ///////
                int houriterator = 0;      ///////
                int dayiterator = 0;
                int weekiterator = 0;
                int yeariterator = 0;

                double averagesum = 0;

                seriesB = new LineGraphSeries<DataPoint>();
                seriesminutesB = new LineGraphSeries<DataPoint>();
                serieshoursB = new LineGraphSeries<DataPoint>();
                seriesdayB = new LineGraphSeries<DataPoint>();
                seriesweekB = new LineGraphSeries<DataPoint>();
                seriesyearB = new LineGraphSeries<DataPoint>();

                DataPoint[] aseriesB= new DataPoint[60];
                DataPoint[] aseriesminutesB= new DataPoint[60];
                DataPoint[] aserieshoursB= new DataPoint[24];
                DataPoint[] aseriesdayB= new DataPoint[32];
                DataPoint[] aseriesweekB= new DataPoint[13];
                DataPoint[] aseriesyearB= new DataPoint[10];
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    int secondssize = 0; //tells how much stuff is in a window
                    int minutessize = 0;
                    int hourssize = 0;
                    int dayssize = 0;
                    int monthssize = 0;
                    int yearssize = 0;

                    time[iterator] = Integer.parseInt(snapshot1.child("time").getValue().toString());
                    concentration[iterator] = Double.parseDouble(snapshot1.child("concentration").getValue().toString());
                    minutetimeB[iterator] = Integer.parseInt(snapshot1.child("minute").getValue().toString()); //////////////////////////////////
                    hourtimeB[iterator] = Integer.parseInt(snapshot1.child("hour").getValue().toString());     /////////////////////////////////
                    daytimeB[iterator] = Integer.parseInt(snapshot1.child("day").getValue().toString());       /////////////////////////////////
                    monthtimeB[iterator] = Integer.parseInt(snapshot1.child("month").getValue().toString());   /////////////////////////////////
                    yeartimeB[iterator] = Integer.parseInt(snapshot1.child("year").getValue().toString());
                    if(concentration[iterator] > max)
                    {
                        max = concentration[iterator];
                    }
                    //////////////////////////////////////////////A
                    //////////////////////////////////////////////
                    /////////////////////////////////////////////
                    for(int i = 0; i < 60; i++)
                    {
                        if(secondwindow[i] != -1)
                        {
                            secondssize = secondssize + 1;
                        }
                        if(minutewindow[i] != -1)
                        {
                            minutessize = minutessize + 1;
                        }
                    }

                    for(int i = 0; i < 24; i++)
                    {
                        if(hourwindow[i] != -1)
                        {
                            hourssize = hourssize + 1;
                        }

                    }

                    for(int i = 0; i < 32; i++)
                    {
                        if(daywindow[i] != -1)
                        {
                            dayssize = dayssize + 1;
                        }

                    }

                    for(int i = 0; i < 13; i++)
                    {
                        if(monthwindow[i] != -1 )
                        {
                            monthssize = monthssize + 1;
                        }
                    }

                    for(int i = 0; i < 10; i++)
                    {
                        if(yearwindow[i] != -1)
                        {
                            yearssize = yearssize + 1;
                        }

                    }
                    //controlling seconds and part of minutes arrays
                    if(time[iterator] == 0) //checks if time index is 0
                    {
                        if(iterator>0) {//iterator > 0 &&
                            if ( time[iterator - 1] == 59) //makes sure last point was 59 and your higher then 0
                            {
                                secondwindow[time[iterator]] = time[iterator];
                                secconcentrationAVG[time[iterator]] = concentration[iterator];
                                //reset all other values
                                for (int i = 1; i < 60; i++) {
                                    secondwindow[i] = -1;
                                    secconcentrationAVG[i] = 0;
                                }
                                //seriesB.resetData(aserieshoursB);
                                minutewindow[minutetimeB[iterator]] = minutetimeB[iterator]; // minutetimeB[iterator-1]  iterator-1


                                if (secondssize < 60) {               //iterator - (secondssize)
                                    for (int i = iterator - (secondssize); i < iterator; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + concentration[i];           ////
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    mintuteconcentrationAVG[minutetimeB[iterator]] = averagesum / secondssize; //iterator-1
                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[0]));
                                    //minutiteratorB = minutiteratorB + 1;


                                } else {
                                    for (int i = iterator - (secondssize); i < iterator; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + concentration[i];           ////
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    mintuteconcentrationAVG[minutetimeB[iterator]] = averagesum / 60; //iterator-1
                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[0]));
                                }
                            }
                        }
                        //ENDING STUFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
                        //end of checking if you passed the iteration
                        else
                        {
                            secondwindow[time[iterator]] = time[iterator];
                            secconcentrationAVG[time[iterator]] = concentration[iterator];
                            for(int i = iterator - (secondssize); i< iterator ; i++)        ////
                            {                                                         ////

                                averagesum = averagesum + concentration[i];           ////
                                ////
                                //buttonreferesh.setText(String.valueOf(secondssize));j
                            }
                            minutewindow[minutetimeB[iterator]] = minutetimeB[iterator];
                            mintuteconcentrationAVG[minutetimeB[iterator]] = averagesum/secondssize;

                            //buttonback.setText(String.valueOf(secondssize)); //mintuteconcentrationAVG[23]
                            averagesum = 0;
                            //buttonback.setText(String.valueOf(mintuteconcentrationAVG[0]));
                        }
                    }
                    else
                    {
                        secondwindow[time[iterator]] = time[iterator];
                        secconcentrationAVG[time[iterator]] = concentration[iterator];
                        for(int i = iterator - (secondssize); i< iterator ; i++)        ////
                        {                                                         ////

                            averagesum = averagesum + concentration[i];           ////
                            ////
                            //buttonreferesh.setText(String.valueOf(secondssize));j
                        }
                        minutewindow[minutetimeB[iterator]] = minutetimeB[iterator];
                        mintuteconcentrationAVG[minutetimeB[iterator]] = averagesum/secondssize;
                        //mintuteconcentrationAVG[23]
                        averagesum = 0;
                        //buttonback.setText(String.valueOf(mintuteconcentrationAVG[0]));//mintuteconcentrationAVG[23] FFFFF
                    }
                    //buttonback.setText(String.valueOf(mintuteconcentrationAVG[0]));
                    //buttonback.setText(String.valueOf(mintuteconcentrationAVG[0]));
                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[59]));
                    ///////////////CHANGE  TO MINUTES/HOURS

                    if(minutetimeB[iterator] == 0) //checks if time index is 0
                    {
                        if(iterator>0) {//iterator > 0 &&
                            if ( minutetimeB[iterator - 1] == 59) //makes sure last point was 59 and your higher then 0
                            {
                                //minutewindow[minutetimeB[iterator]] = minutetimeB[iterator];
                                //mintuteconcentrationAVG[minutetimeB[iterator]] = concentration[iterator]; //get back over here
                                //reset all other values

                                //seriesB.resetData(aserieshoursB);
                                hourwindow[hourtimeB[iterator-1]] = hourtimeB[iterator-1]; // minutetimeB[iterator-1]  iterator-1


                                if (minutessize < 60) {               //iterator - (secondssize)
                                    for (int i = 60 - (minutessize); i < 60; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + mintuteconcentrationAVG[i];           ///////BOOK MARK!
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    for (int i = 1; i < 60; i++) {
                                        minutewindow[i] = -1;
                                        mintuteconcentrationAVG[i] = 0;
                                    }

                                    hourconcentrationAVG[hourtimeB[iterator-1]] = averagesum / minutessize; //iterator-1
                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(hourconcentrationAVG[12])); THIS ONE FIXS IT
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[22]));
                                    //buttonreferesh.setText(String.valueOf(iterator));
                                    //minutiteratorB = minutiteratorB + 1;


                                } else {
                                    for (int i = 0; i < 60; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + mintuteconcentrationAVG[i];           ////
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    hourconcentrationAVG[hourtimeB[iterator-1]] = averagesum / 60; //iterator-1

                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[22]));
                                }
                            }
                            else
                            {
                                for(int i = 0; i < 60; i++)        ////60 - (minutessize)    60
                                {                                                         ////

                                    averagesum = averagesum + mintuteconcentrationAVG[i];           ////
                                    ////
                                    //buttonreferesh.setText(String.valueOf(secondssize));j
                                }
                                hourwindow[hourtimeB[iterator]] = hourtimeB[iterator];
                                hourconcentrationAVG[hourtimeB[iterator]] = averagesum/minutessize;
                                //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[0]));
                                //buttonback.setText(String.valueOf(secondssize)); //mintuteconcentrationAVG[23]
                                averagesum = 0;

                            }
                        }

                        //ENDING STUFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
                        //end of checking if you passed the iteration
                        else
                        {

                            for(int i = 0; i < 60; i++)        ////////60 - (minutessize)    60
                            {                                                         ////

                                averagesum = averagesum + mintuteconcentrationAVG[i];           ////
                                ////
                                //buttonreferesh.setText(String.valueOf(secondssize));j
                            }
                            hourwindow[hourtimeB[iterator]] = hourtimeB[iterator];
                            hourconcentrationAVG[hourtimeB[iterator]] = averagesum/minutessize;
                            //buttonback.setText(String.valueOf(secondssize)); //mintuteconcentrationAVG[23]
                            averagesum = 0;

                            //buttonback.setText(String.valueOf(mintuteconcentrationAVG[23]));
                        }
                    }
                    ///////////////CHANGE  TO MINUTES/HOURS

                    else
                    {
                        //secondwindow[time[iterator]] = time[iterator];
                        //secconcentrationAVG[time[iterator]] = concentration[iterator];
                        for(int i = 0; i < 60; i++)        ////
                        {                                                         ////

                            averagesum = averagesum + mintuteconcentrationAVG[i];           ////
                            ////
                            //buttonreferesh.setText(String.valueOf(secondssize));
                        }
                        hourwindow[hourtimeB[iterator]] = hourtimeB[iterator];
                        hourconcentrationAVG[hourtimeB[iterator]] = averagesum/minutessize;
                        //buttonreferesh.setText(String.valueOf(hourconcentrationAVG[11]));
                        //buttonback.setText(String.valueOf(mintuteconcentrationAVG[23])); //mintuteconcentrationAVG[23]
                        averagesum = 0;
                        //buttonreferesh.setText(String.valueOf(iterator));
                        //buttonback.setText(String.valueOf(hourconcentrationAVG[11]));
                    }
                    //buttonreferesh.setText(String.valueOf(iterator));
                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[0]));
                    //buttonback.setText(String.valueOf(hourconcentrationAVG[11]));
                    //buttonreferesh.setText(String.valueOf(hourconcentrationAVG[12]));
                    //////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Hours/Days
                    if(hourtimeB[iterator] == 0) //checks if time index is 0
                    {
                        if(iterator>0) {//iterator > 0 &&
                            if ( hourtimeB[iterator - 1] == 23) //makes sure last point was 59 and your higher then 0
                            {
                                //minutewindow[minutetimeB[iterator]] = minutetimeB[iterator];
                                //mintuteconcentrationAVG[minutetimeB[iterator]] = concentration[iterator]; //get back over here
                                //reset all other values

                                //seriesB.resetData(aserieshoursB);
                                daywindow[daytimeB[iterator-1]] = daytimeB[iterator-1]; // minutetimeB[iterator-1]  iterator-1

                                //GO BACK
                                if (hourssize < 24) {               //iterator - (secondssize)
                                    for (int i = 24 - (hourssize); i < 24; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + hourconcentrationAVG[i];           ///////BOOK MARK!
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    for (int i = 1; i < 24; i++) {
                                        hourwindow[i] = -1;
                                        hourconcentrationAVG[i] = 0;
                                    }

                                    dayconcenctrationAVG[daytimeB[iterator-1]] = averagesum / hourssize; //iterator-1
                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(hourconcentrationAVG[12])); THIS ONE FIXS IT
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[22]));
                                    //buttonreferesh.setText(String.valueOf(iterator));
                                    //minutiteratorB = minutiteratorB + 1;


                                } else {
                                    for (int i = 0; i < 24; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + hourconcentrationAVG[i];           ////
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    dayconcenctrationAVG[daytimeB[iterator-1]] = averagesum /24; //iterator-1

                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[22]));
                                }
                            }
                            else
                            {
                                for(int i = 0; i < hourwindow.length; i++)        ////60 - (minutessize)    60
                                {                                                         ////

                                    averagesum = averagesum + hourconcentrationAVG[i];           ////
                                    ////
                                    //buttonreferesh.setText(String.valueOf(secondssize));j
                                }
                                daywindow[daytimeB[iterator]] = daytimeB[iterator];
                                dayconcenctrationAVG[daytimeB[iterator]] = averagesum/hourssize;
                                //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[0]));
                                //buttonback.setText(String.valueOf(secondssize)); //mintuteconcentrationAVG[23]
                                averagesum = 0;

                            }
                        }

                        else
                        {

                            for(int i = 0; i < hourwindow.length; i++)        ////////60 - (minutessize)    60
                            {                                                         ////

                                if(hourwindow[i] != -1) {
                                    averagesum = averagesum + hourconcentrationAVG[i];           ////
                                    ////
                                }         ////
                                ////
                                //buttonreferesh.setText(String.valueOf(secondssize));j
                            }
                            daywindow[daytimeB[iterator]] = daytimeB[iterator];
                            dayconcenctrationAVG[daytimeB[iterator]] = averagesum/hourssize;
                            //buttonback.setText(String.valueOf(secondssize)); //mintuteconcentrationAVG[23]
                            averagesum = 0;

                            //buttonback.setText(String.valueOf(mintuteconcentrationAVG[23]));
                        }
                    }


                    else
                    {
                        //secondwindow[time[iterator]] = time[iterator];
                        //secconcentrationAVG[time[iterator]] = concentration[iterator];
                        for(int i = 0; i < hourwindow.length; i++)        ////
                        {                                                         ////

                            if(hourwindow[i] != -1) {
                                averagesum = averagesum + hourconcentrationAVG[i];           ////
                                ////
                            }           ////
                            ////
                            //buttonreferesh.setText(String.valueOf(secondssize));
                        }
                        daywindow[daytimeB[iterator]] = daytimeB[iterator];
                        dayconcenctrationAVG[daytimeB[iterator]] = averagesum/hourssize;
                        //buttonreferesh.setText(String.valueOf(hourconcentrationAVG[11]));
                        //buttonback.setText(String.valueOf(mintuteconcentrationAVG[23])); //mintuteconcentrationAVG[23]
                        averagesum = 0;
                        //buttonreferesh.setText(String.valueOf(iterator));
                        //buttonback.setText(String.valueOf(hourconcentrationAVG[11]));
                    }
                    //checkpoint//849
                    //buttonreferesh.setText(String.valueOf(daywindow[3]));
                    //buttonback.setText(String.valueOf(daywindow[2]));

                    //////////////////////////////////////////////////////////////////////////////////
                    //////////    day/month

                    if(daytimeB[iterator] == 1) //checks if time index is 0
                    {
                        if(iterator>0) {//iterator > 0 &&
                            if ( (daytimeB[iterator - 1] == 29) || (daytimeB[iterator - 1] == 30) || (daytimeB[iterator - 1] == 31)) //makes sure last point was 59 and your higher then 0
                            {
                                //minutewindow[minutetimeB[iterator]] = minutetimeB[iterator];
                                //mintuteconcentrationAVG[minutetimeB[iterator]] = concentration[iterator]; //get back over here
                                //reset all other values

                                //seriesB.resetData(aserieshoursB);
                                monthwindow[monthtimeB[iterator-1]] = monthtimeB[iterator-1]; // minutetimeB[iterator-1]  iterator-1

                                //CHANGE STUFF OVER HERE
                                if (dayssize < daytimeB[iterator - 1]) {               //iterator - (secondssize)
                                    for (int i = daytimeB[iterator - 1] - (dayssize); i < daytimeB[iterator - 1] + 1; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + dayconcenctrationAVG[i];           ///////BOOK MARK!
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    for (int i = 1; i < daytimeB[iterator - 1] + 1; i++) {
                                        daywindow[i] = -1;
                                        dayconcenctrationAVG[i] = 0;
                                    }

                                    weekconcenctrationAVG[monthtimeB[iterator-1]] = averagesum / dayssize; //iterator-1 COME BACK HERE!!!!!!
                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(hourconcentrationAVG[12])); THIS ONE FIXS IT
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[22]));
                                    //buttonreferesh.setText(String.valueOf(iterator));
                                    //minutiteratorB = minutiteratorB + 1;


                                } else {
                                    for (int i = 1; i < daytimeB[iterator - 1] + 1; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + dayconcenctrationAVG[i];           ////
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    weekconcenctrationAVG[monthtimeB[iterator-1]] = averagesum /daytimeB[iterator - 1]; //iterator-1

                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[22]));
                                }
                            }
                            else
                            {
                                for(int i = 1; i < daytimeB[iterator - 1] + 1; i++)        ////60 - (minutessize)    60
                                {                                                         ////

                                    averagesum = averagesum + dayconcenctrationAVG[i];           ////
                                    ////
                                    //buttonreferesh.setText(String.valueOf(secondssize));j
                                }
                                monthwindow[monthtimeB[iterator]] = monthtimeB[iterator];
                                weekconcenctrationAVG[monthtimeB[iterator]] = averagesum/dayssize;
                                //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[0]));
                                //buttonback.setText(String.valueOf(secondssize)); //mintuteconcentrationAVG[23]
                                averagesum = 0;

                            }
                        }

                        else
                        {

                            for(int i = 1; i < daywindow.length; i++)        ////////60 - (minutessize)    60
                            {                                                         ////

                                if(daywindow[i] != -1) {
                                    averagesum = averagesum + dayconcenctrationAVG[i];           ////
                                    ////
                                }          ////
                                ////
                                //buttonreferesh.setText(String.valueOf(secondssize));j
                            }
                            monthwindow[monthtimeB[iterator]] = monthtimeB[iterator];
                            weekconcenctrationAVG[monthtimeB[iterator]] = averagesum/dayssize;
                            //buttonback.setText(String.valueOf(secondssize)); //mintuteconcentrationAVG[23]
                            averagesum = 0;

                            //buttonback.setText(String.valueOf(mintuteconcentrationAVG[23]));
                        }
                    }


                    else
                    {
                        //secondwindow[time[iterator]] = time[iterator];
                        //secconcentrationAVG[time[iterator]] = concentration[iterator];
                        for(int i = 1; i < daywindow.length; i++)         ////dayssize
                        {                                                         ////
                            if(daywindow[i] != -1) {
                                averagesum = averagesum + dayconcenctrationAVG[i];           ////
                                ////
                            }
                            //buttonreferesh.setText(String.valueOf(secondssize));
                        }
                        monthwindow[monthtimeB[iterator]] = monthtimeB[iterator];
                        weekconcenctrationAVG[monthtimeB[iterator]] = averagesum/dayssize;
                        //buttonreferesh.setText(String.valueOf(hourconcentrationAVG[11]));
                        //buttonback.setText(String.valueOf(mintuteconcentrationAVG[23])); //mintuteconcentrationAVG[23]
                        averagesum = 0;
                        //buttonreferesh.setText(String.valueOf(iterator));
                        //buttonback.setText(String.valueOf(dayssize));
                        //buttonreferesh.setText(String.valueOf(weekconcenctrationAVG[11]));
                    }
                    //buttonback.setText(String.valueOf(dayconcenctrationAVG[2]));
                    //buttonreferesh.setText(String.valueOf(weekconcenctrationAVG[11]));
                    //buttonback.setText(String.valueOf(weekconcenctrationAVG[11]));

                    ////////////////////////////////////////MONTH TO YEAR//////////////////////////////////////
                    if(monthtimeB[iterator] == 1) //checks if time index is 0
                    {
                        if(iterator>0) {//iterator > 0 &&
                            if ( (monthtimeB[iterator - 1] == 12) ) //makes sure last point was 59 and your higher then 0
                            {
                                //minutewindow[minutetimeB[iterator]] = minutetimeB[iterator];
                                //mintuteconcentrationAVG[minutetimeB[iterator]] = concentration[iterator]; //get back over here
                                //reset all other values

                                //seriesB.resetData(aserieshoursB);
                                yearwindow[yeartimeB[iterator-1]-2021] = yeartimeB[iterator-1]-2000; // minutetimeB[iterator-1]  iterator-1

                                //CHANGE STUFF OVER HERE
                                if (monthssize < 12) {               //iterator - (secondssize)
                                    for (int i = monthtimeB[iterator - 1] - (monthssize); i < monthtimeB[iterator - 1] + 1; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + weekconcenctrationAVG[i];           ///////BOOK MARK!
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    for (int i = 1; i < monthtimeB[iterator - 1] + 1; i++) {
                                        monthwindow[i] = -1;
                                        weekconcenctrationAVG[i] = 0;
                                    }

                                    yearsconcentrationAVG[yeartimeB[iterator-1]-2021] = averagesum / monthssize; //iterator-1 COME BACK HERE!!!!!!
                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(hourconcentrationAVG[12])); THIS ONE FIXS IT
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[22]));
                                    //buttonreferesh.setText(String.valueOf(iterator));
                                    //minutiteratorB = minutiteratorB + 1;


                                } else {
                                    for (int i = 1; i < monthtimeB[iterator - 1] + 1; i++)        ////
                                    {                                                         ////

                                        averagesum = averagesum + weekconcenctrationAVG[i];           ////
                                        ////
                                        //buttonreferesh.setText(String.valueOf(secondssize));
                                    }
                                    yearsconcentrationAVG[yeartimeB[iterator-1]-2021] = averagesum /12; //iterator-1

                                    averagesum = 0;
                                    //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[22]));
                                }
                            }
                            else
                            {
                                for(int i = 1; i < monthtimeB[iterator - 1] + 1; i++)        ////60 - (minutessize)    60
                                {                                                         ////

                                    averagesum = averagesum + weekconcenctrationAVG[i];           ////
                                    ////
                                    //buttonreferesh.setText(String.valueOf(secondssize));j
                                }
                                yearwindow[yeartimeB[iterator]-2021] = yeartimeB[iterator]-2000;
                                yearsconcentrationAVG[yeartimeB[iterator]-2021] = averagesum/monthssize;
                                //buttonreferesh.setText(String.valueOf(mintuteconcentrationAVG[0]));
                                //buttonback.setText(String.valueOf(secondssize)); //mintuteconcentrationAVG[23]
                                averagesum = 0;

                            }
                        }

                        else
                        {

                            for(int i = 1; i < monthwindow.length; i++)        ////////60 - (minutessize)    60
                            {                                                         ////

                                if(monthwindow[i] != -1) {
                                    averagesum = averagesum + weekconcenctrationAVG[i];           ////
                                    ////
                                }          ////
                                ////
                                //buttonreferesh.setText(String.valueOf(secondssize));j
                            }
                            yearwindow[yeartimeB[iterator]-2021] = yeartimeB[iterator]-2000;
                            yearsconcentrationAVG[yeartimeB[iterator]-2021] = averagesum/monthssize;
                            //buttonback.setText(String.valueOf(secondssize)); //mintuteconcentrationAVG[23]
                            averagesum = 0;

                            //buttonback.setText(String.valueOf(mintuteconcentrationAVG[23]));
                        }
                    }


                    else
                    {
                        //secondwindow[time[iterator]] = time[iterator];
                        //secconcentrationAVG[time[iterator]] = concentration[iterator];
                        for(int i = 1; i < monthwindow.length; i++)         ////dayssize
                        {                                                         ////
                            if(monthwindow[i] != -1) {
                                averagesum = averagesum + weekconcenctrationAVG[i];           ////
                                ////
                            }
                            //buttonreferesh.setText(String.valueOf(secondssize));
                        }
                        yearwindow[yeartimeB[iterator]-2021] = yeartimeB[iterator]-2000;
                        yearsconcentrationAVG[yeartimeB[iterator]-2021] = averagesum/monthssize;
                        //buttonreferesh.setText(String.valueOf(hourconcentrationAVG[11]));
                        //buttonback.setText(String.valueOf(mintuteconcentrationAVG[23])); //mintuteconcentrationAVG[23]
                        averagesum = 0;
                        //buttonreferesh.setText(String.valueOf(iterator));
                        //buttonback.setText(String.valueOf(dayssize));
                        //buttonreferesh.setText(String.valueOf(weekconcenctrationAVG[11]));
                    }
                    //buttonback.setText(String.valueOf(monthwindow[12]));
                    //buttonreferesh.setText(String.valueOf(weekconcenctrationAVG[12]));
                    buttonback.setText(String.valueOf(yearwindow[1]));
                    buttonreferesh.setText(String.valueOf(yearsconcentrationAVG[1]));
                    //buttonreferesh.setText(String.valueOf(yearsconcentrationAVG[12]));
                    ////////////////////////////////////////MONTH TO YEAR//////////////////////////////////////
                    ///////////////////////////////////////////// NEW STUFF2
                    ////////////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////
                    if((iterator+1)%60==0)                                        /////
                    {                                                             /////
                        minutetime[minutiterator] = minutiterator;                ////
                        for(int i = (iterator-59); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        mintuteconcentration[minutiterator] = averagesum/60;      ////
                        averagesum = 0;
                        minutiterator = minutiterator + 1;////

                    }
                    if((iterator+1)%3600==0)                                        /////
                    {                                                             /////
                        hourtime[houriterator] = houriterator;                ////
                        for(int i = (iterator-3599); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        hourconcentration[houriterator] = averagesum/3600;      ////
                        averagesum = 0;
                        houriterator = houriterator + 1;////

                    }
                    if((iterator+1)%43200==0)                                        /////
                    {                                                             /////
                        daytime[dayiterator] = dayiterator;                ////
                        for(int i = (iterator-43199); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        dayconcenctration[dayiterator] = averagesum/43200;      ////
                        averagesum = 0;
                        dayiterator = dayiterator + 1;////

                    }
                    if((iterator+1)%302400==0)                                        /////
                    {                                                             /////
                        weektime[weekiterator] = weekiterator;                ////
                        for(int i = (iterator-302399); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        weekconcenctration[weekiterator] = averagesum/302400;      ////
                        averagesum = 0;
                        weekiterator = weekiterator + 1;////

                    }
                    if((iterator+1)%1576800==0)                                        /////
                    {                                                             /////
                        yeartime[yeariterator] = yeariterator;                ////
                        for(int i = (iterator-1576799); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        yearsconcentration[yeariterator] = averagesum/1576800;      ////
                        averagesum = 0;
                        yeariterator = yeariterator + 1;////

                    }

                    iterator = iterator + 1;
                }
                ///////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////////////////////////////////////////////////////////////////
                int whilecheck = 0;
                for(int i = 0; i < 60; i++)
                {

                    if(secondwindow[i] != -1)
                    {                   //secondwindow[i]
                        aseriesB[whilecheck] = new DataPoint(secondwindow[i], secconcentrationAVG[i] );
                        seriesB.appendData( aseriesB[whilecheck], true, 100);
                        whilecheck = whilecheck + 1;
                    }
                }

                int whilecheck2 = 0;
                for(int i = 0; i < 60; i++)
                {

                    if(minutewindow[i] != -1)
                    {                   //secondwindow[i]
                        aseriesminutesB[whilecheck2] = new DataPoint(minutewindow[i], mintuteconcentrationAVG[i] );
                        seriesminutesB.appendData( aseriesminutesB[whilecheck2], true, 100);
                        whilecheck2 = whilecheck2 + 1;
                    }
                }

                int whilecheck3 = 0;
                for(int i = 0; i < 24; i++)
                {

                    if(hourwindow[i] != -1)
                    {                   //secondwindow[i]
                        aserieshoursB[whilecheck3] = new DataPoint(hourwindow[i], hourconcentrationAVG[i] );
                        serieshoursB.appendData( aserieshoursB[whilecheck3], true, 100);
                        whilecheck3 = whilecheck3 + 1;
                    }
                }
                int whilecheck4 = 0;
                for(int i = 0; i < 32; i++)
                {

                    if(daywindow[i] != -1)
                    {                   //secondwindow[i]
                        aseriesdayB[whilecheck4] = new DataPoint(daywindow[i], dayconcenctrationAVG[i] );
                        seriesdayB.appendData( aseriesdayB[whilecheck4], true, 100);
                        whilecheck4 = whilecheck4 + 1;
                    }
                }

                int whilecheck5 = 0;
                for(int i = 0; i < 13; i++)
                {

                    if(monthwindow[i] != -1)
                    {                   //secondwindow[i]
                        aseriesweekB[whilecheck5] = new DataPoint(monthwindow[i], weekconcenctrationAVG[i] );
                        seriesweekB.appendData( aseriesweekB[whilecheck5], true, 100);
                        whilecheck5 = whilecheck5 + 1;
                    }
                }

                int whilecheck6 = 0;
                for(int i = 0; i < 10; i++)
                {

                    if(yearwindow[i] != -1)
                    {                   //secondwindow[i]
                        aseriesyearB[whilecheck6] = new DataPoint(yearwindow[i], yearsconcentrationAVG[i] );
                        seriesyearB.appendData( aseriesyearB[whilecheck6], true, 100);
                        whilecheck6 = whilecheck6 + 1;
                    }
                }
                ////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////////////////////////////////////////////

                t = time[0];
                c = concentration[0];
                //oxyg1.setText(String.valueOf(c));
                GraphView graph = (GraphView) findViewById(R.id.graphth);
                //GraphView graph2 = (GraphView) findViewById(R.id.graph);
                series = new LineGraphSeries<DataPoint>();
                seriesminutes = new LineGraphSeries<DataPoint>();
                serieshours = new LineGraphSeries<DataPoint>();
                double g = 0;
                String ge;
                DataPoint[] a = new DataPoint[arraysize];
                DataPoint[] aminutes = new DataPoint[minutes];
                for(int i = 0; i < minutes; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aminutes[i] = new DataPoint(minutetime[i], mintuteconcentration[i]);       ////

                    //seriesminutes.appendData(aminutes[i], true, minutes + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                //if(series.)
                for(int i = 0; i < arraysize; i++) {
                    //protected(series.resetData(new DataPoint[] {}));
                    a[i] = new DataPoint(time[i], concentration[i]);
                    //graph.onDataChanged(true,true);
                    //series.appendData(a[i], true, arraysize + 40);
                    //graph.onDataChanged(true,true);
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                DataPoint[] ahours = new DataPoint[hours];  ///////
                for(int i = 0; i < hours; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    ahours[i] = new DataPoint(hourtime[i], hourconcentration[i]);       ////

                    //serieshours.appendData(ahours[i], true, hours + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }


                seriesday = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] aday= new DataPoint[days];  ///////

                //if(series.)
                for(int i = 0; i < days; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aday[i] = new DataPoint(daytime[i], dayconcenctration[i]);       ////

                    //seriesday.appendData(aday[i], true, days + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }

                seriesweek = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] aweek= new DataPoint[weeks];  ///////

                //if(series.)
                for(int i = 0; i < weeks; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aweek[i] = new DataPoint(weektime[i], weekconcenctration[i]);       ////

                    //seriesweek.appendData(aweek[i], true, weeks + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }

                seriesyear = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] ayear= new DataPoint[years];  ///////

                //if(series.)
                for(int i = 0; i < years; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    ayear[i] = new DataPoint(yeartime[i], yearsconcentration[i]);       ////

                    //seriesyear.appendData(ayear[i], true, years + 3);    ////
                    graph.onDataChanged(true,true);

                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }

                seriessupersecond = seriesB;
                seriessuperminute1 = seriesminutesB;
                seriesghour1 = serieshoursB;
                seriesgday1 = seriesdayB;
                seriesgweek1 = seriesweekB;
                seriesgyear1 = seriesyearB;
                arraysizeCHECKglobal = arraysize;
                arraysizesecondglobal1 = arraysize;
                arraysizeglobalminute1 = minutes;
                arraysizeglobalhour1 = hours;
                arraysizeglobalday1 = days;
                arraysizeglobalweek1 = weeks;
                arraysizeglobalyear1 = years;
                graph = (GraphView) findViewById(R.id.graphth);
                opentesting();


                /*
                if(indication == 2)
                {
                    graph.setTitle("         CO2 Sensor 1");
                    graph.setTitleTextSize(25);
                    graph.removeAllSeries();

                    graph.addSeries(seriesghour1);
                    GridLabelRenderer griLa = graph.getGridLabelRenderer();
                    LineGraphSeries lil = seriesghour1;
                    lil.setThickness(2);
                    griLa.setHorizontalAxisTitle("              hours");
                    griLa.setHorizontalAxisTitleTextSize(20);
                    griLa.setVerticalAxisTitle("ppm");
                    griLa.setLabelVerticalWidth(43);
                    griLa.setLabelVerticalWidth(55);
                    //griLa.setH;
                    griLa.setVerticalAxisTitleTextSize(20);
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setYAxisBoundsManual(true);
                    if(hours<10)
                    {
                        graph.getViewport().setMinX(0);
                        graph.getViewport().setMaxX(10);
                    }
                    else
                    {
                        graph.getViewport().setMinX(hours-10);
                        graph.getViewport().setMaxX(hours);
                    }
                    graph.getViewport().setMaxY(max + .2*max);
                    graph.getViewport().setMinY(0);
                }

                if(indication == 3)
                {
                    graph.setTitle("         CO2 Sensor 1");
                    graph.setTitleTextSize(25);
                    graph.removeAllSeries();
                    graph.addSeries(seriesgday1);
                    GridLabelRenderer griLa = graph.getGridLabelRenderer();
                    LineGraphSeries lil = seriesgday1;
                    lil.setThickness(2);
                    griLa.setHorizontalAxisTitle("              days");
                    griLa.setHorizontalAxisTitleTextSize(20);
                    griLa.setVerticalAxisTitle("ppm");
                    griLa.setLabelVerticalWidth(43);
                    griLa.setLabelVerticalWidth(55);
                    //griLa.setH;
                    griLa.setVerticalAxisTitleTextSize(20);
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setYAxisBoundsManual(true);
                    if(days<10)
                    {
                        graph.getViewport().setMinX(0);
                        graph.getViewport().setMaxX(10);
                    }
                    else
                    {
                        graph.getViewport().setMinX(days-10);
                        graph.getViewport().setMaxX(days);
                    }
                    graph.getViewport().setMaxY(max + .2*max);
                    graph.getViewport().setMinY(0);
                }

                if(indication == 4)
                {
                    graph.setTitle("         CO2 Sensor 1");
                    graph.setTitleTextSize(25);
                    graph.removeAllSeries();
                    graph.addSeries(seriesgweek1);
                    GridLabelRenderer griLa = graph.getGridLabelRenderer();
                    LineGraphSeries lil = seriesgweek1;
                    lil.setThickness(2);
                    griLa.setHorizontalAxisTitle("              weeks");
                    griLa.setHorizontalAxisTitleTextSize(20);
                    griLa.setVerticalAxisTitle("ppm");
                    griLa.setLabelVerticalWidth(43);
                    griLa.setLabelVerticalWidth(55);
                    //griLa.setH;
                    griLa.setVerticalAxisTitleTextSize(20);
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setYAxisBoundsManual(true);
                    if(weeks<10)
                    {
                        graph.getViewport().setMinX(0);
                        graph.getViewport().setMaxX(10);
                    }
                    else
                    {
                        graph.getViewport().setMinX(weeks-10);
                        graph.getViewport().setMaxX(weeks);
                    }
                    graph.getViewport().setMaxY(max + .2*max);
                    graph.getViewport().setMinY(0);
                }


                if(indication == 5)
                {
                    graph.setTitle("         CO2 Sensor 1");
                    graph.setTitleTextSize(25);
                    graph.removeAllSeries();
                    graph.addSeries(seriesgyear1);

                    GridLabelRenderer griLa = graph.getGridLabelRenderer();
                    LineGraphSeries lil = seriesgyear1;
                    lil.setThickness(2);
                    griLa.setHorizontalAxisTitle("              years");
                    griLa.setHorizontalAxisTitleTextSize(20);
                    griLa.setVerticalAxisTitle("ppm");
                    griLa.setLabelVerticalWidth(43);
                    griLa.setLabelVerticalWidth(55);
                    //griLa.setH;
                    griLa.setVerticalAxisTitleTextSize(20);
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setYAxisBoundsManual(true);
                    if(years<10)
                    {
                        graph.getViewport().setMinX(0);
                        graph.getViewport().setMaxX(10);
                    }
                    else
                    {
                        graph.getViewport().setMinX(years-3);
                        graph.getViewport().setMaxX(years);
                    }
                    graph.getViewport().setMaxY(max + .2*max);
                    graph.getViewport().setMinY(0);

                }
                */

                //series = null;
                //series = new LineGraphSeries<DataPoint>(a);
                //ge = String.valueOf(series.findDataPointAtX(1));
                //cra.setText(ge);// "         CO2 Sensor 1"

                ///////////////////////////////////////////////////////////////
                /*
                graph.setTitle("         CO2 Sensor 1");
                graph.setTitleTextSize(25);
                graph.getGridLabelRenderer().setNumHorizontalLabels(3);
                //graph.getGridLabelRenderer().setNumVerticalLabels(4);
                graph.removeAllSeries();
                graph.addSeries(seriessupersecond);
                //graph.setVisibility(View.GONE);
                GridLabelRenderer griLa = graph.getGridLabelRenderer();
                LineGraphSeries lil = series;
                lil.setThickness(2);
                griLa.setHorizontalAxisTitle("              Seconds");
                griLa.setHorizontalAxisTitleTextSize(20);
                griLa.setVerticalAxisTitle("ppm");
                griLa.setLabelVerticalWidth(43);
                //griLa.setH;
                griLa.setVerticalAxisTitleTextSize(20);
                graph.getViewport().setXAxisBoundsManual(true);
                graph.getViewport().setYAxisBoundsManual(true);
                if(arraysize<60)
                {
                    graph.getViewport().setMinX(0);
                    graph.getViewport().setMaxX(60);
                }
                else
                {
                    graph.getViewport().setMinX(arraysize-60);
                    graph.getViewport().setMaxX(arraysize);
                }
                graph.getViewport().setMaxX(arraysize);
                graph.getViewport().setMaxY(max + .2*max);
                graph.getViewport().setMinY(0);

                 */
                /////////////////////////////////////////////////////////////////

                //graph.getViewport().setMaxY(max);
                //graph.getViewport().setMaxX(arraysize);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        /*
        GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.setTitle("         CO2 Sensor 1");
        graph.setTitleTextSize(25);
        graph.getGridLabelRenderer().setNumHorizontalLabels(3);
        //graph.getGridLabelRenderer().setNumVerticalLabels(4);
        graph.removeAllSeries();
        graph.addSeries(seriessupersecond);
        //graph.setVisibility(View.GONE);
        GridLabelRenderer griLa = graph.getGridLabelRenderer();
        LineGraphSeries lil = seriessupersecond;
        lil.setThickness(2);
        griLa.setHorizontalAxisTitle("              Seconds");
        griLa.setHorizontalAxisTitleTextSize(20);
        griLa.setVerticalAxisTitle("ppm");
        griLa.setLabelVerticalWidth(43);
        //griLa.setH;
        griLa.setVerticalAxisTitleTextSize(20);
        graph.getViewport().setXAxisBoundsManual(true);
        */


        rootDatabaseref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                LineGraphSeries<DataPoint> series;
                LineGraphSeries<DataPoint> seriesminutes;
                LineGraphSeries<DataPoint> serieshours;
                LineGraphSeries<DataPoint> seriesday;
                LineGraphSeries<DataPoint> seriesweek;
                LineGraphSeries<DataPoint> seriesyear;
                String data;// = snapshot.child();
                Double z;// = Double.parseDouble(data);
                // oxyg1.setText(S tring.valueOf(z));
                int t = 0;
                int iterator = 0;
                //double max = 0;
                double c = 0;
                double y;
                int x;
                //x = -1;
                int arraysize = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    arraysize = arraysize + 1;
                }
                int[] time = new int[arraysize];
                double minutediv = arraysize/60;                ///////////
                double hourdiv = arraysize/3600;
                double daydiv = arraysize/43200;
                double weekdiv = arraysize/302400;
                double yeardiv = arraysize/15768000;

                double minutesdoub = Math.floor(minutediv);     ///////////
                double hoursdoub = Math.floor(hourdiv);     ///////////
                double daydouble = Math.floor(daydiv);
                double weekdouble = Math.floor(weekdiv);
                double yearsdouble = Math.floor(yeardiv);

                int minutes = (int)minutesdoub;
                int hours = (int)hoursdoub;                 //////////
                int days = (int)daydouble;
                int weeks = (int)weekdouble;
                int years = (int)yearsdouble;

                int[] minutetime = new int[minutes];
                int[] hourtime = new int[hours];            //////////
                int[] daytime = new int[days];
                int[] weektime = new int[weeks];
                int[] yeartime = new int[years];


                double[] concentration = new double[arraysize];
                double[] mintuteconcentration = new double[minutes]; //////
                double[] hourconcentration = new double[hours]; //////
                double[] dayconcenctration = new double[days];
                double[] weekconcenctration = new double[weeks];
                double[] yearsconcentration = new double[years];

                int minutiterator = 0;      ///////
                int houriterator = 0;      ///////
                int dayiterator = 0;
                int weekiterator = 0;
                int yeariterator = 0;

                double averagesum = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {

                    time[iterator] = Integer.parseInt(snapshot1.child("time").getValue().toString());
                    concentration[iterator] = Double.parseDouble(snapshot1.child("concentration").getValue().toString());
                    if(concentration[iterator] > max)
                    {
                        max = concentration[iterator];
                    }
                    if((iterator+1)%60==0)                                        /////
                    {                                                             /////
                        minutetime[minutiterator] = minutiterator;                ////
                        for(int i = (iterator-59); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        mintuteconcentration[minutiterator] = averagesum/60;      ////
                        averagesum = 0;
                        minutiterator = minutiterator + 1;////

                    }
                    if((iterator+1)%3600==0)                                        /////
                    {                                                             /////
                        hourtime[houriterator] = houriterator;                ////
                        for(int i = (iterator-3599); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        hourconcentration[houriterator] = averagesum/3600;      ////
                        averagesum = 0;
                        houriterator = houriterator + 1;////

                    }
                    if((iterator+1)%43200==0)                                        /////
                    {                                                             /////
                        daytime[dayiterator] = dayiterator;                ////
                        for(int i = (iterator-43199); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        dayconcenctration[dayiterator] = averagesum/43200;      ////
                        averagesum = 0;
                        dayiterator = dayiterator + 1;////

                    }
                    if((iterator+1)%302400==0)                                        /////
                    {                                                             /////
                        weektime[weekiterator] = weekiterator;                ////
                        for(int i = (iterator-302399); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        weekconcenctration[weekiterator] = averagesum/302400;      ////
                        averagesum = 0;
                        weekiterator = weekiterator + 1;////

                    }
                    if((iterator+1)%1576800==0)                                        /////
                    {                                                             /////
                        yeartime[yeariterator] = yeariterator;                ////
                        for(int i = (iterator-1576799); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        yearsconcentration[yeariterator] = averagesum/1576800;      ////
                        averagesum = 0;
                        yeariterator = yeariterator + 1;////

                    }

                    iterator = iterator + 1;
                }

                t = time[0];
                c = concentration[0];

                //GraphView graph = (GraphView) findViewById(R.id.graph12); /////////////////////////

                series = new LineGraphSeries<DataPoint>();
                seriesminutes = new LineGraphSeries<DataPoint>();
                serieshours = new LineGraphSeries<DataPoint>();
                double g = 0;
                String ge;
                DataPoint[] a = new DataPoint[arraysize];
                DataPoint[] aminutes = new DataPoint[minutes];
                for(int i = 0; i < minutes; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aminutes[i] = new DataPoint(minutetime[i], mintuteconcentration[i]);       ////

                    seriesminutes.appendData(aminutes[i], true, minutes + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                //if(series.)
                for(int i = 0; i < arraysize; i++) {
                    //protected(series.resetData(new DataPoint[] {}));
                    a[i] = new DataPoint(time[i], concentration[i]);

                    series.appendData(a[i], true, arraysize + 40);
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                DataPoint[] ahours = new DataPoint[hours];  ///////
                for(int i = 0; i < hours; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    ahours[i] = new DataPoint(hourtime[i], hourconcentration[i]);       ////

                    serieshours.appendData(ahours[i], true, hours + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }


                seriesday = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] aday= new DataPoint[days];  ///////

                //if(series.)
                for(int i = 0; i < days; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aday[i] = new DataPoint(daytime[i], dayconcenctration[i]);       ////

                    seriesday.appendData(aday[i], true, days + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }

                seriesweek = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] aweek= new DataPoint[weeks];  ///////

                //if(series.)
                for(int i = 0; i < weeks; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aweek[i] = new DataPoint(weektime[i], weekconcenctration[i]);       ////

                    seriesweek.appendData(aweek[i], true, weeks + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }

                seriesyear = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] ayear= new DataPoint[years];  ///////

                //if(series.)
                for(int i = 0; i < years; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    ayear[i] = new DataPoint(yeartime[i], yearsconcentration[i]);       ////

                    seriesyear.appendData(ayear[i], true, years + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                seriesgsecond2 = series;

                seriesgsuperminute2 = seriesminutes;
                seriesghour2 = serieshours;
                seriesgday2 = seriesday;
                seriesgweek2 = seriesweek;
                seriesgyear2 = seriesyear;

                arraysizeglobalsecond2 = arraysize;
                arraysizeglobalminute2 = minutes;
                arraysizeglobalhour2 = hours;
                arraysizeglobalday2 = days;
                arraysizeglobalweek2 = weeks;
                arraysizeglobalyear2 = years;
                opentesting2();
                //series = null;
                //series = new LineGraphSeries<DataPoint>(a);
                //ge = String.valueOf(series.findDataPointAtX(1));
                //cra.setText(ge);

                //graph.getGridLabelRenderer().setNumVerticalLabels(4);
                ////////////////////////////////////////////////////////////////////////
                /*
                graph.setTitle("         CO2 Sensor 2");
                graph.setTitleTextSize(25);
                graph.removeAllSeries();
                graph.addSeries(series);
                graph.getGridLabelRenderer().setNumHorizontalLabels(3);
                GridLabelRenderer griLa = graph.getGridLabelRenderer();
                LineGraphSeries lil = series;
                lil.setThickness(2);
                griLa.setHorizontalAxisTitle("              Seconds");
                griLa.setHorizontalAxisTitleTextSize(20);
                griLa.setVerticalAxisTitle("ppm");
                griLa.setLabelVerticalWidth(43);
                //griLa.setH;
                griLa.setVerticalAxisTitleTextSize(20);
                graph.getViewport().setXAxisBoundsManual(true);
                graph.getViewport().setYAxisBoundsManual(true);
                int newparmter = 0;
                int newarray = arraysize;
                if(arraysize<60)
                {
                    graph.getViewport().setMinX(0);
                    graph.getViewport().setMaxX(60);
                }
                else
                {
                    graph.getViewport().setMinX(arraysize-60);
                    graph.getViewport().setMaxX(arraysize);
                }
                graph.getViewport().setMaxY(max + .2*max);
                graph.getViewport().setMinY(0);

                 */
                ////////////////////////////////////////////////////////////
            }



            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                LineGraphSeries<DataPoint> series;
                LineGraphSeries<DataPoint> seriesminutes;
                LineGraphSeries<DataPoint> serieshours;
                LineGraphSeries<DataPoint> seriesday;
                LineGraphSeries<DataPoint> seriesweek;
                LineGraphSeries<DataPoint> seriesyear;
                String data;// = snapshot.child();
                Double z;// = Double.parseDouble(data);
                //double max = 0;
                // oxyg1.setText(S tring.valueOf(z));
                int t = 0;
                int iterator = 0;
                double c = 0;
                double y;
                int x;
                //x = -1;
                int arraysize = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    arraysize = arraysize + 1;
                }
                int[] time = new int[arraysize];
                double minutediv = arraysize/60;                ///////////
                double hourdiv = arraysize/3600;
                double daydiv = arraysize/43200;
                double weekdiv = arraysize/302400;
                double yeardiv = arraysize/15768000;

                double minutesdoub = Math.floor(minutediv);     ///////////
                double hoursdoub = Math.floor(hourdiv);     ///////////
                double daydouble = Math.floor(daydiv);
                double weekdouble = Math.floor(weekdiv);
                double yearsdouble = Math.floor(yeardiv);

                int minutes = (int)minutesdoub;
                int hours = (int)hoursdoub;                 //////////
                int days = (int)daydouble;
                int weeks = (int)weekdouble;
                int years = (int)yearsdouble;

                int[] minutetime = new int[minutes];
                int[] hourtime = new int[hours];            //////////
                int[] daytime = new int[days];
                int[] weektime = new int[weeks];
                int[] yeartime = new int[years];


                double[] concentration = new double[arraysize];
                double[] mintuteconcentration = new double[minutes]; //////
                double[] hourconcentration = new double[hours]; //////
                double[] dayconcenctration = new double[days];
                double[] weekconcenctration = new double[weeks];
                double[] yearsconcentration = new double[years];

                int minutiterator = 0;      ///////
                int houriterator = 0;      ///////
                int dayiterator = 0;
                int weekiterator = 0;
                int yeariterator = 0;

                double averagesum = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {

                    time[iterator] = Integer.parseInt(snapshot1.child("time").getValue().toString());
                    concentration[iterator] = Double.parseDouble(snapshot1.child("concentration").getValue().toString());
                    if(concentration[iterator] > max)
                    {
                        max = concentration[iterator];
                    }
                    if((iterator+1)%60==0)                                        /////
                    {                                                             /////
                        minutetime[minutiterator] = minutiterator;                ////
                        for(int i = (iterator-59); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        mintuteconcentration[minutiterator] = averagesum/60;      ////
                        averagesum = 0;
                        minutiterator = minutiterator + 1;////

                    }
                    if((iterator+1)%3600==0)                                        /////
                    {                                                             /////
                        hourtime[houriterator] = houriterator;                ////
                        for(int i = (iterator-3599); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        hourconcentration[houriterator] = averagesum/3600;      ////
                        averagesum = 0;
                        houriterator = houriterator + 1;////

                    }
                    if((iterator+1)%43200==0)                                        /////
                    {                                                             /////
                        daytime[dayiterator] = dayiterator;                ////
                        for(int i = (iterator-43199); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        dayconcenctration[dayiterator] = averagesum/43200;      ////
                        averagesum = 0;
                        dayiterator = dayiterator + 1;////

                    }
                    if((iterator+1)%302400==0)                                        /////
                    {                                                             /////
                        weektime[weekiterator] = weekiterator;                ////
                        for(int i = (iterator-302399); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        weekconcenctration[weekiterator] = averagesum/302400;      ////
                        averagesum = 0;
                        weekiterator = weekiterator + 1;////

                    }
                    if((iterator+1)%1576800==0)                                        /////
                    {                                                             /////
                        yeartime[yeariterator] = yeariterator;                ////
                        for(int i = (iterator-1576799); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        yearsconcentration[yeariterator] = averagesum/1576800;      ////
                        averagesum = 0;
                        yeariterator = yeariterator + 1;////

                    }

                    iterator = iterator + 1;
                }

                t = time[0];
                c = concentration[0];
                //oxyg1.setText(String.valueOf(c));
                GraphView graph = (GraphView) findViewById(R.id.graph3th); /////////////////////////////////////////

                series = new LineGraphSeries<DataPoint>();
                seriesminutes = new LineGraphSeries<DataPoint>();
                serieshours = new LineGraphSeries<DataPoint>();
                double g = 0;
                String ge;
                DataPoint[] a = new DataPoint[arraysize];
                DataPoint[] aminutes = new DataPoint[minutes];
                for(int i = 0; i < minutes; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aminutes[i] = new DataPoint(minutetime[i], mintuteconcentration[i]);       ////

                    seriesminutes.appendData(aminutes[i], true, minutes + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                //if(series.)
                for(int i = 0; i < arraysize; i++) {
                    //protected(series.resetData(new DataPoint[] {}));
                    a[i] = new DataPoint(time[i], concentration[i]);

                    series.appendData(a[i], true, arraysize + 40);
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                DataPoint[] ahours = new DataPoint[hours];  ///////
                for(int i = 0; i < hours; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    ahours[i] = new DataPoint(hourtime[i], hourconcentration[i]);       ////

                    serieshours.appendData(ahours[i], true, hours + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }


                seriesday = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] aday= new DataPoint[days];  ///////

                //if(series.)
                for(int i = 0; i < days; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aday[i] = new DataPoint(daytime[i], dayconcenctration[i]);       ////

                    seriesday.appendData(aday[i], true, days + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }

                seriesweek = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] aweek= new DataPoint[weeks];  ///////

                //if(series.)
                for(int i = 0; i < weeks; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aweek[i] = new DataPoint(weektime[i], weekconcenctration[i]);       ////

                    seriesweek.appendData(aweek[i], true, weeks + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }

                seriesyear = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] ayear= new DataPoint[years];  ///////

                //if(series.)
                for(int i = 0; i < years; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    ayear[i] = new DataPoint(yeartime[i], yearsconcentration[i]);       ////

                    seriesyear.appendData(ayear[i], true, years + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                seriesgsecond3 = series;

                seriesgsuperminute3 = seriesminutes;
                seriesghour3 = serieshours;
                seriesgday3 = seriesday;
                seriesgweek3 = seriesweek;
                seriesgyear3 = seriesyear;

                arraysizeglobalsecond3 = arraysize;
                arraysizeglobalminute3 = minutes;
                arraysizeglobalhour3 = hours;
                arraysizeglobalday3 = days;
                arraysizeglobalweek3 = weeks;
                arraysizeglobalyear3 = years;
                opentesting3();;
                //series = null;
                //series = new LineGraphSeries<DataPoint>(a);
                //ge = String.valueOf(series.findDataPointAtX(1));
                //cra.setText(ge);
                ///////////////////////////////////////////////////////////////////
                /*
                graph.setTitle("         CO2 Sensor 3");
                graph.setTitleTextSize(25);

                //graph.getGridLabelRenderer().setNumVerticalLabels(4);
                graph.removeAllSeries();
                graph.addSeries(series);
                graph.getGridLabelRenderer().setNumHorizontalLabels(3);
                GridLabelRenderer griLa = graph.getGridLabelRenderer();
                LineGraphSeries lil = series;
                lil.setThickness(2);
                griLa.setHorizontalAxisTitle("              Seconds");
                griLa.setHorizontalAxisTitleTextSize(20);
                griLa.setVerticalAxisTitle("ppm");
                griLa.setLabelVerticalWidth(43);
                //griLa.setH;
                griLa.setVerticalAxisTitleTextSize(20);
                graph.getViewport().setXAxisBoundsManual(true);
                graph.getViewport().setYAxisBoundsManual(true);
                if(arraysize<60)
                {
                    graph.getViewport().setMinX(0);
                    graph.getViewport().setMaxX(60);
                }
                else
                {
                    graph.getViewport().setMinX(arraysize-60);
                    graph.getViewport().setMaxX(arraysize);
                }
                //graph.getViewport().setMaxX(arraysize);
                graph.getViewport().setMaxY(max + .2*max);
                graph.getViewport().setMinY(0);

                 */
                /////////////////////////////////////////////////////////////////
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        rootDatabaseref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                LineGraphSeries<DataPoint> series;
                LineGraphSeries<DataPoint> seriesminutes;
                LineGraphSeries<DataPoint> serieshours;
                LineGraphSeries<DataPoint> seriesday;
                LineGraphSeries<DataPoint> seriesweek;
                LineGraphSeries<DataPoint> seriesyear;
                String data;// = snapshot.child();
                Double z;// = Double.parseDouble(data);
                // oxyg1.setText(S tring.valueOf(z));
                int t = 0;
                int iterator = 0;
                //double max = 0;
                double c = 0;
                double y;
                int x;
                //x = -1;
                int arraysize = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    arraysize = arraysize + 1;
                }
                int[] time = new int[arraysize];
                double minutediv = arraysize/60;                ///////////
                double hourdiv = arraysize/3600;
                double daydiv = arraysize/43200;
                double weekdiv = arraysize/302400;
                double yeardiv = arraysize/15768000;

                double minutesdoub = Math.floor(minutediv);     ///////////
                double hoursdoub = Math.floor(hourdiv);     ///////////
                double daydouble = Math.floor(daydiv);
                double weekdouble = Math.floor(weekdiv);
                double yearsdouble = Math.floor(yeardiv);

                int minutes = (int)minutesdoub;
                int hours = (int)hoursdoub;                 //////////
                int days = (int)daydouble;
                int weeks = (int)weekdouble;
                int years = (int)yearsdouble;

                int[] minutetime = new int[minutes];
                int[] hourtime = new int[hours];            //////////
                int[] daytime = new int[days];
                int[] weektime = new int[weeks];
                int[] yeartime = new int[years];


                double[] concentration = new double[arraysize];
                double[] mintuteconcentration = new double[minutes]; //////
                double[] hourconcentration = new double[hours]; //////
                double[] dayconcenctration = new double[days];
                double[] weekconcenctration = new double[weeks];
                double[] yearsconcentration = new double[years];

                int minutiterator = 0;      ///////
                int houriterator = 0;      ///////
                int dayiterator = 0;
                int weekiterator = 0;
                int yeariterator = 0;

                double averagesum = 0;
                for(DataSnapshot snapshot1 : snapshot.getChildren())
                {

                    time[iterator] = Integer.parseInt(snapshot1.child("time").getValue().toString());
                    concentration[iterator] = Double.parseDouble(snapshot1.child("concentration").getValue().toString());
                    if(concentration[iterator] > max)
                    {
                        max = concentration[iterator];
                    }
                    if((iterator+1)%60==0)                                        /////
                    {                                                             /////
                        minutetime[minutiterator] = minutiterator;                ////
                        for(int i = (iterator-59); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        mintuteconcentration[minutiterator] = averagesum/60;      ////
                        averagesum = 0;
                        minutiterator = minutiterator + 1;////

                    }
                    if((iterator+1)%3600==0)                                        /////
                    {                                                             /////
                        hourtime[houriterator] = houriterator;                ////
                        for(int i = (iterator-3599); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        hourconcentration[houriterator] = averagesum/3600;      ////
                        averagesum = 0;
                        houriterator = houriterator + 1;////

                    }
                    if((iterator+1)%43200==0)                                        /////
                    {                                                             /////
                        daytime[dayiterator] = dayiterator;                ////
                        for(int i = (iterator-43199); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        dayconcenctration[dayiterator] = averagesum/43200;      ////
                        averagesum = 0;
                        dayiterator = dayiterator + 1;////

                    }
                    if((iterator+1)%302400==0)                                        /////
                    {                                                             /////
                        weektime[weekiterator] = weekiterator;                ////
                        for(int i = (iterator-302399); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        weekconcenctration[weekiterator] = averagesum/302400;      ////
                        averagesum = 0;
                        weekiterator = weekiterator + 1;////

                    }
                    if((iterator+1)%1576800==0)                                        /////
                    {                                                             /////
                        yeartime[yeariterator] = yeariterator;                ////
                        for(int i = (iterator-1576799); i< (iterator + 1); i++)        ////
                        {                                                         ////
                            averagesum = averagesum + concentration[i];           ////
                            ////
                        }                                                         ////
                        yearsconcentration[yeariterator] = averagesum/1576800;      ////
                        averagesum = 0;
                        yeariterator = yeariterator + 1;////

                    }

                    iterator = iterator + 1;
                }

                t = time[0];
                c = concentration[0];

                //GraphView graph = (GraphView) findViewById(R.id.graph4);                //////////////////////////////////////////////////
                //GraphView graph2 = (GraphView) findViewById(R.id.graph);
                series = new LineGraphSeries<DataPoint>();
                seriesminutes = new LineGraphSeries<DataPoint>();
                serieshours = new LineGraphSeries<DataPoint>();
                double g = 0;
                String ge;
                DataPoint[] a = new DataPoint[arraysize];
                DataPoint[] aminutes = new DataPoint[minutes];
                for(int i = 0; i < minutes; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aminutes[i] = new DataPoint(minutetime[i], mintuteconcentration[i]);       ////

                    seriesminutes.appendData(aminutes[i], true, minutes + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                //if(series.)
                for(int i = 0; i < arraysize; i++) {
                    //protected(series.resetData(new DataPoint[] {}));
                    a[i] = new DataPoint(time[i], concentration[i]);

                    series.appendData(a[i], true, arraysize + 40);
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                DataPoint[] ahours = new DataPoint[hours];  ///////
                for(int i = 0; i < hours; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    ahours[i] = new DataPoint(hourtime[i], hourconcentration[i]);       ////

                    serieshours.appendData(ahours[i], true, hours + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }


                seriesday = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] aday= new DataPoint[days];  ///////

                //if(series.)
                for(int i = 0; i < days; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aday[i] = new DataPoint(daytime[i], dayconcenctration[i]);       ////

                    seriesday.appendData(aday[i], true, days + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }

                seriesweek = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] aweek= new DataPoint[weeks];  ///////

                //if(series.)
                for(int i = 0; i < weeks; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    aweek[i] = new DataPoint(weektime[i], weekconcenctration[i]);       ////

                    seriesweek.appendData(aweek[i], true, weeks + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }

                seriesyear = new LineGraphSeries<DataPoint>();
                //double g = 0;
                //String ge;
                DataPoint[] ayear= new DataPoint[years];  ///////

                //if(series.)
                for(int i = 0; i < years; i++) {                                      ////
                    //protected(series.resetData(new DataPoint[] {}));
                    ayear[i] = new DataPoint(yeartime[i], yearsconcentration[i]);       ////

                    seriesyear.appendData(ayear[i], true, years + 3);    ////
                    //g = Double.parseDouble(String.valueOf(series.findDataPointAtX(time[i])));

                }
                seriesgsecond4 = series;

                seriesgsuperminute4 = seriesminutes;
                seriesghour4 = serieshours;
                seriesgday4 = seriesday;
                seriesgweek4 = seriesweek;
                seriesgyear4 = seriesyear;

                arraysizeglobalsecond4 = arraysize;
                arraysizeglobalminute4 = minutes;
                arraysizeglobalhour4 = hours;
                arraysizeglobalday4 = days;
                arraysizeglobalweek4 = weeks;
                arraysizeglobalyear4 = years;
                opentesting4();
                //series = null;
                //series = new LineGraphSeries<DataPoint>(a);
                //ge = String.valueOf(series.findDataPointAtX(1));
                //cra.setText(ge);

                //////////////////////////////////////////////////////
                /*
                graph.setTitle("         CO2 Sensor 4");
                graph.setTitleTextSize(25);

                //graph.getGridLabelRenderer().setNumVerticalLabels(4);
                graph.removeAllSeries();
                graph.addSeries(series);
                graph.getGridLabelRenderer().setNumHorizontalLabels(3);
                GridLabelRenderer griLa = graph.getGridLabelRenderer();
                LineGraphSeries lil = series;
                lil.setThickness(2);
                griLa.setHorizontalAxisTitle("              Seconds");
                griLa.setHorizontalAxisTitleTextSize(20);
                griLa.setVerticalAxisTitle("ppm");
                griLa.setLabelVerticalWidth(43);
                //griLa.setH;
                griLa.setVerticalAxisTitleTextSize(20);
                graph.getViewport().setXAxisBoundsManual(true);
                graph.getViewport().setYAxisBoundsManual(true);
                /*
                if(arraysize<60)
                {
                    graph.getViewport().setMinX(0);
                    graph.getViewport().setMaxX(60);
                }
                else
                {
                    graph.getViewport().setMinX(arraysize-60);
                    graph.getViewport().setMaxX(arraysize);
                }

                //graph.getViewport().setMaxX(arraysize); //arraysize
                //graph.getViewport().setMaxX(arraysize);
                graph.getViewport().setMaxY(max + .2*max);
                graph.getViewport().setMinY(0);

                */
                /////////////////////////////////////////////////////
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    }
    public void openActivityrefresh(){
        Intent intent = new Intent(this, mcu1cograph.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }
    public void openActivitymain(){
        Intent intent = new Intent(this, mcu1co.class); //causes the subordinate activity file to be opened, redirects to new layout
        startActivity(intent);
    }

    public void openActivityminutes(){

        GraphView graph = (GraphView) findViewById(R.id.graphth);

        GraphView graph2 = (GraphView) findViewById(R.id.graph12th);
        GraphView graph3 = (GraphView) findViewById(R.id.graph3th);
        GraphView graph4 = (GraphView) findViewById(R.id.graph4);
        Button buttonminutes = (Button) findViewById(R.id.minutestab);

        if(indication == 0)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriessupersecond);
            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriessupersecond;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              seconds");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);

            if(arraysizeCHECKglobal<60)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(60);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeCHECKglobal-60);
                graph.getViewport().setMaxX(arraysizeCHECKglobal);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);

            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgsecond2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgsecond2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              seconds");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph2.getViewport().setMaxX(arraysizeglobalsecond2 + 1);
            //graph2.getViewport().setMaxX(arraysizeglobalsecond2 + 1);

            if(arraysizeglobalsecond2<60)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(60);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalsecond2-60);
                graph2.getViewport().setMaxX(arraysizeglobalsecond2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);

            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgsecond3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgsecond3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              second");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            graph3.getViewport().setMaxX(arraysizeglobalsecond3 + 1);
            //graph3.getViewport().setMaxX(arraysizeglobalsecond3 + 1);

            if(arraysizeglobalsecond3<60)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(60);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalsecond3-60);
                graph3.getViewport().setMaxX(arraysizeglobalsecond3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);

            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgsecond4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgsecond4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              seconds");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            graph4.getViewport().setMaxX(arraysizeglobalsecond4 + 1);


            if(arraysizeglobalsecond4<60)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(60);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalsecond4-60);
                graph4.getViewport().setMaxX(arraysizeglobalsecond4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);


        }
        if(indication == 1)
        {


            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriessuperminute1);

            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriessuperminute1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              minutes");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalminute1<10)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(10);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalminute1-10);
                graph.getViewport().setMaxX(arraysizeglobalminute1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);

            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgsuperminute2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgsuperminute2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              minutes");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalminute2<10)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(10);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalminute2-10);
                graph2.getViewport().setMaxX(arraysizeglobalminute2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);

            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgsuperminute3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgsuperminute3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              minutes");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalminute3<10)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(10);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalminute3-10);
                graph3.getViewport().setMaxX(arraysizeglobalminute3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);

            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgsuperminute4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgsuperminute4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              minutes");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalminute4<10)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(10);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalminute3-10);
                graph4.getViewport().setMaxX(arraysizeglobalminute3);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);
        }
        else if(indication == 2)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();

            graph.addSeries(seriesghour1);
            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriesghour1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              hours");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalhour1<10)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(10);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalhour1-10);
                graph.getViewport().setMaxX(arraysizeglobalhour1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);

            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesghour2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesghour2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              hours");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalhour2<10)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(10);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalhour2-10);
                graph2.getViewport().setMaxX(arraysizeglobalhour2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);

            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesghour3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesghour3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              hours");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalhour3<10)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(10);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalhour3-10);
                graph3.getViewport().setMaxX(arraysizeglobalhour3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);

            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesghour4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesghour4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              hours");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalhour4<10)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(10);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalhour4-10);
                graph4.getViewport().setMaxX(arraysizeglobalhour4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);
        }
        else if(indication == 3)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriesgday1);
            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriesgday1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              days");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalday1<10)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(10);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalday1-10);
                graph.getViewport().setMaxX(arraysizeglobalday1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);

            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgday2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgday2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              days");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalday2<10)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(10);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalday2-10);
                graph2.getViewport().setMaxX(arraysizeglobalday2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);

            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgday3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgday3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              days");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalday3<10)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(10);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalday3-10);
                graph3.getViewport().setMaxX(arraysizeglobalday3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);

            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgday4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgday4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              days");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalday4<10)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(10);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalday4-10);
                graph4.getViewport().setMaxX(arraysizeglobalday4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);
        }
        else if(indication == 4)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriesgweek1);
            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriesgweek1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              weeks");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalweek1<10)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(10);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalweek1-10);
                graph.getViewport().setMaxX(arraysizeglobalweek1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);

            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgweek2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgweek2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              weeks");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalweek2<10)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(10);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalweek1-10);
                graph2.getViewport().setMaxX(arraysizeglobalweek1);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);

            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgweek3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgweek3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              weeks");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalweek3<10)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(10);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalweek3-10);
                graph3.getViewport().setMaxX(arraysizeglobalweek3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);

            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgweek4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgweek4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              weeks");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalweek4<10)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(10);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalweek4-10);
                graph4.getViewport().setMaxX(arraysizeglobalweek4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);
        }
        else if(indication == 5)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriesgyear1);

            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriesgyear1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              years");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalyear1<3)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(3);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalyear1-3);
                graph.getViewport().setMaxX(arraysizeglobalyear1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);

            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgyear2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgyear2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              years");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalyear2<3)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(3);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalyear2-3);
                graph2.getViewport().setMaxX(arraysizeglobalyear2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);

            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgyear3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgyear3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              weeks");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalyear3<3)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(3);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalyear3-3);
                graph3.getViewport().setMaxX(arraysizeglobalyear3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);

            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgyear4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgyear4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              years");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalyear4<3)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(3);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalyear4-3);
                graph4.getViewport().setMaxX(arraysizeglobalyear4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);

        }

        //Intent intent = new Intent(this, mcu1co2graphminutes.class); //causes the subordinate activity file to be opened, redirects to new layout
        //startActivity(intent);
    }


    @Override

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //adapterView.setSelection(i);

        indication = i;
        openActivityminutes();
        //graph.setTitle(indication);
        //openActivityrefresh();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void indicator2(){
        indication2 = indication;
    }

    public void opentesting(){
        GraphView graph = (GraphView) findViewById(R.id.graphth);
        if(indication == 0)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriessupersecond);
            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriessupersecond;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              seconds");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);

            if(arraysizeCHECKglobal<60)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(60);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeCHECKglobal-60);
                graph.getViewport().setMaxX(arraysizeCHECKglobal);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);




        }
        if(indication == 1)
        {


            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriessuperminute1);

            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriessuperminute1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              minutes");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalminute1<10)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(10);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalminute1-10);
                graph.getViewport().setMaxX(arraysizeglobalminute1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 2)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();

            graph.addSeries(seriesghour1);
            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriesghour1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              hours");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalhour1<10)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(10);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalhour1-10);
                graph.getViewport().setMaxX(arraysizeglobalhour1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 3)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriesgday1);
            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriesgday1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              days");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalday1<10)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(10);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalday1-10);
                graph.getViewport().setMaxX(arraysizeglobalday1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 4)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriesgweek1);
            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriesgweek1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              weeks");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalweek1<10)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(10);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalweek1-10);
                graph.getViewport().setMaxX(arraysizeglobalweek1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 5)
        {
            graph.setTitle("         CO Sensor 1");
            graph.setTitleTextSize(25);
            graph.removeAllSeries();
            graph.addSeries(seriesgyear1);

            GridLabelRenderer griLa = graph.getGridLabelRenderer();
            LineGraphSeries lil = seriesgyear1;
            lil.setThickness(2);
            griLa.setHorizontalAxisTitle("              years");
            griLa.setHorizontalAxisTitleTextSize(20);
            griLa.setVerticalAxisTitle("ppm");
            griLa.setLabelVerticalWidth(43);
            griLa.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa.setGridColor(Color.LTGRAY);
            griLa.setVerticalAxisTitleTextSize(20);
            graph.getViewport().setXAxisBoundsManual(true);
            graph.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalyear1<3)
            {
                graph.getViewport().setMinX(0);
                graph.getViewport().setMaxX(3);
            }
            else
            {
                graph.getViewport().setMinX(arraysizeglobalyear1-3);
                graph.getViewport().setMaxX(arraysizeglobalyear1);
            }
            graph.getViewport().setMinY(0);
            graph.getViewport().setMaxY(max + .2*max);



        }

    }
    public void opentesting2(){
        GraphView graph2 = (GraphView) findViewById(R.id.graph12th);

        if(indication == 0)
        {


            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgsecond2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgsecond2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              seconds");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph2.getViewport().setMaxX(arraysizeglobalsecond2 + 1);
            //graph2.getViewport().setMaxX(arraysizeglobalsecond2 + 1);

            if(arraysizeglobalsecond2<60)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(60);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalsecond2-60);
                graph2.getViewport().setMaxX(arraysizeglobalsecond2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);






        }
        if(indication == 1)
        {




            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgsuperminute2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgsuperminute2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              minutes");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalminute2<10)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(10);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalminute2-10);
                graph2.getViewport().setMaxX(arraysizeglobalminute2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);




        }
        else if(indication == 2)
        {

            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesghour2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesghour2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              hours");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalhour2<10)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(10);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalhour2-10);
                graph2.getViewport().setMaxX(arraysizeglobalhour2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 3)
        {


            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgday2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgday2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              days");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalday2<10)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(10);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalday2-10);
                graph2.getViewport().setMaxX(arraysizeglobalday2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 4)
        {

            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgweek2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgweek2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              weeks");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalweek2<10)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(10);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalweek1-10);
                graph2.getViewport().setMaxX(arraysizeglobalweek1);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 5)
        {

            graph2.setTitle("         CO Sensor 2");
            graph2.setTitleTextSize(25);
            graph2.removeAllSeries();
            graph2.addSeries(seriesgyear2);
            GridLabelRenderer griLa2 = graph2.getGridLabelRenderer();
            LineGraphSeries lil2 = seriesgyear2;
            lil2.setThickness(2);
            griLa2.setHorizontalAxisTitle("              years");
            griLa2.setHorizontalAxisTitleTextSize(20);
            griLa2.setVerticalAxisTitle("ppm");
            griLa2.setLabelVerticalWidth(43);
            griLa2.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa2.setGridColor(Color.LTGRAY);
            griLa2.setVerticalAxisTitleTextSize(20);
            graph2.getViewport().setXAxisBoundsManual(true);
            graph2.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalyear2<3)
            {
                graph2.getViewport().setMinX(0);
                graph2.getViewport().setMaxX(3);
            }
            else
            {
                graph2.getViewport().setMinX(arraysizeglobalyear2-3);
                graph2.getViewport().setMaxX(arraysizeglobalyear2);
            }
            graph2.getViewport().setMinY(0);
            graph2.getViewport().setMaxY(max + .2*max);



        }



    }
    public void opentesting3(){
        GraphView graph3 = (GraphView) findViewById(R.id.graph3th);
        if(indication == 0)
        {


            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgsecond3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgsecond3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              second");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            graph3.getViewport().setMaxX(arraysizeglobalsecond3 + 1);
            //graph3.getViewport().setMaxX(arraysizeglobalsecond3 + 1);

            if(arraysizeglobalsecond3<60)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(60);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalsecond3-60);
                graph3.getViewport().setMaxX(arraysizeglobalsecond3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);




        }
        if(indication == 1)
        {




            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgsuperminute3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgsuperminute3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              minutes");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalminute3<10)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(10);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalminute3-10);
                graph3.getViewport().setMaxX(arraysizeglobalminute3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 2)
        {


            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesghour3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesghour3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              hours");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalhour3<10)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(10);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalhour3-10);
                graph3.getViewport().setMaxX(arraysizeglobalhour3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 3)
        {


            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgday3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgday3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              days");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalday3<10)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(10);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalday3-10);
                graph3.getViewport().setMaxX(arraysizeglobalday3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 4)
        {


            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgweek3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgweek3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              weeks");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalweek3<10)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(10);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalweek3-10);
                graph3.getViewport().setMaxX(arraysizeglobalweek3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);


        }
        else if(indication == 5)
        {


            graph3.setTitle("         CO Sensor 3");
            graph3.setTitleTextSize(25);
            graph3.removeAllSeries();
            graph3.addSeries(seriesgyear3);
            GridLabelRenderer griLa3 = graph3.getGridLabelRenderer();
            LineGraphSeries lil3 = seriesgyear3;
            lil3.setThickness(2);
            griLa3.setHorizontalAxisTitle("              weeks");
            griLa3.setHorizontalAxisTitleTextSize(20);
            griLa3.setVerticalAxisTitle("ppm");
            griLa3.setLabelVerticalWidth(43);
            griLa3.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa3.setGridColor(Color.LTGRAY);
            griLa3.setVerticalAxisTitleTextSize(20);
            graph3.getViewport().setXAxisBoundsManual(true);
            graph3.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalyear3<3)
            {
                graph3.getViewport().setMinX(0);
                graph3.getViewport().setMaxX(3);
            }
            else
            {
                graph3.getViewport().setMinX(arraysizeglobalyear3-3);
                graph3.getViewport().setMaxX(arraysizeglobalyear3);
            }
            graph3.getViewport().setMinY(0);
            graph3.getViewport().setMaxY(max + .2*max);



        }


    }
    public void opentesting4(){
        GraphView graph4 = (GraphView) findViewById(R.id.graph4);
        if(indication == 0)
        {
            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgsecond4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgsecond4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              seconds");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            graph4.getViewport().setMaxX(arraysizeglobalsecond4 + 1);


            if(arraysizeglobalsecond4<60)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(60);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalsecond4-60);
                graph4.getViewport().setMaxX(arraysizeglobalsecond4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);


        }
        if(indication == 1)
        {


            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgsuperminute4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgsuperminute4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              minutes");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalminute4<10)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(10);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalminute3-10);
                graph4.getViewport().setMaxX(arraysizeglobalminute3);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);
        }
        else if(indication == 2)
        {


            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesghour4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesghour4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              hours");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalhour4<10)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(10);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalhour4-10);
                graph4.getViewport().setMaxX(arraysizeglobalhour4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);
        }
        else if(indication == 3)
        {



            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgday4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgday4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              days");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalday4<10)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(10);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalday4-10);
                graph4.getViewport().setMaxX(arraysizeglobalday4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);
        }
        else if(indication == 4)
        {


            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgweek4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgweek4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              weeks");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalweek4<10)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(10);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalweek4-10);
                graph4.getViewport().setMaxX(arraysizeglobalweek4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);
        }
        else if(indication == 5)
        {
            graph4.setTitle("         CO Sensor 4");
            graph4.setTitleTextSize(25);
            graph4.removeAllSeries();
            graph4.addSeries(seriesgyear4);
            GridLabelRenderer griLa4 = graph4.getGridLabelRenderer();
            LineGraphSeries lil4 = seriesgyear4;
            lil4.setThickness(2);
            griLa4.setHorizontalAxisTitle("              years");
            griLa4.setHorizontalAxisTitleTextSize(20);
            griLa4.setVerticalAxisTitle("ppm");
            griLa4.setLabelVerticalWidth(43);
            griLa4.setLabelVerticalWidth(55);
            //griLa.setH;
            griLa4.setGridColor(Color.LTGRAY);
            griLa4.setVerticalAxisTitleTextSize(20);
            graph4.getViewport().setXAxisBoundsManual(true);
            graph4.getViewport().setYAxisBoundsManual(true);
            //graph.getViewport().setMaxX(10);
            if(arraysizeglobalyear4<3)
            {
                graph4.getViewport().setMinX(0);
                graph4.getViewport().setMaxX(3);
            }
            else
            {
                graph4.getViewport().setMinX(arraysizeglobalyear4-3);
                graph4.getViewport().setMaxX(arraysizeglobalyear4);
            }
            graph4.getViewport().setMinY(0);
            graph4.getViewport().setMaxY(max + .2*max);

        }

    }
}