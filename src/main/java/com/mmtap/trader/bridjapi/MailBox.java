package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.TimeT;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:1355</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class MailBox extends StructObject {
	static {
		BridJ.register();
	}
	/** receive time */
	@Field(0) 
	public TimeT time() {
		return this.io.getTimeTField(this, 0);
	}
	/** receive time */
	@Field(0) 
	public MailBox time(TimeT time) {
		this.io.setTimeTField(this, 0, time);
		return this;
	}
	/** mail sender (login) */
	@Field(1) 
	public int sender() {
		return this.io.getIntField(this, 1);
	}
	/** mail sender (login) */
	@Field(1) 
	public MailBox sender(int sender) {
		this.io.setIntField(this, 1, sender);
		return this;
	}
	/**
	 * mail sender (name)<br>
	 * C type : char[64]
	 */
	@Array({64}) 
	@Field(2) 
	public Pointer<Byte > from() {
		return this.io.getPointerField(this, 2);
	}
	/** mail recipient */
	@Field(3) 
	public int to() {
		return this.io.getIntField(this, 3);
	}
	/** mail recipient */
	@Field(3) 
	public MailBox to(int to) {
		this.io.setIntField(this, 3, to);
		return this;
	}
	/**
	 * mail sumbect<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(4) 
	public Pointer<Byte > subject() {
		return this.io.getPointerField(this, 4);
	}
	/** readed flag */
	@Field(5) 
	public int readed() {
		return this.io.getIntField(this, 5);
	}
	/** readed flag */
	@Field(5) 
	public MailBox readed(int readed) {
		this.io.setIntField(this, 5, readed);
		return this;
	}
	/**
	 * pointer to mail body<br>
	 * C type : char*
	 */
	@Field(6) 
	public Pointer<Byte > body() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * pointer to mail body<br>
	 * C type : char*
	 */
	@Field(6) 
	public MailBox body(Pointer<Byte > body) {
		this.io.setPointerField(this, 6, body);
		return this;
	}
	/** mail body length */
	@Field(7) 
	public int bodylen() {
		return this.io.getIntField(this, 7);
	}
	/** mail body length */
	@Field(7) 
	public MailBox bodylen(int bodylen) {
		this.io.setIntField(this, 7, bodylen);
		return this;
	}
	/** minimum build */
	@Field(8) 
	public short build_min() {
		return this.io.getShortField(this, 8);
	}
	/** minimum build */
	@Field(8) 
	public MailBox build_min(short build_min) {
		this.io.setShortField(this, 8, build_min);
		return this;
	}
	/** maximum build */
	@Field(9) 
	public short build_max() {
		return this.io.getShortField(this, 9);
	}
	/** maximum build */
	@Field(9) 
	public MailBox build_max(short build_max) {
		this.io.setShortField(this, 9, build_max);
		return this;
	}
	/** reserved */
	@Field(10) 
	public int reserved() {
		return this.io.getIntField(this, 10);
	}
	/** reserved */
	@Field(10) 
	public MailBox reserved(int reserved) {
		this.io.setIntField(this, 10, reserved);
		return this;
	}
	public MailBox() {
		super();
	}
	public MailBox(Pointer pointer) {
		super(pointer);
	}
}
