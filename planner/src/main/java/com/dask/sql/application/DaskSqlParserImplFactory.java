package com.dask.sql.application;

import java.io.Reader;

import org.apache.calcite.sql.parser.SqlAbstractParserImpl;
import org.apache.calcite.sql.parser.SqlParserImplFactory;
import com.predibase.pql.parser.ExtensionSqlParserImpl; // import com.dask.sql.parser.DaskSqlParserImpl;

/**
 * DaskSqlParserImplFactory is the bridge between the Java code written by us
 * and the code generated by the freetype code template.
 */
public class DaskSqlParserImplFactory implements SqlParserImplFactory {

    @Override
    public SqlAbstractParserImpl getParser(Reader stream) {
        return new ExtensionSqlParserImpl(stream); //return new DaskSqlParserImpl(stream);
    }

}
