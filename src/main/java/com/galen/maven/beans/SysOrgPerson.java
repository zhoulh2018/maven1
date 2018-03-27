package com.galen.maven.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SYS_ORG_PERSON database table.
 * 
 */
@Entity(name="SYS_ORG_PERSON")
public class SysOrgPerson implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="FD_ID")
	private String fdId;

	@Column(name="FD_ACNAME")
	private String fdAcname;

	@Column(name="FD_ATTENDANCE_CARD_NUMBER")
	private String fdAttendanceCardNumber;

	@Column(name="FD_BIRTHDAY")
	private Timestamp fdBirthday;

	@Column(name="FD_BUHR_NAME")
	private String fdBuhrName;

	@Column(name="FD_BUHR_SESAID")
	private String fdBuhrSesaid;

	@Column(name="FD_BUHR_STAFFNO")
	private String fdBuhrStaffno;

	@Column(name="FD_BUSINESS_TITLE")
	private String fdBusinessTitle;

	@Column(name="FD_BUSINESS_UNIT")
	private String fdBusinessUnit;

	@Column(name="FD_BUSINESS_UNIT_ID")
	private String fdBusinessUnitId;

	@Column(name="FD_CARD_NO")
	private String fdCardNo;

	@Column(name="FD_CON_HISTORY_OPERATION_TAG")
	private String fdConHistoryOperationTag;

	@Column(name="FD_CONTRACT_END_DATE")
	private Timestamp fdContractEndDate;

	@Column(name="FD_CONTRACT_NO")
	private String fdContractNo;

	@Column(name="FD_CONTRACT_START_DATE")
	private Timestamp fdContractStartDate;

	@Column(name="FD_CONTRACT_TYPE")
	private String fdContractType;

	@Column(name="FD_COST_CENTER")
	private String fdCostCenter;

	@Column(name="FD_COST_CENTER_ID")
	private String fdCostCenterId;

	@Column(name="FD_DEADLINE_DATE")
	private Timestamp fdDeadlineDate;

	@Column(name="FD_DEFAULT_LANG")
	private String fdDefaultLang;

	@Column(name="FD_DEPARTMENT_DETAIL")
	private String fdDepartmentDetail;

	@Column(name="FD_DEPARTMENT_ID")
	private String fdDepartmentId;

	@Column(name="FD_EMAIL")
	private String fdEmail;

	@Column(name="FD_EMPLOYEE_ATTRIBUTE")
	private String fdEmployeeAttribute;

	@Column(name="FD_EMPLOYEE_RCD")
	private String fdEmployeeRcd;

	@Column(name="FD_EMPLOYEE_STATUS")
	private String fdEmployeeStatus;

	@Column(name="FD_ENGLISH_NAME")
	private String fdEnglishName;

	@Column(name="FD_FIRST_NAME")
	private String fdFirstName;

	@Column(name="FD_FORCE_LEAVE_DAYS")
	private Double fdForceLeaveDays;

	@Column(name="FD_INIT_PASSWORD")
	private String fdInitPassword;

	@Column(name="FD_INTERNATIONAL_STATUS")
	private String fdInternationalStatus;

	@Column(name="FD_IS_POSTPONE")
	private String fdIsPostpone;

	@Column(name="FD_JOB_CODE")
	private String fdJobCode;

	@Column(name="FD_JOIN_IN_DATE")
	private Timestamp fdJoinInDate;

	@Column(name="FD_LAST_CHANGE_PWD")
	private Timestamp fdLastChangePwd;

	@Column(name="FD_LAST_LONG_TERM_DATE")
	private Timestamp fdLastLongTermDate;

	@Column(name="FD_LAST_NAME")
	private String fdLastName;

	@Column(name="FD_LAST_WORKING_DAY")
	private Timestamp fdLastWorkingDay;

	@Column(name="FD_LATEST_ACTION")
	private String fdLatestAction;

	@Column(name="FD_LATEST_ACTION_DATE")
	private Timestamp fdLatestActionDate;

	@Column(name="FD_LEGAL_ENTITY")
	private String fdLegalEntity;

	@Column(name="FD_LEGAL_ENTITY_ID")
	private String fdLegalEntityId;

	@Column(name="FD_LEGAL_ENTITY_NAME")
	private String fdLegalEntityName;

	@Column(name="FD_LEGAL_SENIORITY_START_DATE")
	private Timestamp fdLegalSeniorityStartDate;

	@Column(name="FD_LINE_MANAGER_STAFFNO")
	private String fdLineManagerStaffno;

	@Column(name="FD_LM_SESAID")
	private String fdLmSesaid;

	@Column(name="FD_LMR_NOTES_ID")
	private String fdLmrNotesId;

	@Column(name="FD_LOCK_TIME")
	private Timestamp fdLockTime;

	@Column(name="FD_LOGIN_NAME")
	private String fdLoginName;

	@Column(name="FD_MOBILE_NO")
	private String fdMobileNo;

	@Column(name="FD_NOTES_ID")
	private String fdNotesId;

	@Column(name="FD_PASSWORD")
	private String fdPassword;

	@Column(name="FD_PAYROLL_CODE")
	private String fdPayrollCode;

	@Column(name="FD_PEOPLESOFT_ID")
	private String fdPeoplesoftId;

	@Column(name="FD_PROBATION_END_DATE")
	private Timestamp fdProbationEndDate;

	@Column(name="FD_PS_PAYROLL_CODE")
	private String fdPsPayrollCode;

	@Column(name="FD_RTX_NO")
	private String fdRtxNo;

	@Column(name="FD_SAP_CODE")
	private String fdSapCode;

	@Column(name="FD_SEX")
	private String fdSex;

	@Column(name="FD_SHORT_NO")
	private String fdShortNo;

	@Column(name="FD_STAFFING_LEVEL_ID")
	private String fdStaffingLevelId;

	@Column(name="FD_TYPE")
	private String fdType;

	@Column(name="FD_WECHAT_NO")
	private String fdWechatNo;

	@Column(name="FD_WORK_PHONE")
	private String fdWorkPhone;

	@Column(name="FD_WORKING_COUNTRY")
	private String fdWorkingCountry;

	@Column(name="FD_WORKING_HOURS_TYPE")
	private String fdWorkingHoursType;

	@Column(name="FD_WORKING_LOCATION")
	private String fdWorkingLocation;

	@Column(name="FD_WORKING_LOCATION_ID")
	private String fdWorkingLocationId;

	public SysOrgPerson() {
	}

	public String getFdId() {
		return this.fdId;
	}

	public void setFdId(String fdId) {
		this.fdId = fdId;
	}

	public String getFdAcname() {
		return this.fdAcname;
	}

	public void setFdAcname(String fdAcname) {
		this.fdAcname = fdAcname;
	}

	public String getFdAttendanceCardNumber() {
		return this.fdAttendanceCardNumber;
	}

	public void setFdAttendanceCardNumber(String fdAttendanceCardNumber) {
		this.fdAttendanceCardNumber = fdAttendanceCardNumber;
	}

	public Timestamp getFdBirthday() {
		return this.fdBirthday;
	}

	public void setFdBirthday(Timestamp fdBirthday) {
		this.fdBirthday = fdBirthday;
	}

	public String getFdBuhrName() {
		return this.fdBuhrName;
	}

	public void setFdBuhrName(String fdBuhrName) {
		this.fdBuhrName = fdBuhrName;
	}

	public String getFdBuhrSesaid() {
		return this.fdBuhrSesaid;
	}

	public void setFdBuhrSesaid(String fdBuhrSesaid) {
		this.fdBuhrSesaid = fdBuhrSesaid;
	}

	public String getFdBuhrStaffno() {
		return this.fdBuhrStaffno;
	}

	public void setFdBuhrStaffno(String fdBuhrStaffno) {
		this.fdBuhrStaffno = fdBuhrStaffno;
	}

	public String getFdBusinessTitle() {
		return this.fdBusinessTitle;
	}

	public void setFdBusinessTitle(String fdBusinessTitle) {
		this.fdBusinessTitle = fdBusinessTitle;
	}

	public String getFdBusinessUnit() {
		return this.fdBusinessUnit;
	}

	public void setFdBusinessUnit(String fdBusinessUnit) {
		this.fdBusinessUnit = fdBusinessUnit;
	}

	public String getFdBusinessUnitId() {
		return this.fdBusinessUnitId;
	}

	public void setFdBusinessUnitId(String fdBusinessUnitId) {
		this.fdBusinessUnitId = fdBusinessUnitId;
	}

	public String getFdCardNo() {
		return this.fdCardNo;
	}

	public void setFdCardNo(String fdCardNo) {
		this.fdCardNo = fdCardNo;
	}

	public String getFdConHistoryOperationTag() {
		return this.fdConHistoryOperationTag;
	}

	public void setFdConHistoryOperationTag(String fdConHistoryOperationTag) {
		this.fdConHistoryOperationTag = fdConHistoryOperationTag;
	}

	public Timestamp getFdContractEndDate() {
		return this.fdContractEndDate;
	}

	public void setFdContractEndDate(Timestamp fdContractEndDate) {
		this.fdContractEndDate = fdContractEndDate;
	}

	public String getFdContractNo() {
		return this.fdContractNo;
	}

	public void setFdContractNo(String fdContractNo) {
		this.fdContractNo = fdContractNo;
	}

	public Timestamp getFdContractStartDate() {
		return this.fdContractStartDate;
	}

	public void setFdContractStartDate(Timestamp fdContractStartDate) {
		this.fdContractStartDate = fdContractStartDate;
	}

	public String getFdContractType() {
		return this.fdContractType;
	}

	public void setFdContractType(String fdContractType) {
		this.fdContractType = fdContractType;
	}

	public String getFdCostCenter() {
		return this.fdCostCenter;
	}

	public void setFdCostCenter(String fdCostCenter) {
		this.fdCostCenter = fdCostCenter;
	}

	public String getFdCostCenterId() {
		return this.fdCostCenterId;
	}

	public void setFdCostCenterId(String fdCostCenterId) {
		this.fdCostCenterId = fdCostCenterId;
	}

	public Timestamp getFdDeadlineDate() {
		return this.fdDeadlineDate;
	}

	public void setFdDeadlineDate(Timestamp fdDeadlineDate) {
		this.fdDeadlineDate = fdDeadlineDate;
	}

	public String getFdDefaultLang() {
		return this.fdDefaultLang;
	}

	public void setFdDefaultLang(String fdDefaultLang) {
		this.fdDefaultLang = fdDefaultLang;
	}

	public String getFdDepartmentDetail() {
		return this.fdDepartmentDetail;
	}

	public void setFdDepartmentDetail(String fdDepartmentDetail) {
		this.fdDepartmentDetail = fdDepartmentDetail;
	}

	public String getFdDepartmentId() {
		return this.fdDepartmentId;
	}

	public void setFdDepartmentId(String fdDepartmentId) {
		this.fdDepartmentId = fdDepartmentId;
	}

	public String getFdEmail() {
		return this.fdEmail;
	}

	public void setFdEmail(String fdEmail) {
		this.fdEmail = fdEmail;
	}

	public String getFdEmployeeAttribute() {
		return this.fdEmployeeAttribute;
	}

	public void setFdEmployeeAttribute(String fdEmployeeAttribute) {
		this.fdEmployeeAttribute = fdEmployeeAttribute;
	}

	public String getFdEmployeeRcd() {
		return this.fdEmployeeRcd;
	}

	public void setFdEmployeeRcd(String fdEmployeeRcd) {
		this.fdEmployeeRcd = fdEmployeeRcd;
	}

	public String getFdEmployeeStatus() {
		return this.fdEmployeeStatus;
	}

	public void setFdEmployeeStatus(String fdEmployeeStatus) {
		this.fdEmployeeStatus = fdEmployeeStatus;
	}

	public String getFdEnglishName() {
		return this.fdEnglishName;
	}

	public void setFdEnglishName(String fdEnglishName) {
		this.fdEnglishName = fdEnglishName;
	}

	public String getFdFirstName() {
		return this.fdFirstName;
	}

	public void setFdFirstName(String fdFirstName) {
		this.fdFirstName = fdFirstName;
	}

	public Double getFdForceLeaveDays() {
		return this.fdForceLeaveDays;
	}

	public void setFdForceLeaveDays(Double fdForceLeaveDays) {
		this.fdForceLeaveDays = fdForceLeaveDays;
	}

	public String getFdInitPassword() {
		return this.fdInitPassword;
	}

	public void setFdInitPassword(String fdInitPassword) {
		this.fdInitPassword = fdInitPassword;
	}

	public String getFdInternationalStatus() {
		return this.fdInternationalStatus;
	}

	public void setFdInternationalStatus(String fdInternationalStatus) {
		this.fdInternationalStatus = fdInternationalStatus;
	}

	public String getFdIsPostpone() {
		return this.fdIsPostpone;
	}

	public void setFdIsPostpone(String fdIsPostpone) {
		this.fdIsPostpone = fdIsPostpone;
	}

	public String getFdJobCode() {
		return this.fdJobCode;
	}

	public void setFdJobCode(String fdJobCode) {
		this.fdJobCode = fdJobCode;
	}

	public Timestamp getFdJoinInDate() {
		return this.fdJoinInDate;
	}

	public void setFdJoinInDate(Timestamp fdJoinInDate) {
		this.fdJoinInDate = fdJoinInDate;
	}

	public Timestamp getFdLastChangePwd() {
		return this.fdLastChangePwd;
	}

	public void setFdLastChangePwd(Timestamp fdLastChangePwd) {
		this.fdLastChangePwd = fdLastChangePwd;
	}

	public Timestamp getFdLastLongTermDate() {
		return this.fdLastLongTermDate;
	}

	public void setFdLastLongTermDate(Timestamp fdLastLongTermDate) {
		this.fdLastLongTermDate = fdLastLongTermDate;
	}

	public String getFdLastName() {
		return this.fdLastName;
	}

	public void setFdLastName(String fdLastName) {
		this.fdLastName = fdLastName;
	}

	public Timestamp getFdLastWorkingDay() {
		return this.fdLastWorkingDay;
	}

	public void setFdLastWorkingDay(Timestamp fdLastWorkingDay) {
		this.fdLastWorkingDay = fdLastWorkingDay;
	}

	public String getFdLatestAction() {
		return this.fdLatestAction;
	}

	public void setFdLatestAction(String fdLatestAction) {
		this.fdLatestAction = fdLatestAction;
	}

	public Timestamp getFdLatestActionDate() {
		return this.fdLatestActionDate;
	}

	public void setFdLatestActionDate(Timestamp fdLatestActionDate) {
		this.fdLatestActionDate = fdLatestActionDate;
	}

	public String getFdLegalEntity() {
		return this.fdLegalEntity;
	}

	public void setFdLegalEntity(String fdLegalEntity) {
		this.fdLegalEntity = fdLegalEntity;
	}

	public String getFdLegalEntityId() {
		return this.fdLegalEntityId;
	}

	public void setFdLegalEntityId(String fdLegalEntityId) {
		this.fdLegalEntityId = fdLegalEntityId;
	}

	public String getFdLegalEntityName() {
		return this.fdLegalEntityName;
	}

	public void setFdLegalEntityName(String fdLegalEntityName) {
		this.fdLegalEntityName = fdLegalEntityName;
	}

	public Timestamp getFdLegalSeniorityStartDate() {
		return this.fdLegalSeniorityStartDate;
	}

	public void setFdLegalSeniorityStartDate(Timestamp fdLegalSeniorityStartDate) {
		this.fdLegalSeniorityStartDate = fdLegalSeniorityStartDate;
	}

	public String getFdLineManagerStaffno() {
		return this.fdLineManagerStaffno;
	}

	public void setFdLineManagerStaffno(String fdLineManagerStaffno) {
		this.fdLineManagerStaffno = fdLineManagerStaffno;
	}

	public String getFdLmSesaid() {
		return this.fdLmSesaid;
	}

	public void setFdLmSesaid(String fdLmSesaid) {
		this.fdLmSesaid = fdLmSesaid;
	}

	public String getFdLmrNotesId() {
		return this.fdLmrNotesId;
	}

	public void setFdLmrNotesId(String fdLmrNotesId) {
		this.fdLmrNotesId = fdLmrNotesId;
	}

	public Timestamp getFdLockTime() {
		return this.fdLockTime;
	}

	public void setFdLockTime(Timestamp fdLockTime) {
		this.fdLockTime = fdLockTime;
	}

	public String getFdLoginName() {
		return this.fdLoginName;
	}

	public void setFdLoginName(String fdLoginName) {
		this.fdLoginName = fdLoginName;
	}

	public String getFdMobileNo() {
		return this.fdMobileNo;
	}

	public void setFdMobileNo(String fdMobileNo) {
		this.fdMobileNo = fdMobileNo;
	}

	public String getFdNotesId() {
		return this.fdNotesId;
	}

	public void setFdNotesId(String fdNotesId) {
		this.fdNotesId = fdNotesId;
	}

	public String getFdPassword() {
		return this.fdPassword;
	}

	public void setFdPassword(String fdPassword) {
		this.fdPassword = fdPassword;
	}

	public String getFdPayrollCode() {
		return this.fdPayrollCode;
	}

	public void setFdPayrollCode(String fdPayrollCode) {
		this.fdPayrollCode = fdPayrollCode;
	}

	public String getFdPeoplesoftId() {
		return this.fdPeoplesoftId;
	}

	public void setFdPeoplesoftId(String fdPeoplesoftId) {
		this.fdPeoplesoftId = fdPeoplesoftId;
	}

	public Timestamp getFdProbationEndDate() {
		return this.fdProbationEndDate;
	}

	public void setFdProbationEndDate(Timestamp fdProbationEndDate) {
		this.fdProbationEndDate = fdProbationEndDate;
	}

	public String getFdPsPayrollCode() {
		return this.fdPsPayrollCode;
	}

	public void setFdPsPayrollCode(String fdPsPayrollCode) {
		this.fdPsPayrollCode = fdPsPayrollCode;
	}

	public String getFdRtxNo() {
		return this.fdRtxNo;
	}

	public void setFdRtxNo(String fdRtxNo) {
		this.fdRtxNo = fdRtxNo;
	}

	public String getFdSapCode() {
		return this.fdSapCode;
	}

	public void setFdSapCode(String fdSapCode) {
		this.fdSapCode = fdSapCode;
	}

	public String getFdSex() {
		return this.fdSex;
	}

	public void setFdSex(String fdSex) {
		this.fdSex = fdSex;
	}

	public String getFdShortNo() {
		return this.fdShortNo;
	}

	public void setFdShortNo(String fdShortNo) {
		this.fdShortNo = fdShortNo;
	}

	public String getFdStaffingLevelId() {
		return this.fdStaffingLevelId;
	}

	public void setFdStaffingLevelId(String fdStaffingLevelId) {
		this.fdStaffingLevelId = fdStaffingLevelId;
	}

	public String getFdType() {
		return this.fdType;
	}

	public void setFdType(String fdType) {
		this.fdType = fdType;
	}

	public String getFdWechatNo() {
		return this.fdWechatNo;
	}

	public void setFdWechatNo(String fdWechatNo) {
		this.fdWechatNo = fdWechatNo;
	}

	public String getFdWorkPhone() {
		return this.fdWorkPhone;
	}

	public void setFdWorkPhone(String fdWorkPhone) {
		this.fdWorkPhone = fdWorkPhone;
	}

	public String getFdWorkingCountry() {
		return this.fdWorkingCountry;
	}

	public void setFdWorkingCountry(String fdWorkingCountry) {
		this.fdWorkingCountry = fdWorkingCountry;
	}

	public String getFdWorkingHoursType() {
		return this.fdWorkingHoursType;
	}

	public void setFdWorkingHoursType(String fdWorkingHoursType) {
		this.fdWorkingHoursType = fdWorkingHoursType;
	}

	public String getFdWorkingLocation() {
		return this.fdWorkingLocation;
	}

	public void setFdWorkingLocation(String fdWorkingLocation) {
		this.fdWorkingLocation = fdWorkingLocation;
	}

	public String getFdWorkingLocationId() {
		return this.fdWorkingLocationId;
	}

	public void setFdWorkingLocationId(String fdWorkingLocationId) {
		this.fdWorkingLocationId = fdWorkingLocationId;
	}

}