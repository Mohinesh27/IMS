package com.sth.ims.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="user")
public class User {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@NotEmpty
	@Column(name="UserName",nullable=false)
	private String userName;
	
	@NotEmpty
	@Column(name="Password", nullable=false)
	private String password;
	
	@NotEmpty
	@Column(name="IsActive",nullable=false)
	private boolean isActive;
	
	@NotEmpty
	@Column(name="IsLocked",nullable=false)
	private boolean isLocked;
	
	@NotEmpty
	@Column(name="IsAccountExpired",nullable=false)
	private boolean isAccountExpired;
	
	@NotEmpty
	@Column(name="LastSuccessfulLogin",nullable=true)
	private Date lastSuccessfulLogin;
	
	@NotEmpty
	@Column(name="LoginFailureAttempt",nullable=true)
	private int loginFailureAttempt;
	
	@NotEmpty
	@Column(name="LastLoginFailed",nullable=true)
	private Date lastLoginFailed;
	
	@NotEmpty
	@Column(name="LockedDate",nullable=true)
	private Date lockedDate;
	
	@NotEmpty
	@Column(name="PasswordResetDate",nullable=true)
	private Date passwordResetDate;
	
	@NotEmpty
	@Column(name="PasswordExpiredDate",nullable=true)
	private Date passwordExpiredDate;
	
	@NotEmpty
	@Column(name="CreatedBy",nullable=true)
	private long createdBy;
	
	@NotEmpty
	@Column(name="ModifiedBy",nullable=true)
	private long modifiedBy;
	
	@NotEmpty
	@Column(name="CreatedOn",nullable=true)
	private Date createdOn;
	
	@NotEmpty
	@Column(name="ModifiedOn",nullable=true)
	private Date modifiedOn;

	@NotEmpty
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="UserProfile",
	joinColumns={ @JoinColumn(name="UserId") },
	inverseJoinColumns={@JoinColumn(name="ProfileId") })
	private Set<Profile> userProfiles=new HashSet<Profile>();
	
	
	@NotEmpty
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="UserInRole",
	joinColumns={ @JoinColumn(name="UserId") },
	inverseJoinColumns={@JoinColumn(name="RoleId") })
	private Set<Role> userRoles=new HashSet<Role>();
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public boolean isAccountExpired() {
		return isAccountExpired;
	}

	public void setAccountExpired(boolean isAccountExpired) {
		this.isAccountExpired = isAccountExpired;
	}

	public Date getLastSuccessfulLogin() {
		return lastSuccessfulLogin;
	}

	public void setLastSuccessfulLogin(Date lastSuccessfulLogin) {
		this.lastSuccessfulLogin = lastSuccessfulLogin;
	}

	public int getLoginFailureAttempt() {
		return loginFailureAttempt;
	}

	public void setLoginFailureAttempt(int loginFailureAttempt) {
		this.loginFailureAttempt = loginFailureAttempt;
	}

	public Date getLastLoginFailed() {
		return lastLoginFailed;
	}

	public void setLastLoginFailed(Date lastLoginFailed) {
		this.lastLoginFailed = lastLoginFailed;
	}

	public Date getLockedDate() {
		return lockedDate;
	}

	public void setLockedDate(Date lockedDate) {
		this.lockedDate = lockedDate;
	}

	public Date getPasswordResetDate() {
		return passwordResetDate;
	}

	public void setPasswordResetDate(Date passwordResetDate) {
		this.passwordResetDate = passwordResetDate;
	}

	public Date getPasswordExpiredDate() {
		return passwordExpiredDate;
	}

	public void setPasswordExpiredDate(Date passwordExpiredDate) {
		this.passwordExpiredDate = passwordExpiredDate;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Set<Profile> getUserProfiles() {
		return userProfiles;
	}

	public void setUserProfiles(Set<Profile> userProfiles) {
		this.userProfiles = userProfiles;
	}

	public Set<Role> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<Role> userRoles) {
		this.userRoles = userRoles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (createdBy ^ (createdBy >>> 32));
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isAccountExpired ? 1231 : 1237);
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + (isLocked ? 1231 : 1237);
		result = prime * result + ((lastLoginFailed == null) ? 0 : lastLoginFailed.hashCode());
		result = prime * result + ((lastSuccessfulLogin == null) ? 0 : lastSuccessfulLogin.hashCode());
		result = prime * result + ((lockedDate == null) ? 0 : lockedDate.hashCode());
		result = prime * result + loginFailureAttempt;
		result = prime * result + (int) (modifiedBy ^ (modifiedBy >>> 32));
		result = prime * result + ((modifiedOn == null) ? 0 : modifiedOn.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((passwordExpiredDate == null) ? 0 : passwordExpiredDate.hashCode());
		result = prime * result + ((passwordResetDate == null) ? 0 : passwordResetDate.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (createdBy != other.createdBy)
			return false;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isAccountExpired != other.isAccountExpired)
			return false;
		if (isActive != other.isActive)
			return false;
		if (isLocked != other.isLocked)
			return false;
		if (lastLoginFailed == null) {
			if (other.lastLoginFailed != null)
				return false;
		} else if (!lastLoginFailed.equals(other.lastLoginFailed))
			return false;
		if (lastSuccessfulLogin == null) {
			if (other.lastSuccessfulLogin != null)
				return false;
		} else if (!lastSuccessfulLogin.equals(other.lastSuccessfulLogin))
			return false;
		if (lockedDate == null) {
			if (other.lockedDate != null)
				return false;
		} else if (!lockedDate.equals(other.lockedDate))
			return false;
		if (loginFailureAttempt != other.loginFailureAttempt)
			return false;
		if (modifiedBy != other.modifiedBy)
			return false;
		if (modifiedOn == null) {
			if (other.modifiedOn != null)
				return false;
		} else if (!modifiedOn.equals(other.modifiedOn))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (passwordExpiredDate == null) {
			if (other.passwordExpiredDate != null)
				return false;
		} else if (!passwordExpiredDate.equals(other.passwordExpiredDate))
			return false;
		if (passwordResetDate == null) {
			if (other.passwordResetDate != null)
				return false;
		} else if (!passwordResetDate.equals(other.passwordResetDate))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", isActive=" + isActive
				+ ", isLocked=" + isLocked + ", isAccountExpired=" + isAccountExpired + ", lastSuccessfulLogin="
				+ lastSuccessfulLogin + ", loginFailureAttempt=" + loginFailureAttempt + ", lastLoginFailed="
				+ lastLoginFailed + ", lockedDate=" + lockedDate + ", passwordResetDate=" + passwordResetDate
				+ ", passwordExpiredDate=" + passwordExpiredDate + ", createdBy=" + createdBy + ", modifiedBy="
				+ modifiedBy + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + "]";
	}
	
	
	
}
