package com.akmozo.site.form;

import com.akmozo.zframework.form.ActionForm;

public class LoginForm implements ActionForm {
    
    private String login;
    private String pass;
    private int num;

    public LoginForm() {
    }

    public LoginForm(String paramLogin, String paramPass) {
        this.login = paramLogin;
        this.pass = paramPass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String paramLogin) {
        this.login = paramLogin;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String paramPass) {
        this.pass = paramPass;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int paramNum) {
        this.num = paramNum;
    }

    @Override
    public boolean validateForm() {
        return !"".equals(login) && !"".equals(pass) && num > 0;
    }

}
