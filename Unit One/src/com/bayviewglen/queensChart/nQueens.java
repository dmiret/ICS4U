package com.bayviewglen.queensChart;

public class nQueens {

	private int coordinateY;
	private int corrdinateX;
	
		
	public nQueens() {
		super();
		this.coordinateY=0;
		this.corrdinateX=0;
	}
	public nQueens(int coordinateY, int corrdinateX) {
		super();
		this.coordinateY = coordinateY;
		this.corrdinateX = corrdinateX;
	}
	public int getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}
	public int getCorrdinateX() {
		return corrdinateX;
	}
	public void setCorrdinateX(int corrdinateX) {
		this.corrdinateX = corrdinateX;
	}
	
	
}

