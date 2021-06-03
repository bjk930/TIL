package strategy.step4.module;

import strategy.step4.component.FlyImpl;
import strategy.step4.component.KnifeImpl;
import strategy.step4.component.MissileImpl;

public class Robot {
	private FlyImpl fly;
	private MissileImpl missile;
	private KnifeImpl knife;
	public void shape() {
		System.out.println(getClass().getName()+"은 팔, 다리, 머리, 몸통으로 이루어져 있다.");
	}
	public void actionWalk() {
		System.out.println("걸을 수 있다.");
	}
	public void actionRun() {
		System.out.println("뛸 수 있다.");
	}
	public void actionFly() {
		fly.fly();}
	public void actionMissile() {
		missile.Missile();
	}
	public void actionKnife() {
		knife.knife();
	}
	public FlyImpl getFly() {
		return fly;
	}
	public void setFly(FlyImpl fly) {
		this.fly = fly;
	}
	public MissileImpl getMissile() {
		return missile;
	}
	public void setMissile(MissileImpl missile) {
		this.missile = missile;
	}
	public KnifeImpl getKnife() {
		return knife;
	}
	public void setKnife(KnifeImpl knife) {
		this.knife = knife;
	}
	
}
