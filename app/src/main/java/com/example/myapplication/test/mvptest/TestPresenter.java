package com.example.myapplication.test.mvptest;

import com.example.myapplication.test.mvptest.modle.User;

public class TestPresenter {
    private  TestView view;
    public TestPresenter(TestView view) {
        this.view = view;
    }
    public void login(User user){
        if("ccy".equals(user.getUserName()) && "123".equals(user.getPasswd())){
            view.showMessage("登陆成功");
        }else{
            view.showMessage("登陆失败");
        }
    }
}
