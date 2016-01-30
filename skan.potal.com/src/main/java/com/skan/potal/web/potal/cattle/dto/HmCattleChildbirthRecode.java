package com.skan.potal.web.potal.cattle.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 분만기록 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Table
public class HmCattleChildbirthRecode implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 분만기록 composite - id. */
	@EmbeddedId private HmCattleChildbirthRecodeId hmCattleChildbirthRecodeId;

	/** 한우(암소/수소) 개체관리기록부. */
	@ManyToOne
	@JoinColumn(name="entityDiscernNo" ,insertable=false, updatable=false)
	private HmCattleRegister hmCattleRegister;

	/** 정액번호. */
	private Long spermNo;

	/** 정액수정일자. */
	private Date spermFertilizationDate;

	/** 분만예정일. */
	private Date expectedDateConfinement;

	/** 특이사항. */
	private String nothingSpecial;

	/**
	 * 생성자.
	 */
	public HmCattleChildbirthRecode() {
	}

	/**
	 * 분만기록 composite - id을 설정합니다..
	 * 
	 * @param hmCattleChildbirthRecodeId
	 *            분만기록 composite - id
	 */
	public void setHmCattleChildbirthRecodeId(HmCattleChildbirthRecodeId hmCattleChildbirthRecodeId) {
		this.hmCattleChildbirthRecodeId = hmCattleChildbirthRecodeId;
	}

	/**
	 * 분만기록 composite - id을 가져옵니다..
	 * 
	 * @return 분만기록 composite - id
	 */
	public HmCattleChildbirthRecodeId getHmCattleChildbirthRecodeId() {
		return this.hmCattleChildbirthRecodeId;
	}

	/**
	 * 한우(암소/수소) 개체관리기록부을 설정합니다..
	 * 
	 * @param hmCattleRegister
	 *            한우(암소/수소) 개체관리기록부
	 */
	public void setHmCattleRegister(HmCattleRegister hmCattleRegister) {
		this.hmCattleRegister = hmCattleRegister;
	}

	/**
	 * 한우(암소/수소) 개체관리기록부을 가져옵니다..
	 * 
	 * @return 한우(암소/수소) 개체관리기록부
	 */
	public HmCattleRegister getHmCattleRegister() {
		return this.hmCattleRegister;
	}

	/**
	 * 정액번호을 설정합니다..
	 * 
	 * @param spermNo
	 *            정액번호
	 */
	public void setSpermNo(Long spermNo) {
		this.spermNo = spermNo;
	}

	/**
	 * 정액번호을 가져옵니다..
	 * 
	 * @return 정액번호
	 */
	public Long getSpermNo() {
		return this.spermNo;
	}

	/**
	 * 정액수정일자을 설정합니다..
	 * 
	 * @param spermFertilizationDate
	 *            정액수정일자
	 */
	public void setSpermFertilizationDate(Date spermFertilizationDate) {
		this.spermFertilizationDate = spermFertilizationDate;
	}

	/**
	 * 정액수정일자을 가져옵니다..
	 * 
	 * @return 정액수정일자
	 */
	public Date getSpermFertilizationDate() {
		return this.spermFertilizationDate;
	}

	/**
	 * 분만예정일을 설정합니다..
	 * 
	 * @param expectedDateConfinement
	 *            분만예정일
	 */
	public void setExpectedDateConfinement(Date expectedDateConfinement) {
		this.expectedDateConfinement = expectedDateConfinement;
	}

	/**
	 * 분만예정일을 가져옵니다..
	 * 
	 * @return 분만예정일
	 */
	public Date getExpectedDateConfinement() {
		return this.expectedDateConfinement;
	}

	/**
	 * 특이사항을 설정합니다..
	 * 
	 * @param nothingSpecial
	 *            특이사항
	 */
	public void setNothingSpecial(String nothingSpecial) {
		this.nothingSpecial = nothingSpecial;
	}

	/**
	 * 특이사항을 가져옵니다..
	 * 
	 * @return 특이사항
	 */
	public String getNothingSpecial() {
		return this.nothingSpecial;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hmCattleChildbirthRecodeId == null) ? 0 : hmCattleChildbirthRecodeId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		HmCattleChildbirthRecode other = (HmCattleChildbirthRecode) obj;
		if (hmCattleChildbirthRecodeId == null) {
			if (other.hmCattleChildbirthRecodeId != null) {
				return false;
			}
		} else if (!hmCattleChildbirthRecodeId.equals(other.hmCattleChildbirthRecodeId)) {
			return false;
		}
		return true;
	}

}