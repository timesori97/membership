package title;

import java.util.*;

public class management {
	Scanner s = new Scanner(System.in);
	member[] memberlist = new member[5];

	management(String ȸ��) {
		System.out.println(ȸ�� + "�������α׷��� ���Ű��� ȯ���մϴ�.");
		boolean flag = true;
		while (flag) {
			System.out.println("1.ȸ����� 2.��ü���� 3.���� 4.���� ��� 5.ȸ���˻� 6.ȸ�� �޸��ۼ�");
			int num = s.nextInt();
			s.nextLine();
			if (num == 1) {
				create();
			} else if (num == 2) {
				all();
			} else if (num == 3) {
				delete();
			} else if (num == 4) {
				System.out.println("���̵� ������ 1�� ��̵���� 2��");
				int a = s.nextInt();
				s.nextLine();
				if (a == 1) {
					mod();
				} else if (a == 2) {
					hobby();
				}

			} else if (num == 5) {
				serech();
			} else if (num == 6) {
				memo();
			}
		}
	}

	private void memo() {
		// TODO Auto-generated method stub
		System.out.println("�޸��� ȸ������ ��������.");
		String memomember = s.nextLine();
		System.out.println("�޸��Ͻ� ������ ������ ��������.");
		String title = s.nextLine();
		System.out.println("�޸��Ͻ� ������ ��������.");
		String memo = s.nextLine();

		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				if (memberlist[i].name.equals(memomember) ) {

					for(int j=0;j<10;j++) {
					if (memberlist[i].memo[0][j] == null) {
						
						memberlist[i].memo[0][j]=title;
						memberlist[i].memo[1][j]=memo;
						break;
						}

					}
				}
			}
			
		}
	}

	private void hobby() {
		// TODO Auto-generated method stub
		System.out.println("�߰��� ��̸� ��������");
		String memberhobby = s.nextLine();
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				for (int j = 0; j < 5; j++) {
					if (memberlist[i].hobby[j] == null) {
						memberlist[i].hobby[j] = memberhobby;
						System.out.println("��̸� ����Ͽ����ϴ�.");
						break;
					}
				}
				break;
			}
		}
	}

	private void serech() {
		// TODO Auto-generated method stub
		System.out.println("�˻��Ͻ� ȸ���� ȸ���̸������ÿ�(�κа˻��ص� ������ ��µ�)");
		String serechname = s.nextLine();
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				if (memberlist[i].name.contains(serechname)) {
					System.out.println(memberlist[i].id);
					System.out.println(memberlist[i].name);
					System.out.println(memberlist[i].addr);
					if (memberlist[i].age = true) {
						System.out.println("�̼�����");
					}
				} 
				System.out.println();
			}
		}
	}

	private void mod() { // ���� �޼���
		// TODO Auto-generated method stub
		System.out.println("������ ȸ���̸��� �ۼ��ϼ���");
		String firstname = s.nextLine();
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				if (memberlist[i].name.equals(firstname)) {
					System.out.println("�����ϰ� ������ ���� ������.");
					System.out.println("1.���̵� 2.ȸ���� 3.�ּ� ");
					int choose = s.nextInt();
					s.nextLine();
					if (choose == 1) {
						System.out.println("������ ���̵� �ۼ����ּ���.");
						String modid = s.nextLine();
						memberlist[i].id = modid;
					} else if (choose == 2) {
						System.out.println("������ ȸ������ �ۼ����ּ���.");
						String modname = s.nextLine();
						memberlist[i].name = modname;
					} else if (choose == 3) {
						System.out.println("������ �ּҸ� �ۼ����ּ���.");
						String modaddr = s.nextLine();
						memberlist[i].addr = modaddr;
					}
					System.out.println("������ �Ϸ��Ͽ����ϴ�.");
					break;
				} 
					
				

			}
			
		}
		
	}

	private void delete() { // ���� �޼���
		// TODO Auto-generated method stub
		System.out.println("�����Ͻ� ȸ�� ���̵� �ۼ��ϼ���.");
		String deletename = s.nextLine();
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				if (memberlist[i].id.equals(deletename)) {
					memberlist[i] = null;
					System.out.println("ȸ���� �����Ǿ����ϴ�.");
					break;
				}
				
			}
			
		}
		

	}

	private void all() { // ��ü��� �޼���
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				System.out.println(memberlist[i].id);
				System.out.println(memberlist[i].name);
				System.out.println(memberlist[i].addr);
				if (memberlist[i].age == true) {
					System.out.println("�̼�����");
				}
				System.out.println("---------------------------");
				System.out.println("���");
				for (int j = 0; j < 5; j++) {
					if (memberlist[i].hobby[j] != null)
						System.out.println(memberlist[i].hobby[j]);
				}
				System.out.println("---------------------------");
				System.out.println("�޸�");
				if (memberlist[i] != null) {
					for (int g = 0; g < 10; g++) {
						if (memberlist[i].memo[0][g] != null) {
							System.out.println( memberlist[i].memo[0][g]);
							System.out.println( memberlist[i].memo[1][g]);
							
						}
					}
					
				}
				System.out.println("---------------------------");
			}
		}

	}
 
	private void create() { // ���� �޼���
		// TODO Auto-generated method stub
		System.out.println("����Ͻ� ȸ���� ���̵� �����ּ���.");
		String id = s.nextLine();
		System.out.println("����Ͻ� ȸ���� �̸��� �����ּ���.");
		String name = s.nextLine();
		System.out.println("����Ͻ� ȸ���� �ּҸ� �����ּ���.");
		String addr = s.nextLine();
		System.out.println("�̼������̽ø� 1���� �����ּ���.");
		int student = s.nextInt();

		member insert = new member(id, name, addr, student);

		for (int i = 0; i < 5; i++) {
			if (memberlist[i] == null) {
				memberlist[i] = insert;
				System.out.println("ȸ������� �Ǿ����ϴ�.");
				break;
			}
		}
	

	}

}