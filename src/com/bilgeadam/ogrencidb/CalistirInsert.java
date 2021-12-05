package com.bilgeadam.ogrencidb;

import java.sql.*;

public class CalistirInsert {
    public static void main(String[] args) {

        try
        {
            Class.forName("org.postgresql.Driver");


            Connection conn =
                    DriverManager.getConnection("jdbc:postgresql://localhost:5432/odb","postgres","123456");

            Statement st = conn.createStatement();

            int sonuc = st.executeUpdate("insert into ogrenci(no,ad,soyad)values(3,'Bora','Yuret')");

            if (sonuc>0)
                System.out.println("Basariyla insert edildi.");
            else
                System.out.println("Basari ile insert edemedi.");




            st.close();
            conn.close();


        }


        catch (Exception e)
        {
            System.err.println("Hata:" + e.getMessage());
        }


    }
}
