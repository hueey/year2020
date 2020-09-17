/*
 * This file is generated by jOOQ.
 */
package com.cloud.kailuan.yjindex.db.tables.records;


import com.cloud.kailuan.yjindex.db.tables.LcFileInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LcFileInfoRecord extends TableRecordImpl<LcFileInfoRecord> implements Record11<Long, String, String, String, String, Byte, String, LocalDateTime, String, LocalDateTime, String> {

    private static final long serialVersionUID = -2021809739;

    /**
     * Setter for <code>lc.lc_file_info.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>lc.lc_file_info.original_name</code>. 文件原始名字
     */
    public void setOriginalName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.original_name</code>. 文件原始名字
     */
    public String getOriginalName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>lc.lc_file_info.new_name</code>. 文件随机名称
     */
    public void setNewName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.new_name</code>. 文件随机名称
     */
    public String getNewName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>lc.lc_file_info.file_path</code>. 文件服务器存储绝对路径
     */
    public void setFilePath(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.file_path</code>. 文件服务器存储绝对路径
     */
    public String getFilePath() {
        return (String) get(3);
    }

    /**
     * Setter for <code>lc.lc_file_info.relative_path</code>. 文件相对路径，域名+此字段为该资源的请求地址
     */
    public void setRelativePath(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.relative_path</code>. 文件相对路径，域名+此字段为该资源的请求地址
     */
    public String getRelativePath() {
        return (String) get(4);
    }

    /**
     * Setter for <code>lc.lc_file_info.del_flag</code>. 逻辑删除(默认0正常，1文件已被物理删除)
     */
    public void setDelFlag(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.del_flag</code>. 逻辑删除(默认0正常，1文件已被物理删除)
     */
    public Byte getDelFlag() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>lc.lc_file_info.create_by</code>. 创建人
     */
    public void setCreateBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.create_by</code>. 创建人
     */
    public String getCreateBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>lc.lc_file_info.create_date</code>. 创建时间
     */
    public void setCreateDate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.create_date</code>. 创建时间
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>lc.lc_file_info.update_by</code>. 更新人
     */
    public void setUpdateBy(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.update_by</code>. 更新人
     */
    public String getUpdateBy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>lc.lc_file_info.update_date</code>. 更新时间
     */
    public void setUpdateDate(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.update_date</code>. 更新时间
     */
    public LocalDateTime getUpdateDate() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>lc.lc_file_info.remarks</code>. 文件备注
     */
    public void setRemarks(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>lc.lc_file_info.remarks</code>. 文件备注
     */
    public String getRemarks() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, String, String, Byte, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, String, String, String, Byte, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return LcFileInfo.LC_FILE_INFO.ID;
    }

    @Override
    public Field<String> field2() {
        return LcFileInfo.LC_FILE_INFO.ORIGINAL_NAME;
    }

    @Override
    public Field<String> field3() {
        return LcFileInfo.LC_FILE_INFO.NEW_NAME;
    }

    @Override
    public Field<String> field4() {
        return LcFileInfo.LC_FILE_INFO.FILE_PATH;
    }

    @Override
    public Field<String> field5() {
        return LcFileInfo.LC_FILE_INFO.RELATIVE_PATH;
    }

    @Override
    public Field<Byte> field6() {
        return LcFileInfo.LC_FILE_INFO.DEL_FLAG;
    }

    @Override
    public Field<String> field7() {
        return LcFileInfo.LC_FILE_INFO.CREATE_BY;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return LcFileInfo.LC_FILE_INFO.CREATE_DATE;
    }

    @Override
    public Field<String> field9() {
        return LcFileInfo.LC_FILE_INFO.UPDATE_BY;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return LcFileInfo.LC_FILE_INFO.UPDATE_DATE;
    }

    @Override
    public Field<String> field11() {
        return LcFileInfo.LC_FILE_INFO.REMARKS;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getOriginalName();
    }

    @Override
    public String component3() {
        return getNewName();
    }

    @Override
    public String component4() {
        return getFilePath();
    }

    @Override
    public String component5() {
        return getRelativePath();
    }

    @Override
    public Byte component6() {
        return getDelFlag();
    }

    @Override
    public String component7() {
        return getCreateBy();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateDate();
    }

    @Override
    public String component9() {
        return getUpdateBy();
    }

    @Override
    public LocalDateTime component10() {
        return getUpdateDate();
    }

    @Override
    public String component11() {
        return getRemarks();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getOriginalName();
    }

    @Override
    public String value3() {
        return getNewName();
    }

    @Override
    public String value4() {
        return getFilePath();
    }

    @Override
    public String value5() {
        return getRelativePath();
    }

    @Override
    public Byte value6() {
        return getDelFlag();
    }

    @Override
    public String value7() {
        return getCreateBy();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateDate();
    }

    @Override
    public String value9() {
        return getUpdateBy();
    }

    @Override
    public LocalDateTime value10() {
        return getUpdateDate();
    }

    @Override
    public String value11() {
        return getRemarks();
    }

    @Override
    public LcFileInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value2(String value) {
        setOriginalName(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value3(String value) {
        setNewName(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value4(String value) {
        setFilePath(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value5(String value) {
        setRelativePath(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value6(Byte value) {
        setDelFlag(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value7(String value) {
        setCreateBy(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value8(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value9(String value) {
        setUpdateBy(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value10(LocalDateTime value) {
        setUpdateDate(value);
        return this;
    }

    @Override
    public LcFileInfoRecord value11(String value) {
        setRemarks(value);
        return this;
    }

    @Override
    public LcFileInfoRecord values(Long value1, String value2, String value3, String value4, String value5, Byte value6, String value7, LocalDateTime value8, String value9, LocalDateTime value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LcFileInfoRecord
     */
    public LcFileInfoRecord() {
        super(LcFileInfo.LC_FILE_INFO);
    }

    /**
     * Create a detached, initialised LcFileInfoRecord
     */
    public LcFileInfoRecord(Long id, String originalName, String newName, String filePath, String relativePath, Byte delFlag, String createBy, LocalDateTime createDate, String updateBy, LocalDateTime updateDate, String remarks) {
        super(LcFileInfo.LC_FILE_INFO);

        set(0, id);
        set(1, originalName);
        set(2, newName);
        set(3, filePath);
        set(4, relativePath);
        set(5, delFlag);
        set(6, createBy);
        set(7, createDate);
        set(8, updateBy);
        set(9, updateDate);
        set(10, remarks);
    }
}
