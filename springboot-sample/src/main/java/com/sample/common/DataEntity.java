package com.sample.common;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass()
public abstract class DataEntity 
{
	@Column(name="`created_at`")
	protected LocalDateTime createdDate;
	@Column(name="`updated_at`")
	protected LocalDateTime updatedDate;
}
