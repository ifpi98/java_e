package chap01;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArrayAccounts = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] Args) {
		boolean run = true;
		while (run) {

			System.out.println("-------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");

			System.out.println("-------------------------------------------------------");

			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();

		System.out.print("계좌주: ");
		String owner = scanner.next();

		System.out.print("초기입금액: ");
		int money = scanner.nextInt();

		for (int i = 0; i < accountArrayAccounts.length; i++) {
			if (accountArrayAccounts[i] == null) {
				accountArrayAccounts[i] = new Account(ano, owner, money);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}


	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (int i = 0; i < accountArrayAccounts.length; i++) {
			if (accountArrayAccounts[i] == null) {
				break;
			}
			System.out.println(
				accountArrayAccounts[i].getAno() + "\t" + accountArrayAccounts[i].getOwner() + "\t" + accountArrayAccounts[i].getBalance());
		}
	}

	// 예금하기
	
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int dep = scanner.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
			System.out.println("결과: 입금이 성공되었습니다.");
		}
		
	}
	
//	private static void deposit() {
//		System.out.print("계좌번호: ");
//		String typedAno = scanner.next();
//
//		System.out.print("예금액: ");
//		int typedMoney = scanner.nextInt();
//		
//		for (int i = 0; i < accountArrayAccounts.length; i++) {
//			if (accountArrayAccounts[i] == null) {
//				break;
//			}
//			else if (accountArrayAccounts[i].getAno() == typedAno) {
//				int tempMoney = typedMoney + accountArrayAccounts[i].getBalance(); 
//				accountArrayAccounts[i].setBalance(tempMoney);
//				System.out.println("결과: 입급되었습니다.");
//				break;
//			} else { 
//				System.out.println("입력하신 계좌번호가 존재하지 않습니다.");
//				break;
//			}
//		}
//	}

	// 출금하기
	private static void withdraw() {
	
		
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int withd = scanner.nextInt();
	
		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			if (withd > findAccount(ano).getBalance()) {
				System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - withd);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
		}
		
	}

	// Account배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArrayAccounts.length; i++) {
			if (accountArrayAccounts[i].getAno().equals(ano)) {
				return accountArrayAccounts[i];
			}
		}
		return null;
	}

}
