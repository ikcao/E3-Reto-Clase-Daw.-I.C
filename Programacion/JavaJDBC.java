import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaJDBC {
	private static int numerosuscritos = 0;

	public static void main(String[] args) {

		allinfo();
		averageage();

	}

	/**
	 * Muestra en pantalla toda la informacion de la base de datos.
	 */
	private static void allinfo() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Direccion IP, nombre de la base de datos Mysql, usuario y
			// contraseña.
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatoseventos", "root",
					""

			);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from suscritos");

			while (resultSet.next()) {

				System.out.println(" ID_SUSCRITO: " + resultSet.getInt(1) + " EMAIL: " + resultSet.getString(2)
						+ " CONTRASEÑA: " + resultSet.getString(3) + " NOMBRE: " + resultSet.getString(4) + " "
						+ resultSet.getString(5) + " EDAD " + resultSet.getInt(6) + " GENERO: " + resultSet.getString(7)
						+ " TELEFONO: " + resultSet.getInt(8) + " LOCALIDAD: " + resultSet.getString(9));

				numerosuscritos++;
			}
			;

			System.out.println(" El numero de suscritos es: " + numerosuscritos);
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * Muestra en pantalla todos los Ids con sus respectivos nombres.
	 */
	private static void justidnames() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Direccion IP, nombre de la base de datos Mysql, usuario y
			// contraseña.
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatoseventos", "root",
					""

			);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select id_suscrito from suscritos");
			while (resultSet.next()) {

				System.out.println(" ID_SUSCRITO: " + resultSet.getInt(1) + " NOMBRE: " + resultSet.getString(4) + " "
						+ resultSet.getString(5));
				;

			}

			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Muestra en pantalla todos los nombres y los apellidos de los suscritos.
	 */
	private static void sunames() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Direccion IP, nombre de la base de datos Mysql, usuario y
			// contraseña.
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatoseventos", "root",
					""

			);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from suscritos");
			while (resultSet.next()) {

				System.out.println(" NOMBRE: " + resultSet.getString(4) + " " + resultSet.getString(5));

			}

			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * Muestra en pantalla los nombres con sus respectivos numeros de telefono.
	 */
	private static void phonenumbers() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Direccion IP, nombre de la base de datos Mysql, usuario y
			// contraseña.
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatoseventos", "root",
					""

			);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from suscritos");
			while (resultSet.next()) {

				System.out.println(" NOMBRE: " + resultSet.getString(4) + " " + resultSet.getString(5) + " TELEFONO "
						+ resultSet.getInt(8));

			}

			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * Muestra en pantalla la media de edad de todos los suscritos.
	 */
	private static void averageage() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Direccion IP, nombre de la base de datos Mysql, usuario y
			// contraseña.
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatoseventos", "root",
					""

			);

			int a = numerosuscritos;
			int sum = 0;
			Statement st = connection.createStatement();
			ResultSet res = st.executeQuery("SELECT SUM(edad) FROM suscritos");

			while (res.next()) {
				int c = res.getInt(1);
				sum = sum + c;

			}
			sum = sum / a;

			System.out.println(" La media de edad de los suscritos es " + sum);

			connection.close();
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}