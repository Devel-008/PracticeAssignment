package com.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;


public class MainUser {

    public static void main(String[] args) {
       // String fileAddress = null;
        //Scanner sc = new Scanner(System.in);
        JsonUserGetterSetter users =new JsonUserGetterSetter("sgdsk","dshisdh",56, new AddressGetterSetter("gdshgch","hid","sushi","sedgy"));

        ObjectMapper mapper = new ObjectMapper();
       /* try {
            System.out.println("File ka name Dale ::");
            fileAddress = sc.next();
            JsonUserGetterSetter[] user = mapper.readValue(new FileReader(fileAddress), JsonUserGetterSetter[].class);
            System.out.println(mapper.writeValueAsString(user));
        } catch(Exception e) {
            System.out.println(e);
        }*/
        try{
            FileWriter writer = new FileWriter("jjSon.json");
            mapper.writerWithDefaultPrettyPrinter().writeValue(writer,users);
            System.out.println("Success!!1");

        }catch (Exception e){
            System.out.println(""+e);
        }


    }
}
