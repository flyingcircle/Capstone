package me.capstone.advancedbattle.tile.piece.unit;

import me.capstone.advancedbattle.tile.TileType;
import me.capstone.advancedbattle.tile.piece.Piece;

// Class for the Battleship piece. We will put health, fuel, damage, movement speed, and sight in here.
public class Battleship extends Piece {

	public Battleship(int row, int column) {
		super(row, column, TileType.BATTLESHIP);
	}

}