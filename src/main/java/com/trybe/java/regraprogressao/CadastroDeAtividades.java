package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class CadastroDeAtividades {

  /**
   * This method performs the registration of activities for the current period. It allows the
   * student to enter the names and weights of each activity. The sum of all weights must be 100.
   */
  public static void cadastrarAtividades() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");

    int activityCount = scanner.nextInt();
    String[] activityName = new String[activityCount];
    int[] activityWeight = new int[activityCount];
    int totalWeight = 0;

    for (int i = 0; i < activityCount; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      scanner.nextLine();
      activityName[i] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      activityWeight[i] = scanner.nextInt();

      totalWeight += activityWeight[i];
    }
    if (totalWeight != 100) {
      System.out.println("A soma dos pesos das atividades não é igual a 100.");
      return;
    }
    scanner.close();
  }
}
