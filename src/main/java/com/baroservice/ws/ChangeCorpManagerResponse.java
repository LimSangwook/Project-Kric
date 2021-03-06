
package com.baroservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeCorpManagerResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeCorpManagerResult"
})
@XmlRootElement(name = "ChangeCorpManagerResponse")
public class ChangeCorpManagerResponse {

    @XmlElement(name = "ChangeCorpManagerResult")
    protected int changeCorpManagerResult;

    /**
     * changeCorpManagerResult 속성의 값을 가져옵니다.
     * 
     */
    public int getChangeCorpManagerResult() {
        return changeCorpManagerResult;
    }

    /**
     * changeCorpManagerResult 속성의 값을 설정합니다.
     * 
     */
    public void setChangeCorpManagerResult(int value) {
        this.changeCorpManagerResult = value;
    }

}
