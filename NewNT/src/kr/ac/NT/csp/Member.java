package kr.ac.NT.csp;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Member {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	

	public Member(String name, String stuid, String phone, String email, String kakao, String leader, String gitid) {
		super();
		this.name = name;
		this.stuid = stuid;
		this.phone = phone;
		this.email = email;
		this.kakao = kakao;
		this.leader = leader;
		this.gitid = gitid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKakao() {
		return kakao;
	}

	public void setKakao(String kakao) {
		this.kakao = kakao;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getGitid() {
		return gitid;
	}

	public void setGitid(String gitid) {
		this.gitid = gitid;
	}
	@Persistent
	private String name;
	@Persistent
	private String stuid;
	@Persistent
	private String phone;
	@Persistent
	private String email;
	@Persistent
	private String kakao;
	@Persistent
	private String leader;
	@Persistent
	private String gitid;
	
	
	
}