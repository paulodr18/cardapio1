package service;

import java.util.Scanner;

import controller.CardapioController;
import entity.CardapioEntity;

public class CardapioService {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CardapioEntity cardapio = new CardapioEntity();
		CardapioController cardapioController = new CardapioController();

		System.out.println("Digite o código do intem: ");
		int codigo = sc.nextInt();
		cardapio.setCodigo(codigo);

		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		cardapio.setQuantidade(quantidade);

		double resultado = cardapioController.condicaoSwitch(cardapio.getCodigo(), cardapio.getQuantidade());
		cardapio.setResultado(resultado);
		System.out.println(cardapio.getResultado());
	}
}