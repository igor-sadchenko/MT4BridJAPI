package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * ---<br>
 * <i>native declaration : MT4ManagerAPI.h:1330</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public abstract class SymbolProperties extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * symbol<br>
	 * C type : char[12]
	 */
	@Array({12}) 
	@Field(0) 
	public Pointer<Byte > symbol() {
		return this.io.getPointerField(this, 0);
	}
	/** Conversion Error : COLORREF (failed to convert type to Java (undefined type)) */
	/** symbol spread */
	@Field(2) 
	public int spread() {
		return this.io.getIntField(this, 2);
	}
	/** symbol spread */
	@Field(2) 
	public SymbolProperties spread(int spread) {
		this.io.setIntField(this, 2, spread);
		return this;
	}
	/** spread balance */
	@Field(3) 
	public int spread_balance() {
		return this.io.getIntField(this, 3);
	}
	/** spread balance */
	@Field(3) 
	public SymbolProperties spread_balance(int spread_balance) {
		this.io.setIntField(this, 3, spread_balance);
		return this;
	}
	/** stops level */
	@Field(4) 
	public int stops_level() {
		return this.io.getIntField(this, 4);
	}
	/** stops level */
	@Field(4) 
	public SymbolProperties stops_level(int stops_level) {
		this.io.setIntField(this, 4, stops_level);
		return this;
	}
	/** smoothing */
	@Field(5) 
	public int smoothing() {
		return this.io.getIntField(this, 5);
	}
	/** smoothing */
	@Field(5) 
	public SymbolProperties smoothing(int smoothing) {
		this.io.setIntField(this, 5, smoothing);
		return this;
	}
	/** execution mode */
	@Field(6) 
	public int exemode() {
		return this.io.getIntField(this, 6);
	}
	/** execution mode */
	@Field(6) 
	public SymbolProperties exemode(int exemode) {
		this.io.setIntField(this, 6, exemode);
		return this;
	}
	/**
	 * reserved<br>
	 * C type : int[8]
	 */
	@Array({8}) 
	@Field(7) 
	public Pointer<Integer > reserved() {
		return this.io.getPointerField(this, 7);
	}
}
