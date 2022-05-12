package me.matthewmcdaniel;

import java.net.spi.InetAddressResolver;
import java.net.spi.InetAddressResolverProvider;

//  Source: https://blogs.oracle.com/javamagazine/post/java-18-gems-jdks
public class HelloWorldInternetAddressResolverProvider extends InetAddressResolverProvider {
    @Override
    public InetAddressResolver get(Configuration configuration) {
        return new HelloWorldInternetAddressResolver();
    }

    @Override
    public String name() {
        return "Hello World Provider";
    }
}
