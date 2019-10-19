package com.example.assignment2adnroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtUserId;
    EditText edtPassword;
    TextView txtError;
    Button btnLogin;
    String userid,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final StudentDateSaurce studentDateSaurce=StudentDateSaurce.getInstance();

        for (int i=1;i<=10;i++)
        {
            Student student=new Student();
            student.name="Amar"+i;
           student.Id=i;
           student.Password=""+i+10;
           studentDateSaurce.addStudent(student);
        }

        edtUserId=findViewById(R.id.edtUserId);
        edtPassword=findViewById(R.id.edtPassword);
        txtError=findViewById(R.id.txterror);
        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

             boolean status=false;
           userid=edtUserId.getText().toString();
             password=edtPassword.getText().toString();

             for (int j=0;j<studentDateSaurce.getStudentCount();j++)
             {
                Student student=studentDateSaurce.getStudent(j);
                if (userid.equalsIgnoreCase(""+student.Id)&& password.equalsIgnoreCase(student.Password))
                {
                    status=true;
                }
                if(status==true)
                {
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
              else
                {
                    txtError.setText("Invalid");
                }
             }
            }
        });
    }
}
