package com.booking;

import java.util.Date;

public class Doctor extends User {

    public enum Speciality{CARDIO, PATHO, PSYCHO, PNEUMO};
    private final Speciality speciality;
    private final String email;
    private final String telephone;

    public static class Builder extends User.Builder<Builder>{
        private final Speciality speciality;
        private final String email;
        private final String telephone;

        public Builder(Speciality speciality, String email, String telephone) {
            this.speciality = speciality;
            this.email = email;
            this.telephone = telephone;
        }

        @Override
        public Doctor build() {
            return new Doctor(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Doctor(Builder builder){
        super(builder);
        this.email = builder.email;
        this.telephone = builder.telephone;
        this.speciality = builder.speciality;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
}
