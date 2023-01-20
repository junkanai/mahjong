package enums;

public enum TileType {
	EAST(1),
	SOUTH(2),
	WEST(3),
	NORTH(4),
	WHITE(5),
	GREEN(6),
	RED(7),

	S_1(11),
	S_2(12),
	S_3(13),
	S_4(14),
	S_5(15),
	S_6(16),
	S_7(17),
	S_8(18),
	S_9(19),

	M_1(21),
	M_2(22),
	M_3(23),
	M_4(24),
	M_5(25),
	M_6(26),
	M_7(27),
	M_8(28),
	M_9(29),

	P_1(31),
	P_2(33),
	P_3(33),
	P_4(34),
	P_5(35),
	P_6(36),
	P_7(37),
	P_8(38),
	P_9(39);

	private final int id;

	private TileType(int tileType) {
		this.id = tileType;
	}

	public boolean isS() {
		return S_1.id <= this.id && this.id <= S_9.id;
	}

	public boolean isM() {
		return M_1.id <= this.id && this.id <= M_9.id;
	}

	public boolean isP() {
		return P_1.id <= this.id && this.id <= P_9.id;
	}

	public boolean isNumber() {
		return S_1.id <= this.id && this.id <= P_9.id;
	}

	public boolean isChar() {
		return EAST.id <= this.id && this.id <= RED.id;
	}

	public boolean is2to8() {
		return (S_2.id <= this.id && this.id <= S_8.id)
			|| (M_2.id <= this.id && this.id <= M_8.id)
			|| (P_2.id <= this.id && this.id <= P_8.id);
	}

	public boolean is1or9() {
		return this == S_1 || this == S_9 || this == M_1
			|| this == M_9 || this == P_1 || this == P_9;
	}

	public boolean isWGR() {
		return this == WHITE || this == GREEN || this == RED;
	}

	public boolean isSameDirection(Direction direction) {
		return ( direction == Direction.EAST && this == EAST )
			|| ( direction == Direction.WEST && this == WEST )
			|| ( direction == Direction.SOUTH && this == SOUTH )
			|| ( direction == Direction.NORTH && this == NORTH );
	}
}
