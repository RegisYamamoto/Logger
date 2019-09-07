package com.regis;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Inicio {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("MyLog");
		FileHandler fh;

		try {

			// Este bloco configura o logger com manipulador e formatador
			fh = new FileHandler("C:/Workspace/Logger/MyLogFile.log");
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);

			// A seguinte instrução é usada para registrar qualquer mensagem
			logger.info("Meu primeiro log");

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		logger.info("Como vai você?");

	}

}