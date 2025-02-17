package com.example.shopee.repository;

import com.example.shopee.model.CartDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartDetailRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
        private final RowMapper<CartDetail> cDetailRowMapper = (rs, rowNum) ->
                new CartDetail(
                        rs.getLong("id"),
                        rs.getLong("cart_id"),
                        rs.getLong("product_id"),
                        rs.getInt("quantity"),
                        rs.getTimestamp("created_at").toLocalDateTime()
                );
        public List<CartDetail> getCartDetail() {
            String sql = "SELECT * FROM cart_details";
            return jdbcTemplate.query(sql,cDetailRowMapper);
        }

    }
