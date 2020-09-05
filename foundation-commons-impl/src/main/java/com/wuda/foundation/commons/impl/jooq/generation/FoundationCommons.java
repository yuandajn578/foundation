/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation;


import com.wuda.foundation.commons.impl.jooq.generation.tables.Email;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Phone;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKey;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKeyDefinition;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyValue;
import com.wuda.foundation.commons.impl.jooq.generation.tables.TreeNode;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoundationCommons extends SchemaImpl {

    private static final long serialVersionUID = -595952906;

    /**
     * The reference instance of <code>foundation_commons</code>
     */
    public static final FoundationCommons FOUNDATION_COMMONS = new FoundationCommons();

    /**
     * email信息
     */
    public final Email EMAIL = Email.EMAIL;

    /**
     * 电话信息。
     */
    public final Phone PHONE = Phone.PHONE;

    /**
     * 属性的key
     */
    public final PropertyKey PROPERTY_KEY = PropertyKey.PROPERTY_KEY;

    /**
     * property key 的定义，就好像是数据库表中列的定义是类似的
     */
    public final PropertyKeyDefinition PROPERTY_KEY_DEFINITION = PropertyKeyDefinition.PROPERTY_KEY_DEFINITION;

    /**
     * 属性的值
     */
    public final PropertyValue PROPERTY_VALUE = PropertyValue.PROPERTY_VALUE;

    /**
     * 树形结构的节点。有很多数据是用树形结构组织的，比如商品分类，文章分类，组织架构等等，通常我们都是为它们单独设计一个表，比如商品分类表，部门表，然后每个表都写了差不多相同的处理逻辑，如何避免重复处理类似树形的数据呢？这个表的目的就是为了统一处理这些类似树形结构的表，以这个表为核心，扩展出商品分类，文章分类，部门等。
     */
    public final TreeNode TREE_NODE = TreeNode.TREE_NODE;

    /**
     * No further instances allowed
     */
    private FoundationCommons() {
        super("foundation_commons", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Email.EMAIL,
            Phone.PHONE,
            PropertyKey.PROPERTY_KEY,
            PropertyKeyDefinition.PROPERTY_KEY_DEFINITION,
            PropertyValue.PROPERTY_VALUE,
            TreeNode.TREE_NODE);
    }
}
