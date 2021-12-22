package co.wideo.demo.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class WideoVO implements Serializable 
{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String json;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
	@Override
	public String toString() {
		return "WideoVO [id=" + id + ", name=" + name + ", json=" + json + "]";
	}
	
}