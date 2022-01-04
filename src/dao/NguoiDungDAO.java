package dao;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import model.NguoiDung;

public class NguoiDungDAO extends DAO{

	public NguoiDungDAO() {
		super();
	}
	
	public boolean login(NguoiDung nd){
		boolean kq = false;
		
		String sql = "{call kiemtraDN(?,?)}";;
		try{
			CallableStatement cs = con.prepareCall(sql);
			cs.setString(1, nd.getEmail());
			cs.setString(2, nd.getMatkhau());
			ResultSet rs = cs.executeQuery();
			if(rs.next()){
				nd.setId(rs.getInt("id"));
				kq = true;
			}
		} catch(Exception e){
			e.printStackTrace();
			kq = false;
		}
		return kq;
	}
}
