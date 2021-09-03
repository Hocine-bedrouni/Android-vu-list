package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this); //nom de la page
        builder.setTitle(R.string.app_name) // set le titre
                .setMessage(R.string.vue) //set le message
                .setPositiveButton("ok", ((dialogInterface, i) -> {
                            dialogInterface.dismiss();
                        })
                )
                .show();


        //Récupération de Listview
        ListView listView = (ListView) findViewById(R.id.listvue);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //Création des users
        UserAccount francois = new UserAccount("francois", "admin");
        UserAccount germain = new UserAccount("germain", "user");
        UserAccount cedric = new UserAccount("cedric", "guest", false);
        UserAccount manu = new UserAccount("manu", "guest");

        //Création de la liste
        UserAccount[] users = new UserAccount[]{francois, cedric, germain};

        //création de l'adapter
//        ArrayAdapter<UserAccount> arrayAdapter = new ArrayAdapter<UserAccount>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1, users);
        ArrayAdapter<UserAccount> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_checked, users);
        //Affectation de l'adapter
        listView.setAdapter(arrayAdapter);

        listView.setAdapter(arrayAdapter);
        for (int j = 0; j < users.length; j++) {
            listView.setItemChecked(j, users[j].getActive());
        }

//        ArrayList<UserAccount> listCli = new ArrayList<UserAccount>();
//
//        listCli.add(francois);
//        listCli.add(germain);
//        listCli.add(cedric);
//        listCli.add(manu);
//
//        listView.setAdapter(new CustomListAdapter(listCli, this));
    }


}