package com.booking;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class User {

    public enum Type{CITIZEN, DOCTOR}
    final Set<Type> types;
    final String firstName;
    final String lastName;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Type> types = EnumSet.noneOf(Type.class);
        String firstName;
        String lastName;

        public T addType(Type type){
            types.add(Objects.requireNonNull(type));
            return self();
        }

        public T firstName(String firstName){
            this.firstName = Objects.toString(firstName);
            return self();
        }

        public T lastName(String lastName){
            this.lastName = Objects.toString(lastName);
            return self();
        }

        abstract User build();
        protected abstract T self();
    }

    User(Builder<?> builder){
        types = builder.types.clone();
        firstName = builder.firstName;
        lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
