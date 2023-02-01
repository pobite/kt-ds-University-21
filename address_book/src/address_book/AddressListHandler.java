package address_book;

import java.util.ArrayList;
import java.util.List;

public class AddressListHandler {
	private List<Address> addressList = new ArrayList<>();
	
	public void create(String name, String phoneNumber, String address) {
		Address addr = new Address();
		addr.setName(name);
		addr.setPhoneNumber(phoneNumber);
		addr.setAddress(address);
		addressList.add(addr);
	}
	
	public void update(int idx,
						String name,
						String phoneNumber,
						String address) {
		Address addr = addressList.get(idx);
		addr.setName(name);
		addr.setPhoneNumber(phoneNumber);
		addr.setAddress(address);
	}
	
	public void delete(int idx) {
		addressList.remove(idx);
	}
	
	public void read(int idx) {
		Address addr = addressList.get(idx);
		System.out.println("이름 : " + addr.getName());
		System.out.println("전화번호 : " + addr.getPhoneNumber());
		System.out.println("주소 : " + addr.getAddress());
	}
	
	/**
	 * 전통적 for를 이용해 반복
	 */
	public void readAllFor() {
		for (int i = 0; i < addressList.size(); i+= 1) {
			read(i);
		}
	}
	
	/**
	 * for-each를 이용해 반복
	 */
	public void readAllForeach() {
		for (Address addr: addressList) {
			System.out.println(addr.getName());
			System.out.println(addr.getPhoneNumber());
			System.out.println(addr.getAddress());
		}
	}
	
	/**
	 * List의 forEach를 이용해 반복
	 */
	public void readAllListForeach() {
		addressList.forEach( (addr) -> {
			System.out.println(addr.getName());
			System.out.println(addr.getPhoneNumber());
			System.out.println(addr.getAddress());
		} );
	}
 	
	
	public static void main(String[] args) {
		AddressListHandler hdr = new AddressListHandler();
		hdr.create("aaa", "010-1111-1111", "서울");
		hdr.create("bbb", "010-2222-2222", "부산");
		hdr.create("ccc", "010-3333-3333", "강남");
		
		hdr.read(0);
		hdr.read(1);
		hdr.read(2);

		hdr.update(2, "ccc", "010-3232-2323", "강남");
		hdr.read(2);
		
		hdr.delete(2);
		
		System.out.println("FOR");
		hdr.readAllFor();
		
		System.out.println("FOR-EACH");
		hdr.readAllForeach();
		
		System.out.println("LIST FOR EACH");
		hdr.readAllListForeach();
	}

}
