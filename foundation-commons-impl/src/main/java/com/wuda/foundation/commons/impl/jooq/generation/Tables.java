/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation;


import com.wuda.foundation.commons.impl.jooq.generation.tables.AdministrativeUnit;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Email;
import com.wuda.foundation.commons.impl.jooq.generation.tables.FlowHistory;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Group;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Phone;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKey;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKeyDefinition;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyMount;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyValue;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Task;
import com.wuda.foundation.commons.impl.jooq.generation.tables.TaskLog;
import com.wuda.foundation.commons.impl.jooq.generation.tables.TaskPhase;
import com.wuda.foundation.commons.impl.jooq.generation.tables.TreeNode;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Variable;


/**
 * Convenience access to all tables in foundation_commons
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 行政单元，行政区域划分。也就是省市区等数据，不按省市区建表，因为不一定是按那样划分，比如北京，深圳，但是他们有一个共同特点，那就是有上下级关系，因此用ID/PID的方式组织。
     */
    public static final AdministrativeUnit ADMINISTRATIVE_UNIT = AdministrativeUnit.ADMINISTRATIVE_UNIT;

    /**
     * email信息
     */
    public static final Email EMAIL = Email.EMAIL;

    /**
     * 流程处理历史记录
     */
    public static final FlowHistory FLOW_HISTORY = FlowHistory.FLOW_HISTORY;

    /**
     * 店铺是一种组，组织机构是一种组，部门也是一种组，等等，这个表就作为所有这些组的基础结构。为什么要用一个组这样的基础表呢？原因是：1，这些组有很多相同的概念，因此可以统一处理这些组相关的逻辑,；2，组织机构等是可以有上下级的，因此，基于tree_node统一处理所有这些组的树形结构；3，基本上所有的实体都有以某种方式组织起来（比如分类），但是很多实体的组织在业务发展的一开始不是很明确的，比如用户属于公司某个部门，但是随着业务的发展，为用户创建了群（比如微信的群），如果使用抽象的group_id和user_id
     */
    public static final Group GROUP = Group.GROUP;

    /**
     * 电话信息。
     */
    public static final Phone PHONE = Phone.PHONE;

    /**
     * 属性的key
     */
    public static final PropertyKey PROPERTY_KEY = PropertyKey.PROPERTY_KEY;

    /**
     * property key 的定义，就好像是数据库表中列的定义是类似的
     */
    public static final PropertyKeyDefinition PROPERTY_KEY_DEFINITION = PropertyKeyDefinition.PROPERTY_KEY_DEFINITION;

    /**
     * 属性模板的挂载点，比如对于商品来说，相同分类下的商品属性很擂台，因此可以把属性模板挂载到商品分类上，在新建商品时就可以推荐相关的属性模板了
     */
    public static final PropertyMount PROPERTY_MOUNT = PropertyMount.PROPERTY_MOUNT;

    /**
     * 属性的值
     */
    public static final PropertyValue PROPERTY_VALUE = PropertyValue.PROPERTY_VALUE;

    /**
     * 任务
     */
    public static final Task TASK = Task.TASK;

    /**
     * 任务的日志
     */
    public static final TaskLog TASK_LOG = TaskLog.TASK_LOG;

    /**
     * 任务的某个阶段
     */
    public static final TaskPhase TASK_PHASE = TaskPhase.TASK_PHASE;

    /**
     * 树形结构的节点。有很多数据是用树形结构组织的，比如商品分类，文章分类，组织架构等等，通常我们都是为它们单独设计一个表，比如商品分类表，部门表，然后每个表都写了差不多相同的处理逻辑，如何避免重复处理类似树形的数据呢？这个表的目的就是为了统一处理这些类似树形结构的表，以这个表为核心，扩展出商品分类，文章分类，部门等。
     */
    public static final TreeNode TREE_NODE = TreeNode.TREE_NODE;

    /**
     * 简单的变量，使用name-value pair表示
     */
    public static final Variable VARIABLE = Variable.VARIABLE;
}
