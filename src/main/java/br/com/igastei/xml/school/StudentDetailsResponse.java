//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.06.18 às 05:28:04 PM BRT 
//


package br.com.igastei.xml.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Student" type="{http://www.igastei.com.br/xml/school}Student"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student"
})
@XmlRootElement(name = "StudentDetailsResponse")
public class StudentDetailsResponse {

    @XmlElement(name = "Student", required = true)
    protected Student student;

    /**
     * Obtém o valor da propriedade student.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Define o valor da propriedade student.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStudent(Student value) {
        this.student = value;
    }

}
