package address_book;

import java.util.ArrayList;
import java.util.List;

public class AddressHandler {

	private Address[] addressArray = new Address[5];
	private List<Address> addressList = new ArrayList<>();
	private int nAddress = 0;

	public static void main(String[] args) {
		AddressHandler adHandler = new AddressHandler();
		adHandler.create(0, "장", "010-1234-1234", "인천");
		adHandler.create(1, "김", "010-2345-3456", "서울");
		adHandler.create(2, "이", "-", "서울");
		adHandler.create(3, "박", "011-122-3456", "서울");
		adHandler.create(4, "최", "010-9876-5432", "서울");
		adHandler.read();

	}

	// CRUD
	// 추가
	public void create(int idx, Address address) {
		addressArray[idx] = address;
		++nAddress;
	}

	public void create(int idx, String name, String PhoneNumber, String addr) {
		Address address = new Address();
		address.setName(name);
		address.setPhoneNumber(PhoneNumber);
		address.setAddress(addr);

		addressArray[idx] = address;
		++nAddress;
	}

	public void create(Address address) {
		addressArray[nAddress++] = address;
	}

	public void create() {
		Address address = new Address();
		address.setName("변진배");
		address.setAddress("서울");
		address.setPhoneNumber("010-6339-9713");
		addressArray[nAddress++] = address;
	}

	// 조회
	public void read(int idx) {
		if (idx < addressArray.length && addressArray[idx] != null) {
			System.out.println(addressArray[idx]);
		}
	}

	public void read() {
		for (int i = 0; i < addressArray.length; ++i) {
			if (addressArray[i] != null) {
				System.out.println(addressArray[i]);
			}
		}
	}

	// 갱신
	public void update(int idx, Address address) {
		addressArray[idx] = address;
	}

	public void update(int idx, String name, String PhoneNumber, String addr) {
		Address address = new Address();
		address.setName(name);
		address.setPhoneNumber(PhoneNumber);
		address.setAddress(addr);

		addressArray[idx] = address;
	}

	// 삭제
	public void delete(int idx) {
		addressArray[idx] = null;
	}

	public void delete() {
		if (nAddress > 0)
			addressArray[--nAddress] = null;
	}

}
