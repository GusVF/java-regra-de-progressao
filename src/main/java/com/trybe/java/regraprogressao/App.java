package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * Class App.
 */

public class App {

  /**
   * Metodo main.
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");

    int activityCount = scanner.nextInt();
    String[] activityName = new String[activityCount];
    int[] activityWeight = new int[activityCount];
    int[] activityGrade = new int[activityCount];

    for (int i = 0; i < activityCount; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      scanner.nextLine();
      activityName[i] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      activityWeight[i] = scanner.nextInt();

      System.out.println("Digite a nota obtida para " + activityName[i] + " :");
      activityGrade[i] = scanner.nextInt();

    }
    double totalScore = 0.0;
    for (int i = 0; i < activityCount; i++) {
      double weightPercentege = (double) activityWeight[i] / 100;
      double activityScore = activityGrade[i] * weightPercentege;
      totalScore += activityScore;
    }

    if (totalScore >= 85) {
      System.out.println("Parabéns! Você alcançou " + totalScore
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + totalScore
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
    scanner.close();
  }
}