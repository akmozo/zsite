package com.akmozo.site.bean;

import com.akmozo.zframework.action.Action;
import javax.servlet.http.HttpServletRequest;

public class LoginAction implements Action {

    @Override
    public String execute(HttpServletRequest paramRequest) {        
        return "hello";        
    }

}
