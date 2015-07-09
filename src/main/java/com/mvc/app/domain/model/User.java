package com.mvc.app.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

//import com.mvc.app.domain.service.user.UserService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;

//import java.util.Iterator;

@Entity
@Table(name = "T_USER")
public class User implements Serializable {

    /**
     * serial version id.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;

    @Column(name = "STU_ID", unique = true, nullable = false)
    private String sid;
    
    @Column(name = "STU_NAME", nullable = false)
    private String name;
    
    @Column(name = "SCORE", nullable = false)
    private Integer score;

    @Column(name = "CREATED_AT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
/*	
	protected UserService userService;
	
	public int getAvg(){
		Pageable pageable = null;
		Page<User> page = userService.findAll(pageable);
		Iterator<User> i=page.iterator();
		int k=0;
		int sum=0;
		while(i.hasNext()){
			User u=i.next();
			k++;
			sum=sum+u.getScore();
		}
		return sum/k;
	}
	public int getVar(){
		Pageable pageable = null;
		Page<User> page = userService.findAll(pageable);
		Iterator<User> i=page.iterator();
		int k=0;
		int avg=0;
		int sum=0;
		while(i.hasNext()){
			User u=(User)i.next();
			k++;
			avg=avg+u.getScore();
		}
		avg=avg/k;
		i=page.iterator();
		sum=0;
		while(i.hasNext()){
			User u=(User)i.next();
			sum=sum+(u.getScore()-avg)*(u.getScore()-avg);
		}
		return sum/k;
	}
	*/
}
