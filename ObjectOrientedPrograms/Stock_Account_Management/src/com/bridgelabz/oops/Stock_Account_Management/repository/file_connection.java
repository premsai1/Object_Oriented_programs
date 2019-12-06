package com.bridgelabz.oops.Stock_Account_Management.repository;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oops.Stock_Account_Management.models.stock_info;

/**
 * @author Premsai Manthani
 * @purpose : this performs the read ,write from json file.
 * 
 */
public class file_connection {
	// TODO Auto-generated method stub
	ObjectMapper mapper = new ObjectMapper();

	stock_info p = new stock_info();
	File file = new File("stock_market.json");

	public LinkedList<stock_info> readFile() throws JsonParseException, JsonMappingException, IOException {
		LinkedList<stock_info> listOf = mapper.readValue(file, new TypeReference<LinkedList<stock_info>>() {
		});
		return listOf;
	}

	@SuppressWarnings("deprecation")
	public void writeFile(List<stock_info> listOfPerson) throws IOException {

		mapper.defaultPrettyPrintingWriter().writeValue(file, listOfPerson);
	}
}
