package com.ktdsuniversity.edu.cafe.menu.mgnt.controller;

import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntService;
import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntServiceImpl;

public class MenuMgntController {

		public void printMenu() {
			System.out.println("\n============================\r\n"
					+ "1. ���\r\n"
					+ "2. ����\r\n"
					+ "3. ����\r\n"
					+ "4. ��ȸ(1��)\r\n"
					+ "5. ��ȸ(���񺰷�)\r\n"
					+ "6. ��ȸ(��ü)\r\n"
					+ "7. ����\r\n"
					+ "============================\n");
		}
		
		public void printItemTypeMenu() {
			System.out.println("\n============================\r\n"
					+ "1. Ŀ��\r\n"
					+ "2. ����\r\n"
					+ "3. Ƽ\r\n"
					+ "4. ����Ʈ\r\n"
					+ "5. �ڷΰ���\r\n"
					+ "============================\n");
		}
		
		public static void main(String[] args) {
			
		MenuMgntService service = new MenuMgntServiceImpl();
		
		/**
		 * 1. ���
		 * 2. ����
		 * 3. ����
		 * 4. ��ȸ(1��)
		 * 5. ��ȸ(��������)
		 * 6. ��ȸ(��ü)
		 * 7. ����
		 */
		
		Scanner scan = new Scanner(System.in);
		
		/**
		 * �λ� �� ���� ����
		 */
		System.out.println("Cafe Menu Management System");
		
		
		while(true) {
			System.out.println("�޴��� �Է��ϼ���(����): ");
			
			printMenu();
			
			/**
			 * ������ �� �Է� �޾� menu�� ����
			 */
			int menu = scan.nextInt();
			scan.nextLine();	// Enter�� ����
			
			/**
			 * ���
			 */
			if (menu == 1) {
				
				printItemTypeMenu();
				System.out.println("����� �޴� Ÿ���� �Է��ϼ���(����):");
				
				/**
				 * key: ���� �Է� ��
				 * �ش� key�� ���� ����.
				 */
				int type = scan.nextInt();
				scan.nextLine();
				
				/**
				 * �ڷΰ���: 1~4 �̿��� ���� �Է� ��
				 */
				if (type < 1 || type > 4) {
					continue;
				}
				
				System.out.println("����� �����۸��� �Է��ϼ���(����):");
				String name = scan.nextLine();
				
				/**
				 * true�� �� ����� ��� �Ϸ�
				 */
				if ( service.create(name) ) {
					System.out.println(name + "��(��) ��ϵǾ����ϴ�.");
				}
			}
			/**
			 * ����
			 */
			else if (menu == 2) {
				
				printItemTypeMenu();
				System.out.println("������ �޴� Ÿ���� �Է��ϼ���:");
				
				/**
				 * key: ���� �Է� ��
				 * �ش� key�� ���� ����.
				 */
				int index = scan.nextInt();
				scan.nextLine();
				
				
				int key = scan.nextInt();
				scan.nextLine();
				TodoVO todoVO = service.read(key);
				//TODO ��¹�
				System.out.println(todoVO.getItemName());
				
			}
			else if (menu == 3) {
				List<TodoVO> todoList = service.readAll();
				//TODO ��¹�
				//for (TodoVO todoli)
				
				
			}
			else if (menu == 4) {
				System.out.println("������ TODO Key�� �Է��ϼ���.");
				int key = scan.nextInt();
				scan.nextLine();
				
				TodoVO todo = service.read(key);
				if (todo == null) {
					System.out.println("�������� �������� �ʽ��ϴ�.");
				}
				else {
					
					boolean isSuccess = false;
					
					if (todo.isSuccess()) {
						// �̹� �Ϸ�� ��
						System.out.println("�̹� �Ϸ�� ���Դϴ�. �̿Ϸ�� �����ұ��? (Y/N");
						String yn = scan.nextLine();
						if (yn.equalsIgnoreCase("Y")) {
							isSuccess = service.update(key, false);
						}
					}
					else {
						// �Ϸ���� ���� ��
						System.out.println("�̿Ϸ�� ���Դϴ�. �Ϸ�� �����ұ��? (Y/N)");
						String yn = scan.nextLine();
						if (yn.equalsIgnoreCase("Y")) {
							isSuccess = service.update(key, true);
						}
					}
					
					if (isSuccess) {
						System.out.println("ó���Ǿ����ϴ�.");
					}		
				}
				
			}
			else if (menu == 5) {
				
			}
			else if (menu == 6) {
				
			}
			else if (menu == 7) {
				
			}
			/**
			 * ����: 1~6 �̿��� ���� �Է� ��
			 */
			else {
				break;
			}
			
			
		}
	}
}
