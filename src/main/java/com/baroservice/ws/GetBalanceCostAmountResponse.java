
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
 *         &lt;element name="GetBalanceCostAmountResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "getBalanceCostAmountResult"
})
@XmlRootElement(name = "GetBalanceCostAmountResponse")
public class GetBalanceCostAmountResponse {

    @XmlElement(name = "GetBalanceCostAmountResult")
    protected long getBalanceCostAmountResult;

    /**
     * getBalanceCostAmountResult �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public long getGetBalanceCostAmountResult() {
        return getBalanceCostAmountResult;
    }

    /**
     * getBalanceCostAmountResult �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setGetBalanceCostAmountResult(long value) {
        this.getBalanceCostAmountResult = value;
    }

}