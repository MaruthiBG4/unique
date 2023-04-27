package com.example.demo.entity;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsondemo 
{
   public static void main(String[] args) {
	
	   ObjectMapper objectMapper = new ObjectMapper();
	   
	   Employee employee = new Employee( "jack", "bnglr", "IT", "Engineer");
	   objectMapper.writeValue(new File(), employee);
	   
	   
	   
}

}
