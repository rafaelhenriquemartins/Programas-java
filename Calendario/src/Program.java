import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.Instant;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();

		System.out.println(sdf.format(d));

		// pegando o valor dos minutos de uma data

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d);
		int minutos = cal.get(Calendar.MINUTE);
		
		// no java o mes inicia no 0
		int mes = 1 + cal.get(Calendar.MONTH);

		System.out.println("minutos: " + minutos);
		System.out.println("mes: " + mes);

	}

}
