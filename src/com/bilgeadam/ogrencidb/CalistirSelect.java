package com.bilgeadam.ogrencidb;

import java.sql.*;

public class CalistirSelect {

    public static void main(String[] args) {

        try
        {
           // Class.forname ile ilgili jdbc driverlerin ilgili classini gosteriyoruz.
            Class.forName("org.postgresql.Driver");

            //connetion objesini olusturuyoruz.
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/odb", "postgres","123456");


            // Statament ile sql sorgusu yazabiliriz.
            Statement st = conn.createStatement();

            // select sonucu ResultSet`e atilir

            ResultSet rs = st.executeQuery("select no, ad, soyad, kredi from ogrenci order by kredi desc");

            // rs uzerinden while ile doneriz.
            while (rs.next())
            {
                System.out.println("No:"+ rs.getInt("no"));
                System.out.println("Ad:"+ rs.getString(2));
                System.out.println("Soyad:"+ rs.getString(3));
                System.out.println("Kredi:"+ rs.getDouble("kredi"));
                System.out.println();
            }
            rs.close();
            st.close();

            conn.close();

        }
        catch (Exception e)
        {
            System.err.println("hata:"+ e.getMessage());
        }





    }
}
