package com.chain.cts;

import java.util.Arrays;

public class RegBean {
	
	@Override
	public String toString() {
		return "RegBean [name=" + name + ", pwd=" + pwd + ", gender=" + gender
				+ ", mobiles=" + Arrays.toString(mobiles) + ", country1="
				+ country1 + ", country2=" + country2 + ", country3="
				+ country3 + ", sub=" + sub + "]";
	}
	String name;
	String pwd;
	String gender;
	String [] mobiles;
	String country1,country2,country3;
String sub;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String[] getMobiles() {
	return mobiles;
}
public void setMobiles(String[] mobiles) {
	this.mobiles = mobiles;
}
public String getCountry1() {
	return country1;
}
public void setCountry1(String country1) {
	this.country1 = country1;
}
public String getCountry2() {
	return country2;
}
public void setCountry2(String country2) {
	this.country2 = country2;
}
public String getCountry3() {
	return country3;
}
public void setCountry3(String country3) {
	this.country3 = country3;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}


}
