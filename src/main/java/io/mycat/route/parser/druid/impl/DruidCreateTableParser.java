package io.mycat.route.parser.druid.impl;

import io.mycat.route.RouteResultset;
import io.mycat.route.parser.druid.MycatSchemaStatVisitor;
import io.mycat.server.config.SchemaConfig;
import io.mycat.util.StringUtil;

<<<<<<< HEAD:src/main/java/org/opencloudb/parser/druid/impl/DruidCreateTableParser.java
import com.alibaba.druid.sql.visitor.SchemaStatVisitor;
import org.opencloudb.config.model.SchemaConfig;
import org.opencloudb.route.RouteResultset;
=======
import java.sql.SQLNonTransientException;
>>>>>>> mycatapache/master:src/main/java/io/mycat/route/parser/druid/impl/DruidCreateTableParser.java

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableStatement;

public class DruidCreateTableParser extends DefaultDruidParser {

	@Override
<<<<<<< HEAD:src/main/java/org/opencloudb/parser/druid/impl/DruidCreateTableParser.java
	public void visitorParse(RouteResultset rrs, SQLStatement stmt,SchemaStatVisitor visitor) {
=======
	public void visitorParse(RouteResultset rrs, SQLStatement stmt, MycatSchemaStatVisitor visitor) {
>>>>>>> mycatapache/master:src/main/java/io/mycat/route/parser/druid/impl/DruidCreateTableParser.java
	}
	
	@Override
	public void statementParse(SchemaConfig schema, RouteResultset rrs, SQLStatement stmt) throws SQLNonTransientException {
		MySqlCreateTableStatement createStmt = (MySqlCreateTableStatement)stmt;
		if(createStmt.getQuery() != null) {
			String msg = "create table from other table not supported :" + stmt;
			LOGGER.warn(msg);
			throw new SQLNonTransientException(msg);
		}
		String tableName = StringUtil.removeBackquote(createStmt.getTableSource().toString().toUpperCase());
		ctx.addTable(tableName);
		
	}
}
