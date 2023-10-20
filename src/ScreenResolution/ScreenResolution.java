package ScreenResolution;

import java.awt.Dimension;
import java.awt.*;

public class ScreenResolution {
    public static void main(String[] args) {
    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

    int lar = (int) tela.getWidth();
    int alt = (int) tela.getHeight();
    System.out.println("Resolução do Monitor é: "+lar +"x"+alt);
    }
}