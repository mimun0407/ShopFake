package com.example.shopee.repository;

import com.example.shopee.model.Cart;
import com.example.shopee.model.CartDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private final RowMapper<Cart> cartRowMapper=((rs, rowNum) ->
            new Cart(
                    rs.getLong("id"),
                    rs.getLong("user-id"),
                    rs.getString("status"),
                    rs.getTimestamp("created_at").toLocalDateTime()
            )
    );
    public List<CartDetail> getAllCartDetailByCartId(Long cartId) {
        String sql = "SELECT id, cart_id, product_id, quantity,created_at  FROM cart_details WHERE cart_id = ?";

        return jdbcTemplate.query(sql, new Object[]{cartId}, (rs, rowNum) -> new CartDetail(
                rs.getLong("id"),
                rs.getLong("cart_id"),
                rs.getLong("product_id"),
                rs.getInt("quantity"),
                rs.getTimestamp("created_at").toLocalDateTime()
        ));
    }
}
