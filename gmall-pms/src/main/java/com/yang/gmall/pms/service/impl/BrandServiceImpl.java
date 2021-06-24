package com.yang.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yang.gmall.pms.entity.Brand;
import com.yang.gmall.pms.mapper.BrandMapper;
import com.yang.gmall.pms.service.BrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-05-08
 */
@Slf4j
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
