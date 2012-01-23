package com.github.taktos.dbflute.dao.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.github.taktos.dbflute.dao.allcommon.DBMetaInstanceHandler;
import com.github.taktos.dbflute.dao.exentity.*;

/**
 * The entity of PRODUCT_CATEGORY as TABLE. <br />
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
public abstract class BsProductCategory implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} */
    protected String _productCategoryCode;

    /** PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} */
    protected String _productCategoryName;

    /** PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} */
    protected String _parentCategoryCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "PRODUCT_CATEGORY";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "productCategory";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getProductCategoryCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** PRODUCT_CATEGORY as 'productCategorySelf'. */
    protected ProductCategory _productCategorySelf;

    /**
     * PRODUCT_CATEGORY as 'productCategorySelf'.
     * @return The entity of foreign property 'productCategorySelf'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public ProductCategory getProductCategorySelf() {
        return _productCategorySelf;
    }

    /**
     * PRODUCT_CATEGORY as 'productCategorySelf'.
     * @param productCategorySelf The entity of foreign property 'productCategorySelf'. (NullAllowed)
     */
    public void setProductCategorySelf(ProductCategory productCategorySelf) {
        _productCategorySelf = productCategorySelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PRODUCT as 'productList'. */
    protected List<Product> _productList;

    /**
     * PRODUCT as 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<Product> getProductList() {
        if (_productList == null) { _productList = newReferrerList(); }
        return _productList;
    }

    /**
     * PRODUCT as 'productList'.
     * @param productList The entity list of referrer property 'productList'. (NullAllowed)
     */
    public void setProductList(List<Product> productList) {
        _productList = productList;
    }

    /** PRODUCT_CATEGORY as 'productCategorySelfList'. */
    protected List<ProductCategory> _productCategorySelfList;

    /**
     * PRODUCT_CATEGORY as 'productCategorySelfList'.
     * @return The entity list of referrer property 'productCategorySelfList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<ProductCategory> getProductCategorySelfList() {
        if (_productCategorySelfList == null) { _productCategorySelfList = newReferrerList(); }
        return _productCategorySelfList;
    }

    /**
     * PRODUCT_CATEGORY as 'productCategorySelfList'.
     * @param productCategorySelfList The entity list of referrer property 'productCategorySelfList'. (NullAllowed)
     */
    public void setProductCategorySelfList(List<ProductCategory> productCategorySelfList) {
        _productCategorySelfList = productCategorySelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsProductCategory)) { return false; }
        BsProductCategory otherEntity = (BsProductCategory)other;
        if (!xSV(getProductCategoryCode(), otherEntity.getProductCategoryCode())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getProductCategoryCode());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * Convert to display string of entity's data with relation data.
     * @return The display string of basic informations with one-nested relation values. (NotNull)
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_productCategorySelf != null)
        { sb.append(l).append(xbRDS(_productCategorySelf, "productCategorySelf")); }
        if (_productList != null) { for (Entity e : _productList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "productList")); } } }
        if (_productCategorySelfList != null) { for (Entity e : _productCategorySelfList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "productCategorySelfList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
    }

    /**
     * Build display string with custom options.
     * @param name The name for display. (NullAllowed: If it's null, it does not have a name)
     * @param column Does it contains column values or not?
     * @param relation Does it contains relation existences or not?
     * @return The display string for this entity. (NotNull)
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = ", ";
        sb.append(delimiter).append(getProductCategoryCode());
        sb.append(delimiter).append(getProductCategoryName());
        sb.append(delimiter).append(getParentCategoryCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_productCategorySelf != null) { sb.append(c).append("productCategorySelf"); }
        if (_productList != null && !_productList.isEmpty())
        { sb.append(c).append("productList"); }
        if (_productCategorySelfList != null && !_productCategorySelfList.isEmpty())
        { sb.append(c).append("productCategorySelfList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public ProductCategory clone() {
        try {
            return (ProductCategory)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (NullAllowed)
     */
    public String getProductCategoryCode() {
        return _productCategoryCode;
    }

    /**
     * [set] PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (NullAllowed)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        __modifiedProperties.addPropertyName("productCategoryCode");
        this._productCategoryCode = productCategoryCode;
    }

    /**
     * [get] PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_NAME'. (NullAllowed)
     */
    public String getProductCategoryName() {
        return _productCategoryName;
    }

    /**
     * [set] PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br />
     * @param productCategoryName The value of the column 'PRODUCT_CATEGORY_NAME'. (NullAllowed)
     */
    public void setProductCategoryName(String productCategoryName) {
        __modifiedProperties.addPropertyName("productCategoryName");
        this._productCategoryName = productCategoryName;
    }

    /**
     * [get] PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @return The value of the column 'PARENT_CATEGORY_CODE'. (NullAllowed)
     */
    public String getParentCategoryCode() {
        return _parentCategoryCode;
    }

    /**
     * [set] PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @param parentCategoryCode The value of the column 'PARENT_CATEGORY_CODE'. (NullAllowed)
     */
    public void setParentCategoryCode(String parentCategoryCode) {
        __modifiedProperties.addPropertyName("parentCategoryCode");
        this._parentCategoryCode = parentCategoryCode;
    }
}
