package com.bilgeadam.ogrencidb;

import java.sql.*;

public class CalistirUpdate {


    public static void main(String[] args) throws SQLException {

       Connection conn = null;
       Statement st = null;


        try
        {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/odb", "postgres", "123456");

            st = conn.createStatement();

            int sonuc = st.executeUpdate("update ogrenci set ad='hasan' where no =3");

            if (sonuc>0)
                System.out.println("Basarili insert edildi");
            else
                System.out.println("Basarisiz insert edilemedi!");



        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
        conn.close();
        st.close();
        }


    }
}
