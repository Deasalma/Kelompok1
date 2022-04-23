package com.crud.generic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kontak {
	private String noHp;
	private String email;
	private String sosmed;
}
