
package com.baroservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetSMSSendMessageResult" type="{http://ws.baroservice.com/}SMSMessage" minOccurs="0"/&gt;
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
    "getSMSSendMessageResult"
})
@XmlRootElement(name = "GetSMSSendMessageResponse")
public class GetSMSSendMessageResponse {

    @XmlElement(name = "GetSMSSendMessageResult")
    protected SMSMessage getSMSSendMessageResult;

    /**
     * getSMSSendMessageResult �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SMSMessage }
     *     
     */
    public SMSMessage getGetSMSSendMessageResult() {
        return getSMSSendMessageResult;
    }

    /**
     * getSMSSendMessageResult �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSMessage }
     *     
     */
    public void setGetSMSSendMessageResult(SMSMessage value) {
        this.getSMSSendMessageResult = value;
    }

}