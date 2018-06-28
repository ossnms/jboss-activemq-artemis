package org.apache.activemq.artemis.ra;

@FunctionalInterface
public interface ExceptionalSupplier<T, E extends Exception> {
    T get() throws E;
}
