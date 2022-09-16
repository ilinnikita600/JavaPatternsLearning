package DeputyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        PersonBean personBean = new PersonBeanImpl();
        PersonBean personBean1 = new PersonBeanImpl();

        PersonBean proxy = getProxy(personBean, new NonOwnerInvocationHandler(personBean));
        PersonBean proxy1 = getProxy(personBean1, new OwnerInvocationHandler(personBean));
        proxy.setHotOrNotRating(5);
        System.out.println(proxy.getHotOrNotRating());
    }

    static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    static PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
    static PersonBean getProxy(PersonBean person, InvocationHandler handler) {
        if (handler instanceof NonOwnerInvocationHandler) {
            return getNonOwnerProxy(person);
        }
        return getOwnerProxy(person);
    }
}
