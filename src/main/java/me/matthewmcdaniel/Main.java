package me.matthewmcdaniel;

import com.sun.net.httpserver.SimpleFileServer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;
import java.net.spi.InetAddressResolverProvider;

// Source: https://blogs.oracle.com/javamagazine/post/java-18-gems-jdks
public class Main {
    public static void main(String[] args) {

        try {
            InetAddress[] addr = InetAddress.getAllByName("hi");
            for (InetAddress i : addr) {
                System.out.println("Host Address: " + i.getHostAddress()); // Calls lookupByName in HelloWorldInternetAddressResolver.java
                System.out.println("Canonical Hostname: " + i.getCanonicalHostName()); // Calls lookupByAddress in HelloWorldInternetAddressResolver.java
                System.out.println("Hostname: " + i.getHostName());

            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}