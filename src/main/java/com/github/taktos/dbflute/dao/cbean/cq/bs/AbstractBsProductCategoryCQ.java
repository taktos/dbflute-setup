package com.github.taktos.dbflute.dao.cbean.cq.bs;

import java.util.Collection;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.github.taktos.dbflute.dao.allcommon.*;
import com.github.taktos.dbflute.dao.cbean.*;
import com.github.taktos.dbflute.dao.cbean.cq.*;

/**
 * The abstract condition-query of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsProductCategoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsProductCategoryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "PRODUCT_CATEGORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCode The value of productCategoryCode as equal.
     */
    public void setProductCategoryCode_Equal(String productCategoryCode) {
        doSetProductCategoryCode_Equal(fRES(productCategoryCode));
    }

    protected void doSetProductCategoryCode_Equal(String productCategoryCode) {
        regProductCategoryCode(CK_EQ, productCategoryCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryCode The value of productCategoryCode as notEqual.
     */
    public void setProductCategoryCode_NotEqual(String productCategoryCode) {
        doSetProductCategoryCode_NotEqual(fRES(productCategoryCode));
    }

    protected void doSetProductCategoryCode_NotEqual(String productCategoryCode) {
        regProductCategoryCode(CK_NES, productCategoryCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryCode The value of productCategoryCode as greaterThan.
     */
    public void setProductCategoryCode_GreaterThan(String productCategoryCode) {
        regProductCategoryCode(CK_GT, fRES(productCategoryCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryCode The value of productCategoryCode as lessThan.
     */
    public void setProductCategoryCode_LessThan(String productCategoryCode) {
        regProductCategoryCode(CK_LT, fRES(productCategoryCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryCode The value of productCategoryCode as greaterEqual.
     */
    public void setProductCategoryCode_GreaterEqual(String productCategoryCode) {
        regProductCategoryCode(CK_GE, fRES(productCategoryCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryCode The value of productCategoryCode as lessEqual.
     */
    public void setProductCategoryCode_LessEqual(String productCategoryCode) {
        regProductCategoryCode(CK_LE, fRES(productCategoryCode));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productCategoryCodeList The collection of productCategoryCode as inScope.
     */
    public void setProductCategoryCode_InScope(Collection<String> productCategoryCodeList) {
        doSetProductCategoryCode_InScope(productCategoryCodeList);
    }

    public void doSetProductCategoryCode_InScope(Collection<String> productCategoryCodeList) {
        regINS(CK_INS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productCategoryCodeList The collection of productCategoryCode as notInScope.
     */
    public void setProductCategoryCode_NotInScope(Collection<String> productCategoryCodeList) {
        doSetProductCategoryCode_NotInScope(productCategoryCodeList);
    }

    public void doSetProductCategoryCode_NotInScope(Collection<String> productCategoryCodeList) {
        regINS(CK_NINS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param productCategoryCode The value of productCategoryCode as prefixSearch.
     */
    public void setProductCategoryCode_PrefixSearch(String productCategoryCode) {
        setProductCategoryCode_LikeSearch(productCategoryCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param productCategoryCode The value of productCategoryCode as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCategoryCode_LikeSearch(String productCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCategoryCode), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param productCategoryCode The value of productCategoryCode as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCategoryCode_NotLikeSearch(String productCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCategoryCode), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * PRODUCT as 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsProductList</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductList for 'exists'. (NotNull)
     */
    public void existsProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_ExistsReferrer_ProductList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepProductCategoryCode_ExistsReferrer_ProductList(ProductCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * PRODUCT_CATEGORY as 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsProductCategorySelfList</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategorySelfList for 'exists'. (NotNull)
     */
    public void existsProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(ProductCategoryCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * PRODUCT as 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsProductList</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategoryCode_NotExistsReferrer_ProductList for 'not exists'. (NotNull)
     */
    public void notExistsProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_NotExistsReferrer_ProductList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepProductCategoryCode_NotExistsReferrer_ProductList(ProductCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * PRODUCT_CATEGORY as 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsProductCategorySelfList</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategoryCode_NotExistsReferrer_ProductCategorySelfList for 'not exists'. (NotNull)
     */
    public void notExistsProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(ProductCategoryCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * PRODUCT as 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'in-scope'. (NotNull)
     */
    public void inScopeProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_InScopeRelation_ProductList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepProductCategoryCode_InScopeRelation_ProductList(ProductCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * PRODUCT_CATEGORY as 'productCategorySelfAsOne'.
     * @param subQuery The sub-query of ProductCategorySelfList for 'in-scope'. (NotNull)
     */
    public void inScopeProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(ProductCategoryCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * PRODUCT as 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_NotInScopeRelation_ProductList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepProductCategoryCode_NotInScopeRelation_ProductList(ProductCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * PRODUCT_CATEGORY as 'productCategorySelfAsOne'.
     * @param subQuery The sub-query of ProductCategorySelfList for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(ProductCategoryCQ subQuery);

    public void xsderiveProductList(String function, SubQuery<ProductCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", subQueryPropertyName, aliasName, option);
    }
    public abstract String keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(ProductCQ subQuery);

    public void xsderiveProductCategorySelfList(String function, SubQuery<ProductCategoryCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", subQueryPropertyName, aliasName, option);
    }
    public abstract String keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from PRODUCT where ...)} <br />
     * PRODUCT as 'productAsOne'.
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ProductCB> derivedProductList() {
        return xcreateQDRFunctionProductList();
    }
    protected HpQDRFunction<ProductCB> xcreateQDRFunctionProductList() {
        return new HpQDRFunction<ProductCB>(new HpQDRSetupper<ProductCB>() {
            public void setup(String function, SubQuery<ProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveProductList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveProductList(String function, SubQuery<ProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_QueryDerivedReferrer_ProductList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", subQueryPropertyName, operand, value, parameterPropertyName, option);
    }
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductList(ProductCQ subQuery);
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from PRODUCT_CATEGORY where ...)} <br />
     * PRODUCT_CATEGORY as 'productCategorySelfAsOne'.
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ProductCategoryCB> derivedProductCategorySelfList() {
        return xcreateQDRFunctionProductCategorySelfList();
    }
    protected HpQDRFunction<ProductCategoryCB> xcreateQDRFunctionProductCategorySelfList() {
        return new HpQDRFunction<ProductCategoryCB>(new HpQDRSetupper<ProductCategoryCB>() {
            public void setup(String function, SubQuery<ProductCategoryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveProductCategorySelfList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveProductCategorySelfList(String function, SubQuery<ProductCategoryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", subQueryPropertyName, operand, value, parameterPropertyName, option);
    }
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ subQuery);
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(Object parameterValue);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setProductCategoryCode_IsNull() { regProductCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setProductCategoryCode_IsNotNull() { regProductCategoryCode(CK_ISNN, DOBJ); }

    protected void regProductCategoryCode(ConditionKey k, Object v) { regQ(k, v, getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE"); }
    abstract protected ConditionValue getCValueProductCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param productCategoryName The value of productCategoryName as equal.
     */
    public void setProductCategoryName_Equal(String productCategoryName) {
        doSetProductCategoryName_Equal(fRES(productCategoryName));
    }

    protected void doSetProductCategoryName_Equal(String productCategoryName) {
        regProductCategoryName(CK_EQ, productCategoryName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryName The value of productCategoryName as notEqual.
     */
    public void setProductCategoryName_NotEqual(String productCategoryName) {
        doSetProductCategoryName_NotEqual(fRES(productCategoryName));
    }

    protected void doSetProductCategoryName_NotEqual(String productCategoryName) {
        regProductCategoryName(CK_NES, productCategoryName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryName The value of productCategoryName as greaterThan.
     */
    public void setProductCategoryName_GreaterThan(String productCategoryName) {
        regProductCategoryName(CK_GT, fRES(productCategoryName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryName The value of productCategoryName as lessThan.
     */
    public void setProductCategoryName_LessThan(String productCategoryName) {
        regProductCategoryName(CK_LT, fRES(productCategoryName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryName The value of productCategoryName as greaterEqual.
     */
    public void setProductCategoryName_GreaterEqual(String productCategoryName) {
        regProductCategoryName(CK_GE, fRES(productCategoryName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productCategoryName The value of productCategoryName as lessEqual.
     */
    public void setProductCategoryName_LessEqual(String productCategoryName) {
        regProductCategoryName(CK_LE, fRES(productCategoryName));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productCategoryNameList The collection of productCategoryName as inScope.
     */
    public void setProductCategoryName_InScope(Collection<String> productCategoryNameList) {
        doSetProductCategoryName_InScope(productCategoryNameList);
    }

    public void doSetProductCategoryName_InScope(Collection<String> productCategoryNameList) {
        regINS(CK_INS, cTL(productCategoryNameList), getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productCategoryNameList The collection of productCategoryName as notInScope.
     */
    public void setProductCategoryName_NotInScope(Collection<String> productCategoryNameList) {
        doSetProductCategoryName_NotInScope(productCategoryNameList);
    }

    public void doSetProductCategoryName_NotInScope(Collection<String> productCategoryNameList) {
        regINS(CK_NINS, cTL(productCategoryNameList), getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param productCategoryName The value of productCategoryName as prefixSearch.
     */
    public void setProductCategoryName_PrefixSearch(String productCategoryName) {
        setProductCategoryName_LikeSearch(productCategoryName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param productCategoryName The value of productCategoryName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCategoryName_LikeSearch(String productCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCategoryName), getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param productCategoryName The value of productCategoryName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCategoryName_NotLikeSearch(String productCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCategoryName), getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME", likeSearchOption);
    }

    protected void regProductCategoryName(ConditionKey k, Object v) { regQ(k, v, getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME"); }
    abstract protected ConditionValue getCValueProductCategoryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCode The value of parentCategoryCode as equal.
     */
    public void setParentCategoryCode_Equal(String parentCategoryCode) {
        doSetParentCategoryCode_Equal(fRES(parentCategoryCode));
    }

    protected void doSetParentCategoryCode_Equal(String parentCategoryCode) {
        regParentCategoryCode(CK_EQ, parentCategoryCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param parentCategoryCode The value of parentCategoryCode as notEqual.
     */
    public void setParentCategoryCode_NotEqual(String parentCategoryCode) {
        doSetParentCategoryCode_NotEqual(fRES(parentCategoryCode));
    }

    protected void doSetParentCategoryCode_NotEqual(String parentCategoryCode) {
        regParentCategoryCode(CK_NES, parentCategoryCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param parentCategoryCode The value of parentCategoryCode as greaterThan.
     */
    public void setParentCategoryCode_GreaterThan(String parentCategoryCode) {
        regParentCategoryCode(CK_GT, fRES(parentCategoryCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param parentCategoryCode The value of parentCategoryCode as lessThan.
     */
    public void setParentCategoryCode_LessThan(String parentCategoryCode) {
        regParentCategoryCode(CK_LT, fRES(parentCategoryCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param parentCategoryCode The value of parentCategoryCode as greaterEqual.
     */
    public void setParentCategoryCode_GreaterEqual(String parentCategoryCode) {
        regParentCategoryCode(CK_GE, fRES(parentCategoryCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param parentCategoryCode The value of parentCategoryCode as lessEqual.
     */
    public void setParentCategoryCode_LessEqual(String parentCategoryCode) {
        regParentCategoryCode(CK_LE, fRES(parentCategoryCode));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param parentCategoryCodeList The collection of parentCategoryCode as inScope.
     */
    public void setParentCategoryCode_InScope(Collection<String> parentCategoryCodeList) {
        doSetParentCategoryCode_InScope(parentCategoryCodeList);
    }

    public void doSetParentCategoryCode_InScope(Collection<String> parentCategoryCodeList) {
        regINS(CK_INS, cTL(parentCategoryCodeList), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param parentCategoryCodeList The collection of parentCategoryCode as notInScope.
     */
    public void setParentCategoryCode_NotInScope(Collection<String> parentCategoryCodeList) {
        doSetParentCategoryCode_NotInScope(parentCategoryCodeList);
    }

    public void doSetParentCategoryCode_NotInScope(Collection<String> parentCategoryCodeList) {
        regINS(CK_NINS, cTL(parentCategoryCodeList), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param parentCategoryCode The value of parentCategoryCode as prefixSearch.
     */
    public void setParentCategoryCode_PrefixSearch(String parentCategoryCode) {
        setParentCategoryCode_LikeSearch(parentCategoryCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param parentCategoryCode The value of parentCategoryCode as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParentCategoryCode_LikeSearch(String parentCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(parentCategoryCode), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param parentCategoryCode The value of parentCategoryCode as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParentCategoryCode_NotLikeSearch(String parentCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(parentCategoryCode), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * PRODUCT_CATEGORY as 'productCategorySelf'.
     * @param subQuery The sub-query of ProductCategorySelf for 'in-scope'. (NotNull)
     */
    public void inScopeProductCategorySelf(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepParentCategoryCode_InScopeRelation_ProductCategorySelf(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PARENT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepParentCategoryCode_InScopeRelation_ProductCategorySelf(ProductCategoryCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * PRODUCT_CATEGORY as 'productCategorySelf'.
     * @param subQuery The sub-query of ProductCategorySelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductCategorySelf(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepParentCategoryCode_NotInScopeRelation_ProductCategorySelf(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PARENT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", subQueryPropertyName);
    }
    public abstract String keepParentCategoryCode_NotInScopeRelation_ProductCategorySelf(ProductCategoryCQ subQuery);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setParentCategoryCode_IsNull() { regParentCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty(is null or empty). And OnlyOnceRegistered.
     */
    public void setParentCategoryCode_IsNullOrEmpty() { regParentCategoryCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setParentCategoryCode_IsNotNull() { regParentCategoryCode(CK_ISNN, DOBJ); }

    protected void regParentCategoryCode(ConditionKey k, Object v) { regQ(k, v, getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE"); }
    abstract protected ConditionValue getCValueParentCategoryCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ProductCategoryCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<ProductCategoryCB>(new HpSSQSetupper<ProductCategoryCB>() {
            public void setup(String function, SubQuery<ProductCategoryCB> subQuery) {
                xscalarCondition(function, subQuery, operand);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<ProductCategoryCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForScalarCondition(this); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value.
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarCondition(ProductCategoryCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Myself InScope (SubQuery). {mainly to avoid CLOB and Union problem or no master table}
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(ProductCategoryCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return ProductCategoryCB.class.getName(); }
    protected String xabCQ() { return ProductCategoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
