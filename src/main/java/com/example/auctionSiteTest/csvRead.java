package com.example.auctionSiteTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class csvRead {

    CSVReader signup_data_read;

    {
        try {
            signup_data_read = new CSVReader (new FileReader(""));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    String[] csvCell;

}
