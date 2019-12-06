package com.bridgelabz.oops.inventorymanagement_of_rice.repository;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oops.inventorymanagement_of_rice.models.*;
/**
 * @author Premsai Manthani
 * @purpose : this performs the implementation of adding a pulse deleting a
 *          pulse and what is the value of each pulse.
 *          
 *          
 */
public class file_connection {
	ObjectMapper mapper = new ObjectMapper();
	inventory_data p = new inventory_data();
	File file = new File("details_of_pulses.json");

	public LinkedList<inventory_data> readFile() throws JsonParseException, JsonMappingException, IOException {
		LinkedList<inventory_data> listOf = mapper.readValue(file, new TypeReference<LinkedList<inventory_data>>() {
		});
		return listOf;
	}

	@SuppressWarnings("deprecation")
	public void writeFile(List<inventory_data> listOfPerson) throws IOException {

		mapper.defaultPrettyPrintingWriter().writeValue(file, listOfPerson);
	}
}
