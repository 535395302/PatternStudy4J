package pattern.proxy.protect;

import sun.org.mozilla.javascript.internal.json.JsonParser;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Tian
 * @version 1.0
 * @date 2015-10-07 17:50
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersionBean person;
    public OwnerInvocationHandler(PersionBean owner) {
        person = owner;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("setHotOrNotRating")){
            throw new IllegalAccessException("No access....");
        }
        return method.invoke(person,args);
    }
}
