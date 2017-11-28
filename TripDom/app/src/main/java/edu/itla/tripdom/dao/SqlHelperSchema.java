package edu.itla.tripdom.dao;

/**
 * Created by jaesj on 26/11/2017.
 */

public class SqlHelperSchema {
    public static final String USUARIO_TABLE = "(\n" +
            "\t`id`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "\t`nombre`\tTEXT,\n" +
            "\t`tipo_usuario`\tTEXT NOT NULL,\n" +
            "\t`email`\tTEXT,\n" +
            "\t`telefono`\tTEXT\n" +
            ")";
    //crear las restantes entidades....
}

