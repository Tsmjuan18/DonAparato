package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.dto.CompraDTO;

public class CompraDAO {

    Connection conexion;
    
    public CompraDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void registrarCompra(CompraDTO compra) {
        try {
            String sql = "INSERT INTO compra (documento_cliente, id_producto, total, descuento) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, compra.getMiCliente().getDocumento());
            ps.setString(2, compra.getMiProducto().getId());
            ps.setDouble(3, compra.getMiProducto().getCompraTotal());
            ps.setDouble(4, compra.getMiProducto().getDescuento());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}