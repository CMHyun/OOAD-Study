package study.ooad.first;

public class FindGuitarTester {

	public static void main(String[] args) {
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
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
		
		Guitar guitar = inventory.search(whatErinLikes);
		
		if (guitar != null) {
			System.out.println("Erin, you might like this " +
				guitar.getBuilder() + " " + guitar.getModel() +  " " +
				guitar.getType() + " guitar:\n   " +
				guitar.getBackWood() + " back and sides,\n   " +
				guitar.getTopWood() + " top.\nYou can have it for only $" +
				guitar.getPrice() + "!");
			
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
		
	}
	
	/**
	 * Inventory 객체에 임시로 테스트 데이터를 담는 메소드입니다.
	 * @param inventory
	 */
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic","Indian Rosewood", "Sitka");
		inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric","Alder", "Alder");
		inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electric","Alder", "Alder");
		inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic", "Mahogany", "Adirondack");
		inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic", "Brazilian Rosewood", "Adriondack");
		inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric", "Mahogany", "Maple");
		inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue", "electric", "Mahogany", "Mahogany");
		inventory.addGuitar("77023", 6275.95, "Martin", "D-28", "acoustic", "Brazilian Rosewood", "Adirondack");
		inventory.addGuitar("1092", 12995.95, "Olson", "SJ", "acoustic", "Indian Rosewood", "Cedar");
		inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic", "Cocobolo", "Cedar");
		inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature", "electric", "Mahogany", "Maple");
	}

}
