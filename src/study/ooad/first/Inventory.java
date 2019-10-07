package study.ooad.first;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	
	// Default Constructor
	/**
	 * 기본 생성자입니다.
	 * 생성자에서 List 타입의 변수인 guitars 변수가
	 * ArrayList로 생성됩니다.
	 * 
	 * ArrayList를 사용한 이유는 각각의 데이터 인덱스를 가지고 있어
	 * 검색에 유리하기 때문입니다.
	 */
	public Inventory() {
		this.guitars = new ArrayList<Guitar>();
	}
	
	
	// Getter
	public List<Guitar> getGuitars() {
		return guitars;
	}
	
	
	/**
	 * 이 메소드는 기타의 세부 정보를 받아서 Guitar 객체를 생성하고
	 * 그 객체를 릭의 재고 목록에 추가합니다.
	 * @param serialNumber
	 * @param price
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	public void addGuitar(String serialNumber, double price, 
					 String builder, String model, 
					 String type, String backWood,
					 String topWood) 
	{
		Guitar guitar = new Guitar(serialNumber, price, 
								builder, model, type, 
								backWood, topWood);
		
		guitars.add(guitar);
	}

	/**
	 * 이 메소드는 기타의 일련번호를 매개 변수로 받아들여 Guitar 객체를 반환합니다. 
	 * @param serialNumber
	 * @return
	 */
	public Guitar getGuitar(String serialNumber) {
		
		for (Guitar guitar : guitars) {
			if (guitar.getSerialNumber().equals(serialNumber))
				return guitar;
		}
		
		return null;
	}
	
	
	/**
	 * 이 메소드는 고객이 원하는 기타 정보를 받아서 검색하는 메소드입니다.
	 * 고객이 원하는 사양에 가장 잘 맞아 떨어지는 기타를 릭의 재고 목록에서 찾아줍니다.
	 * @param searchGuitar
	 * @return
	 */
	public Guitar search(Guitar searchGuitar) {
		
		for (Guitar guitar : guitars) {
			// 가격과 일려번호는 유일한 값이니깐 무시!
			
			String builder = searchGuitar.getBuilder();
		    if ((builder != null) && (!builder.equals("")) &&
		    		(!builder.equals(guitar.getBuilder())))
		    	continue;
		      
		    String model = searchGuitar.getModel();
		    if ((model != null) && (!model.equals("")) &&
		    		(!model.equals(guitar.getModel())))
		    	continue;
		      
		    String type = searchGuitar.getType();
		    if ((type != null) && (!searchGuitar.equals("")) &&
		    		(!type.equals(guitar.getType())))
		    	continue;
		      
		    String backWood = searchGuitar.getBackWood();
		    if ((backWood != null) && (!backWood.equals("")) &&
		    		(!backWood.equals(guitar.getBackWood())))
		    	continue;
		      
		    String topWood = searchGuitar.getTopWood();
		    if ((topWood != null) && (!topWood.equals("")) &&
		    		(!topWood.equals(guitar.getTopWood())))
		    	continue;
		      
		    return guitar;
		}
		
		return null;
	}
	
	
	

	
	
}
