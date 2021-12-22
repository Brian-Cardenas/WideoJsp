package co.wideo.demo.dao;

import java.util.List;

import co.wideo.demo.model.WideoVO;

public interface WideoDAO 
{
	public List<WideoVO> getAllWideos();
	public List<WideoVO> getInstance();
}