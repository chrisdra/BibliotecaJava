package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Modelo.Libros;
import Modelo.Peliculas;
import Modelo.Personas;

public class Main {
	
	public static void main (String[] args) throws EncryptedDocumentException, IOException {
		
		ArrayList<Personas> personas = new ArrayList<Personas>();
		ArrayList<Libros> libros = new ArrayList<Libros>();
		ArrayList<Peliculas> peliculas = new ArrayList<Peliculas>();
	
		//leerUsuarios(personas);
		leerPersonas(personas);
		//leerPeliculas(peliculas);
		//leerLibros(libros);
		//menu();
	}
	
	public static void menu(ArrayList<Personas> personas) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bienvenido a la Biblioteca");
		int i = 0;
		
		do {
			
			System.out.println("Ingrese su nombre");
			String nombre = scan.nextLine();
			
			System.out.println("Ingrese su clave");
			String clave = scan.nextLine();
			
			for (int j = 0; j < personas.size(); j++ ) {
				
				if (nombre.equals(personas.get(j).getNombre()) && clave.equals(personas.get(j).getClave())) {
					i = 1;
					System.out.println("Bienvenido " + personas.get(j).getNombre() + "\n");
				
				} else {
					i = 2;
					System.out.println("Usuario no reconocido");
				}
				break;
			}
		} while (i == 2);
		
		
	}
	
	public static ArrayList<Peliculas> leerPeliculas(ArrayList<Peliculas> peliculas) throws EncryptedDocumentException, IOException{
			
		ArrayList<Peliculas> peliculas1 = new ArrayList<Peliculas>();
		
		String ruta = "C:\\Users\\Chris\\eclipse-workspace\\Desafio_10_Biblioteca\\Articulos.xlsx";
		FileInputStream file = new FileInputStream(new File(ruta));
			
		XSSFWorkbook wb = new XSSFWorkbook(file);
		//Workbook wb = WorkbookFactory.create(file);
		XSSFSheet hoja = wb.getSheetAt(0);
		//Sheet hoja = wb.getSheetAt(1);
		DataFormatter data = new DataFormatter();
		String cellValue = null;
			
		for (Row row : hoja) {
			
			ArrayList<String> datos = new ArrayList<String>();
			
			for(Cell cell : row) {
				
				cellValue = data.formatCellValue(cell);
				datos.add(cellValue);
			}
			Peliculas p1 = new Peliculas(datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4), datos.get(5));
			peliculas1.add(p1);
		}
		
		peliculas.addAll(peliculas1);
		return peliculas;	
	}
	
	public static ArrayList<Libros> leerLibros(ArrayList<Libros> libros) throws EncryptedDocumentException, IOException{
		
		ArrayList<Libros> libros1 = new ArrayList<Libros>();
		
		String ruta = "C:\\Users\\Chris\\eclipse-workspace\\Desafio_10_Biblioteca\\Articulos.xlsx";
		FileInputStream file = new FileInputStream(new File(ruta));
			
		XSSFWorkbook wb = new XSSFWorkbook(file);
		//Workbook wb = WorkbookFactory.create(file);
		XSSFSheet hoja = wb.getSheetAt(0);
		//Sheet hoja = wb.getSheetAt(1);
		DataFormatter data = new DataFormatter();
		String cellValue = null;
			
		for (Row row : hoja) {
			
			ArrayList<String> datos = new ArrayList<String>();
			
			for(Cell cell : row) {
				
				cellValue = data.formatCellValue(cell);
				datos.add(cellValue);
			}
			Libros l1 = new Libros(datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4), datos.get(5));
			libros1.add(l1);
		}
		
		libros.addAll(libros1);
		return libros;	
	}
	
	public static ArrayList<Personas> leerPersonas(ArrayList<Personas> personas) throws IOException{
		
		ArrayList<Personas> usuario1 = new ArrayList<Personas>();
		
		try {
			
			//String ruta = "Usuarios.xlsx";
			String ruta = "C:\\Users\\Chris\\OneDrive\\Escritorio\\E-Camp\\Usuarios.xlsx";
			FileInputStream file = new FileInputStream(new File(ruta));
				
			XSSFWorkbook wb = new XSSFWorkbook(file);
			//Workbook wb = WorkbookFactory.create(file);
			
			XSSFSheet hoja = wb.getSheetAt(0);
			//Sheet hoja = wb.getSheetAt(1);
			
			DataFormatter data = new DataFormatter();
			String cellValue = null;
				
			for (Row row : hoja) {
				
				ArrayList<String> datos = new ArrayList<String>();
				
				for(Cell cell : row) {
					
					cellValue = data.formatCellValue(cell);
					datos.add(cellValue);
				}
				Personas u1 = new Personas(datos.get(0), datos.get(1), datos.get(2));
				usuario1.add(u1);
			}
			
			personas.addAll(usuario1);
				
			
		} catch (IOException e) {
			
		}
		return usuario1;
	}
	
	public static ArrayList<Personas> leerUsuarios(ArrayList<Personas> personas) throws IOException {
		
		try {
			
			String ruta = "C:\\Users\\Chris\\OneDrive\\Escritorio\\E-Camp\\Usuarios.xlsx";
			FileInputStream file = new FileInputStream(new File(ruta));
			
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(0);
			
			int numFilas = sheet.getLastRowNum();
			
			for(int i = 0; i < numFilas; i++) {
				
				Row fila = sheet.getRow(i);
				int numCols = fila.getLastCellNum();
				
				for (int j = 0; j < numCols; j++) {
					
					Cell celda = fila.getCell(j);
					
					switch(celda.getCellTypeEnum().toString()) {
					case "NUMERIC":
						System.out.println(celda.getNumericCellValue() + " ");
						break;
					case "STRING":
						System.out.println(celda.getStringCellValue() + " ");
						break;
					case "FORMULA":
						System.out.println(celda.getCellFormula() + " ");
						break;
					}
				}
				System.out.println("");
			}
			
		} catch (IOException e) {
			System.out.println("Error");
		}
		return personas;
	}
}
