package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:381</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class ConHoliday extends StructObject {
	static {
		BridJ.register();
	}
	/** year */
	@Field(0) 
	public int year() {
		return this.io.getIntField(this, 0);
	}
	/** year */
	@Field(0) 
	public ConHoliday year(int year) {
		this.io.setIntField(this, 0, year);
		return this;
	}
	/** month */
	@Field(1) 
	public int month() {
		return this.io.getIntField(this, 1);
	}
	/** month */
	@Field(1) 
	public ConHoliday month(int month) {
		this.io.setIntField(this, 1, month);
		return this;
	}
	/** day */
	@Field(2) 
	public int day() {
		return this.io.getIntField(this, 2);
	}
	/** day */
	@Field(2) 
	public ConHoliday day(int day) {
		this.io.setIntField(this, 2, day);
		return this;
	}
	/** work time-from & to (minutes) */
	@Field(3) 
	public int from() {
		return this.io.getIntField(this, 3);
	}
	/** work time-from & to (minutes) */
	@Field(3) 
	public ConHoliday from(int from) {
		this.io.setIntField(this, 3, from);
		return this;
	}
	/** work time-from & to (minutes) */
	@Field(4) 
	public int to() {
		return this.io.getIntField(this, 4);
	}
	/** work time-from & to (minutes) */
	@Field(4) 
	public ConHoliday to(int to) {
		this.io.setIntField(this, 4, to);
		return this;
	}
	/**
	 * security name or symbol's group name or "All"<br>
	 * C type : char[32]
	 */
	@Array({32}) 
	@Field(5) 
	public Pointer<Byte > symbol() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * description<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(6) 
	public Pointer<Byte > description() {
		return this.io.getPointerField(this, 6);
	}
	/** enable */
	@Field(7) 
	public int enable() {
		return this.io.getIntField(this, 7);
	}
	/** enable */
	@Field(7) 
	public ConHoliday enable(int enable) {
		this.io.setIntField(this, 7, enable);
		return this;
	}
	/**
	 * reserved<br>
	 * C type : int[13]
	 */
	@Array({13}) 
	@Field(8) 
	public Pointer<Integer > reserved() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * internal data<br>
	 * C type : ConHoliday*
	 */
	@Field(9) 
	public Pointer<ConHoliday > next() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * internal data<br>
	 * C type : ConHoliday*
	 */
	@Field(9) 
	public ConHoliday next(Pointer<ConHoliday > next) {
		this.io.setPointerField(this, 9, next);
		return this;
	}
	public ConHoliday() {
		super();
	}
	public ConHoliday(Pointer pointer) {
		super(pointer);
	}
}
