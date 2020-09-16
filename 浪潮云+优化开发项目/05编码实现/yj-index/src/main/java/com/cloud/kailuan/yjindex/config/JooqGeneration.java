package com.cloud.kailuan.yjindex.config;


import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;

import java.io.File;

/**
 * @author yzp
 * @date 2020/8/2 17:52
 */
public class JooqGeneration {
    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        configuration
                .withJdbc(new Jdbc()
                        .withDriver("com.mysql.cj.jdbc.Driver")
                        .withUrl("jdbc:mysql://116.62.16.146:3306/test")
                        .withUser("ts")
                        .withPassword("Ts-123456"))
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.mysql.MySQLDatabase")
                                .withInputSchema("test")
                                .withRecordVersionFields("version")
                                .withRecordTimestampFields("update_time")
                                .withProperties(new Property().withKey("dialect").withValue("MYSQL")))
                        .withGenerate(new Generate()
                                .withJavaTimeTypes(true)
                        )
                        .withTarget(new Target()
                                .withDirectory(new File("").getCanonicalPath()+"/dragon-demo/dragon-demo-jooq/src/main/java/")
                                .withPackageName("com.dragon.cloud.dragon.demo.jooq.db")
                                .withEncoding("UTF-8")
                                .withClean(true)
                        ));
        GenerationTool.generate(configuration);

    }
}


