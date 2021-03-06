/*
 * This file is generated by jOOQ.
 */
package com.cloud.kailuan.yjindex.db.tables.records;


import com.cloud.kailuan.yjindex.db.tables.LcAppModuleConf;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * app应用模块配置
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LcAppModuleConfRecord extends UpdatableRecordImpl<LcAppModuleConfRecord> implements Record13<Long, String, String, String, String, Integer, String, String, Byte, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 14266554;

    /**
     * Setter for <code>lc.lc_app_module_conf.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.title</code>. 标题
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.title</code>. 标题
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.ico_url</code>. 图片地址
     */
    public void setIcoUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.ico_url</code>. 图片地址
     */
    public String getIcoUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.ico_link_type</code>. url地址，路由地址
     */
    public void setIcoLinkType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.ico_link_type</code>. url地址，路由地址
     */
    public String getIcoLinkType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.ico_link_url</code>. 图片链接
     */
    public void setIcoLinkUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.ico_link_url</code>. 图片链接
     */
    public String getIcoLinkUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.disp_or</code>. 排序字段
     */
    public void setDispOr(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.disp_or</code>. 排序字段
     */
    public Integer getDispOr() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.remark</code>. 备注
     */
    public void setRemark(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(6);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.status</code>. 配置状态 1：启用 0：不启用
     */
    public void setStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.status</code>. 配置状态 1：启用 0：不启用
     */
    public String getStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.del_flag</code>. 逻辑删除(默认0正常，1文件已被物理删除)
     */
    public void setDelFlag(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.del_flag</code>. 逻辑删除(默认0正常，1文件已被物理删除)
     */
    public Byte getDelFlag() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.create_by</code>. 创建人
     */
    public void setCreateBy(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.create_by</code>. 创建人
     */
    public String getCreateBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.create_date</code>. 创建时间
     */
    public void setCreateDate(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.create_date</code>. 创建时间
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.update_by</code>. 更新人
     */
    public void setUpdateBy(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.update_by</code>. 更新人
     */
    public String getUpdateBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>lc.lc_app_module_conf.update_date</code>. 更新时间
     */
    public void setUpdateDate(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>lc.lc_app_module_conf.update_date</code>. 更新时间
     */
    public LocalDateTime getUpdateDate() {
        return (LocalDateTime) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, String, String, String, String, Integer, String, String, Byte, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, String, String, String, String, Integer, String, String, Byte, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.ID;
    }

    @Override
    public Field<String> field2() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.TITLE;
    }

    @Override
    public Field<String> field3() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.ICO_URL;
    }

    @Override
    public Field<String> field4() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.ICO_LINK_TYPE;
    }

    @Override
    public Field<String> field5() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.ICO_LINK_URL;
    }

    @Override
    public Field<Integer> field6() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.DISP_OR;
    }

    @Override
    public Field<String> field7() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.REMARK;
    }

    @Override
    public Field<String> field8() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.STATUS;
    }

    @Override
    public Field<Byte> field9() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.DEL_FLAG;
    }

    @Override
    public Field<String> field10() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.CREATE_BY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.CREATE_DATE;
    }

    @Override
    public Field<String> field12() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.UPDATE_BY;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return LcAppModuleConf.LC_APP_MODULE_CONF.UPDATE_DATE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getIcoUrl();
    }

    @Override
    public String component4() {
        return getIcoLinkType();
    }

    @Override
    public String component5() {
        return getIcoLinkUrl();
    }

    @Override
    public Integer component6() {
        return getDispOr();
    }

    @Override
    public String component7() {
        return getRemark();
    }

    @Override
    public String component8() {
        return getStatus();
    }

    @Override
    public Byte component9() {
        return getDelFlag();
    }

    @Override
    public String component10() {
        return getCreateBy();
    }

    @Override
    public LocalDateTime component11() {
        return getCreateDate();
    }

    @Override
    public String component12() {
        return getUpdateBy();
    }

    @Override
    public LocalDateTime component13() {
        return getUpdateDate();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getIcoUrl();
    }

    @Override
    public String value4() {
        return getIcoLinkType();
    }

    @Override
    public String value5() {
        return getIcoLinkUrl();
    }

    @Override
    public Integer value6() {
        return getDispOr();
    }

    @Override
    public String value7() {
        return getRemark();
    }

    @Override
    public String value8() {
        return getStatus();
    }

    @Override
    public Byte value9() {
        return getDelFlag();
    }

    @Override
    public String value10() {
        return getCreateBy();
    }

    @Override
    public LocalDateTime value11() {
        return getCreateDate();
    }

    @Override
    public String value12() {
        return getUpdateBy();
    }

    @Override
    public LocalDateTime value13() {
        return getUpdateDate();
    }

    @Override
    public LcAppModuleConfRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value3(String value) {
        setIcoUrl(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value4(String value) {
        setIcoLinkType(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value5(String value) {
        setIcoLinkUrl(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value6(Integer value) {
        setDispOr(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value7(String value) {
        setRemark(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value8(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value9(Byte value) {
        setDelFlag(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value10(String value) {
        setCreateBy(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value11(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value12(String value) {
        setUpdateBy(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord value13(LocalDateTime value) {
        setUpdateDate(value);
        return this;
    }

    @Override
    public LcAppModuleConfRecord values(Long value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, Byte value9, String value10, LocalDateTime value11, String value12, LocalDateTime value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LcAppModuleConfRecord
     */
    public LcAppModuleConfRecord() {
        super(LcAppModuleConf.LC_APP_MODULE_CONF);
    }

    /**
     * Create a detached, initialised LcAppModuleConfRecord
     */
    public LcAppModuleConfRecord(Long id, String title, String icoUrl, String icoLinkType, String icoLinkUrl, Integer dispOr, String remark, String status, Byte delFlag, String createBy, LocalDateTime createDate, String updateBy, LocalDateTime updateDate) {
        super(LcAppModuleConf.LC_APP_MODULE_CONF);

        set(0, id);
        set(1, title);
        set(2, icoUrl);
        set(3, icoLinkType);
        set(4, icoLinkUrl);
        set(5, dispOr);
        set(6, remark);
        set(7, status);
        set(8, delFlag);
        set(9, createBy);
        set(10, createDate);
        set(11, updateBy);
        set(12, updateDate);
    }
}
