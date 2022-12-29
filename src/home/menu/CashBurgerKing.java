package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
    private Scanner scanner = new Scanner(System.in);

    int[] menu = {3500, 3200, 1000, 400, 2000, 700, 1200, 1000};
    int[] era = {0,0,0,0,0,0,0,0};
    String[] name = {"불고기버거", "치킨버거", "감자튀김", "치즈스틱","샐러드","콜라","커피"};

    public void selectMenu() {


        while (true) {
            System.out.println("\t*** 메뉴를 선택하세요 ***\n");
            System.out.println("\t햄버거 ***************");
            System.out.println("\t1. 불고기버거\t3500원");
            System.out.println("\t2. 치킨버거\t3200원");
            System.out.println("\t추가 ****************");
            System.out.println("\t3. 감자튀김\t1000원");
            System.out.println("\t4. 치즈스틱\t400원");
            System.out.println("\t5. 샐러드\t\t2000원");
            System.out.println("\t음료수 ***************");
            System.out.println("\t6. 콜라\t\t700원");
            System.out.println("\t7. 에이드\t\t1200원");
            System.out.println("\t8. 커피\t\t1000원");
            System.out.println("\t********************");
            System.out.println("메뉴 선택 : ");
            int input = scanner.nextInt();
            menunum(input-1);
            System.out.print("추가 주문하시겠습니까?");
            char brk = scanner.next().toUpperCase().charAt(0);
            if (brk == 'Y') break;


        }
        System.out.println("\t주문하신 정보는 다음과 같습니다.\n\t------------------------");
        for(int i = 1; i < 9; i++){
            if (era[i] > 0){
                System.out.println(name[i] + " : " + era + "개 - " + menu[i]*era[i]);
            }
        }



    }

    public void menunum(int num) {
        if(num < 8 && num > -1){
            System.out.println(name[num] + "를(을) 선택하셨습니다\n수량은? :");
            era[num] = scanner.nextInt();

        }


    }

}
