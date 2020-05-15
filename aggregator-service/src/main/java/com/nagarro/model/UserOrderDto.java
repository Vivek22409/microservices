package com.nagarro.model;

import java.util.ArrayList;
import java.util.List;

public class UserOrderDto {

	private UserDto usrDto;
	private List<OrderDto> usrOrdrLst = new ArrayList<>();

	public UserDto getUsrDto() {
		return usrDto;
	}

	public void setUsrDto(UserDto usrDto) {
		this.usrDto = usrDto;
	}

	public List<OrderDto> getUsrOrdrLst() {
		return usrOrdrLst;
	}

	public void setUsrOrdrLst(List<OrderDto> usrOrdrLst) {
		this.usrOrdrLst = usrOrdrLst;
	}

}
