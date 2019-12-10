package _2019_12_10;

import java.util.ArrayList;

import _2019_12_10.dao.DeptDao;
import _2019_12_10.dto.DeptDTO;

public class DeptDemo {
	public static void main(String[] args) {
		DeptDao d = DeptDao.getInstance();
		//boolean isSuccess =d.insert(new DeptDTO(50, "DEVELOPERS","TEXTS"));
		//System.out.println(isSuccess);
		/*boolean isSuccess =d.update(new DeptDTO(50, "DEVELOPERS","LA"));
		System.out.println(isSuccess);*/	
		
		/*boolean isSuccess =d.delete(50);
		System.out.println(isSuccess);*/
		
		/*ArrayList<DeptDTO> list = d.select();
		for (DeptDTO dto: list){
			System.out.printf("%d,%s, %s%n", dto.getNo(), dto.getName(), dto.getLoc());
			
		}*/
		
		DeptDTO dto =d.select(50); 
		if(dto == null){
			System.out.println("데이터가 존재하지 않습니다.");
			
		}else{
				System.out.printf("%d,%s, %s%n", dto.getNo(), dto.getName(), dto.getLoc());
			}
		}
		
	}

