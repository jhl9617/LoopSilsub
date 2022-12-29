package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
    private Scanner scanner = new Scanner(System.in);

    int[] menu = {3500, 3200, 1000, 400, 2000, 700, 1200, 1000};
    int[] era = {0,0,0,0,0,0,0,0};
    String[] name = {"�Ұ�����", "ġŲ����", "����Ƣ��", "ġ�ƽ","������","�ݶ�","Ŀ��"};

    public void selectMenu() {


        while (true) {
            System.out.println("\t*** �޴��� �����ϼ��� ***\n");
            System.out.println("\t�ܹ��� ***************");
            System.out.println("\t1. �Ұ�����\t3500��");
            System.out.println("\t2. ġŲ����\t3200��");
            System.out.println("\t�߰� ****************");
            System.out.println("\t3. ����Ƣ��\t1000��");
            System.out.println("\t4. ġ�ƽ\t400��");
            System.out.println("\t5. ������\t\t2000��");
            System.out.println("\t����� ***************");
            System.out.println("\t6. �ݶ�\t\t700��");
            System.out.println("\t7. ���̵�\t\t1200��");
            System.out.println("\t8. Ŀ��\t\t1000��");
            System.out.println("\t********************");
            System.out.println("�޴� ���� : ");
            int input = scanner.nextInt();
            menunum(input-1);
            System.out.print("�߰� �ֹ��Ͻðڽ��ϱ�?");
            char brk = scanner.next().toUpperCase().charAt(0);
            if (brk == 'Y') break;


        }
        System.out.println("\t�ֹ��Ͻ� ������ ������ �����ϴ�.\n\t------------------------");
        for(int i = 1; i < 9; i++){
            if (era[i] > 0){
                System.out.println(name[i] + " : " + era + "�� - " + menu[i]*era[i]);
            }
        }



    }

    public void menunum(int num) {
        if(num < 8 && num > -1){
            System.out.println(name[num] + "��(��) �����ϼ̽��ϴ�\n������? :");
            era[num] = scanner.nextInt();

        }


    }

}
