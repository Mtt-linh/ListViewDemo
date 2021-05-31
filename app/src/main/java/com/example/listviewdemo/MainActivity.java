package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<com.example.listviewdemo.ContactModel> listContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView)findViewById(R.id.lvContact);
        com.example.listviewdemo.ContactAdapter adapter = new com.example.listviewdemo.ContactAdapter(listContacts,this);
        lvContact.setAdapter(adapter);


        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                com.example.listviewdemo.ContactModel contactModel = listContacts.get(position);
                Toast.makeText(MainActivity.this,contactModel.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private  void  initData(){

        com.example.listviewdemo.ContactModel contact = new com.example.listviewdemo.ContactModel("Nguyen Van Manh","03325325",R.drawable.male02);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Tran Hoai Anh","0765432",R.drawable.female01);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Nguyen Van Anh","0765432",R.drawable.female01);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Tran Trung Kien","0765432",R.drawable.male02);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Hoang Hai Minh","0765432",R.drawable.male01);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Hoang Quooc Khanh","0765432",R.drawable.male02);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Trinh Kim Anh","0765432",R.drawable.images);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Nguyen Hai Van","0765432",R.drawable.female01);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Doan Ba Hung","0765432",R.drawable.male02);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Truong Tan Thanh","0765432",R.drawable.male02);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Cung Tuan","0765432",R.drawable.cungtuan);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Nham Gia Luan","0765432",R.drawable.gialuan);
        listContacts.add(contact);
        contact = new com.example.listviewdemo.ContactModel("Truong Triet Han","0765432",R.drawable.triethan);

    }
}