package com.gouwo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 接口分类表
 * </p>
 *
 * @author asky
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("peo_api_category")
@ApiModel(value="ApiCategoryModel对象", description="接口分类表")
public class ApiCategoryModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "api类别ID")
    @TableId(value = "api_category_id", type = IdType.AUTO)
    private Integer apiCategoryId;

    @ApiModelProperty(value = "分类名称")
    private String name;

    @ApiModelProperty(value = "排序")
    private String sort;

    @ApiModelProperty(value = "创建时间")
    private LocalDate createTime;


}
