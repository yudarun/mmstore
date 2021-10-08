import com.website.mapper.ProductInfoMapper;
import com.website.pojo.ProductInfo;
import com.website.pojo.vo.ProductInfoVo;
import com.website.utils.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_dao.xml","classpath:applicationContext_service.xml"})


public class mytest {
    @Autowired
    ProductInfoMapper productInfoMapper;
    @Test
    public void test01(){
        ProductInfoVo vo = new ProductInfoVo();
        List<ProductInfo> list = productInfoMapper.selectCondition(vo);
        list.forEach(productInfo -> System.out.println(productInfo));
    }
}
