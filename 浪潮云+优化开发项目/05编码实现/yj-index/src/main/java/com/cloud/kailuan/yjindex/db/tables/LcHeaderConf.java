/*
 * This file is generated by jOOQ.
 */
package com.cloud.kailuan.yjindex.db.tables;


import com.cloud.kailuan.yjindex.db.Keys;
import com.cloud.kailuan.yjindex.db.Lc;
import com.cloud.kailuan.yjindex.db.tables.records.LcHeaderConfRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * app头部配置
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LcHeaderConf extends TableImpl<LcHeaderConfRecord> {

    private static final long serialVersionUID = 1876542022;

    /**
     * The reference instance of <code>lc.lc_header_conf</code>
     */
    public static final LcHeaderConf LC_HEADER_CONF = new LcHeaderConf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LcHeaderConfRecord> getRecordType() {
        return LcHeaderConfRecord.class;
    }

    /**
     * The column <code>lc.lc_header_conf.id</code>.
     */
    public final TableField<LcHeaderConfRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>lc.lc_header_conf.header_name</code>. 头部名称
     */
    public final TableField<LcHeaderConfRecord, String> HEADER_NAME = createField(DSL.name("header_name"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "头部名称");

    /**
     * The column <code>lc.lc_header_conf.logo_file_url</code>.
     */
    public final TableField<LcHeaderConfRecord, String> LOGO_FILE_URL = createField(DSL.name("logo_file_url"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>lc.lc_header_conf.bg_file_url</code>.
     */
    public final TableField<LcHeaderConfRecord, String> BG_FILE_URL = createField(DSL.name("bg_file_url"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>lc.lc_header_conf</code> table reference
     */
    public LcHeaderConf() {
        this(DSL.name("lc_header_conf"), null);
    }

    /**
     * Create an aliased <code>lc.lc_header_conf</code> table reference
     */
    public LcHeaderConf(String alias) {
        this(DSL.name(alias), LC_HEADER_CONF);
    }

    /**
     * Create an aliased <code>lc.lc_header_conf</code> table reference
     */
    public LcHeaderConf(Name alias) {
        this(alias, LC_HEADER_CONF);
    }

    private LcHeaderConf(Name alias, Table<LcHeaderConfRecord> aliased) {
        this(alias, aliased, null);
    }

    private LcHeaderConf(Name alias, Table<LcHeaderConfRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("app头部配置"), TableOptions.table());
    }

    public <O extends Record> LcHeaderConf(Table<O> child, ForeignKey<O, LcHeaderConfRecord> key) {
        super(child, key, LC_HEADER_CONF);
    }

    @Override
    public Schema getSchema() {
        return Lc.LC;
    }

    @Override
    public UniqueKey<LcHeaderConfRecord> getPrimaryKey() {
        return Keys.KEY_LC_HEADER_CONF_PRIMARY;
    }

    @Override
    public List<UniqueKey<LcHeaderConfRecord>> getKeys() {
        return Arrays.<UniqueKey<LcHeaderConfRecord>>asList(Keys.KEY_LC_HEADER_CONF_PRIMARY);
    }

    @Override
    public LcHeaderConf as(String alias) {
        return new LcHeaderConf(DSL.name(alias), this);
    }

    @Override
    public LcHeaderConf as(Name alias) {
        return new LcHeaderConf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LcHeaderConf rename(String name) {
        return new LcHeaderConf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LcHeaderConf rename(Name name) {
        return new LcHeaderConf(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
