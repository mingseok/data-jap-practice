package study.datajap.entity;


import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.auditing.config.AnnotationAuditingConfiguration;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AnnotationAuditingConfiguration.class)
@MappedSuperclass // 진짜 상속관계가 아니고, 현재 클래스의 속성들을 테이블에 내려서 같이 쓸수 있게 해주는 애노테이션이다
@Getter
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createDate; // 생성 날짜

    @LastModifiedDate
    private LocalDateTime lastModifiedDate; // 마지막을 수정한 날짜

    @CreatedBy
    @Column(updatable = false)
    private String createBy; // 작성자

    @LastModifiedBy
    private String lastModifiedBy; // 마지막으로 수정한 사람

}