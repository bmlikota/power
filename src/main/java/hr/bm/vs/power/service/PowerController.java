package hr.bm.vs.power.service;

import java.awt.print.Book;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hr.bm.vs.power.domain.DataDTO;

/**
 * Created by Alex on 18/03/2015.
 */

@RestController
public class PowerController {

	@RequestMapping("/service/books")
	public @ResponseBody Iterable<DataDTO> getAllBooks() {
		ArrayList<DataDTO> dataList = new ArrayList<DataDTO>();
		DataDTO data = new DataDTO();
		data.setId(new Long("3"));
		data.setContent("Sadrzaj");

		dataList.add(data);
		return dataList;
	}

	@RequestMapping(value = "/service/book/{id}", method = RequestMethod.GET)
	public @ResponseBody DataDTO getBookById(@PathVariable Long id) {
		System.out.println("id = " + id);
		DataDTO data = new DataDTO();
		data.setId(new Long("3"));
		data.setContent("Sadrzaj");

		return data;
	}
}
