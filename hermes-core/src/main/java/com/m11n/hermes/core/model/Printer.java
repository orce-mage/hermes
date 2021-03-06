package com.m11n.hermes.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.beans.BeanDefinition;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
@JsonIgnoreProperties({"meta", "metaBean"})
@XmlRootElement(name = "printer")
public class Printer extends DirectBean
{
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String name;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private List<PrinterAttributeCategory> attributeCategories;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private PrinterStatus status;

    public Printer() {

    }

    public Printer(String name) {
        this.name = name;
    }

    public void addAttributeCategory(PrinterAttributeCategory category) {
        if(attributeCategories==null) {
            attributeCategories = new ArrayList<>();
        }

        attributeCategories.add(category);
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code Printer}.
     * @return the meta-bean, not null
     */
    public static Printer.Meta meta() {
        return Printer.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(Printer.Meta.INSTANCE);
    }

    @Override
    public Printer.Meta metaBean() {
        return Printer.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param name  the new value of the property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the the {@code name} property.
     * @return the property, not null
     */
    public final Property<String> name() {
        return metaBean().name().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the attributeCategories.
     * @return the value of the property
     */
    public List<PrinterAttributeCategory> getAttributeCategories() {
        return attributeCategories;
    }

    /**
     * Sets the attributeCategories.
     * @param attributeCategories  the new value of the property
     */
    public void setAttributeCategories(List<PrinterAttributeCategory> attributeCategories) {
        this.attributeCategories = attributeCategories;
    }

    /**
     * Gets the the {@code attributeCategories} property.
     * @return the property, not null
     */
    public final Property<List<PrinterAttributeCategory>> attributeCategories() {
        return metaBean().attributeCategories().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the status.
     * @return the value of the property
     */
    public PrinterStatus getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * @param status  the new value of the property
     */
    public void setStatus(PrinterStatus status) {
        this.status = status;
    }

    /**
     * Gets the the {@code status} property.
     * @return the property, not null
     */
    public final Property<PrinterStatus> status() {
        return metaBean().status().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public Printer clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            Printer other = (Printer) obj;
            return JodaBeanUtils.equal(getName(), other.getName()) &&
                    JodaBeanUtils.equal(getAttributeCategories(), other.getAttributeCategories()) &&
                    JodaBeanUtils.equal(getStatus(), other.getStatus());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getName());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAttributeCategories());
        hash = hash * 31 + JodaBeanUtils.hashCode(getStatus());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(128);
        buf.append("Printer{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("name").append('=').append(JodaBeanUtils.toString(getName())).append(',').append(' ');
        buf.append("attributeCategories").append('=').append(JodaBeanUtils.toString(getAttributeCategories())).append(',').append(' ');
        buf.append("status").append('=').append(JodaBeanUtils.toString(getStatus())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code Printer}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code name} property.
         */
        private final MetaProperty<String> name = DirectMetaProperty.ofReadWrite(
                this, "name", Printer.class, String.class);
        /**
         * The meta-property for the {@code attributeCategories} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<PrinterAttributeCategory>> attributeCategories = DirectMetaProperty.ofReadWrite(
                this, "attributeCategories", Printer.class, (Class) List.class);
        /**
         * The meta-property for the {@code status} property.
         */
        private final MetaProperty<PrinterStatus> status = DirectMetaProperty.ofReadWrite(
                this, "status", Printer.class, PrinterStatus.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "name",
                "attributeCategories",
                "status");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return name;
                case 1378957784:  // attributeCategories
                    return attributeCategories;
                case -892481550:  // status
                    return status;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends Printer> builder() {
            return new DirectBeanBuilder<Printer>(new Printer());
        }

        @Override
        public Class<? extends Printer> beanType() {
            return Printer.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code name} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> name() {
            return name;
        }

        /**
         * The meta-property for the {@code attributeCategories} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<PrinterAttributeCategory>> attributeCategories() {
            return attributeCategories;
        }

        /**
         * The meta-property for the {@code status} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<PrinterStatus> status() {
            return status;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return ((Printer) bean).getName();
                case 1378957784:  // attributeCategories
                    return ((Printer) bean).getAttributeCategories();
                case -892481550:  // status
                    return ((Printer) bean).getStatus();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    ((Printer) bean).setName((String) newValue);
                    return;
                case 1378957784:  // attributeCategories
                    ((Printer) bean).setAttributeCategories((List<PrinterAttributeCategory>) newValue);
                    return;
                case -892481550:  // status
                    ((Printer) bean).setStatus((PrinterStatus) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
