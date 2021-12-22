package co.wideo.demo.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import co.wideo.demo.dao.WideoDAO;
import co.wideo.demo.model.WideoVO;
import co.wideo.demo.service.WideoManagerImpl;

@RunWith(MockitoJUnitRunner.class)
public class WideoManagerTest {

	@Mock
	WideoDAO wideoDao;
		
	@InjectMocks
	WideoManagerImpl wideoManager;
		
	@Test
	public void contextLoads() throws Exception {
		assertThat(wideoManager).isNotNull();
	}
	
	@Test
	public void testGetAllWideo() {
		
		List<WideoVO> wideos = new ArrayList<WideoVO>();
		
		String JSON1 = "\r\n" + 
				"{\"id\":\"1\",\"class\":\"wideo\",\"timeStamp\":0,\"version\":6,\"width\":1080,\"height\":1080,\"scenes\":[]}";
		String JSON2 = "\r\n" + 
				"{\"id\":\"2\",\"class\":\"wideo\",\"timeStamp\":0,\"version\":6,\"width\":1080,\"height\":1080,\"scenes\":[]}";

		
		WideoVO vo1 = new WideoVO();
		vo1.setId(1);
		vo1.setName("Wideo 1");
		vo1.setJson(JSON1);
		wideos.add(vo1);
		
		WideoVO vo2 = new WideoVO();
		vo2.setId(2);
		vo2.setName("Wideo 2");
		vo2.setJson(JSON2);
		wideos.add(vo2);
		
		when(wideoDao.getInstance()).thenReturn(wideos);
		
		List<WideoVO> w = wideoManager.getAllWideos(); 
		
		assertEquals(wideos, w);
	}
}
