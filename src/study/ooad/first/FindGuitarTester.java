package study.ooad.first;

import java.util.List;

public class FindGuitarTester {

	/**
	 * 첫번째 수업
	 * 
	 * 릭이라는 고객은 기타를 판매하고 있습니다. 릭은 기타들을 효율적으로 관리하고
	 * 싶어하는데, 서류 중심의 시스템을 버리고 컴퓨터로 재고 관리 시스템을 도입하고
	 * 싶어합니다.
	 * 
	 * 요구 사항에 맞게
	 * 기타 정보가 있는 Guita.java
	 * 재고 정보가 있는 Inventory.java
	 * 를 설계했습니다.
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
//		Guitar whatErinLikes = new Guitar("", 0, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		Guitar whatErinLikes = new Guitar("", 0, 
				Builder.FENDER, "Stratocastor", 
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		
//		Guitar guitar = inventory.search(whatErinLikes);
//		if (guitar != null) {
//			System.out.println("Erin, you might like this " +
//				guitar.getBuilder() + " " + guitar.getModel() +  " " +
//				guitar.getType() + " guitar:\n   " +
//				guitar.getBackWood() + " back and sides,\n   " +
//				guitar.getTopWood() + " top.\nYou can have it for only $" +
//				guitar.getPrice() + "!");
//			
//		} else {
//			System.out.println("Sorry, Erin, we have nothing for you.");
//		}
		
		
		/**
		 * 그런데 main을 실행하면 결과가 guitar 객체가 null이어서 "Sorry, Erin, we have nothing for you."
		 * 가 출력됩니다!
		 * 
		 * 기타 가게에 맞는 기타가 있는데도 왜 이런 결과가 나온걸까요? 무엇이 잘 못 된걸까요?
		 */
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars: ");
			
			for (Guitar matchingGuitar : matchingGuitars) {
				System.out.println("We habe a " +
				matchingGuitar.getBuilder() + " " + matchingGuitar.getModel() +  " " +
				matchingGuitar.getType() + " guitar:\n   " +
				matchingGuitar.getBackWood() + " back and sides,\n   " +
				matchingGuitar.getTopWood() + " top.\nYou can have it for only $" +
				matchingGuitar.getPrice() + "!\n ----");
			}
			
				
			
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
		
	}
	
	/**
	 * Inventory 객체에 임시로 테스트 데이터를 담는 메소드입니다.
	 * @param inventory
	 */
	private static void initializeInventory(Inventory inventory) {
//		inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic","Indian Rosewood", "Sitka");
//		inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric","Alder", "Alder");
//		inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electric","Alder", "Alder");
//		inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic", "Mahogany", "Adirondack");
//		inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic", "Brazilian Rosewood", "Adriondack");
//		inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric", "Mahogany", "Maple");
//		inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue", "electric", "Mahogany", "Mahogany");
//		inventory.addGuitar("77023", 6275.95, "Martin", "D-28", "acoustic", "Brazilian Rosewood", "Adirondack");
//		inventory.addGuitar("1092", 12995.95, "Olson", "SJ", "acoustic", "Indian Rosewood", "Cedar");
//		inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic", "Cocobolo", "Cedar");
//		inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature", "electric", "Mahogany", "Maple");
		
		
		inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "CJ", 
							Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA);
		
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", 
							Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", 
							Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

		inventory.addGuitar("122784", 5495.95, Builder.MARTIN, "D-18", 
							Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK);

		inventory.addGuitar("76531", 6295.95, Builder.MARTIN, "OM-28", 
							Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK);
		
		inventory.addGuitar("70108276", 2295.95, Builder.GIBSON, "Les Paul", 
							Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY);
		
		inventory.addGuitar("82765501", 1890.95, Builder.GIBSON, "SG '61 Reissue", 
							Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY);
		
		inventory.addGuitar("77023", 6275.95, Builder.MARTIN, "D-28", 
							Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK);
		
		inventory.addGuitar("1092", 12995.95, Builder.OLSON, "SJ", 
							Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.CEDAR);
		
		inventory.addGuitar("566-62", 8999.95, Builder.RYAN, "Cathedral", 
							Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR);
		
		inventory.addGuitar("6 29584", 2100.95, Builder.PRS, "Dave Navarro Signature", 
							Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);

	}

}
