package co.wideo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.wideo.demo.dao.WideoDAO;
import co.wideo.demo.model.WideoVO;

@Service
public class WideoManagerImpl implements WideoManager {

	@Autowired
	WideoDAO dao;
	
	public List<WideoVO> getAllWideos() 
	{
		return dao.getInstance();
	}
}
