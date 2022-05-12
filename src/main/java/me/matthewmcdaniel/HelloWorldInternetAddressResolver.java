package me.matthewmcdaniel;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;
import java.util.stream.Stream;

// Source: https://blogs.oracle.com/javamagazine/post/java-18-gems-jdks
public class HelloWorldInternetAddressResolver implements InetAddressResolver {
    @Override
    public Stream<InetAddress> lookupByName(String host, LookupPolicy lookupPolicy) throws UnknownHostException {
        return Stream.of(InetAddress.getByAddress(new byte[]{127,0,0,1}));
    }

    @Override
    public String lookupByAddress(byte[] addr) throws UnknownHostException {
        return "localhost";
    }
}
