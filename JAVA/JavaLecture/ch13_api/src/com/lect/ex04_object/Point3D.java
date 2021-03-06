package com.lect.ex04_object;

public class Point3D implements Cloneable{
	private int x;
	private int y;
	private int z;
	
	public Point3D() {}

	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Point3D) {
			boolean xChk= x==((Point3D)obj).x;
			boolean yChk= y==((Point3D)obj).y;
			boolean zChk= z==((Point3D)obj).z;
			return xChk&&yChk&&zChk;
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%d,%d,%d]",x,y,z);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
