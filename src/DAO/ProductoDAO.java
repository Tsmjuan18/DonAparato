package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.dto.ProductoDTO;

public class ProductoDAO {

    Connection conexion;

    public ProductoDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public String crear(ProductoDTO producto) {
        try {
            String sql = "INSERT INTO producto VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, producto.getId());
            ps.setString(2, producto.getNombreProducto());
            ps.setDouble(3, producto.getValorUnitario());
            ps.setDouble(4, producto.getCantidadProductos());
            ps.executeUpdate();
            return "producto creado";
        } catch (SQLException e) {
            return "producto existente";
        }
    }

    public ProductoDTO leer(String id) {
        try {
            String sql = "SELECT * FROM producto WHERE id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ProductoDTO producto = new ProductoDTO();
                producto.setId(rs.getString("id"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setValorUnitario(rs.getDouble("valorUnitario"));
                producto.setCantidadProductos(rs.getDouble("cantidadProductos"));
                return producto;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizar(ProductoDTO producto) {
        try {
            String sql = "UPDATE producto SET nombreProducto=?, valorUnitario=?, cantidadProductos=? WHERE id=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setDouble(2, producto.getValorUnitario());
            ps.setDouble(3, producto.getCantidadProductos());
            ps.setString(4, producto.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(String id) {
        try {
            String sql = "DELETE FROM producto WHERE id=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}