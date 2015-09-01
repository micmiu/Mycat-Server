package io.mycat.route.parser.druid.impl;

import io.mycat.route.RouteResultset;
import io.mycat.route.parser.druid.MycatSchemaStatVisitor;
import io.mycat.server.config.SchemaConfig;
import io.mycat.util.StringUtil;

<<<<<<< HEAD:src/main/java/org/opencloudb/parser/druid/impl/DruidAlterTableParser.java
import com.alibaba.druid.sql.visitor.SchemaStatVisitor;
import org.opencloudb.config.model.SchemaConfig;
import org.opencloudb.route.RouteResultset;
=======
import java.sql.SQLNonTransientException;
>>>>>>> mycatapache/master:src/main/java/io/mycat/route/parser/druid/impl/DruidAlterTableParser.java

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableStatement;

/**
 * alter table 语句解析
 * @author wang.dw
 *
 */
public class DruidAlterTableParser extends DefaultDruidParser {
	@Override
<<<<<<< HEAD:src/main/java/org/opencloudb/parser/druid/impl/DruidAlterTableParser.java
	public void visitorParse(RouteResultset rrs, SQLStatement stmt,SchemaStatVisitor visitor) throws SQLNonTransientException {
=======
	public void visitorParse(RouteResultset rrs, SQLStatement stmt,MycatSchemaStatVisitor visitor) throws SQLNonTransientException {
>>>>>>> mycatapache/master:src/main/java/io/mycat/route/parser/druid/impl/DruidAlterTableParser.java
		
	}
	@Override
	public void statementParse(SchemaConfig schema, RouteResultset rrs, SQLStatement stmt) throws SQLNonTransientException {
		MySqlAlterTableStatement alterTable = (MySqlAlterTableStatement)stmt;
		String tableName = StringUtil.removeBackquote(alterTable.getTableSource().toString().toUpperCase());
		
		ctx.addTable(tableName);
		
	}
}
