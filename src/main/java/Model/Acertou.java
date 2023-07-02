package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Acertou {
    private int x;
    private int y;
    private Tabuleiro tabuleiro;
    private ArrayList<Barco> barcos;

    public Acertou() {

    }

    public Acertou(int x, int y, Tabuleiro tabuleiro) {
        this.x = x;
        this.y = y;
        this.tabuleiro = tabuleiro;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public boolean acertou(int x, int y) {
        if (tabuleiro.getTabuleiro()[x][y] != 0) {
            System.out.println("Acertou");
            
            switch (tabuleiro.getTabuleiro()[x][y]) {
                case 2:
                    for (Barco barco : barcos) {
                        for (int i = 0; i < barco.getTamanho(); i++) {
                            if (barco.getPosicaoPartes()[i][0] == x && barco.getPosicaoPartes()[i][1] == y) {
                                barco.setPartes(barco.getPartes() - 1);
                            }
                        }
                        if (barco.getPartes() == 0) {
                            barco.setAfundado(true);
                            System.out.println(barco.getNome() + " afundou");
                        }
                    }
                    break;
                case 4:
                    for (Barco barco : barcos) {
                        for (int i = 0; i < barco.getTamanho(); i++) {
                            if (barco.getPosicaoPartes()[i][0] == x && barco.getPosicaoPartes()[i][1] == y) {
                                barco.setPartes(barco.getPartes() - 1);
                            }
                        }
                        if (barco.getPartes() == 0) {
                            barco.setAfundado(true);
                            System.out.println(barco.getNome() + " afundou");
                        }
                    }
                    break;
                case 5:
                    for (Barco barco : barcos) {
                        for (int i = 0; i < barco.getTamanho(); i++) {
                            if (barco.getPosicaoPartes()[i][0] == x && barco.getPosicaoPartes()[i][1] == y) {
                                barco.setPartes(barco.getPartes() - 1);
                            }
                        }
                        if (barco.getPartes() == 0) {
                            barco.setAfundado(true);
                            System.out.println(barco.getNome() + " afundou");
                        }
                    }
                    break;
                case -1:
                    System.out.println("Ja atirou aqui");
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
            tabuleiro.getTabuleiro()[x][y] = -1;
            return true;
        } else {
            tabuleiro.getTabuleiro()[x][y] = -1;
            System.out.println("Errou");
            return false;

        }
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(ArrayList<Barco> barcos) {
        this.barcos = barcos;
    }

}
