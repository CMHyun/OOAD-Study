package study.ooad.first;

public enum Wood {
	
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
	COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD: return "Indian_rosewood";
		case BRAZILIAN_ROSEWOOD: return "Brazilian_rosewood";
		case MAHOGANY:   return "Mahogany";
		case MAPLE: return "Maple";
		case COCOBOLO:    return "Cocobolo";
		case CEDAR:     return "Cedar";
		case ADIRONDACK :     return "Adirondack";
		case ALDER :     return "Alder";
		case SITKA :     return "Sitka";

		default:
			return "unspecified";
		}
	}
	
}
