package com.JSON;

import com.fasterxml.jackson.core.JsonToken;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JsonSchemaTrial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String filePath;
        System.out.println("Enter FilePath for fetching json data:=");
        filePath = sc.next();
        File schemaFile = new File("src/main/resources/jjSon.json");
        JSONTokener schemaData = new JSONTokener(new FileInputStream(schemaFile));
        JSONObject jsonSchema = new JSONObject(schemaData);

        //JSON DATA
        File jsonData = new File(filePath);
        JSONTokener jsonDataFile = new JSONTokener(new FileInputStream(jsonData));
        JSONObject jsonObject = new JSONObject(jsonDataFile);

        //Schema Validator
        Schema schemaValidator = SchemaLoader.load(jsonSchema);
        schemaValidator.validate(jsonObject);

        System.out.println(jsonObject.getInt("id"));
        System.out.println(jsonObject.getString("name"));
        System.out.println(jsonObject.getDouble("price"));
        System.out.println(jsonObject.getString("dob"));

        }


    }

