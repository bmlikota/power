package hr.bm.vs.power.domain;

/**
 * Created by Alex on 07/03/2015.
 */

public class DataDTO {

	private Long id;
	private String content;
	private String poruka;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPoruka() {
		return poruka;
	}

	public void setPoruka(String poruka) {
		this.poruka = poruka;
	}

}
