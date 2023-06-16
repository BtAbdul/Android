package com.btabdul.codenote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.btabdul.codenote.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Inflate and get instance of binding

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // set content view to binding's root

        setContentView(binding.getRoot());

       

        // type a

        int a = 10;

        

        //keyword if, else class 

        if(a==10)

        {

          a=10;  

        }

        

        // opratoor = - +

        a=a;

        

        

        

        

    }

    

    @Override

    protected void onDestroy() {

        super.onDestroy();

        this.binding = null;

    }

}

