package hr.bm.vs.power.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hr.bm.vs.power.backing.ZaruljeBacking;
import hr.bm.vs.power.domain.DataDTO;

/**
 * Created by Alex on 18/03/2015.
 */

@RestController
public class PowerController {

	@Autowired
	private JavaMailSender sender;

	@RequestMapping("/service/power")
	public @ResponseBody Iterable<DataDTO> getAllBooks() {
		ArrayList<DataDTO> dataList = new ArrayList<DataDTO>();
		DataDTO data = new DataDTO();
		data.setId(new Long("3"));
		data.setContent("Sadrzaj");

		dataList.add(data);
		return dataList;
	}

	@RequestMapping(value = "/service/power/{id}", method = RequestMethod.GET)
	public @ResponseBody DataDTO getBookById(@PathVariable Long id) throws Exception {
		// System.out.println("id = " + id);

		// MimeMessage message = sender.createMimeMessage();
		// MimeMessageHelper helper = new MimeMessageHelper(message);
		//
		// helper.setTo("vinko_stanic@yahoo.com");
		// helper.setCc("branko.mlikota@yahoo.com");
		// helper.setText("Pozdrav Vinko! \n"
		// + "Ovaj mail ti je poslao java rest servis spojen na moj "
		// + "gmail racun :-) \n"
		// + "Arduino je inicirao slanje tako sto je poslao request "
		// + "prema servisu. U requestu je kao path varijabla poslan broj = " + id + "!
		// \n"
		// + ":-D");
		// helper.setSubject("Hi from Arduino :-)");
		// sender.send(message);
		//
		System.out.println("id = " + id);
		DataDTO data = new DataDTO();
		data.setId(new Long("3"));
		data.setContent("Sadrzaj");
		data.setPoruka("#" + (ZaruljeBacking.isCrvena ? 1 : 0) + "*" + (ZaruljeBacking.isZuta ? 1 : 0) + "*");

		return data;
	}

}
