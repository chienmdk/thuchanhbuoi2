package thuchanh2;

public class ArrayList {
	public class Array extends account {
	    ArrayList<account> danhSach;
	  account ta=newaccount();


	 public ArrayList(ArrayList<account> danhSach) {
	  super();
	  this.danhSach = danhSach;
	 }
	 public ArrayList() {
	  danhSach = new ArrayList<>();
	 }
	 public void themDanhSach(account ta) {
	  danhSach.add(ta);
	 }
	 public void hienDanhSach() {
	  if (danhSach.isEmpty()) {
	   System.out.println("Danh sách đang rỗng, thêm tài khoản!");
	  }
	   else {
	    for(account ta : danhSach) {
	     System.out.println(ta);
	    }
	   }
	  }
	 public void naptien() {
	        System.out.print("Nhập số tài khoản cần nạp tiền: ");
	        int sotk = ta.nextLong();
	        ta.nextLine();

	        boolean found = false;
	        for (account tk : danhSach) {
	            if (ta.getsotk() == sotk) {
	                found = true;
	                System.out.print("Nhập số tiền muốn nạp: ");
	                double naptien = sc.nextDouble();
	                ta.naptien(naptien);
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Không tìm thấy số tài khoản có trong danh sách.");
	        }
	    }
	 public void Menu() {
	  int chon = 0;

	  do {  
	  System.out.println("1.Thêm tài khoản");
	  System.out.println("2.Hiển thị danh sách tài khoản hiện có");
	  System.out.println("3.Nạp tiền");
	  System.out.println("4. Rút tiền");
	  System.out.println("5. Đáo hạn");
	  System.out.println("6. Chuyển Tiền");
	  chon = sc.nextInt();
	  switch(chon){
	   case 1:
	        ta.nhap();
	        themDanhSach(ta);
	        break;
	   case 2:
	    hienDanhSach();
	    break;
	   case 3:
		   naptien();
	        break;
	   case 4 :
		   ta.ruttien();
		   break;
	   case 5 : 
		   ta.daohan();
		   break;
	   case 6 :
		   
		
	 }
	 }while (chon !=0);
	 }
	}
