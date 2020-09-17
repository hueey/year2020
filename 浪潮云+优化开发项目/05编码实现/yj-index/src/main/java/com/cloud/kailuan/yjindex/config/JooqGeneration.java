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
        var configuration = new Configuration();
        configuration
                .withJdbc(new Jdbc()
                        .withDriver("com.mysql.cj.jdbc.Driver")
                        .withUrl("jdbc:mysql://116.62.16.146:3306/lc")
                        .withUser("ts")
                        .withPassword("Ts-123456"))
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.mysql.MySQLDatabase")
                                .withInputSchema("lc")
                                .withRecordTimestampFields("update_date")
                                .withProperties(new Property().withKey("dialect").withValue("MYSQL")))
                        .withGenerate(new Generate()
                                .withJavaTimeTypes(true)
                        )
                        .withTarget(new Target()
                                .withDirectory(new File("").getCanonicalPath()+"/src/main/java/")
                                .withPackageName("com.cloud.kailuan.yjindex.db")
                                .withEncoding("UTF-8")
                                .withClean(true)
                        ));
        GenerationTool.generate(configuration);

    }
}


