package pattern.proxy.protect;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Test a = new Test();

        PersionBean jack = new PersionBeanImpl();
        jack.setName("Jack Ben");
        jack.setGender("Male");
        jack.setInterests("Read,Cook,Balls");
        PersionBean owner = a.getOwnerProxy(jack);

        owner.setHotOrNotRating(12);
        System.out.println(owner.getHotOrNotRating());
    }

    public PersionBean getOwnerProxy(PersionBean owner) {
        return (PersionBean) Proxy.newProxyInstance(
                owner.getClass().getClassLoader(),
                owner.getClass().getInterfaces(),
                new OwnerInvocationHandler(owner)
            );
    }
}
