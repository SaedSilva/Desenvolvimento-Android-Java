package com.saeddev.lista.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.saeddev.lista.R;
import com.saeddev.lista.model.Person;

public class MainActivity extends AppCompatActivity {
    EditText editName;
    EditText editSurname;
    EditText editCourse;
    EditText editPhone;
    Button buttonSave;
    Button buttonClear;
    Button buttonFinish;

    Person pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Person();

        editName = findViewById(R.id.editName);
        editSurname = findViewById(R.id.editSurname);
        editCourse = findViewById(R.id.editCourse);
        editPhone = findViewById(R.id.editPhone);

        buttonSave = findViewById(R.id.buttonSave);
        buttonClear = findViewById(R.id.buttonClear);
        buttonFinish = findViewById(R.id.buttonFinish);

        buttonClear.setOnClickListener(view -> {
            editName.setText("");
            editSurname.setText("");
            editCourse.setText("");
            editPhone.setText("");
        });
        buttonFinish.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Finalizado!", Toast.LENGTH_LONG).show();
            finish();
        });
        buttonSave.setOnClickListener(view -> {
            pessoa.setName(editName.getText().toString());
            pessoa.setSurname(editSurname.getText().toString());
            pessoa.setCourse(editCourse.getText().toString());
            pessoa.setPhone(editPhone.getText().toString());
            Toast.makeText(MainActivity.this, "Salvo!", Toast.LENGTH_LONG).show();
        });

    }
}