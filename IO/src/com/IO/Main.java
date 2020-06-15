package com.IO;

import javax.xml.stream.Location;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
    }
}