package crm.libraries.abm.entities;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Properties;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.IdentifierGeneratorFactory;
import org.hibernate.id.PersistentIdentifierGenerator;

public class IncrementGenerator implements IdentifierGenerator, Configurable {
	
	private static final Log log = LogFactory.getLog(IncrementGenerator.class);
	
	private long next;
	private String sql;
	private Class returnClass;
	
	
	public synchronized Serializable generate(SessionImplementor session, Object object)
		throws HibernateException {
			
		if (sql!=null) {
			try {
				getNext( session.connection() );
			} catch (SQLException e) {
				e.printStackTrace();
				throw new HibernateException(e);
			}
		}
		return IdentifierGeneratorFactory.createNumber(next++, returnClass);
	}

	public void configure(org.hibernate.type.Type type, Properties params, Dialect d)
		throws MappingException {
		
		String table = params.getProperty("table");
		if (table==null) 
			table = params.getProperty(PersistentIdentifierGenerator.TABLE);
		
		String column = params.getProperty("column");
		if (column==null) 
			column = params.getProperty(PersistentIdentifierGenerator.PK);
		
		String schema = params.getProperty(PersistentIdentifierGenerator.SCHEMA);
		returnClass = type.getReturnedClass();

		sql = "select max(" + column + ") from " + ( schema==null ? table : schema + '.' + table );
	}
	
	private void getNext(Connection conn) throws SQLException {
		
		log.debug("fetching initial value: " + sql);
		
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = null;
		try {
			rs = st.executeQuery();
			if ( rs.next() ) {
				next = rs.getLong(1) + 1;
				if ( rs.wasNull() ) next = 1;
			}
			else {
				next = 1;
			}
			sql=null;
			log.debug("first free id: " + next);
		}
		finally {
			if (rs!=null) rs.close();
			st.close();
		}
	}

}

