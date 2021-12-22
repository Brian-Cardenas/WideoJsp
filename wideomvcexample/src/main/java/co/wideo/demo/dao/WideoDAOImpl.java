package co.wideo.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.wideo.demo.model.WideoVO;

@Repository
public class WideoDAOImpl implements WideoDAO {
	
	List<WideoVO> wideos = new ArrayList<WideoVO>();
	private static List<WideoVO> single_instance = null;
	
	
	private static final String JSON1 = "\r\n" + 
			"{\"id\":\"1\",\"class\":\"wideo\",\"timeStamp\":0,\"version\":6,\"width\":1080,\"height\":1080,\"scenes\":[]}";
	private static final String JSON2 = "\r\n" + 
			"{\"id\":\"2\",\"class\":\"wideo\",\"timeStamp\":0,\"version\":6,\"width\":1080,\"height\":1080,\"scenes\":[]}";

	
	private WideoDAOImpl() {
		WideoVO vo1 = new WideoVO();
		this.single_instance = new ArrayList<WideoVO>();
		vo1.setId(1);
		vo1.setName("Wideo 1");
		vo1.setJson(JSON1);
		this.single_instance.add(vo1);
		
		WideoVO vo2 = new WideoVO();
		vo2.setId(2);
		vo2.setName("Wideo 2");
		vo2.setJson(JSON2);
		this.single_instance.add(vo2);
	}

	public WideoDAOImpl(List<WideoVO> wideos) {
		super();
		this.wideos = wideos;
	}

	@SuppressWarnings("unchecked")
	public List<WideoVO> getInstance()
    {
        if (single_instance == null)
        	single_instance = (List<WideoVO>) new WideoDAOImpl();
 
        return single_instance;
    }

	public List<WideoVO> getAllWideos() 
	{
		return this.wideos;
	}
}