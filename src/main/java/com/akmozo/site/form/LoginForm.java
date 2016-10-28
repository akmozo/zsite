package com.akmozo.site.form;

import com.akmozo.zframework.form.ActionForm;

public class LoginForm implements ActionForm {
    
    private String login;
    private String pass;

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

    @Override
    public boolean validateForm() {
        return !"".equals(login) && !"".equals(pass);
    }

}
