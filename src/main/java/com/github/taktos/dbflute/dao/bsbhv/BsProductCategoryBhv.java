package com.github.taktos.dbflute.dao.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.github.taktos.dbflute.dao.exbhv.*;
import com.github.taktos.dbflute.dao.exentity.*;
import com.github.taktos.dbflute.dao.bsentity.dbmeta.*;
import com.github.taktos.dbflute.dao.cbean.*;

/**
 * The behavior of PRODUCT_CATEGORY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_CATEGORY_CODE
 * 
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     PRODUCT_CATEGORY
 * 
 * [referrer-table]
 *     PRODUCT, PRODUCT_CATEGORY
 * 
 * [foreign-property]
 *     productCategorySelf
 * 
 * [referrer-property]
 *     productList, productCategorySelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProductCategoryBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "PRODUCT_CATEGORY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return ProductCategoryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public ProductCategoryDbm getMyDBMeta() { return ProductCategoryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public ProductCategory newMyEntity() { return new ProductCategory(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public ProductCategoryCB newMyConditionBean() { return new ProductCategoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * int count = productCategoryBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @return The selected count.
     */
    public int selectCount(ProductCategoryCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(ProductCategoryCB cb) { // called by selectCount(cb) 
        assertCBNotNull(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(ProductCategoryCB cb) { // called by selectPage(cb)
        assertCBNotNull(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * productCategoryBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;ProductCategory&gt;() {
     *     public void handle(ProductCategory entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @param entityRowHandler The handler of entity row of ProductCategory. (NotNull)
     */
    public void selectCursor(ProductCategoryCB cb, EntityRowHandler<ProductCategory> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, ProductCategory.class);
    }

    protected <ENTITY extends ProductCategory> void doSelectCursor(ProductCategoryCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<ProductCategory>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * ProductCategory productCategory = productCategoryBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (productCategory != null) {
     *     ... = productCategory.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ProductCategory selectEntity(ProductCategoryCB cb) {
        return doSelectEntity(cb, ProductCategory.class);
    }

    protected <ENTITY extends ProductCategory> ENTITY doSelectEntity(final ProductCategoryCB cb, final Class<ENTITY> entityType) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, ProductCategoryCB>() {
            public List<ENTITY> callbackSelectList(ProductCategoryCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * ProductCategory productCategory = productCategoryBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = productCategory.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ProductCategory selectEntityWithDeletedCheck(ProductCategoryCB cb) {
        return doSelectEntityWithDeletedCheck(cb, ProductCategory.class);
    }

    protected <ENTITY extends ProductCategory> ENTITY doSelectEntityWithDeletedCheck(final ProductCategoryCB cb, final Class<ENTITY> entityType) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, ProductCategoryCB>() {
            public List<ENTITY> callbackSelectList(ProductCategoryCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productCategoryCode The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ProductCategory selectByPKValue(String productCategoryCode) {
        return doSelectByPKValue(productCategoryCode, ProductCategory.class);
    }

    protected <ENTITY extends ProductCategory> ENTITY doSelectByPKValue(String productCategoryCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(productCategoryCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productCategoryCode The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ProductCategory selectByPKValueWithDeletedCheck(String productCategoryCode) {
        return doSelectByPKValueWithDeletedCheck(productCategoryCode, ProductCategory.class);
    }

    protected <ENTITY extends ProductCategory> ENTITY doSelectByPKValueWithDeletedCheck(String productCategoryCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(productCategoryCode), entityType);
    }

    private ProductCategoryCB buildPKCB(String productCategoryCode) {
        assertObjectNotNull("productCategoryCode", productCategoryCode);
        ProductCategoryCB cb = newMyConditionBean();
        cb.query().setProductCategoryCode_Equal(productCategoryCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;ProductCategory&gt; productCategoryList = productCategoryBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (ProductCategory productCategory : productCategoryList) {
     *     ... = productCategory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ProductCategory> selectList(ProductCategoryCB cb) {
        return doSelectList(cb, ProductCategory.class);
    }

    protected <ENTITY extends ProductCategory> ListResultBean<ENTITY> doSelectList(ProductCategoryCB cb, Class<ENTITY> entityType) {
        assertCBNotNull(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, ProductCategoryCB>() {
            public List<ENTITY> callbackSelectList(ProductCategoryCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;ProductCategory&gt; page = productCategoryBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (ProductCategory productCategory : page) {
     *     ... = productCategory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ProductCategory> selectPage(ProductCategoryCB cb) {
        return doSelectPage(cb, ProductCategory.class);
    }

    protected <ENTITY extends ProductCategory> PagingResultBean<ENTITY> doSelectPage(ProductCategoryCB cb, Class<ENTITY> entityType) {
        assertCBNotNull(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, ProductCategoryCB>() {
            public int callbackSelectCount(ProductCategoryCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(ProductCategoryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * productCategoryBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ProductCategoryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<ProductCategoryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends ProductCategoryCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBNotNull(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param productCategory The entity of productCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadProductList(ProductCategory productCategory, ConditionBeanSetupper<ProductCB> conditionBeanSetupper) {
        xassLRArg(productCategory, conditionBeanSetupper);
        loadProductList(xnewLRLs(productCategory), conditionBeanSetupper);
    }
    /**
     * Load referrer of productList with the set-upper for condition-bean of referrer. <br />
     * PRODUCT as 'productList'.
     * <pre>
     * productCategoryBhv.<span style="color: #FD4747">loadProductList</span>(productCategoryList, new ConditionBeanSetupper&lt;ProductCB&gt;() {
     *     public void setup(ProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (ProductCategory productCategory : productCategoryList) {
     *     ... = productCategory.<span style="color: #FD4747">getProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setProductCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ProductCategoryCode_Asc();
     * </pre>
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadProductList(List<ProductCategory> productCategoryList, ConditionBeanSetupper<ProductCB> conditionBeanSetupper) {
        xassLRArg(productCategoryList, conditionBeanSetupper);
        loadProductList(productCategoryList, new LoadReferrerOption<ProductCB, Product>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param productCategory The entity of productCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadProductList(ProductCategory productCategory, LoadReferrerOption<ProductCB, Product> loadReferrerOption) {
        xassLRArg(productCategory, loadReferrerOption);
        loadProductList(xnewLRLs(productCategory), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadProductList(List<ProductCategory> productCategoryList, LoadReferrerOption<ProductCB, Product> loadReferrerOption) {
        xassLRArg(productCategoryList, loadReferrerOption);
        if (productCategoryList.isEmpty()) { return; }
        final ProductBhv referrerBhv = xgetBSFLR().select(ProductBhv.class);
        helpLoadReferrerInternally(productCategoryList, loadReferrerOption, new InternalLoadReferrerCallback<ProductCategory, String, ProductCB, Product>() {
            public String getPKVal(ProductCategory e)
            { return e.getProductCategoryCode(); }
            public void setRfLs(ProductCategory e, List<Product> ls)
            { e.setProductList(ls); }
            public ProductCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(ProductCB cb, List<String> ls)
            { cb.query().setProductCategoryCode_InScope(ls); }
            public void qyOdFKAsc(ProductCB cb) { cb.query().addOrderBy_ProductCategoryCode_Asc(); }
            public void spFKCol(ProductCB cb) { cb.specify().columnProductCategoryCode(); }
            public List<Product> selRfLs(ProductCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(Product e) { return e.getProductCategoryCode(); }
            public void setlcEt(Product re, ProductCategory le)
            { re.setProductCategory(le); }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param productCategory The entity of productCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadProductCategorySelfList(ProductCategory productCategory, ConditionBeanSetupper<ProductCategoryCB> conditionBeanSetupper) {
        xassLRArg(productCategory, conditionBeanSetupper);
        loadProductCategorySelfList(xnewLRLs(productCategory), conditionBeanSetupper);
    }
    /**
     * Load referrer of productCategorySelfList with the set-upper for condition-bean of referrer. <br />
     * PRODUCT_CATEGORY as 'productCategorySelfList'.
     * <pre>
     * productCategoryBhv.<span style="color: #FD4747">loadProductCategorySelfList</span>(productCategoryList, new ConditionBeanSetupper&lt;ProductCategoryCB&gt;() {
     *     public void setup(ProductCategoryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (ProductCategory productCategory : productCategoryList) {
     *     ... = productCategory.<span style="color: #FD4747">getProductCategorySelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setParentCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ParentCategoryCode_Asc();
     * </pre>
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadProductCategorySelfList(List<ProductCategory> productCategoryList, ConditionBeanSetupper<ProductCategoryCB> conditionBeanSetupper) {
        xassLRArg(productCategoryList, conditionBeanSetupper);
        loadProductCategorySelfList(productCategoryList, new LoadReferrerOption<ProductCategoryCB, ProductCategory>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param productCategory The entity of productCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadProductCategorySelfList(ProductCategory productCategory, LoadReferrerOption<ProductCategoryCB, ProductCategory> loadReferrerOption) {
        xassLRArg(productCategory, loadReferrerOption);
        loadProductCategorySelfList(xnewLRLs(productCategory), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadProductCategorySelfList(List<ProductCategory> productCategoryList, LoadReferrerOption<ProductCategoryCB, ProductCategory> loadReferrerOption) {
        xassLRArg(productCategoryList, loadReferrerOption);
        if (productCategoryList.isEmpty()) { return; }
        final ProductCategoryBhv referrerBhv = xgetBSFLR().select(ProductCategoryBhv.class);
        helpLoadReferrerInternally(productCategoryList, loadReferrerOption, new InternalLoadReferrerCallback<ProductCategory, String, ProductCategoryCB, ProductCategory>() {
            public String getPKVal(ProductCategory e)
            { return e.getProductCategoryCode(); }
            public void setRfLs(ProductCategory e, List<ProductCategory> ls)
            { e.setProductCategorySelfList(ls); }
            public ProductCategoryCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(ProductCategoryCB cb, List<String> ls)
            { cb.query().setParentCategoryCode_InScope(ls); }
            public void qyOdFKAsc(ProductCategoryCB cb) { cb.query().addOrderBy_ParentCategoryCode_Asc(); }
            public void spFKCol(ProductCategoryCB cb) { cb.specify().columnParentCategoryCode(); }
            public List<ProductCategory> selRfLs(ProductCategoryCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(ProductCategory e) { return e.getParentCategoryCode(); }
            public void setlcEt(ProductCategory re, ProductCategory le)
            { re.setProductCategorySelf(le); }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'ProductCategory'.
     * @param productCategoryList The list of productCategory. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<ProductCategory> pulloutProductCategorySelf(List<ProductCategory> productCategoryList) {
        return helpPulloutInternally(productCategoryList, new InternalPulloutCallback<ProductCategory, ProductCategory>() {
            public ProductCategory getFr(ProductCategory e) { return e.getProductCategorySelf(); }
            public boolean hasRf() { return true; }
            public void setRfLs(ProductCategory e, List<ProductCategory> ls)
            { e.setProductCategorySelfList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * ProductCategory productCategory = new ProductCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * productCategory.setFoo...(value);
     * productCategory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//productCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//productCategory.set...;</span>
     * productCategoryBhv.<span style="color: #FD4747">insert</span>(productCategory);
     * ... = productCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param productCategory The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(ProductCategory productCategory) {
        doInsert(productCategory, null);
    }

    protected void doInsert(ProductCategory productCategory, InsertOption<ProductCategoryCB> option) {
        assertObjectNotNull("productCategory", productCategory);
        prepareInsertOption(option);
        delegateInsert(productCategory, option);
    }

    protected void prepareInsertOption(InsertOption<ProductCategoryCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * ProductCategory productCategory = new ProductCategory();
     * productCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * productCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//productCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//productCategory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * productCategory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     productCategoryBhv.<span style="color: #FD4747">update</span>(productCategory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param productCategory The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final ProductCategory productCategory) {
        doUpdate(productCategory, null);
    }

    protected void doUpdate(ProductCategory productCategory, final UpdateOption<ProductCategoryCB> option) {
        assertObjectNotNull("productCategory", productCategory);
        prepareUpdateOption(option);
        helpUpdateInternally(productCategory, new InternalUpdateCallback<ProductCategory>() {
            public int callbackDelegateUpdate(ProductCategory entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<ProductCategoryCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected ProductCategoryCB createCBForVaryingUpdate() {
        ProductCategoryCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected ProductCategoryCB createCBForSpecifiedUpdate() {
        ProductCategoryCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param productCategory The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(ProductCategory productCategory) {
        doInesrtOrUpdate(productCategory, null, null);
    }

    protected void doInesrtOrUpdate(ProductCategory productCategory, final InsertOption<ProductCategoryCB> insertOption, final UpdateOption<ProductCategoryCB> updateOption) {
        helpInsertOrUpdateInternally(productCategory, new InternalInsertOrUpdateCallback<ProductCategory, ProductCategoryCB>() {
            public void callbackInsert(ProductCategory entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(ProductCategory entity) { doUpdate(entity, updateOption); }
            public ProductCategoryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(ProductCategoryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<ProductCategoryCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<ProductCategoryCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * ProductCategory productCategory = new ProductCategory();
     * productCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * productCategory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     productCategoryBhv.<span style="color: #FD4747">delete</span>(productCategory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param productCategory The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(ProductCategory productCategory) {
        doDelete(productCategory, null);
    }

    protected void doDelete(ProductCategory productCategory, final DeleteOption<ProductCategoryCB> option) {
        assertObjectNotNull("productCategory", productCategory);
        prepareDeleteOption(option);
        helpDeleteInternally(productCategory, new InternalDeleteCallback<ProductCategory>() {
            public int callbackDelegateDelete(ProductCategory entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<ProductCategoryCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are insert target. (so default constraints are not available) <br />
     * And if the table has an identity, entities after the process do not have incremented values.
     * (When you use the (normal) insert(), an entity after the process has an incremented value)
     * @param productCategoryList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<ProductCategory> productCategoryList) {
        return doBatchInsert(productCategoryList, null);
    }

    protected int[] doBatchInsert(List<ProductCategory> productCategoryList, InsertOption<ProductCategoryCB> option) {
        assertObjectNotNull("productCategoryList", productCategoryList);
        prepareInsertOption(option);
        return delegateBatchInsert(productCategoryList, option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param productCategoryList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<ProductCategory> productCategoryList) {
        return doBatchUpdate(productCategoryList, null);
    }

    protected int[] doBatchUpdate(List<ProductCategory> productCategoryList, UpdateOption<ProductCategoryCB> option) {
        assertObjectNotNull("productCategoryList", productCategoryList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(productCategoryList, option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param productCategoryList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<ProductCategory> productCategoryList, SpecifyQuery<ProductCategoryCB> updateColumnSpec) {
        return doBatchUpdate(productCategoryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param productCategoryList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<ProductCategory> productCategoryList) {
        return doBatchDelete(productCategoryList, null);
    }

    protected int[] doBatchDelete(List<ProductCategory> productCategoryList, DeleteOption<ProductCategoryCB> option) {
        assertObjectNotNull("productCategoryList", productCategoryList);
        prepareDeleteOption(option);
        return delegateBatchDelete(productCategoryList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * productCategoryBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;ProductCategory, ProductCategoryCB&gt;() {
     *     public ConditionBean setup(productCategory entity, ProductCategoryCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     * 
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     * 
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<ProductCategory, ProductCategoryCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<ProductCategory, ProductCategoryCB> setupper, InsertOption<ProductCategoryCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        ProductCategory entity = new ProductCategory();
        ProductCategoryCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected ProductCategoryCB createCBForQueryInsert() {
        ProductCategoryCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. {NonExclusiveControl}
     * <pre>
     * ProductCategory productCategory = new ProductCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//productCategory.setPK...(value);</span>
     * productCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//productCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//productCategory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//productCategory.setVersionNo(value);</span>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * productCategoryBhv.<span style="color: #FD4747">queryUpdate</span>(productCategory, cb);
     * </pre>
     * @param productCategory The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(ProductCategory productCategory, ProductCategoryCB cb) {
        return doQueryUpdate(productCategory, cb, null);
    }

    protected int doQueryUpdate(ProductCategory productCategory, ProductCategoryCB cb, UpdateOption<ProductCategoryCB> option) {
        assertObjectNotNull("productCategory", productCategory); assertCBNotNull(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(productCategory, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (ProductCategoryCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (ProductCategoryCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * productCategoryBhv.<span style="color: #FD4747">queryDelete</span>(productCategory, cb);
     * </pre>
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(ProductCategoryCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(ProductCategoryCB cb, DeleteOption<ProductCategoryCB> option) {
        assertCBNotNull(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((ProductCategoryCB)cb); }
        else { return varyingQueryDelete((ProductCategoryCB)cb, downcast(option)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * ProductCategory productCategory = new ProductCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * productCategory.setFoo...(value);
     * productCategory.setBar...(value);
     * InsertOption<ProductCategoryCB> option = new InsertOption<ProductCategoryCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * productCategoryBhv.<span style="color: #FD4747">varyingInsert</span>(productCategory, option);
     * ... = productCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param productCategory The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(ProductCategory productCategory, InsertOption<ProductCategoryCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(productCategory, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * ProductCategory productCategory = new ProductCategory();
     * productCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * productCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * productCategory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ProductCategoryCB&gt; option = new UpdateOption&lt;ProductCategoryCB&gt;();
     *     option.self(new SpecifyQuery&lt;ProductCategoryCB&gt;() {
     *         public void specify(ProductCategoryCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     productCategoryBhv.<span style="color: #FD4747">varyingUpdate</span>(productCategory, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param productCategory The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(ProductCategory productCategory, UpdateOption<ProductCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(productCategory, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param productCategory The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(ProductCategory productCategory, InsertOption<ProductCategoryCB> insertOption, UpdateOption<ProductCategoryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(productCategory, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param productCategory The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(ProductCategory productCategory, DeleteOption<ProductCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(productCategory, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param productCategoryList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<ProductCategory> productCategoryList, InsertOption<ProductCategoryCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(productCategoryList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param productCategoryList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<ProductCategory> productCategoryList, UpdateOption<ProductCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(productCategoryList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param productCategoryList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<ProductCategory> productCategoryList, DeleteOption<ProductCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(productCategoryList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper). 
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<ProductCategory, ProductCategoryCB> setupper, InsertOption<ProductCategoryCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb). 
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ProductCategory productCategory = new ProductCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//productCategory.setPK...(value);</span>
     * productCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//productCategory.setVersionNo(value);</span>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ProductCategoryCB&gt; option = new UpdateOption&lt;ProductCategoryCB&gt;();
     * option.self(new SpecifyQuery&lt;ProductCategoryCB&gt;() {
     *     public void specify(ProductCategoryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * productCategoryBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(productCategory, cb, option);
     * </pre>
     * @param productCategory The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(ProductCategory productCategory, ProductCategoryCB cb, UpdateOption<ProductCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(productCategory, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of ProductCategory. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(ProductCategoryCB cb, DeleteOption<ProductCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     * 
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     * 
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     * 
     * {Cursor}
     *   o cursorHandling().selectCursor()
     * 
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull) 
     */
    public OutsideSqlBasicExecutor<ProductCategoryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(ProductCategoryCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(ProductCategoryCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends ProductCategory> void delegateSelectCursor(ProductCategoryCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends ProductCategory> List<ENTITY> delegateSelectList(ProductCategoryCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(ProductCategory e, InsertOption<ProductCategoryCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(ProductCategory e, UpdateOption<ProductCategoryCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(ProductCategory e, UpdateOption<ProductCategoryCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(ProductCategory e, DeleteOption<ProductCategoryCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(ProductCategory e, DeleteOption<ProductCategoryCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<ProductCategory> ls, InsertOption<ProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<ProductCategory> ls, UpdateOption<ProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<ProductCategory> ls, UpdateOption<ProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<ProductCategory> ls, DeleteOption<ProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<ProductCategory> ls, DeleteOption<ProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(ProductCategory e, ProductCategoryCB inCB, ConditionBean resCB, InsertOption<ProductCategoryCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(ProductCategory e, ProductCategoryCB cb, UpdateOption<ProductCategoryCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(ProductCategoryCB cb, DeleteOption<ProductCategoryCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected ProductCategory downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, ProductCategory.class);
    }

    protected ProductCategoryCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, ProductCategoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<ProductCategory> downcast(List<? extends Entity> entityList) {
        return (List<ProductCategory>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<ProductCategoryCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<ProductCategoryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<ProductCategoryCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<ProductCategoryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<ProductCategoryCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<ProductCategoryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<ProductCategory, ProductCategoryCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<ProductCategory, ProductCategoryCB>)option;
    }
}
