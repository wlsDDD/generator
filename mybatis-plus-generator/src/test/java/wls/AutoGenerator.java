package wls;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class AutoGenerator {

    @Test
    void test01() {
        FastAutoGenerator.create("url", "username", "password")
                         .globalConfig(builder -> {
                             builder.author("baomidou")
                                    .enableSwagger()
                                    .outputDir("D://");
                         })
                         .packageConfig(builder -> {
                             builder.parent("com.baomidou.mybatisplus.samples.generator") // 设置父包名
                                    .moduleName("system") // 设置父包模块名
                                    .pathInfo(Collections.singletonMap(OutputFile.xml, "D://")); // 设置mapperXml生成路径
                         })
                         .strategyConfig(builder -> {
                             builder.addInclude("t_simple") // 设置需要生成的表名
                                    .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                         })
                         .execute();
    }

}
