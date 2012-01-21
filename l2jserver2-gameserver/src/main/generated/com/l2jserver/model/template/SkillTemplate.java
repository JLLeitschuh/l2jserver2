//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.19 at 03:37:11 PM BRST 
//


package com.l2jserver.model.template;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.l2jserver.model.id.template.SkillTemplateID;
import com.l2jserver.util.jaxb.SkillTemplateIDAdapter;


/**
 * <p>Java class for skill element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="skill">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;extension base="{}AbstractTemplate">
 *         &lt;sequence>
 *           &lt;element name="maximumLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;/sequence>
 *         &lt;attribute name="id" use="required" type="{http://schemas.l2jserver2.com/skill}SkillTemplateID" />
 *         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="delay" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *         &lt;attribute name="cooldown" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;/extension>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "maximumLevel"
})
@XmlRootElement(name = "skill", namespace = "http://schemas.l2jserver2.com/skill")
public class SkillTemplate
    extends AbstractTemplate
{

    protected int maximumLevel;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(SkillTemplateIDAdapter.class)
    protected SkillTemplateID id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "delay", required = true)
    protected int delay;
    @XmlAttribute(name = "cooldown", required = true)
    protected int cooldown;

    /**
     * Gets the value of the maximumLevel property.
     * 
     */
    public int getMaximumLevel() {
        return maximumLevel;
    }

    /**
     * Sets the value of the maximumLevel property.
     * 
     */
    public void setMaximumLevel(int value) {
        this.maximumLevel = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SkillTemplateID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(SkillTemplateID value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     */
    public int getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     */
    public void setDelay(int value) {
        this.delay = value;
    }

    /**
     * Gets the value of the cooldown property.
     * 
     */
    public int getCooldown() {
        return cooldown;
    }

    /**
     * Sets the value of the cooldown property.
     * 
     */
    public void setCooldown(int value) {
        this.cooldown = value;
    }

}