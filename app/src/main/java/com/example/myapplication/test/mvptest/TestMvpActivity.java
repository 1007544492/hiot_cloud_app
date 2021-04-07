package com.example.myapplication.test.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.test.mvptest.modle.User;

public class TestMvpActivity extends AppCompatActivity implements TestView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvp);
        final EditText username = findViewById(R.id.et_username);
        final EditText passwd = findViewById(R.id.et_passwd);
        final Button login = findViewById(R.id.bt_login);
        final User user = new User();
        final TestPresenter presenter = new TestPresenter(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mvc做法，在这里做身份校验
                user.setUserName(username.getText().toString());
                user.setPasswd(passwd.getText().toString());
                presenter.login(user);
 //             login(user);
            }
        });
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
//   private void login(User user){
//        if("lisi".equals(user.getUserName()) && "123".equals(user.getPasswd())){
//            Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this, "登陆失败", Toast.LENGTH_SHORT).show();
//        }
//    }
}
