package edu.itla.tripdom.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import edu.itla.tripdom.entity.TipoUsuario;
import edu.itla.tripdom.entity.Usuario;

/**
 * Created by jaesj on 26/11/2017.
 */

public class UsuarioDbo {
    private DbConnection connection;

    public UsuarioDbo(Context Context) {
        connection = new DbConnection(Context);

    }

    public void crear(Usuario usuario) {
        SQLiteDatabase db = connection.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("nombre", usuario.getNombre());
        cv.put("email", usuario.getEmail());
        cv.put("telefono", usuario.getTelefono());
        cv.put("tipo_usuario", String.valueOf(usuario.getTipoUsuario()));

        db = connection.getWritableDatabase();
        Long id = db.insert("Usuario", null, cv);

        usuario.setId(id.intValue());

        db.close();

    }

    public List<Usuario> buscar() {
        // lista donde se van a ir agregando los usuarios
        List<Usuario> usuarios = new ArrayList<>();
        //columnas a buscar en las bases de datos
        String columnas[] = new String[]{"id", "nombre", "email", "telefono", "tipo_usuario"};
        //abrir conexion a la base de datos(solo lectura)
        SQLiteDatabase db = connection.getReadableDatabase();
        //ejecutamos la consulta
        Cursor cursor = db.query("Usuario", columnas, null, null, null, null, null);
        cursor.moveToFirst();

        while (cursor.isAfterLast()) {
            Usuario u = new Usuario();

            u.setId(cursor.getInt(cursor.getColumnIndex("id")));
            u.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));
            u.setEmail(cursor.getString(cursor.getColumnIndex("email")));
            u.setTelefono(cursor.getString(cursor.getColumnIndex("telefono")));
            u.setTipoUsuario(TipoUsuario.valueOf(cursor.getString(cursor.getColumnIndex("tipo_usuario"))));

            usuarios.add(u);
            cursor.moveToNext();
        }

        cursor.close();
        db.close();
        return usuarios;
    }
}
