package controller;

import entity.CardapioEntity;

public class CardapioController {

	CardapioEntity cardapio = new CardapioEntity();

	public double condicaoSwitch(int codigo, int quantidade) {

		switch (codigo) {

		case 100:
			return 1.20 * quantidade;

		case 101:
			return 1.30 * quantidade;

		case 102:
			return 1.50 * quantidade;

		case 103:
			return 1.20 * quantidade;

		case 104:
			return 1.30 * quantidade;

		case 105:
			return 1.00 * quantidade;

		default:
			return 0;
		}
	}
}
