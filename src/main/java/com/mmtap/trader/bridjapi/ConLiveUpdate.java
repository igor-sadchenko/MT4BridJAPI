package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * ---<br>
 * <i>native declaration : MT4ManagerAPI.h:406</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class ConLiveUpdate extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * company<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(0) 
	public Pointer<Byte > company() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * path to LiveUpdate<br>
	 * C type : char[256]
	 */
	@Array({256}) 
	@Field(1) 
	public Pointer<Byte > path() {
		return this.io.getPointerField(this, 1);
	}
	/** version */
	@Field(2) 
	public int version() {
		return this.io.getIntField(this, 2);
	}
	/** version */
	@Field(2) 
	public ConLiveUpdate version(int version) {
		this.io.setIntField(this, 2, version);
		return this;
	}
	/** build */
	@Field(3) 
	public int build() {
		return this.io.getIntField(this, 3);
	}
	/** build */
	@Field(3) 
	public ConLiveUpdate build(int build) {
		this.io.setIntField(this, 3, build);
		return this;
	}
	/** max. simultaneous connections */
	@Field(4) 
	public int maxconnect() {
		return this.io.getIntField(this, 4);
	}
	/** max. simultaneous connections */
	@Field(4) 
	public ConLiveUpdate maxconnect(int maxconnect) {
		this.io.setIntField(this, 4, maxconnect);
		return this;
	}
	/** current connections (read only) */
	@Field(5) 
	public int connections() {
		return this.io.getIntField(this, 5);
	}
	/** current connections (read only) */
	@Field(5) 
	public ConLiveUpdate connections(int connections) {
		this.io.setIntField(this, 5, connections);
		return this;
	}
	/** type LIVE_UPDATE_* */
	@Field(6) 
	public int type() {
		return this.io.getIntField(this, 6);
	}
	/** type LIVE_UPDATE_* */
	@Field(6) 
	public ConLiveUpdate type(int type) {
		this.io.setIntField(this, 6, type);
		return this;
	}
	/** enable */
	@Field(7) 
	public int enable() {
		return this.io.getIntField(this, 7);
	}
	/** enable */
	@Field(7) 
	public ConLiveUpdate enable(int enable) {
		this.io.setIntField(this, 7, enable);
		return this;
	}
	/** total files count */
	@Field(8) 
	public int totalfiles() {
		return this.io.getIntField(this, 8);
	}
	/** total files count */
	@Field(8) 
	public ConLiveUpdate totalfiles(int totalfiles) {
		this.io.setIntField(this, 8, totalfiles);
		return this;
	}
	/**
	 * files' configurations<br>
	 * C type : LiveInfoFile[(128)]
	 */
	@Array({128}) 
	@Field(9) 
	public Pointer<LiveInfoFile > files() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * reserved<br>
	 * C type : int[16]
	 */
	@Array({16}) 
	@Field(10) 
	public Pointer<Integer > reserved() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * internal data<br>
	 * C type : ConLiveUpdate*
	 */
	@Field(11) 
	public Pointer<ConLiveUpdate > next() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * internal data<br>
	 * C type : ConLiveUpdate*
	 */
	@Field(11) 
	public ConLiveUpdate next(Pointer<ConLiveUpdate > next) {
		this.io.setPointerField(this, 11, next);
		return this;
	}
	public ConLiveUpdate() {
		super();
	}
	public ConLiveUpdate(Pointer pointer) {
		super(pointer);
	}
}
