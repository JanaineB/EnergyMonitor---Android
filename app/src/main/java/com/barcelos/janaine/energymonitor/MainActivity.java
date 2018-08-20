package com.barcelos.janaine.energymonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

//classe main
public class MainActivity extends AppCompatActivity {
    private DatabaseReference root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        root = FirebaseDatabase.getInstance().getReference("sensor");
        root.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<SensorData> dados = new ArrayList<>();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    SensorData sensor = snapshot.getValue(SensorData.class);
                    dados.add(sensor);
                }
                for (SensorData dado : dados) {
                    System.out.println(dado.toString());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w("......................", "loadPost:onCancelled", databaseError.toException());
            }
        });

    }
}
