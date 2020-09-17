/*
 * This file is generated by jOOQ.
 */
package com.cloud.kailuan.yjindex.db.tables;


import com.cloud.kailuan.yjindex.db.Keys;
import com.cloud.kailuan.yjindex.db.Lc;
import com.cloud.kailuan.yjindex.db.tables.records.LcAppModuleConfRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * app应用模块配置
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LcAppModuleConf extends TableImpl<LcAppModuleConfRecord> {

    private static final long serialVersionUID = -1048566804;

    /**
     * The reference instance of <code>lc.lc_app_module_conf</code>
     */
    public static final LcAppModuleConf LC_APP_MODULE_CONF = new LcAppModuleConf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LcAppModuleConfRecord> getRecordType() {
        return LcAppModuleConfRecord.class;
    }

    /**
     * The column <code>lc.lc_app_module_conf.id</code>.
     */
    public final TableField<LcAppModuleConfRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>lc.lc_app_module_conf.title</code>. 标题
     */
    public final TableField<LcAppModuleConfRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "标题");

    /**
     * The column <code>lc.lc_app_module_conf.ico_url</code>. 图片地址
     */
    public final TableField<LcAppModuleConfRecord, String> ICO_URL = createField(DSL.name("ico_url"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "图片地址");

    /**
     * The column <code>lc.lc_app_module_conf.ico_link_type</code>. url地址，路由地址
     */
    public final TableField<LcAppModuleConfRecord, String> ICO_LINK_TYPE = createField(DSL.name("ico_link_type"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "url地址，路由地址");

    /**
     * The column <code>lc.lc_app_module_conf.ico_link_url</code>. 图片链接
     */
    public final TableField<LcAppModuleConfRecord, String> ICO_LINK_URL = createField(DSL.name("ico_link_url"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "图片链接");

    /**
     * The column <code>lc.lc_app_module_conf.disp_or</code>. 排序字段
     */
    public final TableField<LcAppModuleConfRecord, Integer> DISP_OR = createField(DSL.name("disp_or"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "排序字段");

    /**
     * The column <code>lc.lc_app_module_conf.remark</code>. 备注
     */
    public final TableField<LcAppModuleConfRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>lc.lc_app_module_conf.del_flag</code>. 逻辑删除(默认0正常，1文件已被物理删除)
     */
    public final TableField<LcAppModuleConfRecord, Byte> DEL_FLAG = createField(DSL.name("del_flag"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "逻辑删除(默认0正常，1文件已被物理删除)");

    /**
     * The column <code>lc.lc_app_module_conf.create_by</code>. 创建人
     */
    public final TableField<LcAppModuleConfRecord, String> CREATE_BY = createField(DSL.name("create_by"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "创建人");

    /**
     * The column <code>lc.lc_app_module_conf.create_date</code>. 创建时间
     */
    public final TableField<LcAppModuleConfRecord, LocalDateTime> CREATE_DATE = createField(DSL.name("create_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "创建时间");

    /**
     * The column <code>lc.lc_app_module_conf.update_by</code>. 更新人
     */
    public final TableField<LcAppModuleConfRecord, String> UPDATE_BY = createField(DSL.name("update_by"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "更新人");

    /**
     * The column <code>lc.lc_app_module_conf.update_date</code>. 更新时间
     */
    public final TableField<LcAppModuleConfRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "更新时间");

    /**
     * Create a <code>lc.lc_app_module_conf</code> table reference
     */
    public LcAppModuleConf() {
        this(DSL.name("lc_app_module_conf"), null);
    }

    /**
     * Create an aliased <code>lc.lc_app_module_conf</code> table reference
     */
    public LcAppModuleConf(String alias) {
        this(DSL.name(alias), LC_APP_MODULE_CONF);
    }

    /**
     * Create an aliased <code>lc.lc_app_module_conf</code> table reference
     */
    public LcAppModuleConf(Name alias) {
        this(alias, LC_APP_MODULE_CONF);
    }

    private LcAppModuleConf(Name alias, Table<LcAppModuleConfRecord> aliased) {
        this(alias, aliased, null);
    }

    private LcAppModuleConf(Name alias, Table<LcAppModuleConfRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("app应用模块配置"), TableOptions.table());
    }

    public <O extends Record> LcAppModuleConf(Table<O> child, ForeignKey<O, LcAppModuleConfRecord> key) {
        super(child, key, LC_APP_MODULE_CONF);
    }

    @Override
    public Schema getSchema() {
        return Lc.LC;
    }

    @Override
    public UniqueKey<LcAppModuleConfRecord> getPrimaryKey() {
        return Keys.KEY_LC_APP_MODULE_CONF_PRIMARY;
    }

    @Override
    public List<UniqueKey<LcAppModuleConfRecord>> getKeys() {
        return Arrays.<UniqueKey<LcAppModuleConfRecord>>asList(Keys.KEY_LC_APP_MODULE_CONF_PRIMARY);
    }

    @Override
    public TableField<LcAppModuleConfRecord, LocalDateTime> getRecordTimestamp() {
        return UPDATE_DATE;
    }

    @Override
    public LcAppModuleConf as(String alias) {
        return new LcAppModuleConf(DSL.name(alias), this);
    }

    @Override
    public LcAppModuleConf as(Name alias) {
        return new LcAppModuleConf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LcAppModuleConf rename(String name) {
        return new LcAppModuleConf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LcAppModuleConf rename(Name name) {
        return new LcAppModuleConf(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, String, String, String, Integer, String, Byte, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
