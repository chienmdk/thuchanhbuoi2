package thuchanh2;

import bai2.Override;
import bai2.Scanner;
import bai2.String;

public class account {
	private double sotien;
	private int sotk;
	private String tentk;
	private String trangthai;
	public double laiSuat=0.035;
	
public account() {
	
}
public account ( double sotien, int sotk, String tentk, String trangthai) {
	this.sotien = sotien;
	this.sotk = sotk;
	this.tentk = tentk;
	this.trangthai = trangthai;
}
public void setsotien (double sotien) {
	double sotien;
	System.out.println("Nhập vào số tiền: ");
	sotien = ta.nextline();
	if(sotien>=50) {
		this.sotien = sotien;
	}else {
		sotien=50;
		System.out.println("Số tiền không có tính hợp lệ");
		System.out.println("Số tiền hiện tại có:" + sotien);
}
public void setsotk (int sotk) {
	int sotk;
	System.out.println("Nhập vào số tài khoản: ");
	sotk = ta.nextline();
	if(sotk>0 || sotk!=999999) {
		this.sotk = sotk;
	}else {
		sotk=999999;
		System.out.println("số tài khoản hiện tại không hợp lệ");
		System.out.println("Số tài khoản hiện tại có là:" + sotk);
	}

public void settentk (String tentk) {
	String tentk;
	System.out.println("Nhập vào tên tài khoản: ");
	tentk = ta.nextline();
	if (tentk!=""&&tentk!="  ") {
		this.tentk = tentk;
	}else {
		tentk="Chua xac dinh";
		System.out.println("Tên tài khoản hiện tại không hợp lệ");
		System.out.println("Tên tài khoản hiện tại lại là:" + tentk);
	}
public void settrangthai (String trangthai) {
	this.trangthai = trangthai;
}
public double getsotien() {
	return sotien;
}
public int getsotk() {
	return sotk;
}
public String gettentk() {
	return tentk;
}
public String gettrangthai() {
	return trangthai;
}

public void naptien () {
	double naptien;
	System.out.println("Nhập số tiền cần nạp: ");
	naptien = ta.nextline();
	if(naptien>0) {
		this.naptien = naptien + sotk;
	}else {
		if(naptien<0) {
		System.out.println("Số tiền nạp vào không hợp lệ");
		System.out.println("Số tiền hiện tại là:" + sotk);
	}
	}
}
public void ruttien() {
	double ruttien;
	System.out.println("Nhập vào số tiền cần rút: ");
	ruttien = ta.nextline();
	if(ruttien< sotk||ruttien<0) {
		this.ruttien = sotk - ruttien;
	}else {
		if(ruttien> sotk);
		System.out.println("Số tiền không thỏa điều kiện được rút");
		System.out.println("Số tiền hiện tại là:" + sotk );
	}
}
public void chuyentien (Account account) {
	double amount;
	if(sotk>=amount) {
		sotk-=amount;
		account.sotk +=amount;
	}else {
		System.out.println("Tài khoản của bạn không đủ tiền");
	}
}
public void daohan() {
	double laiSuat=0.035;
	sotk = sotk + sotk* laiSuat;
	System.out.println("Số tiền hiện tại là:" + sotk);
}

public void Nhap() {
	Scanner ta = new Scanner (System.in);
	System.out.println("Nhập vào số tiền: ");
	sotien = ta.nextline();
	System.out.println("Nhập vào số tài khoản: ");
	sotk = ta.nextline();
	System.out.println("Nhập vào tên tài khoản: ");
	tentk = ta.nextline();
	System.out.println("Nhập vào trạng thái: ");
	trangthai = ta.nextline();
}
public void Xuat () {
	System.out.println("Số tiền: + getsotien");
	System.out.println("Số tài khoản: + getsotk");
	System.out.println("Tên tài khoản: + gettentk");
	System.out.println("Trạng thái: + gettrangthai");
}

@Override
public String toString() {
	return "Account [sotien=" + sotien + ", sotk=" + sotk + ", tentk=" + tentk +", trangthai=" + trangthai +"]";
}
}