package ru.mirea.vozhzhovea.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    public void onClick1(View view){
        String text = editText.getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(),
                String.format("СТУДЕНТ №8 ГРУППА БСБО-01-20 Количество символов: %s", text.length()),
                Toast.LENGTH_SHORT);
        toast.show();

    }

}