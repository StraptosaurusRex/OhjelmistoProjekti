package fi.hh.swd4t.zone.domain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Connector {

		public Connection con = null;
		public ResultSet res = null;
		public PreparedStatement prepare = null;
		public String sql;

		public Connector() {
			super();
		}

		public Connection connect() throws Exception{
			String url = "jdbc:postgresql://<host>:<port>/<dbname>?sslmode=require&user=<username>&password=<password>";
			return con;
}
}
 