package com.yang.gmall.vo.product;

import com.yang.gmall.pms.entity.ProductAttribute;
import com.yang.gmall.pms.entity.ProductAttributeCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 包含有分类下属性的vo
 */
@Data
public class PmsProductAttributeCategoryItem extends ProductAttributeCategory  implements Serializable {
    private List<ProductAttribute> productAttributeList;


}
