package test;

import enums.*;

public class Test1 {
	public Test1() {
		System.out.println("TileType test:");
		Direction tc = Direction.NORTH;
		TileType tt = TileType.NORTH;
		System.out.println(tt.isSameDirection(tc));
		System.out.println(tt.isSameDirection(Direction.WEST));
	}
}
