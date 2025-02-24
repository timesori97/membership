package title;

import java.util.*;

public class management {
	Scanner s = new Scanner(System.in);
	member[] memberlist = new member[5];

	management(String 회원) {
		System.out.println(회원 + "관리프로그램에 오신것을 환영합니다.");
		boolean flag = true;
		while (flag) {
			System.out.println("1.회원등록 2.전체보기 3.삭제 4.수정 기능 5.회원검색 6.회원 메모작성");
			int num = s.nextInt();
			s.nextLine();
			if (num == 1) {
				create();
			} else if (num == 2) {
				all();
			} else if (num == 3) {
				delete();
			} else if (num == 4) {
				System.out.println("아이디 수정은 1번 취미등록은 2번");
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
		System.out.println("메모할 회원명을 적으세요.");
		String memomember = s.nextLine();
		System.out.println("메모하실 내용의 제목을 적으세요.");
		String title = s.nextLine();
		System.out.println("메모하실 내용을 적으세요.");
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
		System.out.println("추가할 취미를 적으세요");
		String memberhobby = s.nextLine();
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				for (int j = 0; j < 5; j++) {
					if (memberlist[i].hobby[j] == null) {
						memberlist[i].hobby[j] = memberhobby;
						System.out.println("취미를 등록하였습니다.");
						break;
					}
				}
				break;
			}
		}
	}

	private void serech() {
		// TODO Auto-generated method stub
		System.out.println("검색하실 회원의 회원이름을쓰시오(부분검색해도 정보가 출력됨)");
		String serechname = s.nextLine();
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				if (memberlist[i].name.contains(serechname)) {
					System.out.println(memberlist[i].id);
					System.out.println(memberlist[i].name);
					System.out.println(memberlist[i].addr);
					if (memberlist[i].age = true) {
						System.out.println("미성년자");
					}
				} 
				System.out.println();
			}
		}
	}

	private void mod() { // 수정 메서드
		// TODO Auto-generated method stub
		System.out.println("수정할 회원이름을 작성하세요");
		String firstname = s.nextLine();
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				if (memberlist[i].name.equals(firstname)) {
					System.out.println("수정하고 싶으신 것을 고르세요.");
					System.out.println("1.아이디 2.회원명 3.주소 ");
					int choose = s.nextInt();
					s.nextLine();
					if (choose == 1) {
						System.out.println("수정할 아이디를 작성해주세요.");
						String modid = s.nextLine();
						memberlist[i].id = modid;
					} else if (choose == 2) {
						System.out.println("수정할 회원명을 작성해주세요.");
						String modname = s.nextLine();
						memberlist[i].name = modname;
					} else if (choose == 3) {
						System.out.println("수정할 주소를 작성해주세요.");
						String modaddr = s.nextLine();
						memberlist[i].addr = modaddr;
					}
					System.out.println("수정을 완료하였습니다.");
					break;
				} 
					
				

			}
			
		}
		
	}

	private void delete() { // 삭제 메서드
		// TODO Auto-generated method stub
		System.out.println("삭제하실 회원 아이디를 작성하세요.");
		String deletename = s.nextLine();
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				if (memberlist[i].id.equals(deletename)) {
					memberlist[i] = null;
					System.out.println("회원을 삭제되었습니다.");
					break;
				}
				
			}
			
		}
		

	}

	private void all() { // 전체목록 메서드
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			if (memberlist[i] != null) {
				System.out.println(memberlist[i].id);
				System.out.println(memberlist[i].name);
				System.out.println(memberlist[i].addr);
				if (memberlist[i].age == true) {
					System.out.println("미성년자");
				}
				System.out.println("---------------------------");
				System.out.println("취미");
				for (int j = 0; j < 5; j++) {
					if (memberlist[i].hobby[j] != null)
						System.out.println(memberlist[i].hobby[j]);
				}
				System.out.println("---------------------------");
				System.out.println("메모");
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
 
	private void create() { // 생성 메서드
		// TODO Auto-generated method stub
		System.out.println("등록하실 회원의 아이디를 적어주세요.");
		String id = s.nextLine();
		System.out.println("등록하실 회원의 이름을 적어주세요.");
		String name = s.nextLine();
		System.out.println("등록하실 회원의 주소를 적어주세요.");
		String addr = s.nextLine();
		System.out.println("미성년자이시면 1번을 눌러주세요.");
		int student = s.nextInt();

		member insert = new member(id, name, addr, student);

		for (int i = 0; i < 5; i++) {
			if (memberlist[i] == null) {
				memberlist[i] = insert;
				System.out.println("회원등록이 되었습니다.");
				break;
			}
		}
	

	}

}