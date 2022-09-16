package com.JSON;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

import java.io.File;
import java.util.List;

public class SchemaJackson {
    public static void main(String[] args) {
        ObjectMapper jacksonObjectMapper = new ObjectMapper();
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(jacksonObjectMapper);
        try {
            JsonSchema schema = schemaGen.generateSchema(Person.class);
            String schemaString = jacksonObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
            //writing json schema in file
            jacksonObjectMapper.writeValue(new File("src/main/resources/schema.json"),schemaString);
            System.out.println(schemaString);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
// Person class
class Person {
    private String name;
    private int age;
    private List<String> courses;
    private Address address;
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public List<String> getCourse() {
        return courses;
    }
    public Address getAddress() {
        return address;
    }
}
// Address class
class Address {
    private String firstLine;
    private String secondLine;
    private String thirdLine;
    public String getFirstLine() {
        return firstLine;
    }
    public String getSecondLine() {
        return secondLine;
    }
    public String getThirdLine() {
        return thirdLine;
    }
}

