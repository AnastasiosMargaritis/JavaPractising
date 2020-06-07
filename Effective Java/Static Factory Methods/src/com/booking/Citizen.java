package com.booking;

import java.util.List;
import java.util.Objects;

public class Citizen extends User{

    private final String email;
    private final String telephone;
    private final List<Child> children;


    public static class Builder extends User.Builder<Builder>{
        private final String email;
        private final String telephone;
        private final List<Child> children;

        public Builder(String email, String telephone, List <Child> children){
            this.email = Objects.requireNonNull(email);
            this.telephone = Objects.requireNonNull(telephone);
            this.children = Objects.requireNonNull(children);
        }

        @Override
        public Citizen build() {
            return new Citizen(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Citizen(Builder builder){
        super(builder);
        this.email = builder.email;
        this.telephone = builder.telephone;
        this.children = builder.children;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public List<Child> getChildren() {
        return children;
    }
}
