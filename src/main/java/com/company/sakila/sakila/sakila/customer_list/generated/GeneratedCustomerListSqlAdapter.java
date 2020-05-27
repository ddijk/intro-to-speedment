package com.company.sakila.sakila.sakila.customer_list.generated;

import com.company.sakila.sakila.sakila.customer_list.CustomerList;
import com.company.sakila.sakila.sakila.customer_list.CustomerListImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.company.sakila.sakila.sakila.customer_list.CustomerList} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCustomerListSqlAdapter implements SqlAdapter<CustomerList> {
    
    private final TableIdentifier<CustomerList> tableIdentifier;
    
    protected GeneratedCustomerListSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "customer_list");
    }
    
    protected CustomerList apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(      getInt(resultSet, 1 + offset))
            .setName(    resultSet.getString(2 + offset))
            .setAddress( resultSet.getString(3 + offset))
            .setZipCode( resultSet.getString(4 + offset))
            .setPhone(   resultSet.getString(5 + offset))
            .setCity(    resultSet.getString(6 + offset))
            .setCountry( resultSet.getString(7 + offset))
            .setNotes(   resultSet.getString(8 + offset))
            .setSid(     getShort(resultSet, 9 + offset))
            ;
    }
    
    protected CustomerListImpl createEntity() {
        return new CustomerListImpl();
    }
    
    @Override
    public TableIdentifier<CustomerList> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, CustomerList> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, CustomerList> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}