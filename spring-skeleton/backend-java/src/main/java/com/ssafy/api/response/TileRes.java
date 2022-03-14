package com.ssafy.api.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import com.ssafy.db.entity.Planet;
import com.ssafy.db.entity.Tile;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("TileResponse")
public class TileRes {
	
	Long tid;
	Long planet;
    String image;
    int price;
   	LocalDateTime tradeDate;
    String tokenId;
    int area;
    String buyerId;
    String buyerAdr;
}