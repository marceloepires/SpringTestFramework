package com.ea.SpringTestFramework.libraries;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.SimpleThreadScope;

public class BrowserScope extends SimpleThreadScope {

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object o = super.get(name, objectFactory);

//        String sessionId = ((RemoteWebDriver)o).getCurrentUrl();
//
//        if(Objects.isNull(sessionId)) {
//            super.remove(name);
//            o = super.get(name, objectFactory);
//        }
        return o;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }
}
