package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {

       Reader inputLine = new Reader();
       String input = inputLine.readKeyboard();

        LineSeparate inputExpretion = new LineSeparate();
        inputExpretion.separateInputLine(input);
    }
}
