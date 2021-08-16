package com.example.searchlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
private ListView l;
private EditText e;
private ArrayAdapter<String> adapter;
String data[]={"walmart","amazon","tcs","alsoenergy","infosys","cognizant","POLICY BAZAAR",
"capagemini","morgan stanley","BLA etech","hCL","flipkart","cedcoss","Ibm","paytm","mindtree","Orange mantra","info tech","info gain",
"accenture","velcom","genpact","wipro","oracle","samsung","lenovo","ola","uber","honey well","mount blue","l&T","wabhag","uno minda",
"apple","Hp","INTEL","MIDLAND","TATA STEEL","TATA MOTOR","TECH MAHINDRA","ADOBE","MPHASIS","DXC","ALPHSBET","MICROSOFT","GOOGLE","FACEBOOK",
};@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(ListView)findViewById(R.id.list);
        e=(EditText)findViewById(R.id.edit);
         adapter=new ArrayAdapter<>(this,R.layout.list_item,R.id.tt,data);
         l.setAdapter(adapter);
         e.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                 MainActivity.this.adapter.getFilter().filter(s); }

             @Override
             public void onTextChanged(CharSequence s, int start, int before, int count) {
             }

             @Override
             public void afterTextChanged(Editable s) {
             }
         });
    }
}