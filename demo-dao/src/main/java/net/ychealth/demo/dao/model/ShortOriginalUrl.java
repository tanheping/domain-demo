package net.ychealth.demo.dao.model;

import java.util.Date;
import com.obelisk.soa.dao.core.BaseEntity;
import javax.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
    /**
 * 短链接表(ShortOriginalUrl)实体类
 *
 * @author clei
 * @since 2021-07-16 19:56:07
 */
@Data
@Entity
@Table(name="short_original_url")
public class ShortOriginalUrl extends BaseEntity {
    private static final long serialVersionUID = -55484169307922804L;

    /**
        * ID
    */    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id", nullable = false)
    private Long id ;
    

    /**
    * 类型
    */    
    
    @Column(name = "type" , nullable = false)
    private String type;

    /**
    * 原始链接
    */    
    
    @Column(name = "originalurl" , nullable = false)
    private String originalurl;

    /**
    * 短链接后缀
    */    
    
    @Column(name = "suffix" , nullable = false)
    private String suffix;

    /**
    * 添加时间
    */    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss SSS")
    
    @Column(name = "add_date" , nullable = false)
    private Date addDate;

    /**
    * 过期时间
    */    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss SSS")
    
    @Column(name = "expiration_date" , nullable = false)
    private Date expirationDate;

    /**
    * 策略类型
    */    
    
    @Column(name = "strategy" , nullable = false)
    private String strategy;

    
}