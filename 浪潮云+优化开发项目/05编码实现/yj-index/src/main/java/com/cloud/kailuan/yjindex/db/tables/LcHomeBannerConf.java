/*
 * This file is generated by jOOQ.
 */
package com.cloud.kailuan.yjindex.db.tables;


import com.cloud.kailuan.yjindex.db.Keys;
import com.cloud.kailuan.yjindex.db.Lc;
import com.cloud.kailuan.yjindex.db.tables.records.LcHomeBannerConfRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 首页banner图广告配置
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LcHomeBannerConf extends TableImpl<LcHomeBannerConfRecord> {

    private static final long serialVersionUID = 1609577248;

    /**
     * The reference instance of <code>lc.lc_home_banner_conf</code>
     */
    public static final LcHomeBannerConf LC_HOME_BANNER_CONF = new LcHomeBannerConf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LcHomeBannerConfRecord> getRecordType() {
        return LcHomeBannerConfRecord.class;
    }

    /**
     * The column <code>lc.lc_home_banner_conf.id</code>.
     */
    public final TableField<LcHomeBannerConfRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>lc.lc_home_banner_conf.title</code>. 标题
     */
    public final TableField<LcHomeBannerConfRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "标题");

    /**
     * The column <code>lc.lc_home_banner_conf.ad_img_url</code>. 图片地址
     */
    public final TableField<LcHomeBannerConfRecord, String> AD_IMG_URL = createField(DSL.name("ad_img_url"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "图片地址");

    /**
     * The column <code>lc.lc_home_banner_conf.ad_img_link_type</code>. url地址，路由地址
     */
    public final TableField<LcHomeBannerConfRecord, String> AD_IMG_LINK_TYPE = createField(DSL.name("ad_img_link_type"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "url地址，路由地址");

    /**
     * The column <code>lc.lc_home_banner_conf.ad_img_link_url</code>. 图片链接
     */
    public final TableField<LcHomeBannerConfRecord, String> AD_IMG_LINK_URL = createField(DSL.name("ad_img_link_url"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "图片链接");

    /**
     * The column <code>lc.lc_home_banner_conf.disp_or</code>. 排序字段
     */
    public final TableField<LcHomeBannerConfRecord, Integer> DISP_OR = createField(DSL.name("disp_or"), org.jooq.impl.SQLDataType.INTEGER, this, "排序字段");

    /**
     * The column <code>lc.lc_home_banner_conf.remark</code>. 备注
     */
    public final TableField<LcHomeBannerConfRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>lc.lc_home_banner_conf.del_flag</code>. 逻辑删除(默认0正常，1文件已被物理删除)
     */
    public final TableField<LcHomeBannerConfRecord, Byte> DEL_FLAG = createField(DSL.name("del_flag"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "逻辑删除(默认0正常，1文件已被物理删除)");

    /**
     * The column <code>lc.lc_home_banner_conf.create_by</code>. 创建人
     */
    public final TableField<LcHomeBannerConfRecord, String> CREATE_BY = createField(DSL.name("create_by"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "创建人");

    /**
     * The column <code>lc.lc_home_banner_conf.create_date</code>. 创建时间
     */
    public final TableField<LcHomeBannerConfRecord, LocalDateTime> CREATE_DATE = createField(DSL.name("create_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "创建时间");

    /**
     * The column <code>lc.lc_home_banner_conf.update_by</code>. 更新人
     */
    public final TableField<LcHomeBannerConfRecord, String> UPDATE_BY = createField(DSL.name("update_by"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "更新人");

    /**
     * The column <code>lc.lc_home_banner_conf.update_date</code>. 更新时间
     */
    public final TableField<LcHomeBannerConfRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "更新时间");

    /**
     * The column <code>lc.lc_home_banner_conf.status</code>. 配置状态 1：启用 0：不启用
     */
    public final TableField<LcHomeBannerConfRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(2), this, "配置状态 1：启用 0：不启用");

    /**
     * Create a <code>lc.lc_home_banner_conf</code> table reference
     */
    public LcHomeBannerConf() {
        this(DSL.name("lc_home_banner_conf"), null);
    }

    /**
     * Create an aliased <code>lc.lc_home_banner_conf</code> table reference
     */
    public LcHomeBannerConf(String alias) {
        this(DSL.name(alias), LC_HOME_BANNER_CONF);
    }

    /**
     * Create an aliased <code>lc.lc_home_banner_conf</code> table reference
     */
    public LcHomeBannerConf(Name alias) {
        this(alias, LC_HOME_BANNER_CONF);
    }

    private LcHomeBannerConf(Name alias, Table<LcHomeBannerConfRecord> aliased) {
        this(alias, aliased, null);
    }

    private LcHomeBannerConf(Name alias, Table<LcHomeBannerConfRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("首页banner图广告配置"), TableOptions.table());
    }

    public <O extends Record> LcHomeBannerConf(Table<O> child, ForeignKey<O, LcHomeBannerConfRecord> key) {
        super(child, key, LC_HOME_BANNER_CONF);
    }

    @Override
    public Schema getSchema() {
        return Lc.LC;
    }

    @Override
    public UniqueKey<LcHomeBannerConfRecord> getPrimaryKey() {
        return Keys.KEY_LC_HOME_BANNER_CONF_PRIMARY;
    }

    @Override
    public List<UniqueKey<LcHomeBannerConfRecord>> getKeys() {
        return Arrays.<UniqueKey<LcHomeBannerConfRecord>>asList(Keys.KEY_LC_HOME_BANNER_CONF_PRIMARY);
    }

    @Override
    public TableField<LcHomeBannerConfRecord, LocalDateTime> getRecordTimestamp() {
        return UPDATE_DATE;
    }

    @Override
    public LcHomeBannerConf as(String alias) {
        return new LcHomeBannerConf(DSL.name(alias), this);
    }

    @Override
    public LcHomeBannerConf as(Name alias) {
        return new LcHomeBannerConf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LcHomeBannerConf rename(String name) {
        return new LcHomeBannerConf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LcHomeBannerConf rename(Name name) {
        return new LcHomeBannerConf(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, String, String, String, String, Integer, String, Byte, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
