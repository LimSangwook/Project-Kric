
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
 *         &lt;element name="GetMessagesByReceiptNumResult" type="{http://ws.baroservice.com/}ArrayOfSMSMessage" minOccurs="0"/&gt;
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
    "getMessagesByReceiptNumResult"
})
@XmlRootElement(name = "GetMessagesByReceiptNumResponse")
public class GetMessagesByReceiptNumResponse {

    @XmlElement(name = "GetMessagesByReceiptNumResult")
    protected ArrayOfSMSMessage getMessagesByReceiptNumResult;

    /**
     * getMessagesByReceiptNumResult �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSMSMessage }
     *     
     */
    public ArrayOfSMSMessage getGetMessagesByReceiptNumResult() {
        return getMessagesByReceiptNumResult;
    }

    /**
     * getMessagesByReceiptNumResult �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSMSMessage }
     *     
     */
    public void setGetMessagesByReceiptNumResult(ArrayOfSMSMessage value) {
        this.getMessagesByReceiptNumResult = value;
    }

}