package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.ClienteDTO;

public class ClienteDAO {

    Connection conexion;

    public ClienteDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public String crear(ClienteDTO cliente) {
        try {
            String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getDocumento());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getEdad());
            ps.setString(5, cliente.getTelefono());
            ps.setString(6, cliente.getTipo());
            ps.executeUpdate();
            return "cliente creado";
        } catch (SQLException e) {
            return "Cliente ya existente";
        }
    }

    public ClienteDTO leer(String documento) {
        try {
            String sql = "SELECT * FROM cliente WHERE documento = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, documento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ClienteDTO cliente = new ClienteDTO();
                cliente.setDocumento(rs.getString("documento"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setEdad(rs.getInt("edad"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setTipo(rs.getString("tipo"));
                return cliente;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizar(ClienteDTO cliente) {
        try {
            String sql = "UPDATE cliente SET nombre=?, apellido=?, edad=?, telefono=?, tipo=? WHERE documento=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getEdad());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getTipo());
            ps.setString(6, cliente.getDocumento());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(String documento) {
        try {
            String sql = "DELETE FROM cliente WHERE documento=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, documento);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public ArrayList<ClienteDTO> listarTodos() {
		 ArrayList<ClienteDTO> lista = new ArrayList<>();
		    try {
		        String sql = "SELECT * FROM cliente";
		        PreparedStatement ps = conexion.prepareStatement(sql);
		        ResultSet rs = ps.executeQuery();
		        while (rs.next()) {
		            ClienteDTO c = new ClienteDTO();
		            c.setDocumento(rs.getString("documento"));
		            c.setNombre(rs.getString("nombre"));
		            c.setApellido(rs.getString("apellido"));
		            c.setEdad(rs.getInt("edad"));
		            c.setTelefono(rs.getString("telefono"));
		            c.setTipo(rs.getString("tipo"));
		            lista.add(c);
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return lista;
	}
}