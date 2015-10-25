package cn.tboc.ssm.mapper;

import cn.tboc.ssm.po.Items;
import cn.tboc.ssm.po.ItemsCustom;
import cn.tboc.ssm.po.ItemsExample;
import cn.tboc.ssm.po.ItemsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}