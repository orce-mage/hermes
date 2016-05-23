package com.m11n.hermes.core.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.joda.beans.BeanDefinition;
import org.joda.beans.MetaBean;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
@XmlRootElement(name = "print_documents_request")
public class PrintDocumentsRequest extends DirectBean {

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private Integer printjobId;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private List<Integer> printjobItems;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code PrintDocumentsRequest}.
     * @return the meta-bean, not null
     */
    public static PrintDocumentsRequest.Meta meta() {
        return PrintDocumentsRequest.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(PrintDocumentsRequest.Meta.INSTANCE);
    }

    @Override
    public PrintDocumentsRequest.Meta metaBean() {
        return PrintDocumentsRequest.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the printjobId.
     * @return the value of the property
     */
    public Integer getPrintjobId() {
        return printjobId;
    }

    /**
     * Sets the printjobId.
     * @param printjobId  the new value of the property
     */
    public void setPrintjobId(Integer printjobId) {
        this.printjobId = printjobId;
    }

    /**
     * Gets the the {@code printjobId} property.
     * @return the property, not null
     */
    public final Property<Integer> printjobId() {
        return metaBean().printjobId().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the printjobItems.
     * @return the value of the property
     */
    public List<Integer> getPrintjobItems() {
        return printjobItems;
    }

    /**
     * Sets the printjobItems.
     * @param printjobItems  the new value of the property
     */
    public void setPrintjobItems(List<Integer> printjobItems) {
        this.printjobItems = printjobItems;
    }

    /**
     * Gets the the {@code printjobItems} property.
     * @return the property, not null
     */
    public final Property<List<Integer>> printjobItems() {
        return metaBean().printjobItems().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public PrintDocumentsRequest clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            PrintDocumentsRequest other = (PrintDocumentsRequest) obj;
            return JodaBeanUtils.equal(getPrintjobId(), other.getPrintjobId()) &&
                    JodaBeanUtils.equal(getPrintjobItems(), other.getPrintjobItems());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getPrintjobId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getPrintjobItems());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append("PrintDocumentsRequest{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("printjobId").append('=').append(JodaBeanUtils.toString(getPrintjobId())).append(',').append(' ');
        buf.append("printjobItems").append('=').append(JodaBeanUtils.toString(getPrintjobItems())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code PrintDocumentsRequest}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code printjobId} property.
         */
        private final MetaProperty<Integer> printjobId = DirectMetaProperty.ofReadWrite(
                this, "printjobId", PrintDocumentsRequest.class, Integer.class);
        /**
         * The meta-property for the {@code printjobItems} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<Integer>> printjobItems = DirectMetaProperty.ofReadWrite(
                this, "printjobItems", PrintDocumentsRequest.class, (Class) List.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "printjobId",
                "printjobItems");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 148871979:  // printjobId
                    return printjobId;
                case -1655513168:  // printjobItems
                    return printjobItems;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends PrintDocumentsRequest> builder() {
            return new DirectBeanBuilder<PrintDocumentsRequest>(new PrintDocumentsRequest());
        }

        @Override
        public Class<? extends PrintDocumentsRequest> beanType() {
            return PrintDocumentsRequest.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code printjobId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> printjobId() {
            return printjobId;
        }

        /**
         * The meta-property for the {@code printjobItems} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<Integer>> printjobItems() {
            return printjobItems;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 148871979:  // printjobId
                    return ((PrintDocumentsRequest) bean).getPrintjobId();
                case -1655513168:  // printjobItems
                    return ((PrintDocumentsRequest) bean).getPrintjobItems();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 148871979:  // printjobId
                    ((PrintDocumentsRequest) bean).setPrintjobId((Integer) newValue);
                    return;
                case -1655513168:  // printjobItems
                    ((PrintDocumentsRequest) bean).setPrintjobItems((List<Integer>) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
