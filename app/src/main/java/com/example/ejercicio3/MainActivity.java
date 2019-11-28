package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private EditText _name;
    private EditText _lnp;
    private EditText _lnm;
    private EditText _nocuenta;
    private RadioButton M;
    private RadioButton H;

    ArrayList<Student> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _name = findViewById(R.id.Name);
        _lnp = findViewById(R.id.LastNP);
        _lnm = findViewById(R.id.LastNM);
        _nocuenta = findViewById(R.id.NoCuenta);
        M = findViewById(R.id.W);
        H = findViewById(R.id.H);
    }

    public void toArray(View view){
        if (list.size()!=0){
            Intent next = new Intent(this,Ejercicio3_2.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("list",list);
            next.putExtras(bundle);
            startActivity(next);
        }else {
            Toast.makeText(this,this.getResources().getString(R.string.Alarma1),Toast.LENGTH_SHORT).show();
        }
    }

    public void Agregar(View view){
        String Name = _name.getText().toString();
        String LNP = _lnp.getText().toString();
        String LNM = _lnm.getText().toString();
        String No_Cuenta = _nocuenta.getText().toString();

        if (Name.length()!=0){
            if (LNP.length() != 0) {
                if (LNM.length() != 0) {
                    if (No_Cuenta.length() != 0) {
                        if (M.isChecked()) {
                            Student newstudent = new Student();
                            newstudent.SetName(Name);
                            newstudent.SetLNP(LNP);
                            newstudent.SetLNM(LNM);
                            newstudent.SetNC(Integer.parseInt(No_Cuenta));
                            newstudent.SetG(0);
                            list.add(newstudent);
                            Toast.makeText(this,this.getResources().getString(R.string.Todofine1)+list.size()+this.getResources().getString(R.string.Todofine2),Toast.LENGTH_SHORT).show();
                        } else if (H.isChecked()) {
                            Student newstudent = new Student();
                            newstudent.SetName(Name);
                            newstudent.SetLNP(LNP);
                            newstudent.SetLNM(LNM);
                            newstudent.SetNC(Integer.parseInt(No_Cuenta));
                            newstudent.SetG(1);
                            list.add(newstudent);
                            Toast.makeText(this,this.getResources().getString(R.string.Todofine1)+list.size()+this.getResources().getString(R.string.Todofine2),Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(this, this.getResources().getString(R.string.Alarma2), Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(this, this.getResources().getString(R.string.Alarma3), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, this.getResources().getString(R.string.Alarma4), Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(this,this.getResources().getString(R.string.Alarma5),Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this,this.getResources().getString(R.string.Alarma6),Toast.LENGTH_SHORT).show();
        }
    }
}
